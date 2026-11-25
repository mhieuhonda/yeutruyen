package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbk extends zzhbi {
    private zzhbk() {
        throw null;
    }

    /* synthetic */ zzhbk(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    final void zza(zzhbl zzhblVar, Set set, Set set2) {
        synchronized (zzhblVar) {
            if (zzhblVar.seenExceptionsField == null) {
                zzhblVar.seenExceptionsField = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    final int zzb(zzhbl zzhblVar) {
        int i;
        synchronized (zzhblVar) {
            i = zzhblVar.remainingField - 1;
            zzhblVar.remainingField = i;
        }
        return i;
    }
}
