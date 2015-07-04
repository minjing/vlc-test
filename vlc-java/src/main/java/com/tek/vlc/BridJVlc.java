package com.tek.vlc;

import static com.tek.vlc.bridj.LibvlcLibrary.*;
import static org.bridj.Pointer.*;

import org.bridj.Pointer;

import com.tek.vlc.bridj.LibvlcLibrary;

public class BridJVlc {

    public static void main(String[] args) throws Exception {
        Pointer<libvlc_instance_t> inst = libvlc_new(0, null);
        String file = "D:/workspace/isa/12.1 ISA Features with Michael Hoglan.wmv";
        Pointer<Byte> ttt = Pointer.allocateBytes(file.length());
        ttt.setBytes(file.getBytes());
        Pointer<libvlc_media_t> m = libvlc_media_new_location(inst, ttt);
        Pointer<libvlc_media_player_t> mp = libvlc_media_player_new_from_media (m);
        libvlc_media_release (m);
        
        libvlc_media_player_play (mp);
        Thread.sleep(10000);
        
        libvlc_media_player_release (mp);
        libvlc_release (inst);
        
        return;
    }

}
