package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdiy {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfib zzo;

    final /* synthetic */ Set zzA() {
        return this.zzm;
    }

    final /* synthetic */ Set zzB() {
        return this.zzn;
    }

    final /* synthetic */ zzfib zzC() {
        return this.zzo;
    }

    public final zzdiy zza(zzdcz zzdczVar, Executor executor) {
        this.zze.add(new zzdky(zzdczVar, executor));
        return this;
    }

    public final zzdiy zzb(zzden zzdenVar, Executor executor) {
        this.zzh.add(new zzdky(zzdenVar, executor));
        return this;
    }

    public final zzdiy zzc(zzddc zzddcVar, Executor executor) {
        this.zzi.add(new zzdky(zzddcVar, executor));
        return this;
    }

    public final zzdiy zzd(zzddp zzddpVar, Executor executor) {
        this.zzl.add(new zzdky(zzddpVar, executor));
        return this;
    }

    public final zzdiy zze(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdky(appEventListener, executor));
        return this;
    }

    public final zzdiy zzf(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdky(zzaVar, executor));
        return this;
    }

    public final zzdiy zzg(zzdlg zzdlgVar, Executor executor) {
        this.zzd.add(new zzdky(zzdlgVar, executor));
        return this;
    }

    public final zzdiy zzh(zzddt zzddtVar, Executor executor) {
        this.zzf.add(new zzdky(zzddtVar, executor));
        return this;
    }

    public final zzdiy zzi(zzdey zzdeyVar, Executor executor) {
        this.zzg.add(new zzdky(zzdeyVar, executor));
        return this;
    }

    public final zzdiy zzj(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdky(zzrVar, executor));
        return this;
    }

    public final zzdiy zzk(zzdfq zzdfqVar, Executor executor) {
        this.zzm.add(new zzdky(zzdfqVar, executor));
        return this;
    }

    public final zzdiy zzl(zzfib zzfibVar) {
        this.zzo = zzfibVar;
        return this;
    }

    public final zzdiy zzm(zzdgf zzdgfVar, Executor executor) {
        this.zzb.add(new zzdky(zzdgfVar, executor));
        return this;
    }

    public final zzdiz zzn() {
        return new zzdiz(this, null);
    }

    final /* synthetic */ Set zzo() {
        return this.zza;
    }

    final /* synthetic */ Set zzp() {
        return this.zzb;
    }

    final /* synthetic */ Set zzq() {
        return this.zzc;
    }

    final /* synthetic */ Set zzr() {
        return this.zzd;
    }

    final /* synthetic */ Set zzs() {
        return this.zze;
    }

    final /* synthetic */ Set zzt() {
        return this.zzf;
    }

    final /* synthetic */ Set zzu() {
        return this.zzg;
    }

    final /* synthetic */ Set zzv() {
        return this.zzh;
    }

    final /* synthetic */ Set zzw() {
        return this.zzi;
    }

    final /* synthetic */ Set zzx() {
        return this.zzj;
    }

    final /* synthetic */ Set zzy() {
        return this.zzk;
    }

    final /* synthetic */ Set zzz() {
        return this.zzl;
    }
}
