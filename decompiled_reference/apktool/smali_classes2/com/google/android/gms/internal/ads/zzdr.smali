.class public final Lcom/google/android/gms/internal/ads/zzdr;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@25.3.0"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[B

.field private static final zzc:[Ljava/lang/String;

.field private static final zzd:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/gms/internal/ads/zzdr;->zzb:[B

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ""

    aput-object v2, v0, v1

    const-string v1, "A"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    const-string v2, "B"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "C"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzc:[Ljava/lang/String;

    const-string v0, "^\\D?(\\d+)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzd:Ljava/util/regex/Pattern;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static zza(BBBB)Lcom/google/android/gms/internal/ads/zzgwt;
    .locals 4

    const/16 v0, 0xc

    .line 1
    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput-byte v2, v0, v1

    aput-byte v2, v0, v2

    const/4 v1, 0x2

    aput-byte p0, v0, v1

    const/4 p0, 0x3

    aput-byte v1, v0, p0

    const/4 v1, 0x4

    aput-byte v2, v0, v1

    const/4 v3, 0x5

    aput-byte p1, v0, v3

    const/4 p1, 0x6

    aput-byte p0, v0, p1

    const/4 p0, 0x7

    aput-byte v2, v0, p0

    const/16 p0, 0x8

    aput-byte p2, v0, p0

    const/16 p0, 0x9

    aput-byte v1, v0, p0

    const/16 p0, 0xa

    aput-byte v2, v0, p0

    const/16 p0, 0xb

    aput-byte p3, v0, p0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    move-result-object p0

    return-object p0
.end method

.method public static zzb(III)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "avc1.%02X%02X%02X"

    .line 2
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static zzc(IZII[II)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzdr;->zzc:[Ljava/lang/String;

    aget-object p0, v1, p0

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 3
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v1, 0x1

    if-eq v1, p1, :cond_0

    const/16 p1, 0x4c

    goto :goto_0

    :cond_0
    const/16 p1, 0x48

    .line 4
    :goto_0
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    .line 5
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    filled-new-array {p0, p2, p3, p1, p5}, [Ljava/lang/Object;

    move-result-object p0

    .line 6
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string p2, "hvc1.%s%d.%X.%c%d"

    .line 7
    invoke-static {p1, p2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 6
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x6

    :goto_1
    const/4 p1, 0x0

    if-lez p0, :cond_1

    add-int/lit8 p2, p0, -0x1

    .line 8
    aget p3, p4, p2

    if-nez p3, :cond_1

    move p0, p2

    goto :goto_1

    :cond_1
    :goto_2
    if-ge p1, p0, :cond_2

    .line 9
    aget p2, p4, p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, ".%02X"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static zzd([B)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    const/16 v1, 0x11

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v4, "Invalid APV CSD length: %s"

    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zzd(ZLjava/lang/String;I)V

    .line 2
    aget-byte v0, p0, v3

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    const-string v1, "Invalid APV CSD version: %s"

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zzd(ZLjava/lang/String;I)V

    const/4 v0, 0x5

    .line 3
    aget-byte v0, p0, v0

    .line 4
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzdr$$ExternalSyntheticBackport0;->m(B)I

    move-result v0

    const/4 v1, 0x6

    .line 5
    aget-byte v1, p0, v1

    .line 6
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzdr$$ExternalSyntheticBackport0;->m(B)I

    move-result v1

    const/4 v2, 0x7

    .line 7
    aget-byte p0, p0, v2

    .line 8
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdr$$ExternalSyntheticBackport0;->m(B)I

    move-result p0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "apv1.apvf%d.apvl%d.apvb%d"

    .line 10
    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static zze(Lcom/google/android/gms/internal/ads/zzv;)Landroid/util/Pair;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdr;->zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzdq;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdq;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/util/Pair;

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdq;->zza()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdq;->zzb()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzdq;
    .locals 28

    move-object/from16 v0, p0

    const-string v1, "Unrecognized MP4A profile: -1"

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    const-string v4, "\\."

    .line 2
    invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 3
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    const-string v6, "video/dolby-vision"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v10, 0x80

    const/16 v11, 0x1000

    const/16 v12, 0x40

    const/16 v13, 0x20

    const/16 v14, 0x8

    const/16 v15, 0x10

    move-object/from16 v16, v3

    const/4 v3, 0x3

    const/16 v17, 0x800

    const/4 v6, 0x4

    const/16 v18, 0x400

    const/4 v7, 0x2

    const/16 v19, 0x200

    const/4 v8, 0x1

    const/16 v20, 0x100

    const-string v9, "CodecSpecificDataUtil"

    if-eqz v5, :cond_8

    .line 4
    array-length v0, v4

    const-string v1, "Ignoring malformed Dolby Vision codec string: "

    if-ge v0, v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzd:Ljava/util/regex/Pattern;

    .line 6
    aget-object v3, v4, v8

    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 9
    :cond_2
    invoke-virtual {v0, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x61f

    if-eq v1, v2, :cond_4

    packed-switch v1, :pswitch_data_0

    :cond_3
    move-object/from16 v1, v16

    goto/16 :goto_0

    .line 11
    :pswitch_0
    const-string v1, "09"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_1
    const-string v1, "08"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 13
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_2
    const-string v1, "07"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 14
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_3
    const-string v1, "06"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 15
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_4
    const-string v1, "05"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 16
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_5
    const-string v1, "04"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_6
    const-string v1, "03"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 18
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_7
    const-string v1, "02"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :pswitch_8
    const-string v1, "01"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 20
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    .line 36
    :pswitch_9
    const-string v1, "00"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 21
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_4
    const-string v1, "10"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 11
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_5

    .line 10
    const-string v1, "Unknown Dolby Vision profile string: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    .line 23
    :cond_5
    aget-object v0, v4, v7

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    packed-switch v2, :pswitch_data_1

    packed-switch v2, :pswitch_data_2

    :cond_6
    move-object/from16 v2, v16

    goto/16 :goto_1

    .line 37
    :pswitch_a
    const-string v2, "13"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 25
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_b
    const-string v2, "12"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 26
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_c
    const-string v2, "11"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 27
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_d
    const-string v2, "10"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 28
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_e
    const-string v2, "09"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 29
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_f
    const-string v2, "08"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 30
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :pswitch_10
    const-string v2, "07"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 31
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :pswitch_11
    const-string v2, "06"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 32
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :pswitch_12
    const-string v2, "05"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 33
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :pswitch_13
    const-string v2, "04"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 34
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :pswitch_14
    const-string v2, "03"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 35
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :pswitch_15
    const-string v2, "02"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 36
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    .line 39
    :pswitch_16
    const-string v2, "01"

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 37
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_7

    .line 38
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unknown Dolby Vision level string: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    .line 39
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v0

    :cond_8
    const/4 v5, 0x0

    move/from16 v21, v10

    .line 41
    aget-object v10, v4, v5

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v22

    move/from16 v23, v11

    const/16 v11, 0x15

    move/from16 v24, v12

    const/4 v12, 0x6

    const/16 v25, 0x2000

    move/from16 v26, v13

    const/16 v13, 0x14

    move/from16 v27, v6

    const/4 v6, -0x1

    sparse-switch v22, :sswitch_data_0

    goto/16 :goto_18

    .line 150
    :sswitch_0
    const-string v1, "vvi1"

    .line 41
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    goto :goto_2

    :sswitch_1
    const-string v1, "vvc1"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 89
    :goto_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    .line 90
    array-length v2, v4

    const-string v5, "Ignoring malformed VVC codec string: "

    if-ge v2, v3, :cond_9

    .line 91
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 92
    :cond_9
    :try_start_0
    aget-object v2, v4, v8

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v1, v8, :cond_c

    if-eqz v0, :cond_a

    iget v1, v0, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    if-ne v1, v12, :cond_a

    move/from16 v0, v23

    goto :goto_3

    :cond_a
    if-eqz v0, :cond_b

    .line 95
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzi;->zzf:I

    if-ne v0, v14, :cond_b

    move v0, v8

    goto :goto_3

    :cond_b
    move v0, v7

    goto :goto_3

    :cond_c
    const/16 v0, 0x41

    if-ne v1, v0, :cond_f

    move/from16 v0, v27

    .line 94
    :goto_3
    aget-object v1, v4, v7

    .line 95
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_1

    goto/16 :goto_4

    .line 118
    :sswitch_2
    const-string v2, "L144"

    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x200000

    .line 97
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_3
    const-string v2, "L128"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x80000

    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_4
    const-string v2, "L112"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x20000

    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_5
    const-string v2, "H144"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x400000

    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_6
    const-string v2, "H128"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x100000

    .line 98
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_7
    const-string v2, "H112"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x40000

    .line 100
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_8
    const-string v2, "L96"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const v2, 0x8000

    .line 103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_9
    const-string v2, "L86"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 105
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_a
    const-string v2, "L83"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 107
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_b
    const-string v2, "L80"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 109
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_c
    const-string v2, "L67"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 111
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_d
    const-string v2, "L64"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 113
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_e
    const-string v2, "L51"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 114
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_f
    const-string v2, "L48"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 115
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_10
    const-string v2, "L35"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 116
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_5

    .line 95
    :sswitch_11
    const-string v2, "L32"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 117
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_12
    const-string v2, "L16"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 118
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_13
    const-string v2, "H96"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x10000

    .line 102
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_14
    const-string v2, "H86"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/16 v2, 0x4000

    .line 104
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_15
    const-string v2, "H83"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 106
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_16
    const-string v2, "H80"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 108
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_17
    const-string v2, "H67"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 110
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    .line 95
    :sswitch_18
    const-string v2, "H64"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 112
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_5

    :cond_d
    :goto_4
    move-object/from16 v3, v16

    :goto_5
    if-nez v3, :cond_e

    .line 119
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unknown VVC level string: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_e
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 120
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v1

    .line 121
    :cond_f
    aget-object v0, v4, v8

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unknown VVC profile IDC: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    .line 93
    :catch_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    .line 41
    :sswitch_19
    const-string v1, "vp09"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 123
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 124
    array-length v1, v4

    const-string v2, "Ignoring malformed VP9 codec string: "

    if-ge v1, v3, :cond_10

    .line 125
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 126
    :cond_10
    :try_start_1
    aget-object v1, v4, v8

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 127
    aget-object v4, v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v1, :cond_14

    if-eq v1, v8, :cond_13

    if-eq v1, v7, :cond_12

    if-eq v1, v3, :cond_11

    move v2, v6

    goto :goto_6

    :cond_11
    move v2, v14

    goto :goto_6

    :cond_12
    move/from16 v2, v27

    goto :goto_6

    :cond_13
    move v2, v7

    goto :goto_6

    :cond_14
    move v2, v8

    :goto_6
    if-ne v2, v6, :cond_15

    .line 129
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr v0, v11

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown VP9 profile: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_15
    const/16 v1, 0xa

    if-eq v0, v1, :cond_1e

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1f

    if-eq v0, v13, :cond_1d

    if-eq v0, v11, :cond_1c

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_1b

    const/16 v1, 0x1f

    if-eq v0, v1, :cond_1a

    const/16 v1, 0x28

    if-eq v0, v1, :cond_19

    const/16 v1, 0x29

    if-eq v0, v1, :cond_18

    const/16 v1, 0x32

    if-eq v0, v1, :cond_17

    const/16 v1, 0x33

    if-eq v0, v1, :cond_16

    packed-switch v0, :pswitch_data_3

    move v7, v6

    goto :goto_7

    :pswitch_17
    move/from16 v7, v25

    goto :goto_7

    :pswitch_18
    move/from16 v7, v23

    goto :goto_7

    :pswitch_19
    move/from16 v7, v17

    goto :goto_7

    :cond_16
    move/from16 v7, v19

    goto :goto_7

    :cond_17
    move/from16 v7, v20

    goto :goto_7

    :cond_18
    move/from16 v7, v21

    goto :goto_7

    :cond_19
    move/from16 v7, v24

    goto :goto_7

    :cond_1a
    move/from16 v7, v26

    goto :goto_7

    :cond_1b
    move v7, v15

    goto :goto_7

    :cond_1c
    move v7, v14

    goto :goto_7

    :cond_1d
    move/from16 v7, v27

    goto :goto_7

    :cond_1e
    move v7, v8

    :cond_1f
    :goto_7
    if-ne v7, v6, :cond_20

    .line 130
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x13

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unknown VP9 level: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_20
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v0, v2, v7}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v0

    .line 128
    :catch_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    .line 41
    :sswitch_1a
    const-string v1, "s263"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 143
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 144
    array-length v1, v4

    const-string v2, "Ignoring malformed H263 codec string: "

    if-ge v1, v3, :cond_21

    .line 145
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 146
    :cond_21
    :try_start_2
    aget-object v1, v4, v8

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 147
    aget-object v3, v4, v7

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    packed-switch v1, :pswitch_data_4

    move v2, v6

    goto :goto_8

    :pswitch_1a
    move/from16 v2, v20

    goto :goto_8

    :pswitch_1b
    move/from16 v2, v21

    goto :goto_8

    :pswitch_1c
    move/from16 v2, v24

    goto :goto_8

    :pswitch_1d
    move/from16 v2, v26

    goto :goto_8

    :pswitch_1e
    move v2, v15

    goto :goto_8

    :pswitch_1f
    move v2, v14

    goto :goto_8

    :pswitch_20
    move/from16 v2, v27

    goto :goto_8

    :pswitch_21
    move v2, v7

    goto :goto_8

    :pswitch_22
    move v2, v8

    :goto_8
    if-ne v2, v6, :cond_22

    .line 149
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x16

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown H263 profile: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_22
    const/16 v1, 0xa

    if-eq v0, v1, :cond_2a

    if-eq v0, v13, :cond_29

    const/16 v1, 0x1e

    if-eq v0, v1, :cond_28

    const/16 v1, 0x28

    if-eq v0, v1, :cond_27

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_26

    const/16 v1, 0x32

    if-eq v0, v1, :cond_25

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_24

    const/16 v1, 0x46

    if-eq v0, v1, :cond_23

    move v10, v6

    goto :goto_9

    :cond_23
    move/from16 v10, v21

    goto :goto_9

    :cond_24
    move/from16 v10, v24

    goto :goto_9

    :cond_25
    move/from16 v10, v26

    goto :goto_9

    :cond_26
    move v10, v15

    goto :goto_9

    :cond_27
    move v10, v14

    goto :goto_9

    :cond_28
    move/from16 v10, v27

    goto :goto_9

    :cond_29
    move v10, v7

    goto :goto_9

    :cond_2a
    move v10, v8

    :goto_9
    if-ne v10, v6, :cond_2b

    .line 150
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr v1, v13

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unknown H263 level: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_2b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v0, v2, v10}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v0

    .line 148
    :catch_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    .line 41
    :sswitch_1b
    const-string v2, "mp4a"

    invoke-virtual {v10, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_69

    .line 62
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 63
    array-length v2, v4

    const-string v10, "Ignoring malformed MP4A codec string: "

    if-eq v2, v3, :cond_2c

    .line 64
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 65
    :cond_2c
    :try_start_3
    aget-object v2, v4, v8

    invoke-static {v2, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    .line 66
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzas;->zze(I)Ljava/lang/String;

    move-result-object v2

    const-string v11, "audio/mp4a-latm"

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_34

    .line 67
    aget-object v2, v4, v7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0x11

    if-eq v2, v4, :cond_32

    if-eq v2, v13, :cond_31

    const/16 v4, 0x17

    if-eq v2, v4, :cond_30

    const/16 v4, 0x1d

    if-eq v2, v4, :cond_2f

    const/16 v4, 0x27

    if-eq v2, v4, :cond_2e

    const/16 v4, 0x2a

    if-eq v2, v4, :cond_2d

    packed-switch v2, :pswitch_data_5

    move v3, v6

    goto :goto_a

    :pswitch_23
    move v3, v12

    goto :goto_a

    :pswitch_24
    const/4 v3, 0x5

    goto :goto_a

    :pswitch_25
    move/from16 v3, v27

    goto :goto_a

    :pswitch_26
    move v3, v7

    goto :goto_a

    :pswitch_27
    move v3, v8

    goto :goto_a

    :cond_2d
    const/16 v3, 0x2a

    goto :goto_a

    :cond_2e
    const/16 v3, 0x27

    goto :goto_a

    :cond_2f
    const/16 v3, 0x1d

    goto :goto_a

    :cond_30
    const/16 v3, 0x17

    goto :goto_a

    :cond_31
    move v3, v13

    goto :goto_a

    :cond_32
    const/16 v3, 0x11

    :goto_a
    :pswitch_28
    if-ne v3, v6, :cond_33

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x1d

    .line 68
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_33
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v1, v3, v5}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v1

    :cond_34
    return-object v16

    .line 69
    :catch_3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    .line 41
    :sswitch_1c
    const-string v0, "iamf"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_69

    .line 42
    array-length v0, v4

    move/from16 v1, v27

    if-ge v0, v1, :cond_35

    const-string v0, "Ignoring malformed IAMF codec string: "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 44
    :cond_35
    :try_start_4
    aget-object v0, v4, v8

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 46
    aget-object v1, v4, v3

    .line 47
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_2

    goto/16 :goto_b

    .line 51
    :sswitch_1d
    const-string v2, "mp4a"

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_42

    if-eqz v0, :cond_38

    if-eq v0, v8, :cond_37

    if-eq v0, v7, :cond_36

    .line 50
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unrecognized IAMF AAC profile: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_36
    const v0, 0x1040002

    goto/16 :goto_d

    :cond_37
    const v0, 0x1020002

    goto/16 :goto_d

    :cond_38
    const v0, 0x1010002

    goto/16 :goto_d

    .line 47
    :sswitch_1e
    const-string v2, "ipcm"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_42

    if-eqz v0, :cond_3b

    if-eq v0, v8, :cond_3a

    if-eq v0, v7, :cond_39

    .line 48
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unrecognized IAMF PCM profile: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_39
    const v0, 0x1040008

    goto/16 :goto_d

    :cond_3a
    const v0, 0x1020008

    goto/16 :goto_d

    :cond_3b
    const v0, 0x1010008

    goto/16 :goto_d

    .line 47
    :sswitch_1f
    const-string v2, "fLaC"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_42

    if-eqz v0, :cond_3e

    if-eq v0, v8, :cond_3d

    if-eq v0, v7, :cond_3c

    .line 49
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x20

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unrecognized IAMF FLAC profile: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_3c
    const v0, 0x1040004

    goto :goto_d

    :cond_3d
    const v0, 0x1020004

    goto :goto_d

    :cond_3e
    const v0, 0x1010004

    goto :goto_d

    .line 47
    :sswitch_20
    const-string v2, "Opus"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_42

    if-eqz v0, :cond_41

    if-eq v0, v8, :cond_40

    if-eq v0, v7, :cond_3f

    .line 51
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x20

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unrecognized IAMF Opus profile: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_3f
    const v0, 0x1040001

    goto :goto_d

    :cond_40
    const v0, 0x1020001

    goto :goto_d

    :cond_41
    const v0, 0x1010001

    goto :goto_d

    .line 52
    :cond_42
    :goto_b
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unrecognized codec identifier for IAMF auxiliary profile: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    :goto_c
    move v0, v6

    :goto_d
    if-ne v0, v6, :cond_43

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_43
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v1, v0, v5}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v1

    :catch_4
    move-exception v0

    .line 45
    aget-object v1, v4, v8

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Ignoring malformed primary profile in IAMF codec string: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_18

    .line 41
    :sswitch_21
    const-string v1, "hvc1"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    goto :goto_e

    :sswitch_22
    const-string v1, "hev1"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 122
    :goto_e
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    invoke-static {v1, v4, v0}, Lcom/google/android/gms/internal/ads/zzdr;->zzg(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzdq;

    move-result-object v0

    return-object v0

    .line 41
    :sswitch_23
    const-string v1, "avc2"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    goto :goto_f

    :sswitch_24
    const-string v1, "avc1"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 131
    :goto_f
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 132
    array-length v1, v4

    const-string v2, "Ignoring malformed AVC codec string: "

    if-ge v1, v7, :cond_44

    .line 133
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 134
    :cond_44
    :try_start_5
    aget-object v10, v4, v8

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-ne v10, v12, :cond_45

    .line 138
    aget-object v1, v4, v8

    invoke-virtual {v1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    .line 139
    aget-object v3, v4, v8

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_10

    :cond_45
    if-lt v1, v3, :cond_4f

    .line 135
    aget-object v1, v4, v8

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 136
    aget-object v3, v4, v7

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    :goto_10
    const/16 v2, 0x42

    if-eq v1, v2, :cond_4b

    const/16 v2, 0x4d

    if-eq v1, v2, :cond_4c

    const/16 v2, 0x58

    if-eq v1, v2, :cond_4a

    const/16 v2, 0x64

    if-eq v1, v2, :cond_49

    const/16 v2, 0x6e

    if-eq v1, v2, :cond_48

    const/16 v2, 0x7a

    if-eq v1, v2, :cond_47

    const/16 v2, 0xf4

    if-eq v1, v2, :cond_46

    move v7, v6

    goto :goto_11

    :cond_46
    move/from16 v7, v24

    goto :goto_11

    :cond_47
    move/from16 v7, v26

    goto :goto_11

    :cond_48
    move v7, v15

    goto :goto_11

    :cond_49
    move v7, v14

    goto :goto_11

    :cond_4a
    const/4 v7, 0x4

    goto :goto_11

    :cond_4b
    move v7, v8

    :cond_4c
    :goto_11
    if-ne v7, v6, :cond_4d

    .line 141
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr v0, v11

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown AVC profile: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_4d
    packed-switch v0, :pswitch_data_6

    packed-switch v0, :pswitch_data_7

    packed-switch v0, :pswitch_data_8

    packed-switch v0, :pswitch_data_9

    packed-switch v0, :pswitch_data_a

    move v1, v6

    goto :goto_12

    :pswitch_29
    const/high16 v1, 0x10000

    goto :goto_12

    :pswitch_2a
    const v1, 0x8000

    goto :goto_12

    :pswitch_2b
    const/16 v1, 0x4000

    goto :goto_12

    :pswitch_2c
    move/from16 v1, v25

    goto :goto_12

    :pswitch_2d
    move/from16 v1, v23

    goto :goto_12

    :pswitch_2e
    move/from16 v1, v17

    goto :goto_12

    :pswitch_2f
    move/from16 v1, v18

    goto :goto_12

    :pswitch_30
    move/from16 v1, v19

    goto :goto_12

    :pswitch_31
    move/from16 v1, v20

    goto :goto_12

    :pswitch_32
    move/from16 v1, v21

    goto :goto_12

    :pswitch_33
    move/from16 v1, v24

    goto :goto_12

    :pswitch_34
    move/from16 v1, v26

    goto :goto_12

    :pswitch_35
    move v1, v15

    goto :goto_12

    :pswitch_36
    move v1, v14

    goto :goto_12

    :pswitch_37
    const/4 v1, 0x4

    goto :goto_12

    :pswitch_38
    move v1, v8

    :goto_12
    if-ne v1, v6, :cond_4e

    .line 142
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x13

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unknown AVC level: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_4e
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v0, v7, v1}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v0

    .line 137
    :cond_4f
    :try_start_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x25

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_5

    return-object v16

    .line 140
    :catch_5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    .line 41
    :sswitch_25
    const-string v1, "av01"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 79
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    .line 80
    array-length v2, v4

    const-string v10, "Ignoring malformed AV1 codec string: "

    const/4 v13, 0x4

    if-ge v2, v13, :cond_50

    .line 81
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 82
    :cond_50
    :try_start_7
    aget-object v2, v4, v8

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 83
    aget-object v13, v4, v7

    invoke-virtual {v13, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 84
    aget-object v3, v4, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_6

    if-eqz v2, :cond_51

    .line 86
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/2addr v0, v11

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown AV1 profile: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_51
    if-eq v1, v14, :cond_55

    const/16 v2, 0xa

    if-eq v1, v2, :cond_52

    .line 88
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x17

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown AV1 bit depth: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_52
    if-eqz v0, :cond_54

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzi;->zze:[B

    if-nez v1, :cond_53

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_53

    if-ne v0, v12, :cond_54

    :cond_53
    move/from16 v0, v23

    goto :goto_13

    :cond_54
    move v0, v7

    goto :goto_13

    :cond_55
    move v0, v8

    :goto_13
    packed-switch v5, :pswitch_data_b

    move v1, v6

    goto/16 :goto_14

    :pswitch_39
    const/high16 v1, 0x800000

    goto/16 :goto_14

    :pswitch_3a
    const/high16 v1, 0x400000

    goto :goto_14

    :pswitch_3b
    const/high16 v1, 0x200000

    goto :goto_14

    :pswitch_3c
    const/high16 v1, 0x100000

    goto :goto_14

    :pswitch_3d
    const/high16 v1, 0x80000

    goto :goto_14

    :pswitch_3e
    const/high16 v1, 0x40000

    goto :goto_14

    :pswitch_3f
    const/high16 v1, 0x20000

    goto :goto_14

    :pswitch_40
    const/high16 v1, 0x10000

    goto :goto_14

    :pswitch_41
    const v1, 0x8000

    goto :goto_14

    :pswitch_42
    const/16 v1, 0x4000

    goto :goto_14

    :pswitch_43
    move/from16 v1, v25

    goto :goto_14

    :pswitch_44
    move/from16 v1, v23

    goto :goto_14

    :pswitch_45
    move/from16 v1, v17

    goto :goto_14

    :pswitch_46
    move/from16 v1, v18

    goto :goto_14

    :pswitch_47
    move/from16 v1, v19

    goto :goto_14

    :pswitch_48
    move/from16 v1, v20

    goto :goto_14

    :pswitch_49
    move/from16 v1, v21

    goto :goto_14

    :pswitch_4a
    move/from16 v1, v24

    goto :goto_14

    :pswitch_4b
    move/from16 v1, v26

    goto :goto_14

    :pswitch_4c
    move v1, v15

    goto :goto_14

    :pswitch_4d
    move v1, v14

    goto :goto_14

    :pswitch_4e
    const/4 v1, 0x4

    goto :goto_14

    :pswitch_4f
    move v1, v7

    goto :goto_14

    :pswitch_50
    move v1, v8

    :goto_14
    if-ne v1, v6, :cond_56

    .line 87
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x13

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown AV1 level: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_56
    new-instance v2, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v2

    .line 85
    :catch_6
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    .line 41
    :sswitch_26
    const-string v1, "apv1"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 70
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 71
    array-length v0, v4

    const-string v2, "Ignoring malformed APV codec string: "

    const/4 v13, 0x4

    if-ge v0, v13, :cond_57

    .line 72
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 73
    :cond_57
    :try_start_8
    aget-object v0, v4, v8

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 74
    aget-object v5, v4, v7

    invoke-virtual {v5, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 75
    aget-object v3, v4, v3

    invoke-virtual {v3, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_7

    const/16 v2, 0x21

    if-ne v0, v2, :cond_58

    goto :goto_15

    :cond_58
    const/16 v2, 0x2c

    if-ne v0, v2, :cond_5a

    move/from16 v8, v25

    .line 77
    :goto_15
    invoke-static {v5, v1}, Lcom/google/android/gms/internal/ads/zzdr;->zzi(II)I

    move-result v0

    if-ne v0, v6, :cond_59

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_59
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v1, v8, v0}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v1

    .line 78
    :cond_5a
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1a

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unrecognized APV profile: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :catch_7
    move-exception v0

    .line 76
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_18

    .line 41
    :sswitch_27
    const-string v1, "ac-4"

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_69

    .line 53
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 54
    array-length v1, v4

    const-string v2, "Ignoring malformed AC-4 codec string: "

    const/4 v5, 0x4

    if-eq v1, v5, :cond_5b

    .line 55
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    .line 56
    :cond_5b
    :try_start_9
    aget-object v1, v4, v8

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 57
    aget-object v5, v4, v7

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 58
    aget-object v4, v4, v3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_8

    if-eqz v1, :cond_61

    if-eq v1, v8, :cond_5f

    if-eq v1, v7, :cond_5d

    :cond_5c
    move v2, v6

    goto :goto_16

    :cond_5d
    if-ne v5, v8, :cond_5e

    const/16 v2, 0x402

    goto :goto_16

    :cond_5e
    if-ne v5, v7, :cond_5c

    const/16 v2, 0x404

    goto :goto_16

    :cond_5f
    if-nez v5, :cond_60

    const/16 v2, 0x201

    goto :goto_16

    :cond_60
    if-ne v5, v8, :cond_5c

    const/16 v2, 0x202

    goto :goto_16

    :cond_61
    if-nez v5, :cond_5c

    const/16 v2, 0x101

    :goto_16
    if-ne v2, v6, :cond_62

    .line 60
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x17

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/2addr v0, v2

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Unknown AC-4 profile: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_62
    if-eqz v0, :cond_66

    if-eq v0, v8, :cond_65

    if-eq v0, v7, :cond_64

    if-eq v0, v3, :cond_67

    const/4 v1, 0x4

    if-eq v0, v1, :cond_63

    move v14, v6

    goto :goto_17

    :cond_63
    move v14, v15

    goto :goto_17

    :cond_64
    const/4 v1, 0x4

    move v14, v1

    goto :goto_17

    :cond_65
    move v14, v7

    goto :goto_17

    :cond_66
    move v14, v8

    :cond_67
    :goto_17
    if-ne v14, v6, :cond_68

    .line 61
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/2addr v1, v13

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unknown AC-4 level: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object v0

    :cond_68
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdq;

    invoke-direct {v0, v2, v14}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object v0

    .line 59
    :catch_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    :cond_69
    :goto_18
    return-object v16

    nop

    :pswitch_data_0
    .packed-switch 0x600
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x601
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61f
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x2d9149 -> :sswitch_27
        0x2dcaea -> :sswitch_26
        0x2dd8f6 -> :sswitch_25
        0x2ddf23 -> :sswitch_24
        0x2ddf24 -> :sswitch_23
        0x30d038 -> :sswitch_22
        0x310dbc -> :sswitch_21
        0x3134b1 -> :sswitch_1c
        0x333790 -> :sswitch_1b
        0x35091c -> :sswitch_1a
        0x374e43 -> :sswitch_19
        0x376aee -> :sswitch_1
        0x376ba8 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11506 -> :sswitch_18
        0x11509 -> :sswitch_17
        0x11540 -> :sswitch_16
        0x11543 -> :sswitch_15
        0x11546 -> :sswitch_14
        0x11565 -> :sswitch_13
        0x12371 -> :sswitch_12
        0x123ab -> :sswitch_11
        0x123ae -> :sswitch_10
        0x123d0 -> :sswitch_f
        0x123e8 -> :sswitch_e
        0x1240a -> :sswitch_d
        0x1240d -> :sswitch_c
        0x12444 -> :sswitch_b
        0x12447 -> :sswitch_a
        0x1244a -> :sswitch_9
        0x12469 -> :sswitch_8
        0x2178ca -> :sswitch_7
        0x2178ef -> :sswitch_6
        0x217929 -> :sswitch_5
        0x234a46 -> :sswitch_4
        0x234a6b -> :sswitch_3
        0x234aa5 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x3c
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_27
        :pswitch_26
        :pswitch_28
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x259c5f -> :sswitch_20
        0x2f8728 -> :sswitch_1f
        0x316bd1 -> :sswitch_1e
        0x333790 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0xa
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x14
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1e
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x28
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x32
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
    .end packed-switch
.end method

.method public static zzg(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzdq;
    .locals 7

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    const-string v2, "CodecSpecificDataUtil"

    const-string v3, "Ignoring malformed HEVC codec string: "

    const/4 v4, 0x4

    if-ge v0, v4, :cond_0

    .line 2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzdr;->zzd:Ljava/util/regex/Pattern;

    const/4 v5, 0x1

    .line 3
    aget-object v6, p1, v5

    invoke-virtual {v0, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-nez v6, :cond_1

    .line 5
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 6
    :cond_1
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v3, 0x1000

    const/4 v6, 0x2

    if-eqz v0, :cond_2

    move p0, v5

    goto :goto_0

    .line 8
    :cond_2
    const-string v0, "2"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz p2, :cond_3

    iget p0, p2, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    const/4 p2, 0x6

    if-ne p0, p2, :cond_3

    move p0, v3

    goto :goto_0

    :cond_3
    move p0, v6

    :goto_0
    const/4 p2, 0x3

    .line 7
    aget-object p1, p1, p2

    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    goto/16 :goto_1

    .line 34
    :sswitch_0
    const-string p2, "L186"

    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x1000000

    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_1
    const-string p2, "L183"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x400000

    .line 23
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_2
    const-string p2, "L180"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x100000

    .line 24
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_3
    const-string p2, "L156"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x40000

    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_4
    const-string p2, "L153"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x10000

    .line 26
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_5
    const-string p2, "L150"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x4000

    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_6
    const-string p2, "L123"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 28
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_7
    const-string p2, "L120"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x400

    .line 29
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_8
    const-string p2, "H186"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x2000000

    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_9
    const-string p2, "H183"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x800000

    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_a
    const-string p2, "H180"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x200000

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_b
    const-string p2, "H156"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x80000

    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_c
    const-string p2, "H153"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x20000

    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_d
    const-string p2, "H150"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const p2, 0x8000

    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_e
    const-string p2, "H123"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x2000

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_f
    const-string p2, "H120"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x800

    .line 16
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_10
    const-string p2, "L93"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x100

    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_11
    const-string p2, "L90"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x40

    .line 31
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_1

    .line 8
    :sswitch_12
    const-string p2, "L63"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x10

    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_13
    const-string p2, "L60"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_14
    const-string p2, "L30"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 34
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_15
    const-string p2, "H93"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x200

    .line 17
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_16
    const-string p2, "H90"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x80

    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_17
    const-string p2, "H63"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x20

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_18
    const-string p2, "H60"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/16 p2, 0x8

    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    .line 8
    :sswitch_19
    const-string p2, "H30"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 21
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 35
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Unknown HEVC level string: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object p0

    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzdq;

    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzdq;-><init>(II)V

    return-object p1

    .line 37
    :cond_6
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Unknown HEVC profile string: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/google/android/gms/internal/ads/zzdq;->zza:Lcom/google/android/gms/internal/ads/zzdq;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x114a5 -> :sswitch_19
        0x11502 -> :sswitch_18
        0x11505 -> :sswitch_17
        0x1155f -> :sswitch_16
        0x11562 -> :sswitch_15
        0x123a9 -> :sswitch_14
        0x12406 -> :sswitch_13
        0x12409 -> :sswitch_12
        0x12463 -> :sswitch_11
        0x12466 -> :sswitch_10
        0x2178e7 -> :sswitch_f
        0x2178ea -> :sswitch_e
        0x217944 -> :sswitch_d
        0x217947 -> :sswitch_c
        0x21794a -> :sswitch_b
        0x2179a1 -> :sswitch_a
        0x2179a4 -> :sswitch_9
        0x2179a7 -> :sswitch_8
        0x234a63 -> :sswitch_7
        0x234a66 -> :sswitch_6
        0x234ac0 -> :sswitch_5
        0x234ac3 -> :sswitch_4
        0x234ac6 -> :sswitch_3
        0x234b1d -> :sswitch_2
        0x234b20 -> :sswitch_1
        0x234b23 -> :sswitch_0
    .end sparse-switch
.end method

.method public static zzh([BII)[B
    .locals 4

    add-int/lit8 v0, p2, 0x4

    .line 1
    new-array v0, v0, [B

    sget-object v1, Lcom/google/android/gms/internal/ads/zzdr;->zzb:[B

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2
    invoke-static {p0, p1, v0, v3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method private static zzi(II)I
    .locals 6

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, -0x1

    .line 14
    const-string v4, "CodecSpecificDataUtil"

    const-string v5, "Unrecognized APV band: "

    sparse-switch p0, :sswitch_data_0

    .line 15
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1e

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Unrecognized APV level index: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :sswitch_0
    if-eqz p1, :cond_3

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-eq p1, v0, :cond_0

    .line 1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_0
    const p0, 0x200008

    return p0

    :cond_1
    const p0, 0x200004

    return p0

    :cond_2
    const p0, 0x200002

    return p0

    :cond_3
    const p0, 0x200001

    return p0

    :sswitch_1
    if-eqz p1, :cond_7

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_4

    .line 2
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_4
    const p0, 0x100008

    return p0

    :cond_5
    const p0, 0x100004

    return p0

    :cond_6
    const p0, 0x100002

    return p0

    :cond_7
    const p0, 0x100001

    return p0

    :sswitch_2
    if-eqz p1, :cond_b

    if-eq p1, v2, :cond_a

    if-eq p1, v1, :cond_9

    if-eq p1, v0, :cond_8

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_8
    const p0, 0x80008

    return p0

    :cond_9
    const p0, 0x80004

    return p0

    :cond_a
    const p0, 0x80002

    return p0

    :cond_b
    const p0, 0x80001

    return p0

    :sswitch_3
    if-eqz p1, :cond_f

    if-eq p1, v2, :cond_e

    if-eq p1, v1, :cond_d

    if-eq p1, v0, :cond_c

    .line 4
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_c
    const p0, 0x40008

    return p0

    :cond_d
    const p0, 0x40004

    return p0

    :cond_e
    const p0, 0x40002

    return p0

    :cond_f
    const p0, 0x40001

    return p0

    :sswitch_4
    if-eqz p1, :cond_13

    if-eq p1, v2, :cond_12

    if-eq p1, v1, :cond_11

    if-eq p1, v0, :cond_10

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_10
    const p0, 0x20008

    return p0

    :cond_11
    const p0, 0x20004

    return p0

    :cond_12
    const p0, 0x20002

    return p0

    :cond_13
    const p0, 0x20001

    return p0

    :sswitch_5
    if-eqz p1, :cond_17

    if-eq p1, v2, :cond_16

    if-eq p1, v1, :cond_15

    if-eq p1, v0, :cond_14

    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_14
    const p0, 0x10008

    return p0

    :cond_15
    const p0, 0x10004

    return p0

    :cond_16
    const p0, 0x10002

    return p0

    :cond_17
    const p0, 0x10001

    return p0

    :sswitch_6
    if-eqz p1, :cond_1b

    if-eq p1, v2, :cond_1a

    if-eq p1, v1, :cond_19

    if-eq p1, v0, :cond_18

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_18
    const p0, 0x8008

    return p0

    :cond_19
    const p0, 0x8004

    return p0

    :cond_1a
    const p0, 0x8002

    return p0

    :cond_1b
    const p0, 0x8001

    return p0

    :sswitch_7
    if-eqz p1, :cond_1f

    if-eq p1, v2, :cond_1e

    if-eq p1, v1, :cond_1d

    if-eq p1, v0, :cond_1c

    .line 8
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1c
    const/16 p0, 0x4008

    return p0

    :cond_1d
    const/16 p0, 0x4004

    return p0

    :cond_1e
    const/16 p0, 0x4002

    return p0

    :cond_1f
    const/16 p0, 0x4001

    return p0

    :sswitch_8
    if-eqz p1, :cond_23

    if-eq p1, v2, :cond_22

    if-eq p1, v1, :cond_21

    if-eq p1, v0, :cond_20

    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_20
    const/16 p0, 0x2008

    return p0

    :cond_21
    const/16 p0, 0x2004

    return p0

    :cond_22
    const/16 p0, 0x2002

    return p0

    :cond_23
    const/16 p0, 0x2001

    return p0

    :sswitch_9
    if-eqz p1, :cond_27

    if-eq p1, v2, :cond_26

    if-eq p1, v1, :cond_25

    if-eq p1, v0, :cond_24

    .line 10
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_24
    const/16 p0, 0x1008

    return p0

    :cond_25
    const/16 p0, 0x1004

    return p0

    :cond_26
    const/16 p0, 0x1002

    return p0

    :cond_27
    const/16 p0, 0x1001

    return p0

    :sswitch_a
    if-eqz p1, :cond_2b

    if-eq p1, v2, :cond_2a

    if-eq p1, v1, :cond_29

    if-eq p1, v0, :cond_28

    .line 11
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_28
    const/16 p0, 0x808

    return p0

    :cond_29
    const/16 p0, 0x804

    return p0

    :cond_2a
    const/16 p0, 0x802

    return p0

    :cond_2b
    const/16 p0, 0x801

    return p0

    :sswitch_b
    if-eqz p1, :cond_2f

    if-eq p1, v2, :cond_2e

    if-eq p1, v1, :cond_2d

    if-eq p1, v0, :cond_2c

    .line 12
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_2c
    const/16 p0, 0x408

    return p0

    :cond_2d
    const/16 p0, 0x404

    return p0

    :cond_2e
    const/16 p0, 0x402

    return p0

    :cond_2f
    const/16 p0, 0x401

    return p0

    :sswitch_c
    if-eqz p1, :cond_33

    if-eq p1, v2, :cond_32

    if-eq p1, v1, :cond_31

    if-eq p1, v0, :cond_30

    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_30
    const/16 p0, 0x208

    return p0

    :cond_31
    const/16 p0, 0x204

    return p0

    :cond_32
    const/16 p0, 0x202

    return p0

    :cond_33
    const/16 p0, 0x201

    return p0

    :sswitch_d
    if-eqz p1, :cond_37

    if-eq p1, v2, :cond_36

    if-eq p1, v1, :cond_35

    if-eq p1, v0, :cond_34

    .line 14
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x17

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_34
    const/16 p0, 0x108

    return p0

    :cond_35
    const/16 p0, 0x104

    return p0

    :cond_36
    const/16 p0, 0x102

    return p0

    :cond_37
    const/16 p0, 0x101

    return p0

    :sswitch_data_0
    .sparse-switch
        0x1e -> :sswitch_d
        0x21 -> :sswitch_c
        0x3c -> :sswitch_b
        0x3f -> :sswitch_a
        0x5a -> :sswitch_9
        0x5d -> :sswitch_8
        0x78 -> :sswitch_7
        0x7b -> :sswitch_6
        0x96 -> :sswitch_5
        0x99 -> :sswitch_4
        0xb4 -> :sswitch_3
        0xb7 -> :sswitch_2
        0xd2 -> :sswitch_1
        0xd5 -> :sswitch_0
    .end sparse-switch
.end method
