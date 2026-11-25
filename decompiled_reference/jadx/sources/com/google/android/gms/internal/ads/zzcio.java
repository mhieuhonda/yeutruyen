package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcio implements zzhr {
    private final Context zza;
    private final zzhr zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbhi zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhv zzl;

    public zzcio(Context context, zzhr zzhrVar, String str, int i, zzip zzipVar, zzcin zzcinVar) {
        this.zza = context;
        this.zzb = zzhrVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcG)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfv)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfw)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhvVar.zza;
        this.zzh = uri;
        this.zzl = zzhvVar;
        this.zzi = zzbhi.zza(uri);
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfs)).booleanValue();
        zzbhi zzbhiVar = this.zzi;
        zzbhf zzbhfVarZzc = null;
        if (!zBooleanValue) {
            if (zzbhiVar != null) {
                this.zzi.zzh = zzhvVar.zze;
                this.zzi.zzi = zzgui.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbhfVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbhfVarZzc != null && zzbhfVarZzc.zza()) {
                this.zzj = zzbhfVarZzc.zzg();
                this.zzk = zzbhfVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbhfVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (zzbhiVar != null) {
            this.zzi.zzh = zzhvVar.zze;
            this.zzi.zzi = zzgui.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfu);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzft);
            }
            long jLongValue = l.longValue();
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future futureZza = zzbht.zza(this.zza, this.zzi);
            try {
                try {
                    zzbhu zzbhuVar = (zzbhu) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbhuVar.zzc();
                    this.zzj = zzbhuVar.zzd();
                    this.zzk = zzbhuVar.zzf();
                    zzbhuVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbhuVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzhu zzhuVarZzb = zzhvVar.zzb();
            zzhuVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzhuVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
    }
}
