.class Lio/flutter/plugins/googlemobileads/FlutterAdRequest;
.super Ljava/lang/Object;
.source "FlutterAdRequest.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterAdRequest$Builder;
    }
.end annotation


# instance fields
.field private final adMobExtras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final contentUrl:Ljava/lang/String;

.field private final httpTimeoutMillis:Ljava/lang/Integer;

.field private final keywords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mediationExtras:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;",
            ">;"
        }
    .end annotation
.end field

.field private final mediationExtrasIdentifier:Ljava/lang/String;

.field private final mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

.field private final neighboringContentUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nonPersonalizedAds:Ljava/lang/Boolean;

.field private final requestAgent:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
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

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 205
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    .line 206
    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    .line 207
    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    .line 208
    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    .line 209
    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    .line 210
    iput-object p6, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    .line 211
    iput-object p7, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    .line 212
    iput-object p8, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    .line 213
    iput-object p9, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->requestAgent:Ljava/lang/String;

    .line 214
    iput-object p10, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    return-void
.end method

.method private addNetworkExtras(Lcom/google/android/gms/ads/AbstractAdRequestBuilder;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/ads/AbstractAdRequestBuilder<",
            "TT;>;>(",
            "Lcom/google/android/gms/ads/AbstractAdRequestBuilder<",
            "TT;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 220
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 221
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    if-eqz v1, :cond_0

    .line 222
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;

    .line 224
    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;->getMediationExtras()Landroid/util/Pair;

    move-result-object v1

    .line 225
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Class;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Landroid/os/Bundle;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 227
    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    if-eqz v1, :cond_1

    .line 228
    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    .line 229
    invoke-interface {v1, p2, v2}, Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;->getMediationExtras(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p2

    .line 230
    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 233
    :cond_1
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    .line 234
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 235
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 236
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 238
    :cond_2
    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    :cond_3
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    .line 242
    const-class p2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    if-nez p2, :cond_4

    .line 244
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 246
    :cond_4
    const-string v1, "npa"

    const-string v2, "1"

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    const-class v1, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    :cond_5
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 251
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    goto :goto_2

    :cond_6
    return-void
.end method


# virtual methods
.method asAdRequest(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest;
    .locals 1

    .line 279
    new-instance v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {p0, v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->updateAdRequestBuilder(Lcom/google/android/gms/ads/AbstractAdRequestBuilder;Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 331
    :cond_0
    instance-of v1, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 335
    :cond_1
    check-cast p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    .line 336
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    .line 337
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    .line 338
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    .line 339
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    .line 340
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    .line 341
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    .line 342
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    iget-object v3, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    .line 343
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    .line 344
    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method protected getAdMobExtras()Ljava/util/Map;
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

    .line 314
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->adMobExtras:Ljava/util/Map;

    return-object v0
.end method

.method protected getContentUrl()Ljava/lang/String;
    .locals 1

    .line 289
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    return-object v0
.end method

.method protected getHttpTimeoutMillis()Ljava/lang/Integer;
    .locals 1

    .line 304
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    return-object v0
.end method

.method protected getKeywords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 284
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    return-object v0
.end method

.method protected getMediationExtras()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterMediationExtras;",
            ">;"
        }
    .end annotation

    .line 324
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    return-object v0
.end method

.method protected getMediationExtrasIdentifier()Ljava/lang/String;
    .locals 1

    .line 309
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    return-object v0
.end method

.method protected getNeighboringContentUrls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 299
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    return-object v0
.end method

.method protected getNonPersonalizedAds()Ljava/lang/Boolean;
    .locals 1

    .line 294
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    return-object v0
.end method

.method protected getRequestAgent()Ljava/lang/String;
    .locals 1

    .line 319
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->requestAgent:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    .line 349
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->nonPersonalizedAds:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    iget-object v4, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    iget-object v5, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtrasIdentifier:Ljava/lang/String;

    iget-object v6, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    iget-object v7, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->mediationExtras:Ljava/util/List;

    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected updateAdRequestBuilder(Lcom/google/android/gms/ads/AbstractAdRequestBuilder;Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/ads/AbstractAdRequestBuilder<",
            "TT;>;>(",
            "Lcom/google/android/gms/ads/AbstractAdRequestBuilder<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/ads/AbstractAdRequestBuilder<",
            "TT;>;"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->keywords:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 260
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 261
    invoke-virtual {p1, v1}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->addKeyword(Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    goto :goto_0

    .line 264
    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->contentUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 265
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->setContentUrl(Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    .line 267
    :cond_1
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->addNetworkExtras(Lcom/google/android/gms/ads/AbstractAdRequestBuilder;Ljava/lang/String;)V

    .line 268
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->neighboringContentUrls:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 269
    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->setNeighboringContentUrls(Ljava/util/List;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    .line 271
    :cond_2
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->httpTimeoutMillis:Ljava/lang/Integer;

    if-eqz p2, :cond_3

    .line 272
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->setHttpTimeoutMillis(I)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    .line 274
    :cond_3
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->requestAgent:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AbstractAdRequestBuilder;->setRequestAgent(Ljava/lang/String;)Lcom/google/android/gms/ads/AbstractAdRequestBuilder;

    return-object p1
.end method
