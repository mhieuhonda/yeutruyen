package com.github.dart_lang.jni;

/* JADX INFO: loaded from: classes.dex */
public class JniUtils {
    public static native Object fromReferenceAddress(long j);

    static {
        System.loadLibrary("dartjni");
    }
}
