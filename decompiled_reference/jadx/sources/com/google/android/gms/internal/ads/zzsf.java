package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsf extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzv zzc;

    public zzsf(int i, zzv zzvVar, boolean z) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25);
        sb.append("AudioTrack write failed: ");
        sb.append(i);
        super(sb.toString());
        this.zzb = z;
        this.zza = i;
        this.zzc = zzvVar;
    }
}
