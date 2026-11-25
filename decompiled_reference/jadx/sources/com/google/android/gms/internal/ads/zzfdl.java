package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzfdl implements zzhbn {
    static final /* synthetic */ zzfdl zza = new zzfdl();

    private /* synthetic */ zzfdl() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzhcf.zza(new zzfdn("", 1, null));
        }
        zziii zziiiVarZzc = zziij.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zziig zziigVarZzc = zziih.zzc();
            zziigVarZzc.zza(topic.getTopicId());
            zziigVarZzc.zzb(topic.getModelVersion());
            zziigVarZzc.zzc(topic.getTaxonomyVersion());
            zziiiVarZzc.zza((zziih) zziigVarZzc.zzbu());
        }
        return zzhcf.zza(new zzfdn(Base64.encodeToString(((zziij) zziiiVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
