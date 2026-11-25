.class synthetic Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager$6;
.super Ljava/lang/Object;
.source "UserMessagingPlatformManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 139
    invoke-static {}, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->values()[Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager$6;->$SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus:[I

    :try_start_0
    sget-object v1, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->NOT_REQUIRED:Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    invoke-virtual {v1}, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager$6;->$SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus:[I

    sget-object v1, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->REQUIRED:Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    invoke-virtual {v1}, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
