package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzail implements zzaga {
    private zzagd zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaij zzo;
    private zzaip zzp;
    private final zzeu zza = new zzeu(4);
    private final zzeu zzb = new zzeu(9);
    private final zzeu zzc = new zzeu(11);
    private final zzeu zzd = new zzeu();
    private final zzaim zze = new zzaim();
    private int zzg = 1;

    static {
        int i = zzaik.zza;
    }

    private final zzeu zzh(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zzd;
        if (this.zzl > zzeuVar.zzj()) {
            int iZzj = zzeuVar.zzj();
            zzeuVar.zzb(new byte[Math.max(iZzj + iZzj, this.zzl)], 0);
        } else {
            zzeuVar.zzh(0);
        }
        zzeuVar.zzf(this.zzl);
        zzagbVar.zzc(zzeuVar.zzi(), 0, this.zzl);
        return zzeuVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new zzahc(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 3);
        zzeuVar.zzh(0);
        if (zzeuVar.zzx() != 4607062) {
            return false;
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        zzeuVar.zzh(0);
        if ((zzeuVar.zzt() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        zzagbVar.zzl();
        zzagbVar.zzk(iZzB);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        return zzeuVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzf = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        long j;
        boolean zZzf;
        boolean z;
        long j2;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                zzeu zzeuVar = this.zzb;
                if (!zzagbVar.zzb(zzeuVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzeuVar.zzh(0);
                zzeuVar.zzk(4);
                int iZzs = zzeuVar.zzs();
                int i3 = iZzs & 4;
                int i4 = iZzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new zzaij(this.zzf.zzs(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new zzaip(this.zzf.zzs(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzeuVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzagbVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                zzeu zzeuVar2 = this.zzc;
                if (!zzagbVar.zzb(zzeuVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzeuVar2.zzh(0);
                this.zzk = zzeuVar2.zzs();
                this.zzl = zzeuVar2.zzx();
                this.zzm = zzeuVar2.zzx();
                this.zzm = (((long) (zzeuVar2.zzs() << 24)) | this.zzm) * 1000;
                zzeuVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                if (this.zzh) {
                    j = this.zzi + this.zzm;
                } else {
                    j = this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                }
                int i5 = this.zzk;
                if (i5 == 8) {
                    if (this.zzo != null) {
                        zzi();
                        zZzf = this.zzo.zzf(zzh(zzagbVar), j);
                    }
                    z = true;
                    if (!this.zzh && zZzf) {
                        this.zzh = true;
                        if (this.zze.zzc() == -9223372036854775807L) {
                            j2 = -this.zzm;
                        } else {
                            j2 = 0;
                        }
                        this.zzi = j2;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    i2 = i5;
                }
                if (i2 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zZzf = this.zzp.zzf(zzh(zzagbVar), j);
                        z = true;
                    } else {
                        zzagbVar.zzf(this.zzl);
                        zZzf = false;
                        z = false;
                    }
                } else if (i2 != 18 || this.zzn) {
                    zzagbVar.zzf(this.zzl);
                    zZzf = false;
                    z = false;
                } else {
                    zzaim zzaimVar = this.zze;
                    zZzf = zzaimVar.zzf(zzh(zzagbVar), j);
                    long jZzc = zzaimVar.zzc();
                    if (jZzc != -9223372036854775807L) {
                        this.zzf.zzw(new zzagw(zzaimVar.zze(), zzaimVar.zzd(), jZzc));
                        this.zzn = true;
                    }
                    z = true;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    if (this.zze.zzc() == -9223372036854775807L) {
                        j2 = -this.zzm;
                    } else {
                        j2 = 0;
                    }
                    this.zzi = j2;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }
}
