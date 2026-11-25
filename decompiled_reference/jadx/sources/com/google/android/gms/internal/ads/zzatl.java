package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzatl implements Comparable {
    private final zzatw zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzatp zzf;
    private Integer zzg;
    private zzato zzh;
    private boolean zzi;
    private zzasu zzj;
    private zzatk zzk;
    private final zzasz zzl;

    public zzatl(int i, String str, zzatp zzatpVar) {
        Uri uri;
        String host;
        this.zza = zzatw.zza ? new zzatw() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzatpVar;
        this.zzl = new zzasz();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzatl) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        String.valueOf(hexString);
        String strValueOf = String.valueOf(hexString);
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzatw.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        zzato zzatoVar = this.zzh;
        if (zzatoVar != null) {
            zzatoVar.zzc(this);
        }
        if (zzatw.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzatj(this, str, id));
                return;
            }
            zzatw zzatwVar = this.zza;
            zzatwVar.zza(str, id);
            zzatwVar.zzb(toString());
        }
    }

    final void zze(int i) {
        zzato zzatoVar = this.zzh;
        if (zzatoVar != null) {
            zzatoVar.zzd(this, i);
        }
    }

    public final zzatl zzf(zzato zzatoVar) {
        this.zzh = zzatoVar;
        return this;
    }

    public final zzatl zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append("-");
        sb.append(str);
        return sb.toString();
    }

    public final zzatl zzj(zzasu zzasuVar) {
        this.zzj = zzasuVar;
        return this;
    }

    public final zzasu zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzast {
        return Collections.emptyMap();
    }

    public byte[] zzn() throws zzast {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    protected abstract zzatr zzr(zzath zzathVar);

    protected abstract void zzs(Object obj);

    public final void zzt(zzatu zzatuVar) {
        zzatp zzatpVar;
        synchronized (this.zze) {
            zzatpVar = this.zzf;
        }
        zzatpVar.zza(zzatuVar);
    }

    final void zzu(zzatk zzatkVar) {
        synchronized (this.zze) {
            this.zzk = zzatkVar;
        }
    }

    final void zzv(zzatr zzatrVar) {
        zzatk zzatkVar;
        synchronized (this.zze) {
            zzatkVar = this.zzk;
        }
        if (zzatkVar != null) {
            zzatkVar.zza(this, zzatrVar);
        }
    }

    final void zzw() {
        zzatk zzatkVar;
        synchronized (this.zze) {
            zzatkVar = this.zzk;
        }
        if (zzatkVar != null) {
            zzatkVar.zzb(this);
        }
    }

    final /* synthetic */ zzatw zzx() {
        return this.zza;
    }

    public final zzasz zzy() {
        return this.zzl;
    }
}
