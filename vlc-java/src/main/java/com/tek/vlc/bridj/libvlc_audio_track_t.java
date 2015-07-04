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
public class libvlc_audio_track_t extends StructObject {
    static {
        BridJ.register();
    }
    @Field(0) 
    public int i_channels() {
        return this.io.getIntField(this, 0);
    }
    @Field(0) 
    public libvlc_audio_track_t i_channels(int i_channels) {
        this.io.setIntField(this, 0, i_channels);
        return this;
    }
    @Field(1) 
    public int i_rate() {
        return this.io.getIntField(this, 1);
    }
    @Field(1) 
    public libvlc_audio_track_t i_rate(int i_rate) {
        this.io.setIntField(this, 1, i_rate);
        return this;
    }
    public libvlc_audio_track_t() {
        super();
    }
    public libvlc_audio_track_t(Pointer pointer) {
        super(pointer);
    }
}
