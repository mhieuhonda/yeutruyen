package com.google.android.gms.internal.ads;

import androidx.datastore.core.Serializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbl implements Serializer {
    public static final zzgbl zza = new zzgbl();
    private static final zzgbi zzb;

    static {
        zzgbi zzgbiVarZzd = zzgbi.zzd();
        Intrinsics.checkNotNullExpressionValue(zzgbiVarZzd, "getDefaultInstance(...)");
        zzb = zzgbiVarZzd;
    }

    private zzgbl() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) {
        try {
            zzgbi zzgbiVarZzc = zzgbi.zzc(inputStream);
            Intrinsics.checkNotNull(zzgbiVarZzc);
            return zzgbiVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws IOException {
        ((zzgbi) obj).zzaO(outputStream);
        return Unit.INSTANCE;
    }
}
