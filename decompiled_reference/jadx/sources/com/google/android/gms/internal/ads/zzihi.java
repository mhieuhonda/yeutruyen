package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzihi extends zzihj {
    zzihi(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zza(Object obj, long j, byte b) {
        if (zzihk.zzb) {
            zzihk.zzE(obj, j, b);
        } else {
            zzihk.zzF(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final boolean zzb(Object obj, long j) {
        return zzihk.zzb ? zzihk.zzv(obj, j) : zzihk.zzw(obj, j);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzihk.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzihk.zzy(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzihk.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzihk.zzy(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzc(Object obj, long j, boolean z) {
        if (zzihk.zzb) {
            zzihk.zzx(obj, j, z);
        } else {
            zzihk.zzy(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzihj
    public final byte zzh(long j) {
        return Memory.peekByte(j);
    }
}
