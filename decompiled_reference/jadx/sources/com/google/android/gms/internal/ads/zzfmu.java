package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfmu {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfnt zzd = new zzfnt();

    public zzfmu(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((zzfne) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(zzfne zzfneVar) {
        this.zzd.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfneVar);
        return true;
    }

    public final zzfne zzb() {
        zzfnt zzfntVar = this.zzd;
        zzfntVar.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfne zzfneVar = (zzfne) linkedList.remove();
        if (zzfneVar != null) {
            zzfntVar.zzb();
        }
        return zzfneVar;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzfns zzh() {
        return this.zzd.zzg();
    }
}
