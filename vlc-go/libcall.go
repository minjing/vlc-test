packet main

import "syscall"

func main() {
    libvlc, _ := syscall.LoadLibrary("libvlc.dylib")
    
}
