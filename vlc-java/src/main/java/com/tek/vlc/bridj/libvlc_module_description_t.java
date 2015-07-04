package com.tek.vlc.bridj;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("libvlc") 
public class libvlc_module_description_t extends StructObject {
    static {
        BridJ.register();
    }
    /** C type : char* */
    @Field(0) 
    public Pointer<Byte > psz_name() {
        return this.io.getPointerField(this, 0);
    }
    /** C type : char* */
    @Field(0) 
    public libvlc_module_description_t psz_name(Pointer<Byte > psz_name) {
        this.io.setPointerField(this, 0, psz_name);
        return this;
    }
    /** C type : char* */
    @Field(1) 
    public Pointer<Byte > psz_shortname() {
        return this.io.getPointerField(this, 1);
    }
    /** C type : char* */
    @Field(1) 
    public libvlc_module_description_t psz_shortname(Pointer<Byte > psz_shortname) {
        this.io.setPointerField(this, 1, psz_shortname);
        return this;
    }
    /** C type : char* */
    @Field(2) 
    public Pointer<Byte > psz_longname() {
        return this.io.getPointerField(this, 2);
    }
    /** C type : char* */
    @Field(2) 
    public libvlc_module_description_t psz_longname(Pointer<Byte > psz_longname) {
        this.io.setPointerField(this, 2, psz_longname);
        return this;
    }
    /** C type : char* */
    @Field(3) 
    public Pointer<Byte > psz_help() {
        return this.io.getPointerField(this, 3);
    }
    /** C type : char* */
    @Field(3) 
    public libvlc_module_description_t psz_help(Pointer<Byte > psz_help) {
        this.io.setPointerField(this, 3, psz_help);
        return this;
    }
    /** C type : libvlc_module_description_t* */
    @Field(4) 
    public Pointer<libvlc_module_description_t > p_next() {
        return this.io.getPointerField(this, 4);
    }
    /** C type : libvlc_module_description_t* */
    @Field(4) 
    public libvlc_module_description_t p_next(Pointer<libvlc_module_description_t > p_next) {
        this.io.setPointerField(this, 4, p_next);
        return this;
    }
    public libvlc_module_description_t() {
        super();
    }
    public libvlc_module_description_t(Pointer pointer) {
        super(pointer);
    }
}
