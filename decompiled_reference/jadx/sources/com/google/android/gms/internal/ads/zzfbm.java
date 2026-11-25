package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbm implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;
    private final zzflg zzc;
    private final VersionInfoParcel zzd;

    zzfbm(Context context, zzhcp zzhcpVar, zzflg zzflgVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzhcpVar;
        this.zzc = zzflgVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0043 A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00be A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d0 A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee A[Catch: IOException -> 0x0124, TryCatch #0 {IOException -> 0x0124, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:9:0x002f, B:14:0x0055, B:15:0x0079, B:17:0x008b, B:19:0x00a1, B:21:0x00aa, B:26:0x00d0, B:28:0x00ee, B:29:0x0112, B:31:0x011d, B:24:0x00be, B:12:0x0043), top: B:36:0x0000 }] */
    final /* synthetic */ zzfbn zzc() {
        zzgcr zzgcrVar;
        boolean z;
        boolean zZze;
        zzgcw zzgcwVarZzh;
        zzgcs zzgcsVarZza;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzgcr zzgcrVar2 = new zzgcr();
            zzgcr zzgcrVar3 = new zzgcr();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeh)).booleanValue()) {
                    return new zzfbn(true);
                }
            }
            if (!zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzed)).booleanValue()) {
                    zzgcrVar2 = zzgcv.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeo)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                } else if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzef)).booleanValue()) {
                        zzgcrVar2 = zzgcv.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeo)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                    }
                }
            } else if (zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzef)).booleanValue()) {
                    zzgcrVar2 = zzgcv.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeo)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzel)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzek)).intValue()) {
                    zzgcw.zzh(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeg)).booleanValue()) {
                        zzgcwVarZzh = zzgcw.zzh(context);
                        zzgcsVarZza = zzgcs.zza(context);
                        if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzek)).intValue()) {
                            zzgcrVar3 = zzgcwVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzep)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                            zZzc = zzgcsVarZza.zzc();
                        }
                        zZze = zzgcsVarZza.zze();
                        zzgcrVar = zzgcrVar3;
                        z = zZzc;
                    }
                }
                zzgcrVar = zzgcrVar3;
                z = true;
                zZze = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzee)).booleanValue()) {
                    zzgcwVarZzh = zzgcw.zzh(context);
                    zzgcsVarZza = zzgcs.zza(context);
                    if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzek)).intValue()) {
                        zzgcrVar3 = zzgcwVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzep)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                        zZzc = zzgcsVarZza.zzc();
                    }
                    zZze = zzgcsVarZza.zze();
                    zzgcrVar = zzgcrVar3;
                    z = zZzc;
                } else {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeg)).booleanValue()) {
                            zzgcwVarZzh = zzgcw.zzh(context);
                            zzgcsVarZza = zzgcs.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzek)).intValue()) {
                                zzgcrVar3 = zzgcwVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzep)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzp().zzx());
                                zZzc = zzgcsVarZza.zzc();
                            }
                            zZze = zzgcsVarZza.zze();
                            zzgcrVar = zzgcrVar3;
                            z = zZzc;
                        }
                    }
                    zzgcrVar = zzgcrVar3;
                    z = true;
                    zZze = true;
                }
            }
            return new zzfbn(zzgcrVar2, zzgcrVar, z, zZze, zZza);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "PerAppIdSignal");
            return new zzfbn(this.zzc.zza());
        }
    }
}
