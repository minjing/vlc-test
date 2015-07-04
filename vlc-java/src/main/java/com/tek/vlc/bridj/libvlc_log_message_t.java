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
public class libvlc_log_message_t extends StructObject {
    static {
        BridJ.register();
    }
    /** 0=INFO, 1=ERR, 2=WARN, 3=DBG */
    @Field(0) 
    public int i_severity() {
        return this.io.getIntField(this, 0);
    }
    /** 0=INFO, 1=ERR, 2=WARN, 3=DBG */
    @Field(0) 
    public libvlc_log_message_t i_severity(int i_severity) {
        this.io.setIntField(this, 0, i_severity);
        return this;
    }
    /**
     * module type<br>
     * C type : const char*
     */
    @Field(1) 
    public Pointer<Byte > psz_type() {
        return this.io.getPointerField(this, 1);
    }
    /**
     * module type<br>
     * C type : const char*
     */
    @Field(1) 
    public libvlc_log_message_t psz_type(Pointer<Byte > psz_type) {
        this.io.setPointerField(this, 1, psz_type);
        return this;
    }
    /**
     * module name<br>
     * C type : const char*
     */
    @Field(2) 
    public Pointer<Byte > psz_name() {
        return this.io.getPointerField(this, 2);
    }
    /**
     * module name<br>
     * C type : const char*
     */
    @Field(2) 
    public libvlc_log_message_t psz_name(Pointer<Byte > psz_name) {
        this.io.setPointerField(this, 2, psz_name);
        return this;
    }
    /**
     * optional header<br>
     * C type : const char*
     */
    @Field(3) 
    public Pointer<Byte > psz_header() {
        return this.io.getPointerField(this, 3);
    }
    /**
     * optional header<br>
     * C type : const char*
     */
    @Field(3) 
    public libvlc_log_message_t psz_header(Pointer<Byte > psz_header) {
        this.io.setPointerField(this, 3, psz_header);
        return this;
    }
    /**
     * message<br>
     * C type : const char*
     */
    @Field(4) 
    public Pointer<Byte > psz_message() {
        return this.io.getPointerField(this, 4);
    }
    /**
     * message<br>
     * C type : const char*
     */
    @Field(4) 
    public libvlc_log_message_t psz_message(Pointer<Byte > psz_message) {
        this.io.setPointerField(this, 4, psz_message);
        return this;
    }
    public libvlc_log_message_t() {
        super();
    }
    public libvlc_log_message_t(Pointer pointer) {
        super(pointer);
    }
}


