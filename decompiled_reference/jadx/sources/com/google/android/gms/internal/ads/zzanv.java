package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzanv implements zzahm {
    private final zzahm zza;
    private final zzanq zzb;
    private zzans zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfm.zzb;
    private final zzeu zzc = new zzeu();

    public zzanv(zzahm zzahmVar, zzanq zzanqVar) {
        this.zza = zzahmVar;
        this.zzb = zzanqVar;
    }

    private final void zzi(int i) {
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zzd;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i3);
        this.zzd = 0;
        this.zze = i3;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzgtr.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanq zzanqVar = this.zzb;
            this.zzg = zzanqVar.zza(zzvVar) ? zzanqVar.zzc(zzvVar) : null;
        }
        zzans zzansVar = this.zzg;
        zzahm zzahmVar = this.zza;
        if (zzansVar == null) {
            zzahmVar.zzA(zzvVar);
            return;
        }
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzo("application/x-media3-cues");
        zztVarZza.zzk(str);
        zztVarZza.zzt(Long.MAX_VALUE);
        zztVarZza.zzN(this.zzb.zzb(zzvVar));
        zzahmVar.zzA(zztVarZza.zzP());
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i, z, 0);
        }
        zzi(i);
        int iZza = zzjVar.zza(this.zzf, this.zze, i);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzd(zzeuVar, i, i2);
            return;
        }
        zzi(i);
        zzeuVar.zzm(this.zzf, this.zze, i);
        this.zze += i;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zze(final long j, final int i, int i2, int i3, zzahl zzahlVar) {
        if (this.zzg == null) {
            this.zza.zze(j, i, i2, i3, zzahlVar);
            return;
        }
        zzgtr.zzb(zzahlVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, zzanr.zza(), new zzdu() { // from class: com.google.android.gms.internal.ads.zzanu
                @Override // com.google.android.gms.internal.ads.zzdu
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j, i, (zzank) obj);
                }
            });
        } catch (RuntimeException e) {
            if (!this.zzi) {
                throw e;
            }
            zzeh.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z) {
        this.zzi = true;
    }

    final /* synthetic */ void zzh(long j, int i, zzank zzankVar) {
        this.zzh.getClass();
        zzgwt zzgwtVar = zzankVar.zza;
        long j2 = zzankVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgwtVar.size());
        Iterator<E> it = zzgwtVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcy) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzeu zzeuVar = this.zzc;
        int length = bArrMarshall.length;
        zzeuVar.zzb(bArrMarshall, length);
        zzahm zzahmVar = this.zza;
        zzahmVar.zzc(zzeuVar, length);
        long j3 = zzankVar.zzb;
        zzv zzvVar = this.zzh;
        if (j3 == -9223372036854775807L) {
            zzgtr.zzi(zzvVar.zzu == Long.MAX_VALUE);
        } else {
            long j4 = zzvVar.zzu;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzahmVar.zze(j, i | 1, length, 0, null);
    }
}
