package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahz implements zzahs {
    public final zzgwt zza;
    private final int zzb;

    private zzahz(int i, zzgwt zzgwtVar) {
        this.zzb = i;
        this.zza = zzgwtVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzahz zzb(int i, zzeu zzeuVar) {
        String str;
        zzahs zzaiaVar;
        String str2;
        zzgwq zzgwqVar = new zzgwq();
        int iZze = zzeuVar.zze();
        int iZzc = -2;
        while (zzeuVar.zzd() > 8) {
            int iZzC = zzeuVar.zzC();
            int iZzg = zzeuVar.zzg() + zzeuVar.zzC();
            zzeuVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzaia zzaiaVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc != 2) {
                            if (iZzc == 1) {
                                int iZzu = zzeuVar.zzu();
                                if (iZzu == 1) {
                                    str = "audio/raw";
                                } else if (iZzu == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzu == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzu != 8192) {
                                    str = iZzu != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzu2 = zzeuVar.zzu();
                                    int iZzC2 = zzeuVar.zzC();
                                    zzeuVar.zzk(6);
                                    int iZzC3 = zzfm.zzC(zzeuVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                    int iZzu3 = zzeuVar.zzd() > 0 ? zzeuVar.zzu() : 0;
                                    zzt zztVar = new zzt();
                                    zztVar.zzo(str);
                                    zztVar.zzG(iZzu2);
                                    zztVar.zzI(iZzC2);
                                    if (str.equals("audio/raw") && iZzC3 != 0) {
                                        zztVar.zzJ(iZzC3);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                        byte[] bArr = new byte[iZzu3];
                                        zzeuVar.zzm(bArr, 0, iZzu3);
                                        zztVar.zzr(zzgwt.zzj(bArr));
                                    }
                                    zzaiaVar = new zzaia(zztVar.zzP());
                                } else {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZzu).length() + 43);
                                    sb.append("Ignoring track with unsupported format tag ");
                                    sb.append(iZzu);
                                    zzeh.zzc("StreamFormatChunk", sb.toString());
                                }
                            } else {
                                zzeh.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfm.zzU(iZzc)));
                            }
                            break;
                        } else {
                            zzeuVar.zzk(4);
                            int iZzC4 = zzeuVar.zzC();
                            int iZzC5 = zzeuVar.zzC();
                            zzeuVar.zzk(4);
                            int iZzC6 = zzeuVar.zzC();
                            switch (iZzC6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzC6).length() + 44);
                                sb2.append("Ignoring track with unsupported compression ");
                                sb2.append(iZzC6);
                                zzeh.zzc("StreamFormatChunk", sb2.toString());
                            } else {
                                zzt zztVar2 = new zzt();
                                zztVar2.zzv(iZzC4);
                                zztVar2.zzw(iZzC5);
                                zztVar2.zzo(str2);
                                zzaiaVar2 = new zzaia(zztVar2.zzP());
                            }
                        }
                        zzaiaVar = zzaiaVar2;
                        break;
                    case 1751742049:
                        zzaiaVar = zzahw.zzb(zzeuVar);
                        break;
                    case 1752331379:
                        zzaiaVar = zzahx.zzb(zzeuVar);
                        break;
                    case 1852994675:
                        zzaiaVar = zzaib.zzb(zzeuVar);
                        break;
                    default:
                        zzaiaVar = zzaiaVar2;
                        break;
                }
            } else {
                zzaiaVar = zzb(zzeuVar.zzC(), zzeuVar);
            }
            if (zzaiaVar != null) {
                if (zzaiaVar.zza() == 1752331379) {
                    iZzc = ((zzahx) zzaiaVar).zzc();
                }
                zzgwqVar.zzf(zzaiaVar);
            }
            zzeuVar.zzh(iZzg);
            zzeuVar.zzf(iZze);
        }
        return new zzahz(i, zzgwqVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.zzb;
    }

    public final zzahs zzc(Class cls) {
        zzgwt zzgwtVar = this.zza;
        int size = zzgwtVar.size();
        int i = 0;
        while (i < size) {
            zzahs zzahsVar = (zzahs) zzgwtVar.get(i);
            i++;
            if (zzahsVar.getClass() == cls) {
                return zzahsVar;
            }
        }
        return null;
    }
}
