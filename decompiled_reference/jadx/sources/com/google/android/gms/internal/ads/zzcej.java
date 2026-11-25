package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcej implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcem zza;
    private final String zzb;

    public zzcej(zzcem zzcemVar, String str) {
        Objects.requireNonNull(zzcemVar);
        this.zza = zzcemVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcem zzcemVar = this.zza;
        synchronized (zzcemVar) {
            Iterator it = zzcemVar.zzd().iterator();
            while (it.hasNext()) {
                ((zzcek) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
