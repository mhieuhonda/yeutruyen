package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgph implements zzgpe {
    private final zzgqo zza;
    private final long zzb;

    zzgph(zzgcy zzgcyVar, zzgqo zzgqoVar, long j) {
        this.zza = zzgqoVar;
        this.zzb = j;
    }

    private static boolean zzc(zzggb zzggbVar) {
        int iZza = zzggbVar.zzb().zza().zza();
        int iZzb = zzggbVar.zzb().zza().zzb();
        byte[] versionArray = zzavh.zza();
        Intrinsics.checkNotNullParameter(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zza(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzggbVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z = zzggbVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z) {
            this.zza.zzb(20203);
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzb(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzggbVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
