package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.net.HttpHeaders;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyi implements zzacb, zzxa {
    final /* synthetic */ zzyr zza;
    private final long zzb;
    private final Uri zzc;
    private final zzio zzd;
    private final zzye zze;
    private final zzagd zzf;
    private final zzdt zzg;
    private final zzaha zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzhv zzl;
    private zzahm zzm;
    private boolean zzn;

    public zzyi(zzyr zzyrVar, Uri uri, zzhr zzhrVar, zzye zzyeVar, zzagd zzagdVar, zzdt zzdtVar) {
        Objects.requireNonNull(zzyrVar);
        this.zza = zzyrVar;
        this.zzc = uri;
        this.zzd = new zzio(zzhrVar);
        this.zze = zzyeVar;
        this.zzf = zzagdVar;
        this.zzg = zzdtVar;
        this.zzh = new zzaha();
        this.zzj = true;
        this.zzb = zzxc.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzhv zzi(long j, String str) {
        Map mapZzd = zzyr.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgwv zzgwvVar = new zzgwv();
            zzgwvVar.zzb(mapZzd.entrySet());
            zzgwvVar.zza(HttpHeaders.IF_RANGE, str);
            mapZzd = zzgwvVar.zzd();
        }
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(this.zzc);
        zzhuVar.zzc(j);
        zzhuVar.zzd(6);
        zzhuVar.zzb(mapZzd);
        return zzhuVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0233  */
    /* JADX WARN: Code duplicated, block: B:113:0x023d  */
    @Override // com.google.android.gms.internal.ads.zzacb
    public final void zzc() throws Throwable {
        int i;
        long j;
        int i2;
        zzye zzyeVar;
        int i3;
        int i4;
        boolean z;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i5;
        zzj zzjVar;
        int iZzf;
        int i6;
        int i7 = 0;
        String str4 = null;
        for (int i8 = 0; i8 == 0 && !this.zzi; i8 = iZzf) {
            try {
                long j2 = this.zzh.zza;
                zzhv zzhvVarZzi = zzi(j2, str4);
                this.zzl = zzhvVarZzi;
                zzio zzioVar = this.zzd;
                long jZzb = zzioVar.zzb(zzhvVarZzi);
                if (this.zzi) {
                    zzye zzyeVar2 = this.zze;
                    if (zzyeVar2.zzd() != -1) {
                        this.zzh.zza = zzyeVar2.zzd();
                    }
                    zzht.zza(this.zzd);
                    return;
                }
                List list = (List) zzioVar.zzj().get(HttpHeaders.ETAG);
                str4 = (list == null || list.isEmpty()) ? null : (String) list.get(i7);
                if (jZzb != -1) {
                    jZzb += j2;
                    this.zza.zzH();
                }
                long j3 = jZzb;
                zzyr zzyrVar = this.zza;
                Map mapZzj = zzioVar.zzj();
                List list2 = (List) mapZzj.get("icy-br");
                j = -1;
                if (list2 != null) {
                    try {
                        String str5 = (String) list2.get(i7);
                        try {
                            i3 = Integer.parseInt(str5) * 1000;
                            if (i3 > 0) {
                                i4 = i3;
                                z = true;
                            } else {
                                try {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 17);
                                    sb.append("Invalid bitrate: ");
                                    sb.append(str5);
                                    zzeh.zzc("IcyHeaders", sb.toString());
                                    z = false;
                                    i4 = -1;
                                } catch (NumberFormatException unused) {
                                    String.valueOf(str5);
                                    zzeh.zzc("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str5)));
                                    i4 = i3;
                                    z = false;
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            i3 = -1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i = 0;
                        i2 = i;
                        if (i2 != 1) {
                            zzyeVar = this.zze;
                            if (zzyeVar.zzd() != j) {
                                this.zzh.zza = zzyeVar.zzd();
                            }
                        }
                        zzht.zza(this.zzd);
                        throw th;
                    }
                } else {
                    z = false;
                    i4 = -1;
                }
                List list3 = (List) mapZzj.get("icy-genre");
                if (list3 != null) {
                    str = (String) list3.get(0);
                    z = true;
                } else {
                    str = null;
                }
                List list4 = (List) mapZzj.get("icy-name");
                if (list4 != null) {
                    str2 = (String) list4.get(0);
                    z = true;
                } else {
                    str2 = null;
                }
                List list5 = (List) mapZzj.get("icy-url");
                if (list5 != null) {
                    str3 = (String) list5.get(0);
                    z = true;
                } else {
                    str3 = null;
                }
                List list6 = (List) mapZzj.get("icy-pub");
                if (list6 != null) {
                    zEquals = ((String) list6.get(0)).equals("1");
                    z = true;
                } else {
                    zEquals = false;
                }
                List list7 = (List) mapZzj.get("icy-metaint");
                if (list7 != null) {
                    String str6 = (String) list7.get(0);
                    try {
                        i6 = Integer.parseInt(str6);
                        if (i6 > 0) {
                            i5 = i6;
                            z = true;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 27);
                                sb2.append("Invalid metadata interval: ");
                                sb2.append(str6);
                                zzeh.zzc("IcyHeaders", sb2.toString());
                                i5 = -1;
                            } catch (NumberFormatException unused3) {
                                String.valueOf(str6);
                                zzeh.zzc("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str6)));
                                i5 = i6;
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        i6 = -1;
                    }
                } else {
                    i5 = -1;
                }
                zzyrVar.zzP(z ? new zzajh(i4, str, str2, str3, zEquals, i5) : null);
                zzio zzioVar2 = this.zzd;
                zzyr zzyrVar2 = this.zza;
                if (zzyrVar2.zzO() == null || zzyrVar2.zzO().zzf == -1) {
                    zzjVar = zzioVar2;
                } else {
                    zzxb zzxbVar = new zzxb(zzioVar2, zzyrVar2.zzO().zzf, this);
                    zzahm zzahmVarZzx = zzyrVar2.zzx();
                    this.zzm = zzahmVarZzx;
                    zzahmVarZzx.zzA(zzyr.zzc);
                    zzjVar = zzxbVar;
                }
                zzye zzyeVar3 = this.zze;
                zzyeVar3.zza(zzjVar, this.zzc, zzioVar2.zzj(), j2, j3, this.zzf);
                if (zzyrVar2.zzO() != null) {
                    zzyeVar3.zzc();
                }
                if (this.zzj) {
                    zzyeVar3.zze(j2, this.zzk);
                    i = 0;
                    try {
                        this.zzj = false;
                    } catch (Throwable th2) {
                        th = th2;
                        i2 = i;
                        if (i2 != 1) {
                            zzyeVar = this.zze;
                            if (zzyeVar.zzd() != j) {
                                this.zzh.zza = zzyeVar.zzd();
                            }
                        }
                        zzht.zza(this.zzd);
                        throw th;
                    }
                } else {
                    i = 0;
                }
                iZzf = i;
                while (iZzf == 0) {
                    try {
                        if (this.zzi) {
                            iZzf = i;
                            break;
                        }
                        try {
                            zzdt zzdtVar = this.zzg;
                            zzdtVar.zzc();
                            iZzf = zzyeVar3.zzf(this.zzh);
                            long jZzd = zzyeVar3.zzd();
                            if (jZzd > zzyrVar2.zzL() + j2) {
                                zzdtVar.zzb();
                                zzyrVar2.zzN().post(zzyrVar2.zzM());
                                j2 = jZzd;
                            }
                        } catch (InterruptedException unused5) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i2 = iZzf;
                        if (i2 != 1) {
                            zzyeVar = this.zze;
                            if (zzyeVar.zzd() != j) {
                                this.zzh.zza = zzyeVar.zzd();
                            }
                        }
                        zzht.zza(this.zzd);
                        throw th;
                    }
                }
                if (iZzf == 1) {
                    iZzf = i;
                } else if (zzyeVar3.zzd() != -1) {
                    this.zzh.zza = zzyeVar3.zzd();
                }
                zzht.zza(zzioVar2);
                i7 = i;
            } catch (Throwable th4) {
                th = th4;
                i = i7;
                j = -1;
            }
        }
    }

    final /* synthetic */ void zzd(long j, long j2) {
        this.zzh.zza = j;
        this.zzk = j2;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzio zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzhv zzh() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final void zza(zzeu zzeuVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzeuVar.zzd();
        zzahm zzahmVar = this.zzm;
        zzahmVar.getClass();
        zzahmVar.zzc(zzeuVar, iZzd);
        zzahmVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }
}
