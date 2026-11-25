package com.github.dart_lang.jni;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes.dex */
public class PortContinuation<T> implements Continuation<T> {
    private final long port;

    private native void _resumeWith(long j, Object obj);

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j) {
        this.port = j;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return Dispatchers.getIO();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
