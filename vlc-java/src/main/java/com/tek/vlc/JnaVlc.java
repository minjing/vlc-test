package com.tek.vlc;

import static com.tek.vlc.jna.LibvlcLibrary.*;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.PointerByReference;
import com.tek.vlc.jna.LibvlcLibrary;
/**
 * Hello world!
 *
 */
public class JnaVlc {
    
    public static void main(String[] args) throws Exception {
        LibvlcLibrary libvlc = (LibvlcLibrary) Native.loadLibrary("libvlc", LibvlcLibrary.class);
        System.out.println(libvlc.libvlc_get_version());
        
        PointerByReference inst = libvlc.libvlc_new(1, new String[] { "-vvv", "--plugin-path=D:/tool/vlc/vlc-3.0.0-x86/plugins" });
        //String file = "file:///D:/workspace/isa/12.1 ISA Features with Michael Hoglan.wmv";
        //String file = "file:///E:/repo/vlcj-test/opus.sdp";
        String file = "rtp://@:1234";
        PointerByReference m = libvlc.libvlc_media_new_location(inst, file);
        
        PointerByReference mp = libvlc.libvlc_media_player_new_from_media (m);
        libvlc.libvlc_media_release (m);
        
        libvlc.libvlc_media_player_play (mp);
        Thread.sleep(60000);
        
        libvlc.libvlc_media_player_stop (mp);
        libvlc.libvlc_media_player_release (mp);
        
        libvlc.libvlc_release (inst);
    
        
//        LibVlc vlc = LibVlc.instance;
//        System.out.println(vlc.libvlc_get_version());
//        libvlc_instance_t instance = vlc.libvlc_new(1, new String[] { "-vvv", "--plugin-path=D:/tool/vlc/vlc-3.0.0-x64/plugins" });
        return;
    }

    public interface LibVlc extends Library {
        LibVlc instance = (LibVlc) Native.loadLibrary("libvlc", LibVlc.class);

        String libvlc_get_version();
        libvlc_instance_t libvlc_new(int argc, String[] argv);
    }
//
//    public class libvlc_instance_t extends PointerType {
//    }
}
