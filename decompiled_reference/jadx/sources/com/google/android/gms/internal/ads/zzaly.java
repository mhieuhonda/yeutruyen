package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaly {
    public static void zza(int i, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgwt zzgwtVarZzd = zzapVar.zzd(zzfx.class);
            int size = zzgwtVarZzd.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzfx zzfxVar = (zzfx) zzgwtVarZzd.get(i2);
                if (!zzfxVar.zza.equals("com.android.capture.fps") || i == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfxVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i, zzagt zzagtVar, zzt zztVar) {
        if (i == 1 && zzagtVar.zzb()) {
            zztVar.zzK(zzagtVar.zza);
            zztVar.zzL(zzagtVar.zzb);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0288 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:9:0x0030, B:11:0x003b, B:13:0x0047, B:16:0x0053, B:19:0x0060, B:22:0x006d, B:25:0x007a, B:28:0x0087, B:30:0x0093, B:38:0x00ae, B:39:0x00cc, B:40:0x00df, B:43:0x00eb, B:46:0x00f8, B:49:0x0105, B:52:0x0112, B:55:0x011f, B:58:0x012c, B:61:0x0139, B:64:0x0146, B:67:0x0153, B:70:0x0163, B:74:0x0177, B:76:0x017d, B:78:0x0192, B:79:0x0199, B:81:0x01a0, B:86:0x01ab, B:91:0x01b7, B:137:0x0288, B:92:0x01cc, B:94:0x01d3, B:96:0x01df, B:97:0x01f3, B:112:0x0220, B:115:0x022d, B:118:0x023a, B:121:0x0247, B:124:0x0253, B:127:0x025f, B:130:0x0269, B:133:0x0275, B:136:0x0281, B:138:0x02a5, B:139:0x02ac), top: B:144:0x0022 }] */
    public static zzao zzc(zzeu zzeuVar) {
        String str;
        zzao zzajiVar;
        int iZzg = zzeuVar.zzg() + zzeuVar.zzB();
        int iZzB = zzeuVar.zzB();
        int i = (iZzB >> 24) & 255;
        zzao zzaoVarZzd = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZzB & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int iZzB2 = zzeuVar.zzB();
                    if (zzeuVar.zzB() == 1684108385) {
                        zzeuVar.zzk(8);
                        String strZzL = zzeuVar.zzL(iZzB2 - 16);
                        zzaoVarZzd = new zzajm("und", strZzL, strZzL);
                    } else {
                        zzeh.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzgb.zze(iZzB)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzaoVarZzd = zzd(iZzB, "TIT2", zzeuVar);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzaoVarZzd = zzd(iZzB, "TCOM", zzeuVar);
                } else if (i2 == 6578553) {
                    zzaoVarZzd = zzd(iZzB, "TDRC", zzeuVar);
                } else if (i2 == 4280916) {
                    zzaoVarZzd = zzd(iZzB, "TPE1", zzeuVar);
                } else if (i2 == 7630703) {
                    zzaoVarZzd = zzd(iZzB, "TSSE", zzeuVar);
                } else if (i2 == 6384738) {
                    zzaoVarZzd = zzd(iZzB, "TALB", zzeuVar);
                } else if (i2 == 7108978) {
                    zzaoVarZzd = zzd(iZzB, "USLT", zzeuVar);
                } else if (i2 == 6776174) {
                    zzaoVarZzd = zzd(iZzB, "TCON", zzeuVar);
                } else if (i2 == 6779504) {
                    zzaoVarZzd = zzd(iZzB, "TIT1", zzeuVar);
                } else if (i2 == 7173742) {
                    zzaoVarZzd = zzd(iZzB, "MVNM", zzeuVar);
                } else if (i2 == 7173737) {
                    zzaoVarZzd = zze(iZzB, "MVIN", zzeuVar, true, false);
                } else {
                    String strZze = zzgb.zze(iZzB);
                    StringBuilder sb = new StringBuilder(strZze.length() + 32);
                    sb.append("Skipped unknown metadata entry: ");
                    sb.append(strZze);
                    zzeh.zza("MetadataUtil", sb.toString());
                }
            } else if (iZzB == 1735291493) {
                String strZza = zzajt.zza(zzf(zzeuVar) - 1);
                if (strZza != null) {
                    zzajiVar = new zzajx("TCON", null, zzgwt.zzj(strZza));
                    zzaoVarZzd = zzajiVar;
                } else {
                    zzeh.zzc("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzB == 1684632427) {
                zzaoVarZzd = zzg(1684632427, "TPOS", zzeuVar);
            } else if (iZzB == 1953655662) {
                zzaoVarZzd = zzg(1953655662, "TRCK", zzeuVar);
            } else if (iZzB == 1953329263) {
                zzaoVarZzd = zze(1953329263, "TBPM", zzeuVar, true, false);
            } else if (iZzB == 1668311404) {
                zzaoVarZzd = zze(1668311404, "TCMP", zzeuVar, true, true);
            } else if (iZzB == 1668249202) {
                int iZzB3 = zzeuVar.zzB();
                if (zzeuVar.zzB() == 1684108385) {
                    int iZzB4 = zzeuVar.zzB();
                    int i3 = zzalo.zza;
                    int i4 = iZzB4 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = "image/png";
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 30);
                        sb2.append("Unrecognized cover art flags: ");
                        sb2.append(i4);
                        zzeh.zzc("MetadataUtil", sb2.toString());
                    } else {
                        zzeuVar.zzk(4);
                        int i5 = iZzB3 - 16;
                        byte[] bArr = new byte[i5];
                        zzeuVar.zzm(bArr, 0, i5);
                        zzajiVar = new zzaji(str, null, 3, bArr);
                        zzaoVarZzd = zzajiVar;
                    }
                } else {
                    zzeh.zzc("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzB == 1631670868) {
                zzaoVarZzd = zzd(1631670868, "TPE2", zzeuVar);
            } else if (iZzB == 1936682605) {
                zzaoVarZzd = zzd(1936682605, "TSOT", zzeuVar);
            } else if (iZzB == 1936679276) {
                zzaoVarZzd = zzd(1936679276, "TSOA", zzeuVar);
            } else if (iZzB == 1936679282) {
                zzaoVarZzd = zzd(1936679282, "TSOP", zzeuVar);
            } else if (iZzB == 1936679265) {
                zzaoVarZzd = zzd(1936679265, "TSO2", zzeuVar);
            } else if (iZzB == 1936679791) {
                zzaoVarZzd = zzd(1936679791, "TSOC", zzeuVar);
            } else if (iZzB == 1920233063) {
                zzaoVarZzd = zze(1920233063, "ITUNESADVISORY", zzeuVar, false, false);
            } else if (iZzB == 1885823344) {
                zzaoVarZzd = zze(1885823344, "ITUNESGAPLESS", zzeuVar, false, true);
            } else if (iZzB == 1936683886) {
                zzaoVarZzd = zzd(1936683886, "TVSHOWSORT", zzeuVar);
            } else if (iZzB == 1953919848) {
                zzaoVarZzd = zzd(1953919848, "TVSHOW", zzeuVar);
            } else if (iZzB == 757935405) {
                int i6 = -1;
                int i7 = -1;
                String strZzL2 = null;
                String strZzL3 = null;
                while (zzeuVar.zzg() < iZzg) {
                    int iZzg2 = zzeuVar.zzg();
                    int iZzB5 = zzeuVar.zzB();
                    int iZzB6 = zzeuVar.zzB();
                    zzeuVar.zzk(4);
                    if (iZzB6 == 1835360622) {
                        strZzL2 = zzeuVar.zzL(iZzB5 - 12);
                    } else {
                        int i8 = iZzB5 - 12;
                        if (iZzB6 == 1851878757) {
                            strZzL3 = zzeuVar.zzL(i8);
                        } else {
                            if (iZzB6 == 1684108385) {
                                i7 = iZzB5;
                            }
                            if (iZzB6 == 1684108385) {
                                i6 = iZzg2;
                            }
                            zzeuVar.zzk(i8);
                        }
                    }
                }
                if (strZzL2 != null && strZzL3 != null && i6 != -1) {
                    zzeuVar.zzh(i6);
                    zzeuVar.zzk(16);
                    zzaoVarZzd = new zzaju(strZzL2, strZzL3, zzeuVar.zzL(i7 - 16));
                }
            } else {
                String strZze2 = zzgb.zze(iZzB);
                StringBuilder sb3 = new StringBuilder(strZze2.length() + 32);
                sb3.append("Skipped unknown metadata entry: ");
                sb3.append(strZze2);
                zzeh.zza("MetadataUtil", sb3.toString());
            }
            zzeuVar.zzh(iZzg);
            return zzaoVarZzd;
        } catch (Throwable th) {
            zzeuVar.zzh(iZzg);
            throw th;
        }
    }

    private static zzajx zzd(int i, String str, zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385) {
            zzeuVar.zzk(8);
            return new zzajx(str, null, zzgwt.zzj(zzeuVar.zzL(iZzB - 16)));
        }
        zzeh.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzgb.zze(i)));
        return null;
    }

    private static zzajs zze(int i, String str, zzeu zzeuVar, boolean z, boolean z2) {
        int iZzf = zzf(zzeuVar);
        if (z2) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z ? new zzajx(str, null, zzgwt.zzj(Integer.toString(iZzf))) : new zzajm("und", str, Integer.toString(iZzf));
        }
        zzeh.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzgb.zze(i)));
        return null;
    }

    private static int zzf(zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385) {
            zzeuVar.zzk(8);
            int i = iZzB - 16;
            if (i == 1) {
                return zzeuVar.zzs();
            }
            if (i == 2) {
                return zzeuVar.zzt();
            }
            if (i == 3) {
                return zzeuVar.zzx();
            }
            if (i == 4 && (zzeuVar.zzn() & 128) == 0) {
                return zzeuVar.zzH();
            }
        }
        zzeh.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzajx zzg(int i, String str, zzeu zzeuVar) {
        int iZzB = zzeuVar.zzB();
        if (zzeuVar.zzB() == 1684108385 && iZzB >= 22) {
            zzeuVar.zzk(10);
            int iZzt = zzeuVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzt).length());
                sb.append(iZzt);
                String string = sb.toString();
                int iZzt2 = zzeuVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iZzt2);
                    string = sb2.toString();
                }
                return new zzajx(str, null, zzgwt.zzj(string));
            }
        }
        zzeh.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzgb.zze(i)));
        return null;
    }
}
