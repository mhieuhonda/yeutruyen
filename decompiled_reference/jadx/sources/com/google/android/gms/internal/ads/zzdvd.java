package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvd implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdzt zzc;
    private final zzeko zzd;
    private final Executor zze;
    private final zzbaw zzf;
    private final VersionInfoParcel zzg;
    private final zzfsm zzh;
    private final zzekz zzi;
    private final zzflk zzj;

    public zzdvd(Context context, Executor executor, zzbaw zzbawVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzclr zzclrVar, zzeko zzekoVar, zzfsm zzfsmVar, zzdzt zzdztVar, zzekz zzekzVar, zzflk zzflkVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzbawVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzekoVar;
        this.zzh = zzfsmVar;
        this.zzc = zzdztVar;
        this.zzi = zzekzVar;
        this.zzj = zzflkVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdvf zzdvfVar = new zzdvf(this);
        zzdvfVar.zza();
        return zzdvfVar;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    final /* synthetic */ zzdzt zzc() {
        return this.zzc;
    }

    final /* synthetic */ zzeko zzd() {
        return this.zzd;
    }

    final /* synthetic */ Executor zze() {
        return this.zze;
    }

    final /* synthetic */ zzbaw zzf() {
        return this.zzf;
    }

    final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    final /* synthetic */ zzfsm zzh() {
        return this.zzh;
    }

    final /* synthetic */ zzekz zzi() {
        return this.zzi;
    }

    final /* synthetic */ zzflk zzj() {
        return this.zzj;
    }
}
