package com.tek.vlc.bridj;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;

import com.tek.vlc.bridj.LibvlcLibrary.libvlc_track_type_t;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("libvlc") 
public class libvlc_media_track_t extends StructObject {
    static {
        BridJ.register();
    }
    @Field(0) 
    public int i_codec() {
        return this.io.getIntField(this, 0);
    }
    @Field(0) 
    public libvlc_media_track_t i_codec(int i_codec) {
        this.io.setIntField(this, 0, i_codec);
        return this;
    }
    @Field(1) 
    public int i_original_fourcc() {
        return this.io.getIntField(this, 1);
    }
    @Field(1) 
    public libvlc_media_track_t i_original_fourcc(int i_original_fourcc) {
        this.io.setIntField(this, 1, i_original_fourcc);
        return this;
    }
    @Field(2) 
    public int i_id() {
        return this.io.getIntField(this, 2);
    }
    @Field(2) 
    public libvlc_media_track_t i_id(int i_id) {
        this.io.setIntField(this, 2, i_id);
        return this;
    }
    /** C type : libvlc_track_type_t */
    @Field(3) 
    public IntValuedEnum<libvlc_track_type_t > i_type() {
        return this.io.getEnumField(this, 3);
    }
    /** C type : libvlc_track_type_t */
    @Field(3) 
    public libvlc_media_track_t i_type(IntValuedEnum<libvlc_track_type_t > i_type) {
        this.io.setEnumField(this, 3, i_type);
        return this;
    }
    @Field(4) 
    public int i_profile() {
        return this.io.getIntField(this, 4);
    }
    @Field(4) 
    public libvlc_media_track_t i_profile(int i_profile) {
        this.io.setIntField(this, 4, i_profile);
        return this;
    }
    @Field(5) 
    public int i_level() {
        return this.io.getIntField(this, 5);
    }
    @Field(5) 
    public libvlc_media_track_t i_level(int i_level) {
        this.io.setIntField(this, 5, i_level);
        return this;
    }
    /** C type : field1_union */
    @Field(6) 
    public libvlc_media_track_t.field1_union field1() {
        return this.io.getNativeObjectField(this, 6);
    }
    /** C type : field1_union */
    @Field(6) 
    public libvlc_media_track_t field1(libvlc_media_track_t.field1_union field1) {
        this.io.setNativeObjectField(this, 6, field1);
        return this;
    }
    @Field(7) 
    public int i_bitrate() {
        return this.io.getIntField(this, 7);
    }
    @Field(7) 
    public libvlc_media_track_t i_bitrate(int i_bitrate) {
        this.io.setIntField(this, 7, i_bitrate);
        return this;
    }
    /** C type : char* */
    @Field(8) 
    public Pointer<Byte > psz_language() {
        return this.io.getPointerField(this, 8);
    }
    /** C type : char* */
    @Field(8) 
    public libvlc_media_track_t psz_language(Pointer<Byte > psz_language) {
        this.io.setPointerField(this, 8, psz_language);
        return this;
    }
    /** C type : char* */
    @Field(9) 
    public Pointer<Byte > psz_description() {
        return this.io.getPointerField(this, 9);
    }
    /** C type : char* */
    @Field(9) 
    public libvlc_media_track_t psz_description(Pointer<Byte > psz_description) {
        this.io.setPointerField(this, 9, psz_description);
        return this;
    }
    /** <i>native declaration : line 917</i> */
    @Union 
    public static class field1_union extends StructObject {
        static {
            BridJ.register();
        }
        /** C type : libvlc_audio_track_t* */
        @Field(0) 
        public Pointer<libvlc_audio_track_t > audio() {
            return this.io.getPointerField(this, 0);
        }
        /** C type : libvlc_audio_track_t* */
        @Field(0) 
        public field1_union audio(Pointer<libvlc_audio_track_t > audio) {
            this.io.setPointerField(this, 0, audio);
            return this;
        }
        /** C type : libvlc_video_track_t* */
        @Field(1) 
        public Pointer<libvlc_video_track_t > video() {
            return this.io.getPointerField(this, 1);
        }
        /** C type : libvlc_video_track_t* */
        @Field(1) 
        public field1_union video(Pointer<libvlc_video_track_t > video) {
            this.io.setPointerField(this, 1, video);
            return this;
        }
        /** C type : libvlc_subtitle_track_t* */
        @Field(2) 
        public Pointer<libvlc_subtitle_track_t > subtitle() {
            return this.io.getPointerField(this, 2);
        }
        /** C type : libvlc_subtitle_track_t* */
        @Field(2) 
        public field1_union subtitle(Pointer<libvlc_subtitle_track_t > subtitle) {
            this.io.setPointerField(this, 2, subtitle);
            return this;
        }
        public field1_union() {
            super();
        }
        public field1_union(Pointer pointer) {
            super(pointer);
        }
    };
    public libvlc_media_track_t() {
        super();
    }
    public libvlc_media_track_t(Pointer pointer) {
        super(pointer);
    }
}
