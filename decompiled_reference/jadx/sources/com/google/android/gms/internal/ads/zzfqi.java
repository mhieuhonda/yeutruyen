package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqi implements zzfqg {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfqv zzj = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    zzfqi(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    final /* synthetic */ long zzA() {
        return this.zzb;
    }

    final /* synthetic */ long zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ int zzD() {
        return this.zze;
    }

    final /* synthetic */ String zzE() {
        return this.zzf;
    }

    final /* synthetic */ String zzF() {
        return this.zzg;
    }

    final /* synthetic */ String zzG() {
        return this.zzh;
    }

    final /* synthetic */ String zzH() {
        return this.zzi;
    }

    final /* synthetic */ zzfqv zzI() {
        return this.zzj;
    }

    final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    final /* synthetic */ String zzK() {
        return this.zzl;
    }

    final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfqi zzM(int i) {
        this.zzq = i;
        return this;
    }

    final /* synthetic */ int zzN() {
        return this.zzp;
    }

    final /* synthetic */ int zzO() {
        return this.zzq;
    }

    final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzd(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzf(zzfqv zzfqvVar) {
        zzu(zzfqvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzg(zzfkx zzfkxVar) {
        zzv(zzfkxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzj(Throwable th) {
        zzy(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final synchronized zzfqj zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzq();
        }
        if (this.zzc < 0) {
            zzr();
        }
        return new zzfqj(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final /* bridge */ /* synthetic */ zzfqg zzp(int i) {
        zzM(i);
        return this;
    }

    public final synchronized zzfqi zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzzVarZzf.zzk(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfqi zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfqi zzs(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfqi zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfqi zzu(zzfqv zzfqvVar) {
        this.zzj = zzfqvVar;
        return this;
    }

    public final synchronized zzfqi zzv(zzfkx zzfkxVar) {
        String str = zzfkxVar.zzb.zzb;
        if (!TextUtils.isEmpty(str)) {
            this.zzf = str;
        }
        Iterator it = zzfkxVar.zza.iterator();
        while (it.hasNext()) {
            String str2 = ((zzfkn) it.next()).zzab;
            if (!TextUtils.isEmpty(str2)) {
                this.zzg = str2;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfqi zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzdcs zzdcsVar = (zzdcs) iBinder;
            String strZzk = zzdcsVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                this.zzf = strZzk;
            }
            String strZzf = zzdcsVar.zzf();
            if (!TextUtils.isEmpty(strZzf)) {
                this.zzg = strZzf;
            }
        }
        return this;
    }

    public final synchronized zzfqi zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfqi zzy(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkj)).booleanValue()) {
            this.zzl = zzcaf.zzf(th);
            this.zzk = (String) zzgug.zza(zzgtf.zzd('\n')).zzf(zzcaf.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfqi zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkj)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }
}
