package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaoe implements zzans {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzanx zzg;
    private final zzanw zzh;
    private final zzaod zzi;
    private Bitmap zzj;

    public zzaoe(List list) {
        zzeu zzeuVar = new zzeu((byte[]) list.get(0));
        int iZzt = zzeuVar.zzt();
        int iZzt2 = zzeuVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzanx(719, 575, 0, 719, 0, 575);
        this.zzh = new zzanw(0, zzd(), zze(), zzf());
        this.zzi = new zzaod(iZzt, iZzt2);
    }

    private static zzanw zzb(zzet zzetVar, int i) {
        int[] iArr;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i2 = 8;
        int iZzj5 = zzetVar.zzj(8);
        zzetVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzj6 = zzetVar.zzj(i2);
            int iZzj7 = zzetVar.zzj(i2);
            if ((iZzj7 & 128) != 0) {
                iArr = iArrZzd;
            } else {
                iArr = (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            }
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzetVar.zzj(i2);
                iZzj4 = zzetVar.zzj(i2);
                iZzj = zzetVar.zzj(i2);
                iZzj2 = zzetVar.zzj(i2);
                i3 -= 6;
            } else {
                int iZzj8 = zzetVar.zzj(6) << 2;
                int iZzj9 = zzetVar.zzj(4) << 4;
                i3 -= 4;
                iZzj = zzetVar.zzj(4) << 4;
                iZzj2 = zzetVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d = iZzj3;
            String str = zzfm.zza;
            double d2 = iZzj4 - 128;
            double d3 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            iZzj5 = iZzj5;
            i2 = 8;
        }
        return new zzanw(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzany zzc(zzet zzetVar) {
        byte[] bArr;
        int iZzj = zzetVar.zzj(16);
        zzetVar.zzh(4);
        int iZzj2 = zzetVar.zzj(2);
        boolean zZzi = zzetVar.zzi();
        zzetVar.zzh(1);
        byte[] bArr2 = zzfm.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzetVar.zzj(16);
                int iZzj4 = zzetVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzetVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzetVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzany(iZzj, zZzi, bArr2, bArr);
        }
        zzetVar.zzh(zzetVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzany(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = WorkQueueKt.MASK;
                int i6 = 1 != i4 ? 0 : 127;
                int i7 = i3 != 0 ? 127 : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzg(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzg(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzg(WorkQueueKt.MASK, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + WorkQueueKt.MASK + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + WorkQueueKt.MASK + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + WorkQueueKt.MASK + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzg(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fe A[LOOP:3: B:89:0x0163->B:121:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    private static void zzh(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int i4;
        int iZzj4;
        int iZzj5;
        int i5;
        int i6;
        int iZzj6;
        int i7;
        Paint paint2 = paint;
        zzet zzetVar = new zzet(bArr, bArr.length);
        int i8 = i2;
        int i9 = i3;
        byte[] bArrZzi = null;
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        while (zzetVar.zzc() != 0) {
            int iZzj7 = zzetVar.zzj(8);
            if (iZzj7 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iZzj7) {
                    case 16:
                        int i13 = 1;
                        if (i == 3) {
                            if (bArrZzi == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzi;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrZzi3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzi3;
                        }
                        int i14 = 0;
                        while (true) {
                            int iZzj8 = zzetVar.zzj(2);
                            if (iZzj8 != 0) {
                                iZzj2 = i13;
                                iZzj = iZzj8;
                            } else {
                                if (zzetVar.zzi()) {
                                    iZzj3 = zzetVar.zzj(3) + 3;
                                    iZzj = zzetVar.zzj(2);
                                } else {
                                    if (zzetVar.zzi()) {
                                        iZzj2 = i13;
                                        iZzj = 0;
                                    } else {
                                        int iZzj9 = zzetVar.zzj(2);
                                        if (iZzj9 == 0) {
                                            c = 4;
                                            i14 = i13;
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else if (iZzj9 == i13) {
                                            c = 4;
                                            i14 = i14;
                                            iZzj2 = 2;
                                            iZzj = 0;
                                        } else if (iZzj9 == 2) {
                                            c = 4;
                                            i14 = i14;
                                            iZzj2 = zzetVar.zzj(4) + 12;
                                            iZzj = zzetVar.zzj(2);
                                        } else if (iZzj9 != 3) {
                                            iZzj = 0;
                                            iZzj2 = 0;
                                        } else {
                                            iZzj3 = zzetVar.zzj(8) + 29;
                                            iZzj = zzetVar.zzj(2);
                                        }
                                        if (iZzj2 == 0 && paint2 != null) {
                                            int i15 = i9 + 1;
                                            float f = i9;
                                            if (bArr2 != 0) {
                                                iZzj = bArr2[iZzj];
                                            }
                                            paint2.setColor(iArr[iZzj]);
                                            canvas.drawRect(i8, f, i8 + iZzj2, i15, paint2);
                                        }
                                        i8 += iZzj2;
                                        if (i14 != 0) {
                                            zzetVar.zzm();
                                        } else {
                                            paint2 = paint;
                                            i14 = i14;
                                            i13 = 1;
                                        }
                                    }
                                    c = 4;
                                    if (iZzj2 == 0) {
                                    }
                                    i8 += iZzj2;
                                    if (i14 != 0) {
                                        zzetVar.zzm();
                                    } else {
                                        paint2 = paint;
                                        i14 = i14;
                                        i13 = 1;
                                    }
                                }
                                iZzj2 = iZzj3;
                            }
                            c = 4;
                            if (iZzj2 == 0) {
                            }
                            i8 += iZzj2;
                            if (i14 != 0) {
                                zzetVar.zzm();
                            } else {
                                paint2 = paint;
                                i14 = i14;
                                i13 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrZzi2 == null ? zzc : bArrZzi2 : null;
                        boolean z = false;
                        while (true) {
                            int iZzj10 = zzetVar.zzj(i10);
                            if (iZzj10 != 0) {
                                i4 = 1;
                                z = z;
                            } else if (zzetVar.zzi()) {
                                if (zzetVar.zzi()) {
                                    int iZzj11 = zzetVar.zzj(i12);
                                    if (iZzj11 == 0) {
                                        i4 = 1;
                                    } else if (iZzj11 == 1) {
                                        i4 = i12;
                                    } else if (iZzj11 == i12) {
                                        iZzj4 = zzetVar.zzj(i10) + 9;
                                        iZzj5 = zzetVar.zzj(i10);
                                    } else if (iZzj11 != 3) {
                                        z = z;
                                        iZzj10 = 0;
                                        i4 = 0;
                                    } else {
                                        iZzj4 = zzetVar.zzj(8) + 25;
                                        iZzj5 = zzetVar.zzj(i10);
                                    }
                                    iZzj10 = 0;
                                } else {
                                    iZzj4 = zzetVar.zzj(i12) + i10;
                                    iZzj5 = zzetVar.zzj(i10);
                                }
                                i4 = iZzj4;
                                z = z;
                                iZzj10 = iZzj5;
                            } else {
                                int iZzj12 = zzetVar.zzj(3);
                                if (iZzj12 != 0) {
                                    i4 = iZzj12 + 2;
                                    iZzj10 = 0;
                                } else {
                                    z = true;
                                    iZzj10 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint2 == null) {
                                i5 = i12;
                            } else {
                                int i16 = i9 + 1;
                                float f2 = i9;
                                if (bArr4 != 0) {
                                    iZzj10 = bArr4[iZzj10];
                                }
                                paint2.setColor(iArr[iZzj10]);
                                i5 = 2;
                                canvas.drawRect(i8, f2, i8 + i4, i16, paint2);
                            }
                            i8 += i4;
                            if (z) {
                                zzetVar.zzm();
                                continue;
                            } else {
                                i12 = i5;
                                z = z;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i17 = i8;
                        int i18 = 0;
                        while (true) {
                            int iZzj13 = zzetVar.zzj(8);
                            if (iZzj13 != 0) {
                                i6 = i18;
                                iZzj6 = i11;
                            } else if (zzetVar.zzi()) {
                                i6 = i18;
                                iZzj6 = zzetVar.zzj(7);
                                iZzj13 = zzetVar.zzj(8);
                            } else {
                                int iZzj14 = zzetVar.zzj(7);
                                if (iZzj14 != 0) {
                                    i6 = i18;
                                    iZzj6 = iZzj14;
                                    iZzj13 = 0;
                                } else {
                                    i6 = i11;
                                    iZzj13 = 0;
                                    iZzj6 = 0;
                                }
                            }
                            if (iZzj6 == 0 || paint2 == null) {
                                i7 = i11;
                            } else {
                                paint2.setColor(iArr[iZzj13]);
                                i7 = i11;
                                canvas.drawRect(i17, i9, i17 + iZzj6, i9 + 1, paint2);
                            }
                            i17 += iZzj6;
                            if (i6 != 0) {
                                i8 = i17;
                                continue;
                            } else {
                                i11 = i7;
                                i18 = i6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzj7) {
                            case 32:
                                bArrZzi3 = zzi(4, 4, zzetVar);
                                break;
                            case 33:
                                bArrZzi = zzi(4, 8, zzetVar);
                                break;
                            case 34:
                                bArrZzi2 = zzi(16, 8, zzetVar);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i9 += 2;
                i8 = i2;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i, int i2, zzet zzetVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzetVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(byte[] bArr, int i, int i2, zzanr zzanrVar, zzdu zzduVar) {
        boolean z;
        zzank zzankVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i3;
        Canvas canvas2;
        int i4;
        zzaob zzaobVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i5;
        int iZzj5;
        zzet zzetVar = new zzet(bArr, i + i2);
        zzetVar.zzf(i);
        while (true) {
            z = true;
            if (zzetVar.zzc() >= 48 && zzetVar.zzj(8) == 15) {
                zzaod zzaodVar = this.zzi;
                int iZzj6 = zzetVar.zzj(8);
                int iZzj7 = zzetVar.zzj(16);
                int iZzj8 = zzetVar.zzj(16);
                int iZze = zzetVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzetVar.zzc()) {
                    zzeh.zzc("DvbParser", "Data field length exceeds limit");
                    zzetVar.zzh(zzetVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzaodVar.zza) {
                                zzanz zzanzVar = zzaodVar.zzi;
                                int iZzj9 = zzetVar.zzj(8);
                                int iZzj10 = zzetVar.zzj(4);
                                int iZzj11 = zzetVar.zzj(2);
                                zzetVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i6 = iZzj8 - 2; i6 > 0; i6 -= 6) {
                                    int iZzj12 = zzetVar.zzj(8);
                                    zzetVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzaoa(zzetVar.zzj(16), zzetVar.zzj(16)));
                                }
                                zzanz zzanzVar2 = new zzanz(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzanzVar2.zzb != 0) {
                                    zzaodVar.zzi = zzanzVar2;
                                    zzaodVar.zzc.clear();
                                    zzaodVar.zzd.clear();
                                    zzaodVar.zze.clear();
                                } else if (zzanzVar != null) {
                                    if (zzanzVar.zza != zzanzVar2.zza) {
                                        zzaodVar.zzi = zzanzVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzanz zzanzVar3 = zzaodVar.zzi;
                            if (iZzj7 == zzaodVar.zza && zzanzVar3 != null) {
                                int iZzj13 = zzetVar.zzj(8);
                                zzetVar.zzh(4);
                                boolean zZzi = zzetVar.zzi();
                                zzetVar.zzh(3);
                                int iZzj14 = zzetVar.zzj(16);
                                int iZzj15 = zzetVar.zzj(16);
                                int iZzj16 = zzetVar.zzj(3);
                                int iZzj17 = zzetVar.zzj(3);
                                zzetVar.zzh(2);
                                int iZzj18 = zzetVar.zzj(8);
                                int iZzj19 = zzetVar.zzj(8);
                                int iZzj20 = zzetVar.zzj(4);
                                int iZzj21 = zzetVar.zzj(2);
                                zzetVar.zzh(2);
                                int i7 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i7 > 0) {
                                    int iZzj22 = zzetVar.zzj(16);
                                    int iZzj23 = zzetVar.zzj(2);
                                    int iZzj24 = zzetVar.zzj(2);
                                    int iZzj25 = zzetVar.zzj(12);
                                    zzetVar.zzh(4);
                                    int iZzj26 = zzetVar.zzj(12);
                                    int i8 = i7 - 6;
                                    if (iZzj23 == 1) {
                                        i7 -= 8;
                                        iZzj = zzetVar.zzj(8);
                                        iZzj2 = zzetVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i7 -= 8;
                                        iZzj = zzetVar.zzj(8);
                                        iZzj2 = zzetVar.zzj(8);
                                    } else {
                                        i7 = i8;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzaoc(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzaob zzaobVar2 = new zzaob(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzanzVar3.zzb == 0 && (zzaobVar = (zzaob) zzaodVar.zzc.get(zzaobVar2.zza)) != null) {
                                    int i9 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzaobVar.zzj;
                                        if (i9 < sparseArray3.size()) {
                                            zzaobVar2.zzj.put(sparseArray3.keyAt(i9), (zzaoc) sparseArray3.valueAt(i9));
                                            i9++;
                                        }
                                    }
                                }
                                zzaodVar.zzc.put(zzaobVar2.zza, zzaobVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzaodVar.zza) {
                                zzanw zzanwVarZzb = zzb(zzetVar, iZzj8);
                                zzaodVar.zzd.put(zzanwVarZzb.zza, zzanwVarZzb);
                            } else if (iZzj7 == zzaodVar.zzb) {
                                zzanw zzanwVarZzb2 = zzb(zzetVar, iZzj8);
                                zzaodVar.zzf.put(zzanwVarZzb2.zza, zzanwVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzaodVar.zza) {
                                zzany zzanyVarZzc = zzc(zzetVar);
                                zzaodVar.zze.put(zzanyVarZzc.zza, zzanyVarZzc);
                            } else if (iZzj7 == zzaodVar.zzb) {
                                zzany zzanyVarZzc2 = zzc(zzetVar);
                                zzaodVar.zzg.put(zzanyVarZzc2.zza, zzanyVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzaodVar.zza) {
                                zzetVar.zzh(4);
                                boolean zZzi2 = zzetVar.zzi();
                                zzetVar.zzh(3);
                                int iZzj27 = zzetVar.zzj(16);
                                int iZzj28 = zzetVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzetVar.zzj(16);
                                    iZzj3 = zzetVar.zzj(16);
                                    iZzj5 = zzetVar.zzj(16);
                                    iZzj4 = zzetVar.zzj(16);
                                    i5 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i5 = 0;
                                    iZzj5 = 0;
                                }
                                zzaodVar.zzh = new zzanx(iZzj27, iZzj28, i5, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzetVar.zzo(iZze - zzetVar.zze());
                }
            }
        }
        zzaod zzaodVar2 = this.zzi;
        zzanz zzanzVar4 = zzaodVar2.zzi;
        if (zzanzVar4 == null) {
            zzankVar = new zzank(zzgwt.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzanx zzanxVar = zzaodVar2.zzh;
            if (zzanxVar == null) {
                zzanxVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzanxVar.zza + 1 != bitmap.getWidth() || zzanxVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzanxVar.zza + 1, zzanxVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzanzVar4.zzc;
            int i10 = 0;
            while (i10 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzaoa zzaoaVar = (zzaoa) sparseArray4.valueAt(i10);
                zzaob zzaobVar3 = (zzaob) zzaodVar2.zzc.get(sparseArray4.keyAt(i10));
                int i11 = zzaoaVar.zza + zzanxVar.zzc;
                int i12 = zzaoaVar.zzb + zzanxVar.zze;
                int i13 = zzaobVar3.zzc;
                int i14 = i11 + i13;
                boolean z2 = z;
                int iMin = Math.min(i14, zzanxVar.zzd);
                int i15 = zzaobVar3.zzd;
                int i16 = i12 + i15;
                canvas3.clipRect(i11, i12, iMin, Math.min(i16, zzanxVar.zzf));
                int i17 = zzaobVar3.zzf;
                zzanw zzanwVar = (zzanw) zzaodVar2.zzd.get(i17);
                if (zzanwVar == null && (zzanwVar = (zzanw) zzaodVar2.zzf.get(i17)) == null) {
                    zzanwVar = this.zzh;
                }
                SparseArray sparseArray5 = zzaobVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i18 = i10;
                int i19 = 0;
                while (i19 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i19);
                    int i20 = i19;
                    zzaoc zzaocVar = (zzaoc) sparseArray5.valueAt(i19);
                    SparseArray sparseArray7 = sparseArray5;
                    zzany zzanyVar = (zzany) zzaodVar2.zze.get(iKeyAt);
                    if (zzanyVar == null) {
                        zzanyVar = (zzany) zzaodVar2.zzg.get(iKeyAt);
                    }
                    if (zzanyVar != null) {
                        Paint paint = zzanyVar.zzb ? null : this.zzd;
                        int i21 = zzaobVar3.zze;
                        int i22 = zzaocVar.zza + i11;
                        int i23 = i12 + zzaocVar.zzb;
                        canvas2 = canvas3;
                        int[] iArr = i21 == 3 ? zzanwVar.zzd : i21 == 2 ? zzanwVar.zzc : zzanwVar.zzb;
                        i4 = i14;
                        zzh(zzanyVar.zzc, iArr, i21, i22, i23, paint, canvas2);
                        zzh(zzanyVar.zzd, iArr, i21, i22, i23 + 1, paint, canvas2);
                    } else {
                        canvas2 = canvas3;
                        i4 = i14;
                    }
                    i11 = i11;
                    i14 = i4;
                    i19 = i20 + 1;
                    i13 = i13;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzaodVar2 = zzaodVar2;
                }
                zzaod zzaodVar3 = zzaodVar2;
                Canvas canvas4 = canvas3;
                int i24 = i11;
                int i25 = i13;
                int i26 = i14;
                float f = i12;
                float f2 = i24;
                if (zzaobVar3.zzb) {
                    int i27 = zzaobVar3.zze;
                    if (i27 == 3) {
                        i3 = zzanwVar.zzd[zzaobVar3.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i27 == 2 ? zzanwVar.zzc[zzaobVar3.zzh] : zzanwVar.zzb[zzaobVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i26;
                    c2 = c3;
                    c = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i16, paint2);
                } else {
                    canvas = canvas4;
                    c = 3;
                    c2 = 2;
                }
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(Bitmap.createBitmap(this.zzj, i24, i12, i25, i15));
                float f4 = zzanxVar.zza;
                zzcxVar.zzi(f2 / f4);
                zzcxVar.zzj(0);
                float f5 = zzanxVar.zzb;
                zzcxVar.zzf(f / f5, 0);
                zzcxVar.zzg(0);
                zzcxVar.zzm(i25 / f4);
                zzcxVar.zzn(i15 / f5);
                arrayList.add(zzcxVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i10 = i18 + 1;
                z = z2;
                zzaodVar2 = zzaodVar3;
                sparseArray4 = sparseArray6;
            }
            zzankVar = new zzank(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzduVar.zza(zzankVar);
    }
}
