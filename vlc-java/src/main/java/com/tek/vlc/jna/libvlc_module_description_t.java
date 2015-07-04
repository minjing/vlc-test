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
public class libvlc_module_description_t extends Structure {
    /** C type : char* */
    public Pointer psz_name;
    /** C type : char* */
    public Pointer psz_shortname;
    /** C type : char* */
    public Pointer psz_longname;
    /** C type : char* */
    public Pointer psz_help;
    /** C type : libvlc_module_description_t* */
    public libvlc_module_description_t.ByReference p_next;
    public libvlc_module_description_t() {
        super();
    }
    protected List<? > getFieldOrder() {
        return Arrays.asList("psz_name", "psz_shortname", "psz_longname", "psz_help", "p_next");
    }
    /**
     * @param psz_name C type : char*<br>
     * @param psz_shortname C type : char*<br>
     * @param psz_longname C type : char*<br>
     * @param psz_help C type : char*<br>
     * @param p_next C type : libvlc_module_description_t*
     */
    public libvlc_module_description_t(Pointer psz_name, Pointer psz_shortname, Pointer psz_longname, Pointer psz_help, libvlc_module_description_t.ByReference p_next) {
        super();
        this.psz_name = psz_name;
        this.psz_shortname = psz_shortname;
        this.psz_longname = psz_longname;
        this.psz_help = psz_help;
        this.p_next = p_next;
    }
    public libvlc_module_description_t(Pointer peer) {
        super(peer);
    }
    public static class ByReference extends libvlc_module_description_t implements Structure.ByReference {
        
    };
    public static class ByValue extends libvlc_module_description_t implements Structure.ByValue {
        
    };
}
