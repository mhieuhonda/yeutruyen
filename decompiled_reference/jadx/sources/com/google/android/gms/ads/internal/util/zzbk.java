package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatl;
import com.google.android.gms.internal.ads.zzatr;
import com.google.android.gms.internal.ads.zzaui;
import com.google.android.gms.internal.ads.zzcgd;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbk extends zzatl {
    private final zzcgd zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcgd zzcgdVar) {
        super(0, str, new zzbj(zzcgdVar));
        this.zza = zzcgdVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, ShareTarget.METHOD_GET, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    protected final zzatr zzr(zzath zzathVar) {
        return zzatr.zza(zzathVar, zzaui.zza(zzathVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatl
    protected final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzath zzathVar = (zzath) obj;
        Map map = zzathVar.zzc;
        int i = zzathVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzathVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzathVar);
    }
}
