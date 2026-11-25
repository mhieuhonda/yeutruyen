package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbfo {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbfn zzbfnVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbfnVar);
        }
    }

    public final boolean zzb(zzbfn zzbfnVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbfn zzbfnVar2 = (zzbfn) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzh().zzp().zzc()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzp().zze() && !zzbfnVar.equals(zzbfnVar2) && zzbfnVar2.zzc().equals(zzbfnVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbfnVar.equals(zzbfnVar2) && zzbfnVar2.zzb().equals(zzbfnVar.zzb())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzbfn zzbfnVar) {
        synchronized (this.zzb) {
            List list = this.zzc;
            if (list.size() >= 10) {
                int size = list.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                String string = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                list.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzbfnVar.zzk(i2);
            zzbfnVar.zzh();
            list.add(zzbfnVar);
        }
    }
}
