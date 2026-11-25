package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzcya implements zzepm {
    protected final zzfky zza;
    protected final zzfkn zzb;
    private final zzddy zzc;
    private final zzdel zzd;
    private final zzfib zze;
    private final zzdcs zzf;
    private final zzdhq zzg;
    private final zzdep zzh;
    private final zzdkv zzi;
    private final zzdbv zzj;
    private final zzeaw zzk;

    protected zzcya(zzcxz zzcxzVar) {
        this.zza = zzcxzVar.zza();
        this.zzb = zzcxzVar.zzb();
        this.zzc = zzcxzVar.zzc();
        this.zzd = zzcxzVar.zzd();
        this.zze = zzcxzVar.zze();
        this.zzf = zzcxzVar.zzf();
        this.zzg = zzcxzVar.zzg();
        this.zzh = zzcxzVar.zzh();
        this.zzi = zzcxzVar.zzi();
        this.zzj = zzcxzVar.zzj();
        this.zzk = zzcxzVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzddy zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzdcs zzn() {
        return this.zzf;
    }

    public final zzdbv zzo() {
        return this.zzj;
    }

    public final zzfib zzp() {
        return this.zze;
    }

    public final zzdgp zzq() {
        return this.zzg.zzn();
    }

    public final zzfky zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        zzeaw zzeawVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzeawVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziR)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzgzi zzgziVarListIterator = ((zzgwt) list).listIterator(0);
        while (zzgziVarListIterator.hasNext()) {
            zzeax zzeaxVar = (zzeax) zzgziVarListIterator.next();
            for (int i : zzeaxVar.zzb) {
                if (i == 1) {
                    zzeawVar.zza(zzeaxVar.zza, 1, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    break;
                }
            }
        }
    }
}
