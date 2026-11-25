package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaba {
    public final zzbg zza;
    public final int[] zzb;

    public zzaba(zzbg zzbgVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzeh.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
