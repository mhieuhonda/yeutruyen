package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawo {
    public final zzavj zza;
    public final zzawk zzb;
    public final zzawh zzc;
    public final zzawc zzd;

    public zzawo(zzavj zzavjVar, zzawk zzawkVar, zzawc zzawcVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        this.zza = zzavjVar;
        this.zzb = zzawkVar;
        this.zzd = zzawcVar;
        this.zzc = new zzawh((i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6)) ^ (i8 % 454333378));
    }

    public final Optional zza() {
        zzavd zzavdVar;
        try {
            ArrayDeque arrayDeque = this.zzc.zza;
            if (arrayDeque.isEmpty()) {
                throw new zzawg();
            }
            zzawe zzaweVar = (zzawe) arrayDeque.pop();
            long j = zzaweVar.zza;
            long j2 = zzaweVar.zzb;
            long j3 = zzaweVar.zzc;
            zzawk zzawkVar = this.zzb;
            if (zzawkVar.zzb < j2) {
                return Optional.of(zzavd.zzG);
            }
            this.zzd.zza(j);
            if (j3 == 0) {
                while (zzawkVar.zzb > j2) {
                    zzawkVar.zzc();
                }
            }
            return Optional.empty();
        } catch (zzawa e) {
            e = e;
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawb e2) {
            e = e2;
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
        } catch (zzawg unused) {
            zzavdVar = zzavd.zzw;
            return Optional.of(zzavdVar);
        } catch (zzawi unused2) {
            zzavdVar = zzavd.zzG;
            return Optional.of(zzavdVar);
        }
    }
}
