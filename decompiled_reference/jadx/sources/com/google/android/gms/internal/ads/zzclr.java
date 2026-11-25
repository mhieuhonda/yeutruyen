package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzclr {
    public static final zzclb zza(final Context context, final zzcnl zzcnlVar, final String str, final boolean z, final boolean z2, final zzbaw zzbawVar, final zzbke zzbkeVar, final VersionInfoParcel versionInfoParcel, zzbjm zzbjmVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbhw zzbhwVar, final zzfkn zzfknVar, final zzfkq zzfkqVar, final zzekz zzekzVar, final zzflk zzflkVar, final zzdzt zzdztVar) throws zzclq {
        zzbix.zza(context);
        try {
            final zzbjm zzbjmVar2 = null;
            zzguj zzgujVar = new zzguj(context, zzcnlVar, str, z, z2, zzbawVar, zzbkeVar, versionInfoParcel, zzbjmVar2, zznVar, zzaVar, zzbhwVar, zzfknVar, zzfkqVar, zzflkVar, zzdztVar, zzekzVar) { // from class: com.google.android.gms.internal.ads.zzcln
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcnl zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzbaw zzf;
                private final /* synthetic */ zzbke zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbhw zzk;
                private final /* synthetic */ zzfkn zzl;
                private final /* synthetic */ zzfkq zzm;
                private final /* synthetic */ zzflk zzn;
                private final /* synthetic */ zzdzt zzo;
                private final /* synthetic */ zzekz zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbhwVar;
                    this.zzl = zzfknVar;
                    this.zzm = zzfkqVar;
                    this.zzn = zzflkVar;
                    this.zzo = zzdztVar;
                    this.zzp = zzekzVar;
                }

                @Override // com.google.android.gms.internal.ads.zzguj
                public final /* synthetic */ Object zza() {
                    zzcnl zzcnlVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzekz zzekzVar2 = this.zzp;
                    zzdzt zzdztVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbhw zzbhwVar2 = this.zzk;
                    zzfkn zzfknVar2 = this.zzl;
                    zzfkq zzfkqVar2 = this.zzm;
                    zzflk zzflkVar2 = this.zzn;
                    zzbaw zzbawVar2 = this.zzf;
                    zzbke zzbkeVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcme.zza;
                        zzclx zzclxVar = new zzclx(new zzcme(new zzcnd(context2), zzcnlVar2, str2, z3, z4, zzbawVar2, zzbkeVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbhwVar2, zzfknVar2, zzfkqVar2, zzflkVar2), zzdztVar2);
                        zzclxVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzclxVar, zzbhwVar2, z4, zzekzVar2));
                        zzclxVar.setWebChromeClient(new zzcla(zzclxVar));
                        return zzclxVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzclb) zzgujVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzclq("Webview initialization failed.", th);
        }
    }

    public static final ListenableFuture zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzbaw zzbawVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzekz zzekzVar, final zzflk zzflkVar, final zzdzt zzdztVar) {
        return zzhcf.zzf(new zzhbm() { // from class: com.google.android.gms.internal.ads.zzclp
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final /* synthetic */ ListenableFuture zza() throws zzclq {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzcnl zzcnlVarZzb = zzcnl.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbhw zzbhwVarZza = zzbhw.zza();
                zzekz zzekzVar2 = zzekzVar;
                zzflk zzflkVar2 = zzflkVar;
                zzdzt zzdztVar2 = zzdztVar;
                zzclb zzclbVarZza = zzclr.zza(context2, zzcnlVarZzb, "", false, false, zzbawVar, null, versionInfoParcel, null, null, zzaVar2, zzbhwVarZza, null, null, zzekzVar2, zzflkVar2, zzdztVar2);
                final zzcgc zzcgcVarZza = zzcgc.zza(zzclbVarZza);
                zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzclo
                    @Override // com.google.android.gms.internal.ads.zzcmx
                    public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                        zzcgcVarZza.zzb();
                    }
                });
                zzclbVarZza.loadUrl(str);
                return zzcgcVarZza;
            }
        }, zzcfy.zzf);
    }
}
