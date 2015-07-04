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
public class libvlc_video_track_t extends StructObject {
    static {
        BridJ.register();
    }
    @Field(0) 
    public int i_height() {
        return this.io.getIntField(this, 0);
    }
    @Field(0) 
    public libvlc_video_track_t i_height(int i_height) {
        this.io.setIntField(this, 0, i_height);
        return this;
    }
    @Field(1) 
    public int i_width() {
        return this.io.getIntField(this, 1);
    }
    @Field(1) 
    public libvlc_video_track_t i_width(int i_width) {
        this.io.setIntField(this, 1, i_width);
        return this;
    }
    @Field(2) 
    public int i_sar_num() {
        return this.io.getIntField(this, 2);
    }
    @Field(2) 
    public libvlc_video_track_t i_sar_num(int i_sar_num) {
        this.io.setIntField(this, 2, i_sar_num);
        return this;
    }
    @Field(3) 
    public int i_sar_den() {
        return this.io.getIntField(this, 3);
    }
    @Field(3) 
    public libvlc_video_track_t i_sar_den(int i_sar_den) {
        this.io.setIntField(this, 3, i_sar_den);
        return this;
    }
    @Field(4) 
    public int i_frame_rate_num() {
        return this.io.getIntField(this, 4);
    }
    @Field(4) 
    public libvlc_video_track_t i_frame_rate_num(int i_frame_rate_num) {
        this.io.setIntField(this, 4, i_frame_rate_num);
        return this;
    }
    @Field(5) 
    public int i_frame_rate_den() {
        return this.io.getIntField(this, 5);
    }
    @Field(5) 
    public libvlc_video_track_t i_frame_rate_den(int i_frame_rate_den) {
        this.io.setIntField(this, 5, i_frame_rate_den);
        return this;
    }
    public libvlc_video_track_t() {
        super();
    }
    public libvlc_video_track_t(Pointer pointer) {
        super(pointer);
    }
}