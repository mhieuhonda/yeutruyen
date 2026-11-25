package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvi extends zzdut implements zzdlg {
    private zzdlg zza;

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final synchronized void zzdR() {
        zzdlg zzdlgVar = this.zza;
        if (zzdlgVar != null) {
            zzdlgVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final synchronized void zzdu() {
        zzdlg zzdlgVar = this.zza;
        if (zzdlgVar != null) {
            zzdlgVar.zzdu();
        }
    }

    protected final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbon zzbonVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbop zzbopVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdlg zzdlgVar) throws Throwable {
        try {
            try {
                super.zzm(zzaVar, zzbonVar, zzrVar, zzbopVar, zzadVar);
                this.zza = zzdlgVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
