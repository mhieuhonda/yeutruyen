package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzckq extends zzcha {
    private final zzchv zzc;
    private zzckr zzd;
    private Uri zze;
    private zzcgz zzf;
    private boolean zzg;
    private int zzh;

    public zzckq(Context context, zzchv zzchvVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzchvVar;
        zzchvVar.zza(this);
    }

    @EnsuresNonNullIf(expression = {"immersiveAdPlayer"}, result = true)
    private final boolean zzu() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzb(zzcgz zzcgzVar) {
        this.zzf = zzcgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzc(String str) {
        if (str != null) {
            this.zze = Uri.parse(str);
            this.zzd = new zzckr(this.zze.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzckr zzckrVar = this.zzd;
        if (zzckrVar != null) {
            zzckrVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcko
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzi(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final void zzj(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcha
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcha, com.google.android.gms.internal.ads.zzchx
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        zzcgz zzcgzVar = this.zzf;
        if (zzcgzVar != null) {
            zzcgzVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        zzcgz zzcgzVar = this.zzf;
        if (zzcgzVar != null) {
            if (!this.zzg) {
                zzcgzVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        zzcgz zzcgzVar = this.zzf;
        if (zzcgzVar != null) {
            zzcgzVar.zzd();
        }
    }
}
