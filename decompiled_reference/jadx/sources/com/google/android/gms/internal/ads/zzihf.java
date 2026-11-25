package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzihf extends zzihd {
    zzihf() {
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* bridge */ /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzihe) obj).zzk(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i, int i2) {
        ((zzihe) obj).zzk((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zzihe) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i, zzidl zzidlVar) {
        ((zzihe) obj).zzk((i << 3) | 2, zzidlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* bridge */ /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zzihe) obj).zzk((i << 3) | 3, (zzihe) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* synthetic */ Object zzf() {
        return zzihe.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* synthetic */ Object zzg(Object obj) {
        zzihe zziheVar = (zzihe) obj;
        zziheVar.zzd();
        return zziheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != zzihe.zza()) {
            return zziheVar;
        }
        zzihe zziheVarZzb = zzihe.zzb();
        zziepVar.zzt = zziheVarZzb;
        return zziheVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zziep) obj).zzt = (zzihe) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzihd
    final void zzj(Object obj) {
        ((zziep) obj).zzt.zzd();
    }
}
