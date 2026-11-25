package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcs implements Callable {
    private final zzbbz zza;
    private final zzaxt zzb;

    public zzbcs(zzbbz zzbbzVar, zzaxt zzaxtVar) {
        this.zza = zzbbzVar;
        this.zzb = zzaxtVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbbz zzbbzVar = this.zza;
        if (zzbbzVar.zzm() != null) {
            zzbbzVar.zzm().get();
        }
        zzayt zzaytVarZzl = zzbbzVar.zzl();
        if (zzaytVarZzl == null) {
            return null;
        }
        try {
            zzaxt zzaxtVar = this.zzb;
            synchronized (zzaxtVar) {
                try {
                    zzaxtVar.zzaY(zzaytVarZzl.zzaN(), zzidz.zzb());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzifh | NullPointerException unused) {
            return null;
        }
    }
}
