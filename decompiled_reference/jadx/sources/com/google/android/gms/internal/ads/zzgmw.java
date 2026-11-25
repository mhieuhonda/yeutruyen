package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgmw implements zzgmp {
    private final Context zza;
    private final zzimt zzb;
    private final zzgng zzc;
    private final zzgqo zzd;
    private final ExecutorService zze;
    private final zzgll zzf;
    private final zzfxq zzg;

    zzgmw(Context context, zzimt zzimtVar, zzgng zzgngVar, zzgqo zzgqoVar, ExecutorService executorService, zzgll zzgllVar, zzfxq zzfxqVar) {
        this.zza = context;
        this.zzb = zzimtVar;
        this.zzc = zzgngVar;
        this.zzd = zzgqoVar;
        this.zze = executorService;
        this.zzf = zzgllVar;
        this.zzg = zzfxqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgfz zzf(int i) {
        zzgfy zzgfyVarZzd = zzgfz.zzd();
        zzgfyVarZzd.zzd(i);
        return (zzgfz) zzgfyVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgmp
    public final ListenableFuture zza() {
        final zzimt zzimtVar = this.zzb;
        Objects.requireNonNull(zzimtVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgmr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzimtVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzhbx zzhbxVar = (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzk(zzhbx.zzw(zzhcf.zzd(callable, executorService)), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmv
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzbdz) obj);
                return new Integer(0);
            }
        }, zzhcw.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgms
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzhcw.zza()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzggb) obj);
            }
        }, executorService), zzgmq.class, zzgmu.zza, zzhcw.zza());
        this.zzd.zze(15202, zzhbxVar);
        return zzhbxVar;
    }

    final /* synthetic */ int zzb(zzbdz zzbdzVar) {
        if (zzfyn.zza(zzbdzVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbdzVar.name());
        throw new zzgmq(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zzb();
    }

    final /* synthetic */ zzgfz zzd(zzggb zzggbVar) {
        String strZza = zzggbVar.zza().zza();
        String strZzb = zzggbVar.zza().zzb();
        zzgqm zzgqmVarZza = this.zzd.zza(15203);
        try {
            zzgqmVarZza.zza();
            zzfze zzfzeVarZza = zzfxz.zza(this.zza, 1, (zzbdz) this.zzb.zzb(), strZza, strZzb, "1", this.zzg);
            zzgqmVarZza.zzc();
            int i = 2;
            if (zzfzeVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfzeVarZza.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(5010);
                return zzf(8);
            }
            try {
                zzbeb zzbebVarZze = zzbeb.zze(bArr, zzidz.zzc());
                if (zzbebVarZze.zza().zza().isEmpty() || zzbebVarZze.zza().zzb().isEmpty() || zzbebVarZze.zzc().zzA().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzggbVar.equals(zzggb.zzh()) || !TextUtils.equals(zzggbVar.zza().zza(), zzbebVarZze.zza().zza()) || !TextUtils.equals(zzggbVar.zza().zzb(), zzbebVarZze.zza().zzb())) {
                        int i2 = zzfzeVarZza.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zzbebVarZze.zzb().zzA())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        zzgfy zzgfyVarZzd = zzgfz.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            if (i2 != 4) {
                                i = i2 != 6 ? 1 : 5;
                            } else {
                                i = 3;
                            }
                        }
                        zzgfyVarZzd.zzd(i);
                        zzgga zzggaVarZzg = zzggb.zzg();
                        zzggaVarZzg.zza(zzbebVarZze.zza());
                        zzggaVarZzg.zzc((zzbdz) this.zzb.zzb());
                        zzgfyVarZzd.zza((zzggb) zzggaVarZzg.zzbu());
                        zzgfyVarZzd.zzc(zzbebVarZze.zzb());
                        zzgfyVarZzd.zzb(zzbebVarZze.zzc());
                        return (zzgfz) zzgfyVarZzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzifh e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th) {
            try {
                zzgqmVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVarZza.zzc();
                throw th2;
            }
        }
    }
}
