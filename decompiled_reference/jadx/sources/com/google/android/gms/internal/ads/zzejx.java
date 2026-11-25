package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzejx implements zzfpt {
    private final zzejl zza;
    private final zzejp zzb;

    zzejx(zzejl zzejlVar, zzejp zzejpVar) {
        this.zza = zzejlVar;
        this.zzb = zzejpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhn)).booleanValue()) {
            if (zzfpm.RENDERER == zzfpmVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfpm.PRELOADED_LOADER == zzfpmVar || zzfpm.SERVER_TRANSACTION == zzfpmVar) {
                zzejl zzejlVar = this.zza;
                zzejlVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzejp zzejpVar = this.zzb;
                final long jZzb = zzejlVar.zzb();
                zzejpVar.zza.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejo
                    @Override // com.google.android.gms.internal.ads.zzfos
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzejpVar.zzf()) {
                            return null;
                        }
                        long j = jZzb;
                        zzbic.zzaf.zza.C0014zza c0014zzaZzz = zzbic.zzaf.zza.zzz();
                        c0014zzaZzz.zzad(j);
                        byte[] bArrZzaN = c0014zzaZzz.zzbu().zzaN();
                        zzejw.zzf(sQLiteDatabase, false, false);
                        zzejw.zze(sQLiteDatabase, j, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhn)).booleanValue() && zzfpm.RENDERER == zzfpmVar) {
            zzejl zzejlVar = this.zza;
            if (zzejlVar.zzh() != 0) {
                zzejlVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzejlVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhn)).booleanValue() && zzfpm.RENDERER == zzfpmVar) {
            zzejl zzejlVar = this.zza;
            if (zzejlVar.zzh() != 0) {
                zzejlVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzejlVar.zzh());
            }
        }
    }
}
