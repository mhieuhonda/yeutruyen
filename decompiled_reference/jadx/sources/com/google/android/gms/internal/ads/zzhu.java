package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhu {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzhu() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }

    /* synthetic */ zzhu(zzhv zzhvVar, byte[] bArr) {
        this.zza = zzhvVar.zza;
        this.zzb = zzhvVar.zzd;
        this.zzc = zzhvVar.zze;
        this.zzd = zzhvVar.zzf;
        this.zze = zzhvVar.zzg;
    }

    public final zzhu zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhu zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzhu zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzhu zzd(int i) {
        this.zze = 6;
        return this;
    }

    public final zzhv zze() {
        zzgtr.zzk(this.zza, "The uri must be set.");
        return new zzhv(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }
}
