package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflg {
    public final com.google.android.gms.ads.internal.client.zzfw zza;
    public final zzbsi zzb;
    public final zzetk zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbma zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzcl zzo;
    public final zzfku zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final JSONArray zzw;
    public final com.google.android.gms.ads.internal.client.zzcp zzx;

    /* synthetic */ zzflg(zzflf zzflfVar, byte[] bArr) {
        this.zzf = zzflfVar.zzF();
        this.zzg = zzflfVar.zzG();
        this.zzx = zzflfVar.zzac();
        this.zze = zzflfVar.zzE().zzC;
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE = zzflfVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE2 = zzflfVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE3 = zzflfVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE4 = zzflfVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE5 = zzflfVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE6 = zzflfVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE7 = zzflfVar.zzE();
        int i = zzflfVar.zzE().zza;
        long j = zzmVarZzE7.zzb;
        Bundle bundle = zzmVarZzE6.zzc;
        int i2 = zzmVarZzE5.zzd;
        List list = zzmVarZzE4.zze;
        boolean z = zzmVarZzE3.zzf;
        int i3 = zzmVarZzE2.zzg;
        boolean z2 = true;
        if (!zzmVarZzE.zzh && !zzflfVar.zzI()) {
            z2 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzflfVar.zzE().zzi, zzflfVar.zzE().zzj, zzflfVar.zzE().zzk, zzflfVar.zzE().zzl, zzflfVar.zzE().zzm, zzflfVar.zzE().zzn, zzflfVar.zzE().zzo, zzflfVar.zzE().zzp, zzflfVar.zzE().zzq, zzflfVar.zzE().zzr, zzflfVar.zzE().zzs, zzflfVar.zzE().zzt, zzflfVar.zzE().zzu, zzflfVar.zzE().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzflfVar.zzE().zzw), zzflfVar.zzE().zzx, zzflfVar.zzE().zzy, zzflfVar.zzE().zzz, zzflfVar.zzE().zzA, zzflfVar.zzE().zzB);
        this.zzd = zzmVar;
        this.zza = zzflfVar.zzH() != null ? zzflfVar.zzH() : zzflfVar.zzL() != null ? zzflfVar.zzL().zzf : null;
        this.zzh = zzflfVar.zzJ();
        this.zzi = zzflfVar.zzK();
        this.zzj = zzflfVar.zzJ() == null ? null : zzflfVar.zzL() == null ? new zzbma(new NativeAdOptions.Builder().build()) : zzflfVar.zzL();
        this.zzk = zzflfVar.zzM();
        this.zzl = zzflfVar.zzQ();
        this.zzm = zzflfVar.zzN();
        this.zzn = zzflfVar.zzO();
        this.zzo = zzflfVar.zzP();
        this.zzb = zzflfVar.zzR();
        this.zzp = new zzfku(zzflfVar.zzS(), null);
        this.zzq = zzflfVar.zzT();
        this.zzr = zzflfVar.zzU();
        this.zzc = zzflfVar.zzV();
        this.zzs = zzflfVar.zzW();
        this.zzt = zzflfVar.zzX();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzflfVar.zzY();
        this.zzv = zzflfVar.zzZ();
        this.zzw = zzflfVar.zzaa();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzem));
    }
}
