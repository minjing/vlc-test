package com.tek.vlc.jna;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class libvlc_audio_output_t extends Structure {
    /** C type : char* */
    public Pointer psz_name;
    /** C type : char* */
    public Pointer psz_description;
    /** C type : libvlc_audio_output_t* */
    public libvlc_audio_output_t.ByReference p_next;
    public libvlc_audio_output_t() {
        super();
    }
    protected List<? > getFieldOrder() {
        return Arrays.asList("psz_name", "psz_description", "p_next");
    }
    /**
     * @param psz_name C type : char*<br>
     * @param psz_description C type : char*<br>
     * @param p_next C type : libvlc_audio_output_t*
     */
    public libvlc_audio_output_t(Pointer psz_name, Pointer psz_description, libvlc_audio_output_t.ByReference p_next) {
        super();
        this.psz_name = psz_name;
        this.psz_description = psz_description;
        this.p_next = p_next;
    }
    public libvlc_audio_output_t(Pointer peer) {
        super(peer);
    }
    public static class ByReference extends libvlc_audio_output_t implements Structure.ByReference {
        
    };
    public static class ByValue extends libvlc_audio_output_t implements Structure.ByValue {
        
    };
}

