package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzamo {
    private int zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private zzv zzg;
    private int zzh;
    private zzamq[] zzi;
    private int zzj;
    private zzhao zzk;
    private zzhao zzl;
    private boolean zzm;
    private int zzn;

    public zzamo() {
        this.zzb = -1;
        this.zzc = -1L;
        this.zzd = -1L;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzh = 0;
        this.zzm = true;
        this.zzn = -1;
    }

    /* synthetic */ zzamo(zzamp zzampVar, byte[] bArr) {
        this.zza = zzampVar.zza;
        this.zzb = zzampVar.zzb;
        this.zzc = zzampVar.zzc;
        this.zzd = zzampVar.zzd;
        this.zze = zzampVar.zze;
        this.zzf = zzampVar.zzf;
        this.zzg = zzampVar.zzg;
        this.zzh = zzampVar.zzh;
        this.zzi = zzampVar.zzb();
        this.zzj = zzampVar.zzk;
        this.zzk = zzampVar.zzi;
        this.zzl = zzampVar.zzj;
        this.zzm = zzampVar.zzm;
        this.zzn = zzampVar.zzl;
    }

    final /* synthetic */ zzhao zzA() {
        return this.zzl;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzm;
    }

    final /* synthetic */ int zzC() {
        return this.zzn;
    }

    public final zzamo zza(int i) {
        this.zza = i;
        return this;
    }

    public final zzamo zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzamo zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzamo zzd(long j) {
        this.zzd = j;
        return this;
    }

    public final zzamo zze(long j) {
        this.zze = j;
        return this;
    }

    public final zzamo zzf(long j) {
        this.zzf = j;
        return this;
    }

    public final zzamo zzg(zzv zzvVar) {
        this.zzg = zzvVar;
        return this;
    }

    public final zzamo zzh(int i) {
        this.zzh = i;
        return this;
    }

    public final zzamo zzi(zzamq[] zzamqVarArr) {
        this.zzi = (zzamq[]) zzamqVarArr.clone();
        return this;
    }

    public final zzamo zzj(int i) {
        this.zzj = i;
        return this;
    }

    public final zzamo zzk(zzhao zzhaoVar) {
        this.zzk = zzhaoVar;
        return this;
    }

    public final zzamo zzl(zzhao zzhaoVar) {
        this.zzl = zzhaoVar;
        return this;
    }

    public final zzamo zzm(boolean z) {
        this.zzm = z;
        return this;
    }

    public final zzamo zzn(int i) {
        this.zzn = i;
        return this;
    }

    final /* synthetic */ int zzp() {
        return this.zza;
    }

    final /* synthetic */ int zzq() {
        return this.zzb;
    }

    final /* synthetic */ long zzr() {
        return this.zzc;
    }

    final /* synthetic */ long zzs() {
        return this.zzd;
    }

    final /* synthetic */ long zzt() {
        return this.zze;
    }

    final /* synthetic */ long zzu() {
        return this.zzf;
    }

    final /* synthetic */ zzv zzv() {
        return this.zzg;
    }

    final /* synthetic */ int zzw() {
        return this.zzh;
    }

    final /* synthetic */ zzamq[] zzx() {
        return this.zzi;
    }

    final /* synthetic */ int zzy() {
        return this.zzj;
    }

    final /* synthetic */ zzhao zzz() {
        return this.zzk;
    }

    public final zzamp zzo() {
        this.zzg.getClass();
        return new zzamp(this, null);
    }
}
