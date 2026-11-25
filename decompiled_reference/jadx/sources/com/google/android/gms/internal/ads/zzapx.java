package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapx implements zzarn {
    private final List zza;

    public zzapx() {
        this(0);
    }

    public zzapx(int i, List list) {
        this.zza = list;
    }

    private final zzard zzc(zzarm zzarmVar) {
        return new zzard(zze(zzarmVar), "video/mp2t");
    }

    private final zzars zzd(zzarm zzarmVar) {
        return new zzars(zze(zzarmVar), "video/mp2t");
    }

    private final List zze(zzarm zzarmVar) {
        String str;
        int i;
        List listSingletonList;
        zzeu zzeuVar = new zzeu(zzarmVar.zze);
        List arrayList = this.zza;
        while (zzeuVar.zzd() > 0) {
            int iZzs = zzeuVar.zzs();
            int iZzg = zzeuVar.zzg() + zzeuVar.zzs();
            if (iZzs == 134) {
                arrayList = new ArrayList();
                int iZzs2 = zzeuVar.zzs() & 31;
                for (int i2 = 0; i2 < iZzs2; i2++) {
                    String strZzK = zzeuVar.zzK(3, StandardCharsets.UTF_8);
                    int iZzs3 = zzeuVar.zzs();
                    boolean z = (iZzs3 & 128) != 0;
                    if (z) {
                        i = iZzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZzs = (byte) zzeuVar.zzs();
                    zzeuVar.zzk(1);
                    if (z) {
                        int i3 = bZzs & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzdr.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzo(str);
                    zztVar.zze(strZzK);
                    zztVar.zzM(i);
                    zztVar.zzr(listSingletonList);
                    arrayList.add(zztVar.zzP());
                }
            }
            zzeuVar.zzh(iZzg);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzapx(int i) {
        this.zza = zzgwt.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final zzarp zzb(int i, zzarm zzarmVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaqt(new zzaqm(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzaqt(new zzaqk("video/mp2t"));
            }
            if (i == 27) {
                return new zzaqt(new zzaqh(zzc(zzarmVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzaqt(new zzaqj(zzc(zzarmVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzaqt(new zzaqn("video/mp2t"));
            }
            if (i == 89) {
                return new zzaqt(new zzapz(zzarmVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzaqt(new zzapt(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzarb(new zzaqs("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzaqt(new zzapy(zzarmVar.zzb, zzarmVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzaqt(new zzapw(false, zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzaqt(new zzaqf(zzd(zzarmVar), "video/mp2t"));
                            case 17:
                                return new zzaqt(new zzaql(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzarb(new zzaqs("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzaqt(new zzapy(zzarmVar.zzb, zzarmVar.zza(), 4096, "video/mp2t"));
                }
                return new zzaqt(new zzapq(zzarmVar.zzb, zzarmVar.zza(), "video/mp2t"));
            }
        }
        return new zzaqt(new zzaqc(zzd(zzarmVar), "video/mp2t"));
    }
}
