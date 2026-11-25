package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzwp implements zzye {
    private final zzagg zza;
    private zzaga zzb;
    private zzagb zzc;

    public zzwp(zzagg zzaggVar) {
        this.zza = zzaggVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    @Override // com.google.android.gms.internal.ads.zzye
    public final void zza(zzj zzjVar, Uri uri, Map map, long j, long j2, zzagd zzagdVar) throws IOException {
        zzafr zzafrVar = new zzafr(zzjVar, j, j2);
        this.zzc = zzafrVar;
        if (this.zzb != null) {
            return;
        }
        zzaga[] zzagaVarArrZzb = this.zza.zzb(uri, map);
        int length = zzagaVarArrZzb.length;
        zzgwq zzgwqVarZzv = zzgwt.zzv(length);
        if (length == 1) {
            this.zzb = zzagaVarArrZzb[0];
        } else {
            for (int i = 0; i < length; i++) {
                zzaga zzagaVar = zzagaVarArrZzb[i];
                try {
                    if (zzagaVar.zza(zzafrVar)) {
                        this.zzb = zzagaVar;
                        zzgtr.zzi(zzagaVar != null || zzafrVar.zzn() == j);
                        zzafrVar.zzl();
                        break;
                    } else {
                        zzgwqVarZzv.zzh(zzagaVar.zzb());
                        boolean z = this.zzb != null || zzafrVar.zzn() == j;
                        zzgtr.zzi(z);
                        zzafrVar.zzl();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzafrVar.zzn() == j) {
                    }
                } catch (Throwable th) {
                    zzgtr.zzi(this.zzb != null || zzafrVar.zzn() == j);
                    zzafrVar.zzl();
                    throw th;
                }
                zzgtr.zzi(z);
                zzafrVar.zzl();
            }
            if (this.zzb == null) {
                String strZzd = zzgtl.zzd(zzgxt.zzc(zzgwt.zzr(zzagaVarArrZzb), zzwo.zza), ", ");
                StringBuilder sb = new StringBuilder(strZzd.length() + 58);
                sb.append("None of the available extractors (");
                sb.append(strZzd);
                sb.append(") could read the stream.");
                throw new zzzp(sb.toString(), uri, zzgwqVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzb() {
        zzaga zzagaVar = this.zzb;
        if (zzagaVar != null) {
            zzagaVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzc() {
        zzaga zzagaVar = this.zzb;
        if (zzagaVar != null && (zzagaVar instanceof zzaku)) {
            ((zzaku) zzagaVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzd() {
        zzagb zzagbVar = this.zzc;
        if (zzagbVar != null) {
            return zzagbVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zze(long j, long j2) {
        zzaga zzagaVar = this.zzb;
        zzagaVar.getClass();
        zzagaVar.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final int zzf(zzaha zzahaVar) throws IOException {
        zzagb zzagbVar;
        zzaga zzagaVar = this.zzb;
        if (zzagaVar == null || (zzagbVar = this.zzc) == null) {
            throw null;
        }
        return zzagaVar.zzd(zzagbVar, zzahaVar);
    }
}
