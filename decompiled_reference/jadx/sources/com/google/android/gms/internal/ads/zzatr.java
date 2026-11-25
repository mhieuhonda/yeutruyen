package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzatr {
    public final Object zza;
    public final zzasu zzb;
    public final zzatu zzc;
    public boolean zzd;

    private zzatr(zzatu zzatuVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzatuVar;
    }

    private zzatr(Object obj, zzasu zzasuVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzasuVar;
        this.zzc = null;
    }

    public static zzatr zza(Object obj, zzasu zzasuVar) {
        return new zzatr(obj, zzasuVar);
    }

    public static zzatr zzb(zzatu zzatuVar) {
        return new zzatr(zzatuVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
