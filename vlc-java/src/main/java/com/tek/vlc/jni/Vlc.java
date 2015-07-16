package com.tek.vlc.jni;

public class Vlc {

    static {
        System.loadLibrary("libvlc");
    }

    public native String getVersion();
}
