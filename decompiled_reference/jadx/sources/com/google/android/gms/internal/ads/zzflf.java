package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflf {
    private com.google.android.gms.ads.internal.client.zzm zza;
    private com.google.android.gms.ads.internal.client.zzr zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfw zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbma zzh;
    private com.google.android.gms.ads.internal.client.zzx zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcl zzl;
    private zzbsi zzn;
    private zzetk zzr;
    private Bundle zzt;
    private JSONArray zzw;
    private com.google.android.gms.ads.internal.client.zzcp zzx;
    private int zzm = 1;
    private final zzfkt zzo = new zzfkt();
    private boolean zzp = false;
    private boolean zzq = false;
    private boolean zzs = false;
    private final AtomicLong zzu = new AtomicLong();
    private boolean zzv = false;

    public final zzflf zzA(zzflg zzflgVar) {
        this.zzo.zza(zzflgVar.zzp.zza);
        this.zza = zzflgVar.zzd;
        this.zzb = zzflgVar.zzf;
        this.zzx = zzflgVar.zzx;
        this.zzc = zzflgVar.zzg;
        this.zzd = zzflgVar.zza;
        this.zzf = zzflgVar.zzh;
        this.zzg = zzflgVar.zzi;
        this.zzh = zzflgVar.zzj;
        this.zzi = zzflgVar.zzk;
        zzs(zzflgVar.zzm);
        zzr(zzflgVar.zzn);
        this.zzp = zzflgVar.zzq;
        this.zzq = zzflgVar.zzr;
        this.zzr = zzflgVar.zzc;
        this.zzs = zzflgVar.zzs;
        this.zzt = zzflgVar.zzt;
        this.zzu.set(zzflgVar.zzu.get());
        this.zzv = zzflgVar.zzv;
        this.zzw = zzflgVar.zzw;
        return this;
    }

    public final zzflg zzB() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzflg(this, null);
    }

    public final boolean zzC() {
        return this.zzp;
    }

    public final boolean zzD() {
        return this.zzq;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzm zzE() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzr zzF() {
        return this.zzb;
    }

    final /* synthetic */ String zzG() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfw zzH() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzI() {
        return this.zze;
    }

    final /* synthetic */ ArrayList zzJ() {
        return this.zzf;
    }

    final /* synthetic */ ArrayList zzK() {
        return this.zzg;
    }

    final /* synthetic */ zzbma zzL() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzx zzM() {
        return this.zzi;
    }

    final /* synthetic */ AdManagerAdViewOptions zzN() {
        return this.zzj;
    }

    final /* synthetic */ PublisherAdViewOptions zzO() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcl zzP() {
        return this.zzl;
    }

    final /* synthetic */ int zzQ() {
        return this.zzm;
    }

    final /* synthetic */ zzbsi zzR() {
        return this.zzn;
    }

    final /* synthetic */ zzfkt zzS() {
        return this.zzo;
    }

    final /* synthetic */ boolean zzT() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzU() {
        return this.zzq;
    }

    final /* synthetic */ zzetk zzV() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzW() {
        return this.zzs;
    }

    final /* synthetic */ Bundle zzX() {
        return this.zzt;
    }

    final /* synthetic */ AtomicLong zzY() {
        return this.zzu;
    }

    final /* synthetic */ boolean zzZ() {
        return this.zzv;
    }

    public final zzflf zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza = zzmVar;
        return this;
    }

    final /* synthetic */ JSONArray zzaa() {
        return this.zzw;
    }

    public final zzflf zzab(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zzx = zzcpVar;
        return this;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcp zzac() {
        return this.zzx;
    }

    public final com.google.android.gms.ads.internal.client.zzm zzb() {
        return this.zza;
    }

    public final zzflf zzc(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb = zzrVar;
        return this;
    }

    public final zzflf zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzflf zze(boolean z) {
        this.zzq = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzr zzf() {
        return this.zzb;
    }

    public final zzflf zzg(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final zzflf zzi(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.zzd = zzfwVar;
        return this;
    }

    public final zzfkt zzj() {
        return this.zzo;
    }

    public final zzflf zzk(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzflf zzl(int i) {
        this.zzm = i;
        return this;
    }

    public final zzflf zzm(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzflf zzn(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzflf zzo(zzbma zzbmaVar) {
        this.zzh = zzbmaVar;
        return this;
    }

    public final zzflf zzp(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi = zzxVar;
        return this;
    }

    public final zzflf zzq(zzbsi zzbsiVar) {
        this.zzn = zzbsiVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
        return this;
    }

    public final zzflf zzr(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzflf zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzflf zzt(zzetk zzetkVar) {
        this.zzr = zzetkVar;
        return this;
    }

    public final zzflf zzu(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzflf zzv(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final long zzw() {
        return this.zzu.get();
    }

    public final zzflf zzx(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzflf zzy(boolean z) {
        this.zzv = true;
        return this;
    }

    public final zzflf zzz(JSONArray jSONArray) {
        this.zzw = jSONArray;
        return this;
    }
}
