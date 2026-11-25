package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeko extends zzfzx {
    private final Context zza;
    private final zzhcp zzb;

    public zzeko(Context context, zzhcp zzhcpVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjL)).intValue(), zzfzz.zza);
        this.zza = context;
        this.zzb = zzhcpVar;
    }

    static /* synthetic */ Void zzf(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", ImagesContract.URL};
            StringBuilder sb = new StringBuilder(15);
            sb.append("event_state = 1");
            String string2 = sb.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex(ImagesContract.URL);
                    if (columnIndex2 != -1) {
                        long j = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(encodedQuery).length());
                            sb2.append(strValueOf);
                            sb2.append("&");
                            sb2.append(encodedQuery);
                            string = sb2.toString();
                        }
                        strArr2[i] = string;
                    }
                    i++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    zzuVar.zzc(strArr2[i2], null);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void zza(zzfos zzfosVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzhcp zzhcpVar = this.zzb;
        zzhcf.zzr(zzhcpVar.submit(callable), new zzekh(this, zzfosVar), zzhcpVar);
    }

    final void zzb(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeki
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                zzeko.zzg(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzc(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfos(this) { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                zzeko.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzekq zzekqVar) {
        zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzh(zzekqVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ Void zzh(zzekq zzekqVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzekqVar.zza));
        contentValues.put("gws_query_id", zzekqVar.zzb);
        contentValues.put(ImagesContract.URL, zzekqVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzekqVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        com.google.android.gms.ads.internal.util.zzbo zzboVarZzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
        if (zzboVarZzC != null) {
            try {
                zzboVarZzC.zzf(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
