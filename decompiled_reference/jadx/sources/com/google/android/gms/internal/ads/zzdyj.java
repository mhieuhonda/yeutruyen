package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.location.LocationRequest;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyj implements zzdgf, zzden, zzddc, zzddt, com.google.android.gms.ads.internal.client.zza, zzdiq {
    private final zzbhw zza;
    private boolean zzb = false;

    public zzdyj(zzbhw zzbhwVar, @Nullable zzfii zzfiiVar) {
        this.zza = zzbhwVar;
        zzbhwVar.zzc(2);
        if (zzfiiVar != null) {
            zzbhwVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        boolean z = this.zzb;
        zzbhw zzbhwVar = this.zza;
        if (z) {
            zzbhwVar.zzc(8);
        } else {
            zzbhwVar.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(TypedValues.TYPE_TARGET);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(LocationRequest.PRIORITY_NO_POWER);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(final zzfky zzfkyVar) {
        this.zza.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyi
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzbic.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbic.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfkyVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzj(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyf
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzk(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyg
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzl(final zzbic.zzb zzbVar) {
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyh
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzm(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdiq
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
