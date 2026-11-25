package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzast;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzauo;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbh extends zzauo {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(zzbl zzblVar, int i, String str, zzatq zzatqVar, zzatp zzatpVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzatqVar, zzatpVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final Map zzm() throws zzast {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    public final byte[] zzn() throws zzast {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzauo, com.google.android.gms.internal.ads.zzatl
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzs((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzauo
    /* JADX INFO: renamed from: zzz */
    public final void zzs(String str) {
        this.zzc.zze(str);
        super.zzs(str);
    }
}
