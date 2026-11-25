package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapa implements zzans {
    private final zzeu zza = new zzeu();

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i, int i2, zzanr zzanrVar, zzdu zzduVar) {
        zzcy zzcyVarZzr;
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        while (zzeuVar.zzd() > 0) {
            zzgtr.zzb(zzeuVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iZzB = zzeuVar.zzB() - 8;
            if (zzeuVar.zzB() == 1987343459) {
                CharSequence charSequenceZzc = null;
                zzcx zzcxVarZzb = null;
                while (iZzB > 0) {
                    zzgtr.zzb(iZzB >= 8, "Incomplete vtt cue box header found.");
                    int iZzB2 = zzeuVar.zzB();
                    int iZzB3 = zzeuVar.zzB();
                    int i3 = iZzB - 8;
                    int i4 = iZzB2 - 8;
                    String strZzk = zzfm.zzk(zzeuVar.zzi(), zzeuVar.zzg(), i4);
                    zzeuVar.zzk(i4);
                    if (iZzB3 == 1937011815) {
                        zzcxVarZzb = zzapj.zzb(strZzk);
                    } else if (iZzB3 == 1885436268) {
                        charSequenceZzc = zzapj.zzc(null, strZzk.trim(), Collections.emptyList());
                    }
                    iZzB = i3 - i4;
                }
                if (charSequenceZzc == null) {
                    charSequenceZzc = "";
                }
                if (zzcxVarZzb != null) {
                    zzcxVarZzb.zza(charSequenceZzc);
                    zzcyVarZzr = zzcxVarZzb.zzr();
                } else {
                    Pattern pattern = zzapj.zza;
                    zzapi zzapiVar = new zzapi();
                    zzapiVar.zzc = charSequenceZzc;
                    zzcyVarZzr = zzapiVar.zza().zzr();
                }
                arrayList.add(zzcyVarZzr);
            } else {
                zzeuVar.zzk(iZzB);
            }
        }
        zzduVar.zza(new zzank(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
