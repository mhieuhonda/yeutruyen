package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhxx implements zzhmg {
    static final /* synthetic */ zzhxx zza = new zzhxx();

    private /* synthetic */ zzhxx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmg
    public final /* synthetic */ zzhod zza(zzhdz zzhdzVar, zzhey zzheyVar) {
        zzhvj zzhvjVar = (zzhvj) zzhdzVar;
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhyc.zzm(zzhvjVar).zzaM(), zzhta.ASYMMETRIC_PUBLIC, zzhyc.zzh(zzhvjVar.zzf().zzf()), zzhvjVar.zzb());
    }
}
