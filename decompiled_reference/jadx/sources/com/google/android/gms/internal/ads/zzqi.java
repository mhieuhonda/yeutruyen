package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqi {
    public static final zzqi zza;
    public final int zzb;
    public final int zzc;
    private final zzgxd zzd;

    static {
        zzqi zzqiVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgxc zzgxcVar = new zzgxc();
            for (int i = 1; i <= 10; i++) {
                zzgxcVar.zzf(Integer.valueOf(zzfm.zzG(i)));
            }
            zzqiVar = new zzqi(2, zzgxcVar.zzh());
        } else {
            zzqiVar = new zzqi(2, 10);
        }
        zza = zzqiVar;
    }

    public zzqi(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzqi(int i, Set set) {
        this.zzb = i;
        zzgxd zzgxdVarZzp = zzgxd.zzp(set);
        this.zzd = zzgxdVarZzp;
        zzgzh it = zzgxdVarZzp.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqi)) {
            return false;
        }
        zzqi zzqiVar = (zzqi) obj;
        return this.zzb == zzqiVar.zzb && this.zzc == zzqiVar.zzc && Objects.equals(this.zzd, zzqiVar.zzd);
    }

    public final int hashCode() {
        zzgxd zzgxdVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgxdVar == null ? 0 : zzgxdVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + String.valueOf(strValueOf).length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i);
        sb.append(", maxChannelCount=");
        sb.append(i2);
        sb.append(", channelMasks=");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    public final int zza(int i, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.zzb;
        if (i2 < 29) {
            Integer num = (Integer) zzqj.zzb.getOrDefault(Integer.valueOf(i3), 0);
            num.getClass();
            return num.intValue();
        }
        for (int i4 = 10; i4 > 0; i4--) {
            int iZzG = zzfm.zzG(i4);
            if (iZzG != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i3).setSampleRate(i).setChannelMask(iZzG).build(), zzdVar.zza())) {
                return i4;
            }
        }
        return 0;
    }

    final /* synthetic */ boolean zzb(int i, zzv zzvVar) {
        zzgxd zzgxdVar = this.zzd;
        if (zzgxdVar == null) {
            return i <= this.zzc;
        }
        int iZzG = zzvVar.zzI;
        if (iZzG == -1 || zzvVar.zzH != i) {
            iZzG = zzfm.zzG(i);
        }
        if (iZzG != 0) {
            return zzgxdVar.contains(Integer.valueOf(iZzG));
        }
        return false;
    }
}
