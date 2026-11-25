package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgo extends zzffv {
    public zzfgo(Context context, Executor executor, zzcnq zzcnqVar, zzfie zzfieVar, zzfgm zzfgmVar, zzflf zzflfVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcnqVar, zzfieVar, zzfgmVar, zzflfVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzffv
    protected final /* bridge */ /* synthetic */ zzdcg zzc(zzcvp zzcvpVar, zzdcj zzdcjVar, zzdiz zzdizVar) {
        zzcvf zzcvfVarZzk = this.zza.zzk();
        zzcvfVarZzk.zzd(zzdcjVar);
        zzcvfVarZzk.zze(zzdizVar);
        return zzcvfVarZzk;
    }
}
