package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzavm implements zzavl {
    @Override // com.google.android.gms.internal.ads.zzavl
    public final byte zza(zzavx zzavxVar, int i) {
        return zzavxVar.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final zzavx zzb(zzavx zzavxVar, int i, int i2) {
        byte[] bArr;
        int length;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzavxVar.zza).length) || i > i2 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzavx(zzavx.zzh(bArr, i, i2 - i));
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final zzavl zzc() {
        return new zzavm();
    }
}
