package main

/*
#cgo CFLAGS: -Ivlc
#cgo LDFLAGS: -L/usr/local/lib -lvlc
#include <stdlib.h>
#include "vlc.h"
*/
import "C"
import (
    "fmt"
    "errors"
    "unsafe"
    "syscall"
    "os"
    "time"
)

//const uri = "file:///Users/min/Downloads/dance.MOV"
const uri = "file:///Users/min/workspace/repo/projects/vlc-test/vlc-java/opus.sdp"

func main() {
    fmt.Printf(C.GoString(C.libvlc_get_version()) + "\n")

    var err error
	var inst *Instance
    var media *Media
    var player *Player

    args := []string { "-vvv", "--plugin-path=/Users/min/Applications/VLC3.0.0.app/Contents/MacOS/plugins" }
    if inst, err = New(args); err != nil {
        fmt.Fprintf(os.Stderr, "[e] New(): %v", err)
        return;
    } else {
        fmt.Printf("Create vlc instance success.\n")
    }
    if (inst == nil) {
        fmt.Printf("vlc instance is null\n")
    }

    defer inst.Release()

    if media, err = inst.OpenMediaUri(uri); err != nil {
        fmt.Fprintf(os.Stderr, "[e] OpenMediaUri(): %v", err)
        return
    } else {
        fmt.Printf("Create vlc media location success")
    }

    // Create a player for the created media.
	if player, err = media.NewPlayer(); err != nil {
		fmt.Fprintf(os.Stderr, "[e] NewPlayer(): %v", err)
		media.Release()
		return
	}

    defer player.Release()

    media.Release()
	media = nil

    if player != nil {
        fmt.Print("Success!!\n")
    }

    // Play the video.
	player.Play()

	// Give the player 10 seconds of play time.
	time.Sleep(1e10)

	// Stop playing.
	player.Stop()
    //_, err = inst.OpenMediaUri("file:///Users/min/Downloads/dance.MOV")
    //if err != nil {
    //    fmt.Print(err)
    //    return
    //}

    //cstr := make([]*C.char, 1)
    //cstr[0] = C.CString("-vvv")

    //inst := C.libvlc_new(C.int(1), *(***C.char)(unsafe.Pointer(&cstr)))
    //if inst == nil {
    //    fmt.Printf("Create vlc instance failed.\n")
    //    return
    //}
    //media := C.libvlc_media_new_path(inst, C.CString("/Users/min/Downloads/dance.MOV"))
    //player := C.libvlc_media_player_new_from_media(media)
    //C.libvlc_media_release(media)
    //C.libvlc_media_player_play(player)
    //return
}

// A single libvlc instance.
type Instance struct {
	ptr *C.libvlc_instance_t
}

type Media struct {
	ptr *C.libvlc_media_t
}

type Player struct {
	ptr *C.libvlc_media_player_t
}

// New creates and initializes a new VLC instance with the given parameters.
// Returns nil and a possible error if no instance could be created.
func New(argv []string) (i *Instance, err error) {
	cstr := make([]*C.char, len(argv))

	for i := range cstr {
		cstr[i] = C.CString(argv[i])
	}

	if c := C.libvlc_new(C.int(len(argv)), *(***C.char)(unsafe.Pointer(&cstr))); c != nil {
		i = &Instance{c}
	} else {
		err = checkError()
	}

	for i := range cstr {
		C.free(unsafe.Pointer(cstr[i]))
	}
	return
}

func (this *Instance) OpenMediaUri(uri string) (*Media, error) {
	if this.ptr == nil {
		return nil, syscall.EINVAL
	}

	c := C.CString(uri)
	defer C.free(unsafe.Pointer(c))

	if m := C.libvlc_media_new_location(this.ptr, c); m != nil {
		return &Media{m}, nil
	}

	return nil, checkError()
}

func (this *Instance) StartUI(name string) (err error) {
	if this.ptr == nil {
		return syscall.EINVAL
	}

	c := C.CString(name)
	defer C.free(unsafe.Pointer(c))

	if C.libvlc_add_intf(this.ptr, c) < 0 {
		err = checkError()
	}

	return
}

// Release decreases the reference count of the instance and destroys it
// when it reaches zero.
func (this *Instance) Release() (err error) {
	if this.ptr == nil {
		return syscall.EINVAL
	}

	C.libvlc_release(this.ptr)
	return
}

func (this *Media) Release() (err error) {
	if this.ptr == nil {
		return syscall.EINVAL
	}

	C.libvlc_media_release(this.ptr)
	return
}

func (this *Media) NewPlayer() (*Player, error) {
	if this.ptr == nil {
		return nil, syscall.EINVAL
	}

	if c := C.libvlc_media_player_new_from_media(this.ptr); c != nil {
		return &Player{c}, nil
	}

	return nil, checkError()
}

// Play begins playback.
func (this *Player) Play() (err error) {
	if this.ptr == nil {
		return syscall.EINVAL
	}

	if C.libvlc_media_player_play(this.ptr) < 0 {
		err = checkError()
	}

	return
}

func (this *Player) Release() (err error) {
	if this.ptr == nil {
		return syscall.EINVAL
	}

	C.libvlc_media_player_release(this.ptr)
	return
}

func (this *Player) Stop() (err error) {
	if this.ptr == nil {
		return syscall.EINVAL
	}

	C.libvlc_media_player_stop(this.ptr)
	return
}

func checkError() error {
	c := C.libvlc_errmsg()
	if c != nil {
		return errors.New(C.GoString(c))
	}
	return nil
}
