package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgc {
    private final int zza;
    private final zzbfz zzb = new zzbge();

    public zzbgc(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbgb zzbgbVar = new zzbgb();
        int i2 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i2, new zzbga(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbgd.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbgg.zza(strArrZzb, i2, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbgbVar.zzb.write(this.zzb.zza(((zzbgf) it.next()).zzb));
            } catch (IOException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzbgbVar.toString();
    }
}
