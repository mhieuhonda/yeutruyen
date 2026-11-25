package com.github.dart_lang.jni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
class PortCleaner {
    private final ReferenceQueue<Object> queue = new ReferenceQueue<>();
    private final PortPhantom list = new PortPhantom();

    private static native void clean(long j);

    static {
        System.loadLibrary("dartjni");
    }

    private class PortPhantom extends PhantomReference<Object> {
        PortPhantom next;
        final long port;
        PortPhantom prev;

        PortPhantom(Object obj, long j) {
            super(obj, PortCleaner.this.queue);
            this.prev = this;
            this.next = this;
            this.port = j;
            insert();
        }

        PortPhantom() {
            super(null, null);
            this.prev = this;
            this.next = this;
            this.port = 0L;
        }

        void insert() {
            synchronized (PortCleaner.this.list) {
                this.prev = PortCleaner.this.list;
                PortPhantom portPhantom = PortCleaner.this.list.next;
                this.next = portPhantom;
                portPhantom.prev = this;
                PortCleaner.this.list.next = this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void remove() {
            synchronized (PortCleaner.this.list) {
                PortPhantom portPhantom = this.next;
                portPhantom.prev = this.prev;
                this.prev.next = portPhantom;
                this.prev = this;
                this.next = this;
            }
        }
    }

    PortCleaner() {
        Thread thread = new Thread(new Runnable() { // from class: com.github.dart_lang.jni.PortCleaner$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m227lambda$new$0$comgithubdart_langjniPortCleaner();
            }
        }, "PortCleaner");
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-github-dart_lang-jni-PortCleaner, reason: not valid java name */
    /* synthetic */ void m227lambda$new$0$comgithubdart_langjniPortCleaner() {
        while (true) {
            try {
                PortPhantom portPhantom = (PortPhantom) this.queue.remove();
                portPhantom.remove();
                if (portPhantom.port != 0) {
                    clean(portPhantom.port);
                }
            } catch (Throwable unused) {
            }
        }
    }

    void register(Object obj, long j) {
        new PortPhantom(obj, j);
    }
}
