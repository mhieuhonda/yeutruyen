package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqw extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqw(int i, boolean z) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("AudioOutput write failed: ");
        sb.append(i);
        super(sb.toString());
        this.zzb = z;
        this.zza = i;
    }
}
