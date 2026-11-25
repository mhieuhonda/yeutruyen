package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffe implements zzimz {
    public static zzfcv zza(Context context, zzcez zzcezVar, zzcfa zzcfaVar, Object obj, zzfdx zzfdxVar, zzfer zzferVar, zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzimt zzimtVar4, zzimt zzimtVar5, zzimt zzimtVar6, zzimt zzimtVar7, Executor executor, zzfqq zzfqqVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfek) obj);
        hashSet.add(zzfdxVar);
        hashSet.add(zzferVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgS)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgT)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgV)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgW)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzec)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar7.zzb());
        }
        return new zzfcv(context, executor, hashSet, zzfqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
