package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevk implements zzfcs {
    private final zzhcp zza;
    private final zzdxk zzb;
    private final zzece zzc;
    private final zzevm zzd;

    public zzevk(zzhcp zzhcpVar, zzdxk zzdxkVar, zzece zzeceVar, zzevm zzevmVar) {
        this.zza = zzhcpVar;
        this.zzb = zzdxkVar;
        this.zzc = zzeceVar;
        this.zzd = zzevmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzbio zzbioVar = zzbix.zzno;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
            zzevm zzevmVar = this.zzd;
            if (zzevmVar.zzd() != null) {
                zzevl zzevlVarZzd = zzevmVar.zzd();
                zzevlVarZzd.getClass();
                return zzhcf.zza(zzevlVarZzd);
            }
        }
        if (zzgui.zzc((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzch)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzhcf.zza(new zzevl(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzevl zzc() {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzch)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfme zzfmeVarZza = this.zzb.zza(str, new JSONObject());
                zzfmeVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzno)).booleanValue() || zZze) {
                    try {
                        zzbxx zzbxxVarZzC = zzfmeVarZza.zzC();
                        if (zzbxxVarZzC != null) {
                            bundle2.putString("sdk_version", zzbxxVarZzC.toString());
                        }
                    } catch (zzfln unused) {
                    }
                }
                try {
                    zzbxx zzbxxVarZzB = zzfmeVarZza.zzB();
                    if (zzbxxVarZzB != null) {
                        bundle2.putString("adapter_version", zzbxxVarZzB.toString());
                    }
                } catch (zzfln unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfln unused3) {
            }
        }
        zzevl zzevlVar = new zzevl(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzno)).booleanValue()) {
            this.zzd.zzc(zzevlVar);
        }
        return zzevlVar;
    }
}
