package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzhs extends IOException {
    public final int zza;

    public zzhs(int i) {
        this.zza = i;
    }

    public zzhs(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzhs(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzhs(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
