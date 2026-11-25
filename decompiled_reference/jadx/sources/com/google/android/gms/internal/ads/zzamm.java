package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamm {
    private static final zzgug zza = zzgug.zza(zzgtf.zzd(':'));
    private static final zzgug zzb = zzgug.zza(zzgtf.zzd('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int zzb(zzagb zzagbVar, zzaha zzahaVar, List list) throws IOException {
        char c;
        int i;
        ArrayList arrayList;
        List listZzg;
        int i2;
        List listZzg2;
        int i3 = this.zzd;
        if (i3 == 0) {
            long jZzo = zzagbVar.zzo();
            zzahaVar.zza = (jZzo == -1 || jZzo < 8) ? 0L : jZzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i4 = 8;
        if (i3 != 1) {
            char c2 = 2820;
            short s = 2819;
            short s2 = 2817;
            short s3 = 2816;
            short s4 = 2192;
            if (i3 != 2) {
                long jZzn = zzagbVar.zzn();
                int iZzo = (int) ((zzagbVar.zzo() - zzagbVar.zzn()) - ((long) this.zze));
                zzeu zzeuVar = new zzeu(iZzo);
                zzagbVar.zzc(zzeuVar.zzi(), 0, iZzo);
                int i5 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i5 >= list2.size()) {
                        zzahaVar.zza = 0L;
                        return 1;
                    }
                    zzaml zzamlVar = (zzaml) list2.get(i5);
                    zzeuVar.zzh((int) (zzamlVar.zza - jZzn));
                    zzeuVar.zzk(4);
                    int iZzC = zzeuVar.zzC();
                    String strZzK = zzeuVar.zzK(iZzC, StandardCharsets.UTF_8);
                    switch (strZzK.hashCode()) {
                        case -1711564334:
                            if (!strZzK.equals("SlowMotion_Data")) {
                                throw zzat.zzb("Invalid SEF name", null);
                            }
                            c = 2192;
                            i = zzamlVar.zzb - (iZzC + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listZzg = zzb.zzg(zzeuVar.zzK(i, StandardCharsets.UTF_8));
                                for (i2 = 0; i2 < listZzg.size(); i2++) {
                                    listZzg2 = zza.zzg((CharSequence) listZzg.get(i2));
                                    if (listZzg2.size() != 3) {
                                        throw zzat.zzb(null, null);
                                    }
                                    try {
                                        arrayList.add(new zzajz(Long.parseLong((String) listZzg2.get(0)), Long.parseLong((String) listZzg2.get(1)), 1 << (Integer.parseInt((String) listZzg2.get(2)) - 1)));
                                    } catch (NumberFormatException e) {
                                        throw zzat.zzb(null, e);
                                    }
                                }
                                list.add(new zzaka(arrayList));
                            } else if (c == 2816 && c != 2817 && c != 2819 && c != c2) {
                                throw new IllegalStateException();
                            }
                            i5++;
                            c2 = 2820;
                            break;
                            break;
                        case -1332107749:
                            if (!strZzK.equals("Super_SlowMotion_Edit_Data")) {
                                throw zzat.zzb("Invalid SEF name", null);
                            }
                            c = 2819;
                            i = zzamlVar.zzb - (iZzC + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listZzg = zzb.zzg(zzeuVar.zzK(i, StandardCharsets.UTF_8));
                                while (i2 < listZzg.size()) {
                                    listZzg2 = zza.zzg((CharSequence) listZzg.get(i2));
                                    if (listZzg2.size() != 3) {
                                        throw zzat.zzb(null, null);
                                    }
                                    arrayList.add(new zzajz(Long.parseLong((String) listZzg2.get(0)), Long.parseLong((String) listZzg2.get(1)), 1 << (Integer.parseInt((String) listZzg2.get(2)) - 1)));
                                }
                                list.add(new zzaka(arrayList));
                            } else if (c == 2816) {
                            }
                            i5++;
                            c2 = 2820;
                            break;
                            break;
                        case -1251387154:
                            if (!strZzK.equals("Super_SlowMotion_Data")) {
                                throw zzat.zzb("Invalid SEF name", null);
                            }
                            c = 2816;
                            i = zzamlVar.zzb - (iZzC + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listZzg = zzb.zzg(zzeuVar.zzK(i, StandardCharsets.UTF_8));
                                while (i2 < listZzg.size()) {
                                    listZzg2 = zza.zzg((CharSequence) listZzg.get(i2));
                                    if (listZzg2.size() != 3) {
                                        throw zzat.zzb(null, null);
                                    }
                                    arrayList.add(new zzajz(Long.parseLong((String) listZzg2.get(0)), Long.parseLong((String) listZzg2.get(1)), 1 << (Integer.parseInt((String) listZzg2.get(2)) - 1)));
                                }
                                list.add(new zzaka(arrayList));
                            } else if (c == 2816) {
                            }
                            i5++;
                            c2 = 2820;
                            break;
                            break;
                        case -830665521:
                            if (!strZzK.equals("Super_SlowMotion_Deflickering_On")) {
                                throw zzat.zzb("Invalid SEF name", null);
                            }
                            c = c2;
                            i = zzamlVar.zzb - (iZzC + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listZzg = zzb.zzg(zzeuVar.zzK(i, StandardCharsets.UTF_8));
                                while (i2 < listZzg.size()) {
                                    listZzg2 = zza.zzg((CharSequence) listZzg.get(i2));
                                    if (listZzg2.size() != 3) {
                                        throw zzat.zzb(null, null);
                                    }
                                    arrayList.add(new zzajz(Long.parseLong((String) listZzg2.get(0)), Long.parseLong((String) listZzg2.get(1)), 1 << (Integer.parseInt((String) listZzg2.get(2)) - 1)));
                                }
                                list.add(new zzaka(arrayList));
                            } else if (c == 2816) {
                            }
                            i5++;
                            c2 = 2820;
                            break;
                            break;
                        case 1760745220:
                            if (!strZzK.equals("Super_SlowMotion_BGM")) {
                                throw zzat.zzb("Invalid SEF name", null);
                            }
                            c = 2817;
                            i = zzamlVar.zzb - (iZzC + 8);
                            if (c == 2192) {
                                arrayList = new ArrayList();
                                listZzg = zzb.zzg(zzeuVar.zzK(i, StandardCharsets.UTF_8));
                                while (i2 < listZzg.size()) {
                                    listZzg2 = zza.zzg((CharSequence) listZzg.get(i2));
                                    if (listZzg2.size() != 3) {
                                        throw zzat.zzb(null, null);
                                    }
                                    arrayList.add(new zzajz(Long.parseLong((String) listZzg2.get(0)), Long.parseLong((String) listZzg2.get(1)), 1 << (Integer.parseInt((String) listZzg2.get(2)) - 1)));
                                }
                                list.add(new zzaka(arrayList));
                            } else if (c == 2816) {
                            }
                            i5++;
                            c2 = 2820;
                            break;
                            break;
                        default:
                            throw zzat.zzb("Invalid SEF name", null);
                    }
                }
            } else {
                long jZzo2 = zzagbVar.zzo();
                int i6 = this.zze - 20;
                zzeu zzeuVar2 = new zzeu(i6);
                zzagbVar.zzc(zzeuVar2.zzi(), 0, i6);
                int i7 = 0;
                while (i7 < i6 / 12) {
                    zzeuVar2.zzk(2);
                    zzeu zzeuVar3 = zzeuVar2;
                    short sZzw = zzeuVar3.zzw();
                    if (sZzw == s4 || sZzw == s3 || sZzw == s2 || sZzw == s || sZzw == 2820) {
                        this.zzc.add(new zzaml(sZzw, (jZzo2 - ((long) this.zze)) - ((long) zzeuVar3.zzC()), zzeuVar3.zzC()));
                    } else {
                        zzeuVar3.zzk(i4);
                    }
                    i7++;
                    i6 = i6;
                    zzeuVar2 = zzeuVar3;
                    i4 = 8;
                    s = 2819;
                    s2 = 2817;
                    s3 = 2816;
                    s4 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzahaVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzahaVar.zza = ((zzaml) list3.get(0)).zza;
                }
            }
        } else {
            zzeu zzeuVar4 = new zzeu(8);
            zzagbVar.zzc(zzeuVar4.zzi(), 0, 8);
            this.zze = zzeuVar4.zzC() + 8;
            if (zzeuVar4.zzB() != 1397048916) {
                zzahaVar.zza = 0L;
            } else {
                zzahaVar.zza = zzagbVar.zzn() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }
}
