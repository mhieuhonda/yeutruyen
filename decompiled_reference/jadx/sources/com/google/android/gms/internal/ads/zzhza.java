package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhza implements zzhmg {
    static final /* synthetic */ zzhza zza = new zzhza();

    private /* synthetic */ zzhza() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmg
    public final /* synthetic */ zzhod zza(zzhdz zzhdzVar, zzhey zzheyVar) {
        zzhxn zzhxnVar = (zzhxn) zzhdzVar;
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhzf.zzi(zzhxnVar).zzaM(), zzhta.ASYMMETRIC_PUBLIC, (zzhtx) zzhzf.zzj.zzb(zzhxnVar.zzf().zze()), zzhxnVar.zzb());
    }
}
