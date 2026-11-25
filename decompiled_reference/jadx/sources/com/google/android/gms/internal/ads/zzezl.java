package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezl implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    zzezl(Context context, zzhcp zzhcpVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 18;
    }

    final /* synthetic */ zzezj zzc() {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhf)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhh)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhg)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzezj(string, string2, bundle, null);
    }
}
