package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdcs extends com.google.android.gms.ads.internal.client.zzdw {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzemf zzh;
    private final Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzdcs(zzfkn zzfknVar, String str, zzemf zzemfVar, zzfkq zzfkqVar, String str2) {
        String string = null;
        this.zzb = zzfknVar == null ? null : zzfknVar.zzab;
        this.zzc = str2;
        this.zzd = zzfkqVar == null ? null : zzfkqVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfknVar != null) {
            try {
                string = zzfknVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzemfVar.zzh();
        this.zzh = zzemfVar;
        this.zzj = zzfknVar == null ? 0.0d : zzfknVar.zzaz;
        this.zzk = zzfknVar == null ? 2 : zzfknVar.zzaI;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzw)).booleanValue()) {
            Bundle bundle = new Bundle();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhQ)).booleanValue() && zzfkqVar != null) {
                bundle.putAll(zzfkqVar.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhR)).booleanValue() && zzfknVar != null) {
                bundle.putAll(zzfknVar.zzaF);
            }
            this.zzi = bundle;
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhQ)).booleanValue() || zzfkqVar == null) {
                this.zzi = new Bundle();
            } else {
                this.zzi = zzfkqVar.zzk;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhR)).booleanValue() && zzfknVar != null) {
                Bundle bundle2 = zzfknVar.zzaF;
                Bundle bundle3 = this.zzi;
                if (bundle3 != null) {
                    bundle3.putAll(bundle2);
                }
            }
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkM)).booleanValue() || zzfkqVar == null || TextUtils.isEmpty(zzfkqVar.zzi)) ? "" : zzfkqVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final com.google.android.gms.ads.internal.client.zzv zzh() {
        zzemf zzemfVar = this.zzh;
        if (zzemfVar != null) {
            return zzemfVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }
}
