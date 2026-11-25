package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapk implements zzans {
    private final zzeu zza = new zzeu();
    private final zzapb zzb = new zzapb();

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i, int i2, zzanr zzanrVar, zzdu zzduVar) {
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i2 + i);
        zzeuVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzeuVar.zzg();
            String strZzN = zzeuVar.zzN(StandardCharsets.UTF_8);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzeuVar.zzh(iZzg);
                String strZzN2 = zzeuVar.zzN(StandardCharsets.UTF_8);
                String.valueOf(strZzN2);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(strZzN2)), null);
            }
            while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b = -1;
                int iZzg2 = 0;
                while (b == -1) {
                    iZzg2 = zzeuVar.zzg();
                    String strZzN3 = zzeuVar.zzN(StandardCharsets.UTF_8);
                    if (strZzN3 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strZzN3)) {
                        b = 2;
                    } else {
                        b = strZzN3.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzeuVar.zzh(iZzg2);
                if (b == 0) {
                    zzanm.zza(new zzapn(arrayList2), zzanrVar, zzduVar);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(zzeuVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (b != 2) {
                    zzapd zzapdVarZza = zzapj.zza(zzeuVar, arrayList);
                    if (zzapdVarZza != null) {
                        arrayList2.add(zzapdVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzeuVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzeuVar));
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
