package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzana {
    private final zzanb zza = new zzanb();
    private final zzeu zzb = new zzeu(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzana() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzanb zzanbVar = this.zza;
            if (i5 >= zzanbVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzanbVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final zzanb zzc() {
        return this.zza;
    }

    public final zzeu zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzeu zzeuVar = this.zzb;
        if (zzeuVar.zzi().length == 65025) {
            return;
        }
        zzeuVar.zzb(Arrays.copyOf(zzeuVar.zzi(), Math.max(65025, zzeuVar.zze())), zzeuVar.zze());
    }

    public final boolean zzb(zzagb zzagbVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                zzanb zzanbVar = this.zza;
                if (!zzanbVar.zzb(zzagbVar, -1L) || !zzanbVar.zzc(zzagbVar, true)) {
                    return false;
                }
                int iZzf = zzanbVar.zzd;
                if ((zzanbVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzage.zzd(zzagbVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i2 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzeu zzeuVar = this.zzb;
                zzeuVar.zzc(zzeuVar.zze() + iZzf2);
                if (!zzage.zzc(zzagbVar, zzeuVar.zzi(), zzeuVar.zze(), iZzf2)) {
                    return false;
                }
                zzeuVar.zzf(zzeuVar.zze() + iZzf2);
                this.zze = this.zza.zzf[i2 + (-1)] != 255;
            }
            if (i2 == this.zza.zzc) {
                i2 = -1;
            }
            this.zzc = i2;
        }
    }
}
