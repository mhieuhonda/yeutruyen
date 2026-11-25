package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzxe extends zzwz {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzxe(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzxe zzp(zzak zzakVar) {
        return new zzxe(new zzxf(zzakVar), zzbe.zza, zzc);
    }

    public static zzxe zzq(zzbf zzbfVar, Object obj, Object obj2) {
        return new zzxe(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        this.zzb.zzd(i, zzbdVar, z);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i) {
        Object objZzf = this.zzb.zzf(i);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzxe zzr(zzbf zzbfVar) {
        return new zzxe(zzbfVar, this.zzd, this.zze);
    }

    final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
