package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbn implements zzimz {
    private final zzini zza;

    private zzgbn(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzgbn zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgbn(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcnx) this.zza).zza();
        zzgbr coroutineScopeProvider = zzcob.zzc();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        DataStore dataStoreCreate$default = DataStoreFactory.create$default(DataStoreFactory.INSTANCE, zzgbl.zza, null, null, coroutineScopeProvider.zza(), new Function0() { // from class: com.google.android.gms.internal.ads.zzgbm
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Object invoke() {
                return DataStoreFile.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zzinh.zzb(dataStoreCreate$default);
        return dataStoreCreate$default;
    }
}
