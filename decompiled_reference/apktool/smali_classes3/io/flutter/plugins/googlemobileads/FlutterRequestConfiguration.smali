.class Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;
.super Ljava/lang/Object;
.source "FlutterRequestConfiguration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;
    }
.end annotation


# instance fields
.field private final maxAdContentRating:Ljava/lang/String;

.field private final tagForChildDirectedTreatment:Ljava/lang/Integer;

.field private final tagForUnderAgeOfConsent:Ljava/lang/Integer;

.field private final testDeviceIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->maxAdContentRating:Ljava/lang/String;

    .line 117
    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    .line 118
    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    .line 119
    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->testDeviceIds:Ljava/util/List;

    return-void
.end method

.method public static updateRequestConfiguration(Lio/flutter/plugin/common/MethodCall;)V
    .locals 5

    .line 37
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->getRequestConfiguration()Lcom/google/android/gms/ads/RequestConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/RequestConfiguration;->toBuilder()Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    move-result-object v0

    .line 38
    const-string v1, "maxAdContentRating"

    invoke-virtual {p0, v1}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 39
    const-string v2, "tagForChildDirectedTreatment"

    invoke-virtual {p0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 40
    const-string v3, "tagForUnderAgeOfConsent"

    invoke-virtual {p0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 41
    const-string v4, "testDeviceIds"

    invoke-virtual {p0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz v1, :cond_0

    .line 43
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setMaxAdContentRating(Ljava/lang/String;)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    :cond_0
    if-eqz v2, :cond_1

    .line 46
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTagForChildDirectedTreatment(I)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    :cond_1
    if-eqz v3, :cond_2

    .line 49
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTagForUnderAgeOfConsent(I)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    :cond_2
    if-eqz p0, :cond_3

    .line 52
    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->setTestDeviceIds(Ljava/util/List;)Lcom/google/android/gms/ads/RequestConfiguration$Builder;

    .line 54
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/ads/RequestConfiguration$Builder;->build()Lcom/google/android/gms/ads/RequestConfiguration;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/ads/MobileAds;->setRequestConfiguration(Lcom/google/android/gms/ads/RequestConfiguration;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 144
    :cond_0
    instance-of v1, p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 148
    :cond_1
    check-cast p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;

    .line 149
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->maxAdContentRating:Ljava/lang/String;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->maxAdContentRating:Ljava/lang/String;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    .line 150
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    .line 151
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->testDeviceIds:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->testDeviceIds:Ljava/util/List;

    .line 152
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method protected getMaxAdContentRating()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->maxAdContentRating:Ljava/lang/String;

    return-object v0
.end method

.method protected getTagForChildDirectedTreatment()Ljava/lang/Integer;
    .locals 1

    .line 128
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    return-object v0
.end method

.method protected getTagForUnderAgeOfConsent()Ljava/lang/Integer;
    .locals 1

    .line 132
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    return-object v0
.end method

.method protected getTestDeviceIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->testDeviceIds:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 157
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->maxAdContentRating:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;->testDeviceIds:Ljava/util/List;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
