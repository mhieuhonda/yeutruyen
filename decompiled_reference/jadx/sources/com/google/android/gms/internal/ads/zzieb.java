package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzieb extends zziea {
    zzieb() {
    }

    @Override // com.google.android.gms.internal.ads.zziea
    final void zza(Object obj) {
        ((zziel) obj).zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziea
    final void zzb(zzihs zzihsVar, Map.Entry entry) throws IOException {
        zziem zziemVar = (zziem) entry.getKey();
        if (!zziemVar.zzc) {
            zzihq zzihqVar = zzihq.DOUBLE;
            switch (zziemVar.zzb) {
                case DOUBLE:
                    zzihsVar.zzf(zziemVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    zzihsVar.zze(zziemVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    zzihsVar.zzc(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    zzihsVar.zzh(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    zzihsVar.zzi(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    zzihsVar.zzj(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    zzihsVar.zzk(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    zzihsVar.zzl(zziemVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    zzihsVar.zzm(zziemVar.zza, (String) entry.getValue());
                    break;
                case GROUP:
                    zzihsVar.zzs(zziemVar.zza, entry.getValue(), zzigj.zza().zzb(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    zzihsVar.zzr(zziemVar.zza, entry.getValue(), zzigj.zza().zzb(entry.getValue().getClass()));
                    break;
                case BYTES:
                    zzihsVar.zzn(zziemVar.zza, (zzidl) entry.getValue());
                    break;
                case UINT32:
                    zzihsVar.zzo(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    zzihsVar.zzi(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    zzihsVar.zzb(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    zzihsVar.zzd(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    zzihsVar.zzp(zziemVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    zzihsVar.zzq(zziemVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzihq zzihqVar2 = zzihq.DOUBLE;
        switch (zziemVar.zzb) {
            case DOUBLE:
                zzigs.zza(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case FLOAT:
                zzigs.zzb(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case INT64:
                zzigs.zzc(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case UINT64:
                zzigs.zzd(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case INT32:
                zzigs.zzh(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case FIXED64:
                zzigs.zzf(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case FIXED32:
                zzigs.zzk(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case BOOL:
                zzigs.zzn(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case STRING:
                zzigs.zzo(zziemVar.zza, (List) entry.getValue(), zzihsVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzigs.zzr(zziemVar.zza, (List) entry.getValue(), zzihsVar, zzigj.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzigs.zzq(zziemVar.zza, (List) entry.getValue(), zzihsVar, zzigj.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                zzigs.zzp(zziemVar.zza, (List) entry.getValue(), zzihsVar);
                break;
            case UINT32:
                zzigs.zzi(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case ENUM:
                zzigs.zzh(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case SFIXED32:
                zzigs.zzl(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case SFIXED64:
                zzigs.zzg(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case SINT32:
                zzigs.zzj(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
            case SINT64:
                zzigs.zze(zziemVar.zza, (List) entry.getValue(), zzihsVar, zziemVar.zzd);
                break;
        }
    }
}
