package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzekc {
    private final zzbhw zza;
    private final Context zzb;
    private final zzejh zzc;
    private final VersionInfoParcel zzd;

    public zzekc(Context context, VersionInfoParcel versionInfoParcel, zzbhw zzbhwVar, zzejh zzejhVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbhwVar;
        this.zzc = zzejhVar;
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekb
                @Override // com.google.android.gms.internal.ads.zzfos
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String message = e.getMessage();
            String.valueOf(message);
            String strValueOf = String.valueOf(message);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbic.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzifh e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(e.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbic.zzaf.zzc zzcVarZzB = zzbic.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzejw.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzejw.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzejw.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            zzcVarZzB.zzM(zzejw.zzd(sQLiteDatabase, 2));
            final zzbic.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i2 = 0; i2 < size; i2++) {
                zzbic.zzaf.zza zzaVar = (zzbic.zzaf.zza) arrayList.get(i2);
                if (zzaVar.zzf() == zzbic.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbhw zzbhwVar = this.zza;
            zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzejz
                @Override // com.google.android.gms.internal.ads.zzbhv
                public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbic.zzar.zza zzaVarZzs = zzbic.zzar.zzs();
            zzaVarZzs.zzc(versionInfoParcel.buddyApkVersion);
            zzaVarZzs.zzg(versionInfoParcel.clientJarVersion);
            zzaVarZzs.zzk(true != versionInfoParcel.isClientJar ? 2 : 0);
            final zzbic.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzeka
                @Override // com.google.android.gms.internal.ads.zzbhv
                public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar2) {
                    zzbic.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbhwVar.zzc(10004);
            zzejw.zzb(sQLiteDatabase);
        }
        return null;
    }
}
