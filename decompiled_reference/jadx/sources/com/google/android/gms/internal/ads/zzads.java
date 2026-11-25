package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzads implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzaew zze;
    private final zzdp zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzadx zzi;
    private zzfi zzj = new zzfi(10);
    private zzv zzk;
    private zzea zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzaew zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfm.zza(sparseArray, 0)) {
            return (zzaew) sparseArray.get(0);
        }
        zzadm zzadmVar = new zzadm(this, this.zza, 0);
        this.zzg.add(zzadmVar);
        sparseArray.put(0, zzadmVar);
        return zzadmVar;
    }

    public final void zzc(Surface surface, zzev zzevVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzev) this.zzm.second).equals(zzevVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzevVar);
        zzevVar.zza();
        zzevVar.zzb();
    }

    public final void zzd() {
        zzev zzevVar = zzev.zza;
        zzevVar.zza();
        zzevVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzea zzeaVar = this.zzl;
        if (zzeaVar != null) {
            zzeaVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[Catch: zzdx -> 0x0094, TRY_LEAVE, TryCatch #0 {zzdx -> 0x0094, blocks: (B:7:0x0010, B:9:0x0015, B:11:0x001b, B:14:0x0022, B:16:0x0030, B:18:0x0036, B:21:0x003d, B:26:0x005e), top: B:36:0x0010 }] */
    final /* synthetic */ boolean zzi(zzv zzvVar, int i) throws zzaev {
        zzgtr.zzi(this.zzo == 0);
        zzi zziVarZzC = zzC(zzvVar.zzF);
        try {
            int i2 = zziVarZzC.zzd;
            if (i2 != 7) {
                if (zzdy.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i2)};
                    String str = zzfm.zza;
                    zzeh.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zziVarZzC = zzi.zza;
                } else if (i2 != 2 || i2 == 10) {
                    zziVarZzC = zzi.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdy.zzd()) {
                i2 = 7;
                if (zzdy.zzc(i2)) {
                    if (i2 != 2) {
                        zziVarZzC = zzi.zza;
                    } else {
                        zziVarZzC = zzi.zza;
                    }
                } else if (i2 != 2) {
                    zziVarZzC = zzi.zza;
                } else {
                    zziVarZzC = zzi.zza;
                }
            } else {
                zzh zzhVarZzd = zziVarZzC.zzd();
                zzhVarZzd.zzc(6);
                zziVarZzC = zzhVarZzd.zzg();
            }
            zzi zziVar = zziVarZzC;
            zzdp zzdpVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            this.zzl = zzdpVar.zzd(looperMyLooper, null);
            try {
                zzbs zzbsVar = this.zzb;
                Context context = this.zza;
                zzl zzlVar = zzl.zzb;
                final zzea zzeaVar = this.zzl;
                Objects.requireNonNull(zzeaVar);
                zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadl
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzeaVar.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e) {
                throw new zzaev(e, zzvVar);
            }
        } catch (zzdx e2) {
            throw new zzaev(e2, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j, long j2) throws zzaev {
        this.zze.zzv(j, j2);
    }

    final /* synthetic */ void zzm(boolean z) {
        zzfi zzfiVar;
        if (this.zzo == 1) {
            this.zzn++;
            zzaew zzaewVar = this.zze;
            zzaewVar.zzg(z);
            while (true) {
                int iZzc = this.zzj.zzc();
                zzfiVar = this.zzj;
                if (iZzc <= 1) {
                    break;
                } else {
                    zzfiVar.zzd();
                }
            }
            if (zzfiVar.zzc() == 1) {
                zzadr zzadrVar = (zzadr) this.zzj.zzd();
                zzadrVar.getClass();
                zzaewVar.zzs(1, this.zzk, zzadrVar.zza, zzadrVar.zzb, zzgwt.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z) {
                this.zzq = -9223372036854775807L;
            }
            zzea zzeaVar = this.zzl;
            zzeaVar.getClass();
            zzeaVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzadt zzadtVar) {
        this.zze.zzl(zzadtVar);
    }

    final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzadx zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzfi zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzfi zzfiVar) {
        this.zzj = zzfiVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }

    /* synthetic */ zzads(zzadk zzadkVar, byte[] bArr) {
        this.zza = zzadkVar.zze();
        zzbs zzbsVarZzg = zzadkVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgwt.zzi();
        this.zzd = zzadkVar.zzh();
        zzdp zzdpVarZzi = zzadkVar.zzi();
        this.zzf = zzdpVarZzi;
        this.zzh = -zzadkVar.zzj();
        zzadx zzadxVarZzk = zzadkVar.zzk();
        this.zzi = zzadxVarZzk;
        this.zze = new zzacx(zzadkVar.zzf(), zzadxVarZzk, zzdpVarZzi);
        new zzadj(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzP();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }
}
