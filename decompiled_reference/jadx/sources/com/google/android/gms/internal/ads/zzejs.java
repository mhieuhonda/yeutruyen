package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzejs implements zzhcc {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzejt zzb;

    zzejs(zzejt zzejtVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzejtVar);
        this.zzb = zzejtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        zzbic.zzd.zza zzaVar;
        zzejt zzejtVar = this.zzb;
        Bundle bundle = (Bundle) obj;
        if (zzejtVar.zzf()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        zzaVar = zzbic.zzd.zza.BANNER;
                        break;
                    case "native":
                        zzaVar = zzbic.zzd.zza.NATIVE_APP_INSTALL;
                        break;
                    case "rewarded":
                        zzaVar = zzbic.zzd.zza.REWARD_BASED_VIDEO_AD;
                        break;
                    case "interstitial":
                        zzaVar = zzbic.zzd.zza.INTERSTITIAL;
                        break;
                    default:
                        zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                }
                arrayList.add(zzaVar);
            }
            final zzbic.zzaf.zzd zzdVarZze = zzejt.zze(bundle);
            final zzbic.zzab zzabVarZzb = zzejtVar.zzb(bundle);
            final boolean z = this.zza;
            zzejtVar.zza.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejr
                @Override // com.google.android.gms.internal.ads.zzfos
                public final /* synthetic */ Object zza(Object obj3) {
                    zzejt zzejtVar2 = this.zza.zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzejtVar2.zzf()) {
                        return null;
                    }
                    zzbic.zzaf.zzd zzdVar = zzdVarZze;
                    zzbic.zzab zzabVar = zzabVarZzb;
                    ArrayList arrayList2 = arrayList;
                    boolean z2 = z;
                    byte[] bArrZzc = zzejtVar2.zzc(z2, arrayList2, zzabVar, zzdVar);
                    zzejw.zzf(sQLiteDatabase, z2, true);
                    zzejw.zze(sQLiteDatabase, zzejtVar2.zzd().zzb(), bArrZzc);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        zzaVar = zzbic.zzd.zza.BANNER;
                    } else {
                        zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals("native")) {
                        zzaVar = zzbic.zzd.zza.NATIVE_APP_INSTALL;
                    } else {
                        zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        zzaVar = zzbic.zzd.zza.REWARD_BASED_VIDEO_AD;
                    } else {
                        zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        zzaVar = zzbic.zzd.zza.INTERSTITIAL;
                    } else {
                        zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                default:
                    zzaVar = zzbic.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                    break;
            }
            arrayList.add(zzaVar);
        }
        final zzbic.zzaf.zzd zzdVarZze2 = zzejt.zze(bundle);
        final zzbic.zzab zzabVarZzb2 = zzejtVar.zzb(bundle);
        final boolean z2 = this.zza;
        zzejtVar.zza.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj4) {
                zzejt zzejtVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzejtVar2.zzf()) {
                    return null;
                }
                zzbic.zzaf.zzd zzdVar = zzdVarZze2;
                zzbic.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList3 = arrayList;
                boolean z3 = z2;
                byte[] bArrZzc = zzejtVar2.zzc(z3, arrayList3, zzabVar, zzdVar);
                zzejw.zzf(sQLiteDatabase, z3, true);
                zzejw.zze(sQLiteDatabase, zzejtVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}
