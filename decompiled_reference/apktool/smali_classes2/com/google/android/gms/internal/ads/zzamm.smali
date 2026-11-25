.class final Lcom/google/android/gms/internal/ads/zzamm;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@25.3.0"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgug;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgug;


# instance fields
.field private final zzc:Ljava/util/List;

.field private zzd:I

.field private zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtf;->zzd(C)Lcom/google/android/gms/internal/ads/zzgtf;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgug;->zza(Lcom/google/android/gms/internal/ads/zzgtf;)Lcom/google/android/gms/internal/ads/zzgug;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzamm;->zza:Lcom/google/android/gms/internal/ads/zzgug;

    const/16 v0, 0x2a

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtf;->zzd(C)Lcom/google/android/gms/internal/ads/zzgtf;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgug;->zza(Lcom/google/android/gms/internal/ads/zzgtf;)Lcom/google/android/gms/internal/ads/zzgug;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzamm;->zzb:Lcom/google/android/gms/internal/ads/zzgug;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;Ljava/util/List;)I
    .locals 28
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 17
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    const/4 v6, 0x1

    if-eqz v3, :cond_d

    const/4 v7, 0x2

    const/16 v8, 0x8

    const/4 v9, 0x0

    if-eq v3, v6, :cond_b

    const/4 v10, 0x3

    const/16 v11, 0xb04

    const/16 v12, 0xb03

    const/16 v13, 0xb01

    const/16 v14, 0xb00

    const/16 v15, 0x890

    if-eq v3, v7, :cond_7

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    move-result-wide v16

    .line 18
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    move-result-wide v18

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    move-result-wide v20

    sub-long v18, v18, v20

    iget v3, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    int-to-long v4, v3

    .line 19
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeu;

    sub-long v4, v18, v4

    long-to-int v4, v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    move-result-object v5

    .line 20
    invoke-interface {v0, v5, v9, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    move v0, v9

    :goto_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 21
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-ge v0, v5, :cond_6

    .line 22
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzaml;

    .line 23
    iget-wide v7, v4, Lcom/google/android/gms/internal/ads/zzaml;->zza:J

    sub-long v7, v7, v16

    long-to-int v7, v7

    .line 24
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    const/4 v7, 0x4

    .line 25
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 26
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    move-result v7

    .line 27
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v7, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v18

    sparse-switch v18, :sswitch_data_0

    goto/16 :goto_5

    .line 40
    :sswitch_0
    const-string v5, "Super_SlowMotion_BGM"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v13

    goto :goto_1

    :sswitch_1
    const-string v5, "Super_SlowMotion_Deflickering_On"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v11

    goto :goto_1

    :sswitch_2
    const-string v5, "Super_SlowMotion_Data"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v14

    goto :goto_1

    :sswitch_3
    const-string v5, "Super_SlowMotion_Edit_Data"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v12

    goto :goto_1

    :sswitch_4
    const-string v5, "SlowMotion_Data"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v15

    .line 28
    :goto_1
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzaml;->zzb:I

    add-int/lit8 v7, v7, 0x8

    sub-int/2addr v4, v7

    if-eq v5, v15, :cond_2

    if-eq v5, v14, :cond_1

    if-eq v5, v13, :cond_1

    if-eq v5, v12, :cond_1

    if-ne v5, v11, :cond_0

    goto :goto_2

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    :goto_2
    move-object/from16 v5, p3

    goto/16 :goto_4

    .line 28
    :cond_2
    new-instance v5, Ljava/util/ArrayList;

    .line 29
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 30
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lcom/google/android/gms/internal/ads/zzamm;->zzb:Lcom/google/android/gms/internal/ads/zzgug;

    .line 31
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzgug;->zzg(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v4

    move v7, v9

    .line 32
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_4

    sget-object v8, Lcom/google/android/gms/internal/ads/zzamm;->zza:Lcom/google/android/gms/internal/ads/zzgug;

    .line 33
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v11, v19

    check-cast v11, Ljava/lang/CharSequence;

    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/ads/zzgug;->zzg(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v8

    .line 34
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    if-ne v11, v10, :cond_3

    .line 35
    :try_start_0
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v23

    .line 36
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v25

    const/4 v11, 0x2

    .line 37
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    shl-int v27, v6, v8

    new-instance v22, Lcom/google/android/gms/internal/ads/zzajz;

    .line 38
    invoke-direct/range {v22 .. v27}, Lcom/google/android/gms/internal/ads/zzajz;-><init>(JJI)V

    move-object/from16 v8, v22

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v7, v7, 0x1

    const/16 v11, 0xb04

    goto :goto_3

    :catch_0
    move-exception v0

    const/4 v2, 0x0

    .line 42
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v0

    throw v0

    :cond_3
    const/4 v2, 0x0

    .line 41
    invoke-static {v2, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v0

    throw v0

    .line 38
    :cond_4
    new-instance v4, Lcom/google/android/gms/internal/ads/zzaka;

    .line 39
    invoke-direct {v4, v5}, Lcom/google/android/gms/internal/ads/zzaka;-><init>(Ljava/util/List;)V

    move-object/from16 v5, p3

    .line 40
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v0, v0, 0x1

    const/4 v7, 0x2

    const/16 v11, 0xb04

    goto/16 :goto_0

    .line 42
    :cond_5
    :goto_5
    const-string v0, "Invalid SEF name"

    const/4 v2, 0x0

    .line 44
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v0

    throw v0

    :cond_6
    const-wide/16 v3, 0x0

    .line 40
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    move v0, v6

    goto/16 :goto_b

    .line 6
    :cond_7
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    move-result-wide v3

    iget v5, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    add-int/lit8 v7, v5, -0x14

    .line 7
    new-instance v5, Lcom/google/android/gms/internal/ads/zzeu;

    invoke-direct {v5, v7}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    move-result-object v11

    .line 8
    invoke-interface {v0, v11, v9, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    move v0, v9

    :goto_6
    div-int/lit8 v11, v7, 0xc

    if-ge v0, v11, :cond_9

    const/4 v11, 0x2

    .line 9
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    move-object v11, v5

    .line 10
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzw()S

    move-result v5

    if-eq v5, v15, :cond_8

    if-eq v5, v14, :cond_8

    if-eq v5, v13, :cond_8

    if-eq v5, v12, :cond_8

    const/16 v12, 0xb04

    if-eq v5, v12, :cond_8

    .line 14
    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    move/from16 p3, v7

    goto :goto_7

    :cond_8
    iget v12, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    int-to-long v13, v12

    sub-long v12, v3, v13

    .line 11
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    move-result v14

    move/from16 p3, v7

    int-to-long v6, v14

    .line 12
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    move-result v14

    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzaml;

    sub-long/2addr v12, v6

    invoke-direct {v8, v5, v12, v13, v14}, Lcom/google/android/gms/internal/ads/zzaml;-><init>(IJI)V

    .line 13
    invoke-interface {v15, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v0, v0, 0x1

    move/from16 v7, p3

    move-object v5, v11

    const/4 v6, 0x1

    const/16 v8, 0x8

    const/16 v12, 0xb03

    const/16 v13, 0xb01

    const/16 v14, 0xb00

    const/16 v15, 0x890

    goto :goto_6

    :cond_9
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    const-wide/16 v3, 0x0

    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    goto :goto_8

    :cond_a
    iput v10, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 16
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaml;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaml;->zza:J

    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    goto :goto_8

    .line 1
    :cond_b
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeu;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    move-result-object v5

    .line 2
    invoke-interface {v0, v5, v9, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    move-result v5

    add-int/2addr v5, v4

    iput v5, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    .line 4
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    move-result v3

    const v4, 0x53454654

    if-eq v3, v4, :cond_c

    const-wide/16 v3, 0x0

    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    goto :goto_8

    .line 5
    :cond_c
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    move-result-wide v3

    iget v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    add-int/lit8 v0, v0, -0xc

    int-to-long v5, v0

    sub-long/2addr v3, v5

    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    const/4 v11, 0x2

    iput v11, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    :goto_8
    const/4 v0, 0x1

    goto :goto_b

    :cond_d
    const-wide/16 v3, 0x0

    .line 45
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v0, v5, v7

    if-eqz v0, :cond_f

    const-wide/16 v7, 0x8

    cmp-long v0, v5, v7

    if-gez v0, :cond_e

    goto :goto_9

    :cond_e
    const-wide/16 v3, -0x8

    add-long v4, v5, v3

    goto :goto_a

    :cond_f
    :goto_9
    move-wide v4, v3

    :goto_a
    iput-wide v4, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    const/4 v0, 0x1

    iput v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    :goto_b
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch
.end method
