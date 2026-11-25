package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class LiteSdkInfo extends zzcu {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzbvj getAdapterCreator() {
        return new zzbvf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzez getLiteSdkVersion() {
        return new zzez(ModuleDescriptor.MODULE_VERSION, 261710000, "25.3.0");
    }
}
