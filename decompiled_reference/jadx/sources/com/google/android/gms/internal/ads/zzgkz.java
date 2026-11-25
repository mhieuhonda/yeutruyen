package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgkz {
    private final zzgpe zza;
    private final zzgmp zzb;
    private final zzgng zzc;
    private final zzgqo zzd;
    private final zzgew zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgkz(zzgpe zzgpeVar, zzgmp zzgmpVar, zzgng zzgngVar, zzgqo zzgqoVar, zzgew zzgewVar, boolean z, long j, long j2) {
        this.zza = zzgpeVar;
        this.zzb = zzgmpVar;
        this.zzc = zzgngVar;
        this.zzd = zzgqoVar;
        this.zze = zzgewVar;
        this.zzf = z;
        this.zzg = j;
        this.zzh = j2;
    }

    private final ListenableFuture zzh(final int i) {
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzk(zzhbx.zzw(this.zzb.zza()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgfz zzgfzVar = (zzgfz) obj;
                this.zza.zzd(zzgfzVar);
                return zzgfzVar;
            }
        }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze((zzgfz) obj);
            }
        }, zzhcw.zza()), zzgks.zza, zzhcw.zza()), zzgkl.class, zzgkt.zza, zzhcw.zza()), zzgkm.class, zzgku.zza, zzhcw.zza()), zzgkk.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkv
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i, (zzgkk) obj);
            }
        }, zzhcw.zza());
        this.zzd.zze(1002, zzhbxVar);
        return zzhbxVar;
    }

    final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    final ListenableFuture zzb() {
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzg(zzhbx.zzw(this.zzc.zzb()), Throwable.class, zzgko.zza, zzhcw.zza());
        final zzgpe zzgpeVar = this.zza;
        Objects.requireNonNull(zzgpeVar);
        return (zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzk(zzhbxVar, new zzgti() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgpeVar.zza((zzggb) obj));
            }
        }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhcw.zza());
    }

    final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(PointerIconCompat.TYPE_HELP);
        return zzhcf.zza(zzgky.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    final /* synthetic */ zzgfz zzd(zzgfz zzgfzVar) {
        int iZzj = zzgfzVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzgfzVar;
        }
        if (iZzj == 3) {
            zzgqo zzgqoVar = this.zzd;
            int iZzj2 = zzgfzVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj2).length());
            sb.append(iZzj2);
            zzgqoVar.zzc(1004, sb.toString());
            throw new zzgkm(zzgfzVar.zzj() - 1);
        }
        zzgqo zzgqoVar2 = this.zzd;
        if (iZzj != 12) {
            int iZzj3 = zzgfzVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length());
            sb2.append(iZzj3);
            zzgqoVar2.zzc(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, sb2.toString());
            throw new zzgkl(zzgfzVar.zzj() - 1);
        }
        int iZzj4 = zzgfzVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj4).length());
        sb3.append(iZzj4);
        zzgqoVar2.zzc(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, sb3.toString());
        throw new zzgkk(zzgfzVar.zzj() - 1);
    }

    final /* synthetic */ ListenableFuture zze(zzgfz zzgfzVar) {
        if (zzgfzVar.zzj() == 2) {
            return this.zzc.zzd(zzgfzVar.zza(), zzgfzVar.zzb().zzA());
        }
        if (zzgfzVar.zzj() == 3) {
            return this.zzc.zzc(zzgfzVar.zza(), zzgfzVar.zzc().zzA(), zzgfzVar.zzb().zzA());
        }
        throw new AssertionError("Unreachable");
    }

    final /* synthetic */ zzgky zzf(final int i, zzgkk zzgkkVar) {
        if (this.zzf && i < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i)));
        }
        return zzgky.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i) {
        zzh(i + 1);
    }
}
