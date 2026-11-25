.class public final Lcom/google/android/gms/internal/consent_sdk/zzcn;
.super Ljava/lang/Object;
.source "com.google.android.ump:user-messaging-platform@@4.0.0"


# instance fields
.field public zza:Ljava/lang/String;

.field public zzb:Ljava/lang/String;

.field public zzc:Ljava/lang/String;

.field public zzd:Ljava/util/List;

.field public zze:Ljava/util/List;

.field public zzf:Ljava/lang/String;

.field public zzg:I

.field public zzh:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzg:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzd:Ljava/util/List;

    .line 2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zze:Ljava/util/List;

    iput v0, p0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzh:I

    return-void
.end method

.method public static zza(Landroid/util/JsonReader;)Lcom/google/android/gms/internal/consent_sdk/zzcn;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/consent_sdk/zzcn;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 4
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x1

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_9

    .line 33
    :sswitch_0
    const-string v2, "consent_form_payload"

    .line 5
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 31
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zza:Ljava/lang/String;

    goto :goto_0

    .line 5
    :sswitch_1
    const-string v2, "request_info_keys"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzd:Ljava/util/List;

    .line 24
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginArray()V

    .line 25
    :goto_1
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 26
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzd:Ljava/util/List;

    .line 27
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p0}, Landroid/util/JsonReader;->endArray()V

    goto :goto_0

    .line 5
    :sswitch_2
    const-string v2, "actions"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zze:Ljava/util/List;

    .line 10
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginArray()V

    .line 11
    :goto_2
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance v1, Lcom/google/android/gms/internal/consent_sdk/zzcm;

    invoke-direct {v1}, Lcom/google/android/gms/internal/consent_sdk/zzcm;-><init>()V

    .line 12
    invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V

    .line 13
    :goto_3
    invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 14
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, -0x7d8028f6

    if-eq v6, v7, :cond_5

    const v7, 0x5e663ba3

    if-eq v6, v7, :cond_1

    goto :goto_5

    .line 18
    :cond_1
    const-string v6, "action_type"

    .line 15
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 17
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, 0x3d3be2d

    if-eq v6, v7, :cond_3

    const v7, 0x4f05fbf

    if-eq v6, v7, :cond_2

    const v7, 0x6ea5670e

    if-ne v6, v7, :cond_4

    const-string v6, "UNKNOWN_ACTION_TYPE"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v2, v5

    goto :goto_4

    :cond_2
    const-string v6, "WRITE"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v2, v3

    goto :goto_4

    :cond_3
    const-string v6, "CLEAR"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v2, v4

    :goto_4
    iput v2, v1, Lcom/google/android/gms/internal/consent_sdk/zzcm;->zzb:I

    goto :goto_3

    .line 35
    :cond_4
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :cond_5
    const-string v6, "args_json"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 16
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/internal/consent_sdk/zzcm;->zza:Ljava/lang/String;

    goto :goto_3

    .line 19
    :cond_6
    :goto_5
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    goto :goto_3

    .line 20
    :cond_7
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    iget-object v2, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zze:Ljava/util/List;

    .line 21
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 22
    :cond_8
    invoke-virtual {p0}, Landroid/util/JsonReader;->endArray()V

    goto/16 :goto_0

    .line 5
    :sswitch_3
    const-string v2, "privacy_options_required"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 7
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v6, -0x70970855

    if-eq v2, v6, :cond_a

    const v4, 0x17371b9f

    if-eq v2, v4, :cond_9

    const v3, 0x19d1382a

    if-ne v2, v3, :cond_b

    const-string v2, "UNKNOWN"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move v3, v5

    goto :goto_6

    :cond_9
    const-string v2, "REQUIRED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_6

    :cond_a
    const-string v2, "NOT_REQUIRED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    move v3, v4

    :goto_6
    iput v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzh:I

    goto/16 :goto_0

    .line 37
    :cond_b
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :sswitch_4
    const-string v2, "client_side_pingback_url"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 6
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzf:Ljava/lang/String;

    goto/16 :goto_0

    .line 5
    :sswitch_5
    const-string v2, "consent_form_base_url"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 30
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzb:Ljava/lang/String;

    goto/16 :goto_0

    .line 5
    :sswitch_6
    const-string v2, "error_message"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 29
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzc:Ljava/lang/String;

    goto/16 :goto_0

    .line 5
    :sswitch_7
    const-string v2, "consent_signal"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 32
    invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_1

    goto :goto_8

    :sswitch_8
    const-string v2, "CONSENT_SIGNAL_NOT_REQUIRED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x6

    goto :goto_7

    :sswitch_9
    const-string v2, "CONSENT_SIGNAL_PERSONALIZED_ADS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_7

    :sswitch_a
    const-string v2, "CONSENT_SIGNAL_SUFFICIENT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x4

    goto :goto_7

    :sswitch_b
    const-string v2, "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/16 v3, 0x8

    goto :goto_7

    :sswitch_c
    const-string v2, "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move v3, v4

    goto :goto_7

    :sswitch_d
    const-string v2, "CONSENT_SIGNAL_UNKNOWN"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move v3, v5

    goto :goto_7

    :sswitch_e
    const-string v2, "CONSENT_SIGNAL_ERROR"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x7

    goto :goto_7

    :sswitch_f
    const-string v2, "CONSENT_SIGNAL_COLLECT_CONSENT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v3, 0x5

    :goto_7
    iput v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzcn;->zzg:I

    goto/16 :goto_0

    .line 5
    :cond_c
    :goto_8
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 37
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_d
    :goto_9
    invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V

    goto/16 :goto_0

    .line 38
    :cond_e
    invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x774ac593 -> :sswitch_7
        -0x738f0f30 -> :sswitch_6
        -0x6e5c3749 -> :sswitch_5
        -0x67601003 -> :sswitch_4
        -0x4ef2d809 -> :sswitch_3
        -0x453fb703 -> :sswitch_2
        -0x3ad17acb -> :sswitch_1
        -0x2f244ae8 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ab5a7ed -> :sswitch_f
        -0x755d1a4a -> :sswitch_e
        -0x4b527788 -> :sswitch_d
        -0x38e1da9b -> :sswitch_c
        -0x36c1e70c -> :sswitch_b
        0x19984e10 -> :sswitch_a
        0x1be36b13 -> :sswitch_9
        0x66d8a81d -> :sswitch_8
    .end sparse-switch
.end method
