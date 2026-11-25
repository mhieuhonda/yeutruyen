.class public final Lcom/google/android/gms/internal/consent_sdk/zzl;
.super Ljava/lang/Object;
.source "com.google.android.ump:user-messaging-platform@@4.0.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/consent_sdk/zzam;

.field private final zzb:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/app/Application;Lcom/google/android/gms/internal/consent_sdk/zzam;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/consent_sdk/zzl;->zza:Lcom/google/android/gms/internal/consent_sdk/zzam;

    invoke-virtual {p1}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/consent_sdk/zzl;->zzb:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/Map;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    iget-object v2, v0, Lcom/google/android/gms/internal/consent_sdk/zzl;->zza:Lcom/google/android/gms/internal/consent_sdk/zzam;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/consent_sdk/zzam;->zzd()Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/consent_sdk/zzl;->zzb:Landroid/content/Context;

    .line 2
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/consent_sdk/zzam;->zzb(Landroid/content/Context;)V

    .line 3
    const-string v3, "IABTCF_gdprApplies"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    new-instance v5, Ljava/util/HashMap;

    .line 4
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 5
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 6
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 7
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const-string v9, "AD_USER_DATA"

    const-string v10, "AD_PERSONALIZATION"

    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    .line 18
    :sswitch_0
    const-string v8, "UMP_CoMoAdUserDataPurposeConsentStatus"

    .line 7
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 18
    const-string v8, "google_analytics_default_allow_ad_user_data"

    move-object v11, v9

    goto :goto_1

    .line 7
    :sswitch_1
    const-string v8, "UMP_CoMoAdStoragePurposeConsentStatus"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "google_analytics_default_allow_ad_storage"

    const-string v11, "AD_STORAGE"

    goto :goto_1

    :sswitch_2
    const-string v8, "UMP_CoMoAnalyticsStoragePurposeConsentStatus"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 18
    const-string v8, "google_analytics_default_allow_analytics_storage"

    const-string v11, "ANALYTICS_STORAGE"

    goto :goto_1

    .line 7
    :sswitch_3
    const-string v8, "UMP_CoMoAdPersonalizationPurposeConsentStatus"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 18
    const-string v8, "google_analytics_default_allow_ad_personalization_signals"

    move-object v11, v10

    .line 8
    :goto_1
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v12, -0x1

    if-eq v7, v12, :cond_1

    const-string v12, "GRANTED"

    const/4 v13, 0x1

    if-eq v7, v13, :cond_a

    const/4 v14, 0x2

    const-string v15, "DENIED"

    if-eq v7, v14, :cond_9

    const/4 v14, 0x4

    if-eq v7, v14, :cond_1

    const/4 v14, 0x5

    const-string v13, "UserMessagingPlatform"

    if-eq v7, v14, :cond_2

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Invalid CoMo consent status: "

    .line 19
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 20
    invoke-static {v13, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/consent_sdk/zzam;->zza(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_3

    const-string v7, "No default metadata"

    .line 10
    invoke-static {v13, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 11
    :cond_3
    instance-of v8, v7, Ljava/lang/Boolean;

    if-eqz v8, :cond_5

    check-cast v7, Ljava/lang/Boolean;

    .line 12
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const/4 v8, 0x1

    if-eq v8, v7, :cond_4

    move-object v12, v15

    :cond_4
    invoke-interface {v5, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 13
    :cond_5
    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_8

    const-string v8, "eu_consent_policy"

    .line 14
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    :cond_6
    if-eqz v4, :cond_8

    .line 16
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_7

    move-object v12, v15

    :cond_7
    invoke-interface {v5, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_8
    const-string v7, "Failed to get the default eu_consent_policy value."

    .line 15
    invoke-static {v13, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 17
    :cond_9
    invoke-interface {v5, v11, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 18
    :cond_a
    invoke-interface {v5, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 21
    :cond_b
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/consent_sdk/zzam;->zzc(Ljava/util/Map;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72d36826 -> :sswitch_3
        -0x883f808 -> :sswitch_2
        0x3fb31ab1 -> :sswitch_1
        0x582c6f7b -> :sswitch_0
    .end sparse-switch
.end method
