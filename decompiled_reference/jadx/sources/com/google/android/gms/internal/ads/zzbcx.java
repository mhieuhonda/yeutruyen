package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbcx extends zzbdm {
    private final zzbbc zzh;
    private final long zzi;
    private final long zzj;

    public zzbcx(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i, int i2, zzbbc zzbbcVar, long j, long j2) {
        super(zzbbzVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzaxtVar, i, 11);
        this.zzh = zzbbcVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzbbc zzbbcVar = this.zzh;
        if (zzbbcVar != null) {
            zzbba zzbbaVar = new zzbba((String) this.zze.invoke(null, zzbbcVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzaxt zzaxtVar = this.zzd;
            synchronized (zzaxtVar) {
                zzaxtVar.zzf(zzbbaVar.zza.longValue());
                if (zzbbaVar.zzb.longValue() >= 0) {
                    zzaxtVar.zzW(zzbbaVar.zzb.longValue());
                }
                if (zzbbaVar.zzc.longValue() >= 0) {
                    zzaxtVar.zzX(zzbbaVar.zzc.longValue());
                }
            }
        }
    }
}
