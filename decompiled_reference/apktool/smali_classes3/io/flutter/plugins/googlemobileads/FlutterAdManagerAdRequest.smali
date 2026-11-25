.class Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;
.super Lio/flutter/plugins/googlemobileads/FlutterAdRequest;
.source "FlutterAdManagerAdRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest$Builder;
    }
.end annotation


# instance fields
.field private final customTargeting:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final customTargetingLists:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final publisherProvidedId:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    .line 94
    invoke-direct/range {v0 .. v10}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 105
    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargeting:Ljava/util/Map;

    .line 106
    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargetingLists:Ljava/util/Map;

    move-object/from16 p1, p8

    .line 107
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->publisherProvidedId:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest-IA;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method asAdManagerAdRequest(Ljava/lang/String;)Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;
    .locals 3

    .line 111
    new-instance v0, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;-><init>()V

    .line 112
    invoke-virtual {p0, v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->updateAdRequestBuilder(Lcom/google/android/gms/ads/AbstractAdRequestBuilder;Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    .line 114
    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargeting:Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 115
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 116
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;->addCustomTargeting(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    goto :goto_0

    .line 119
    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargetingLists:Ljava/util/Map;

    if-eqz p1, :cond_1

    .line 120
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 121
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;->addCustomTargeting(Ljava/lang/String;Ljava/util/List;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    goto :goto_1

    .line 124
    :cond_1
    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->publisherProvidedId:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 125
    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;->setPublisherProvidedId(Ljava/lang/String;)Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;

    .line 127
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/ads/admanager/AdManagerAdRequest$Builder;->build()Lcom/google/android/gms/ads/admanager/AdManagerAdRequest;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 149
    :cond_0
    instance-of v1, p1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 153
    :cond_1
    move-object v1, p1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    .line 154
    invoke-super {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargeting:Ljava/util/Map;

    iget-object v3, v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargeting:Ljava/util/Map;

    .line 155
    invoke-static {p1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargetingLists:Ljava/util/Map;

    iget-object v1, v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargetingLists:Ljava/util/Map;

    .line 156
    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method protected getCustomTargeting()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargeting:Ljava/util/Map;

    return-object v0
.end method

.method protected getCustomTargetingLists()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargetingLists:Ljava/util/Map;

    return-object v0
.end method

.method protected getPublisherProvidedId()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->publisherProvidedId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 161
    invoke-super {p0}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargeting:Ljava/util/Map;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->customTargetingLists:Ljava/util/Map;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
