package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzerc implements zzema {
    private final zzemc zza;
    private final zzemg zzb;
    private final zzfps zzc;
    private final zzhcp zzd;

    public zzerc(zzfps zzfpsVar, zzhcp zzhcpVar, zzemc zzemcVar, zzemg zzemgVar) {
        this.zzc = zzfpsVar;
        this.zzd = zzhcpVar;
        this.zzb = zzemgVar;
        this.zza = zzemcVar;
    }

    static final String zze(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        return !zzfknVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final ListenableFuture zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        final zzemd zzemdVarZza;
        Iterator it = zzfknVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzemdVarZza = null;
                break;
            }
            try {
                zzemdVarZza = this.zza.zza((String) it.next(), zzfknVar.zzv);
                break;
            } catch (zzfln unused) {
            }
        }
        if (zzemdVarZza == null) {
            return zzhcf.zzc(new zzeot("Unable to instantiate mediation adapter class."));
        }
        zzcgd zzcgdVar = new zzcgd();
        zzemdVarZza.zzc.zza(new zzeqz(this, zzemdVarZza, zzcgdVar));
        if (zzfknVar.zzM) {
            Bundle bundle = zzfkyVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfps zzfpsVar = this.zzc;
        zzfpm zzfpmVar = zzfpm.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zzd(new zzfoy() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // com.google.android.gms.internal.ads.zzfoy
            public final /* synthetic */ void zza() throws zzfln {
                this.zza.zzc(zzfkyVar, zzfknVar, zzemdVarZza);
            }
        }, this.zzd, zzfpmVar, zzfpsVar).zzj(zzfpm.ADAPTER_LOAD_AD_ACK).zze(zzcgdVar).zzj(zzfpm.ADAPTER_WRAP_ADAPTER).zzb(new zzfos() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) {
                return this.zza.zzd(zzfkyVar, zzfknVar, zzemdVarZza, (Void) obj);
            }
        }).zzi();
    }

    final /* synthetic */ void zzc(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar) throws zzfln {
        this.zzb.zza(zzfkyVar, zzfknVar, zzemdVar);
    }

    final /* synthetic */ Object zzd(zzfky zzfkyVar, zzfkn zzfknVar, zzemd zzemdVar, Void r4) {
        return this.zzb.zzb(zzfkyVar, zzfknVar, zzemdVar);
    }
}
