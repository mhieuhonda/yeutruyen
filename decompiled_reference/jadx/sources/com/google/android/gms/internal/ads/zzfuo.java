package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfuo extends zzgwl {
    private final LinkedList zza = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzftw zzftwVar = (zzftw) obj;
        int iZzf = zzftwVar.zzf();
        LinkedList linkedList = this.zza;
        if (iZzf != 3) {
            linkedList.add(zzftwVar);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzftw zzftwVar2 = (zzftw) listIterator.next();
            if (zzftwVar2.zzf() == 3) {
                double dZze = zzftwVar2.zze();
                double dZze2 = zzftwVar.zze();
                if (dZze < dZze2 || (dZze == dZze2 && zzftwVar2.zzc() > zzftwVar.zzc())) {
                    listIterator.set(zzftwVar);
                    zzftwVar = zzftwVar2;
                }
            }
        }
        linkedList.add(zzftwVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final Queue zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, com.google.android.gms.internal.ads.zzgwk
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl, com.google.android.gms.internal.ads.zzgwi
    public final /* synthetic */ Collection zzc() {
        return this.zza;
    }
}
