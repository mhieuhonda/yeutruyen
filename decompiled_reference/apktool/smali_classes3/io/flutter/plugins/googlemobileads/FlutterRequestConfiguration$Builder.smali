.class public Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;
.super Ljava/lang/Object;
.source "FlutterRequestConfiguration.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "Builder"
.end annotation


# instance fields
.field private maxAdContentRating:Ljava/lang/String;

.field private tagForChildDirectedTreatment:Ljava/lang/Integer;

.field private tagForUnderAgeOfConsent:Ljava/lang/Integer;

.field private testDeviceIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    .line 60
    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method build()Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;
    .locals 5

    .line 106
    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->maxAdContentRating:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    iget-object v4, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->testDeviceIds:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    return-object v0
.end method

.method protected getMaxAdContentRating()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->maxAdContentRating:Ljava/lang/String;

    return-object v0
.end method

.method protected getTagForChildDirectedTreatment()Ljava/lang/Integer;
    .locals 1

    .line 93
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    return-object v0
.end method

.method protected getTagForUnderAgeOfConsent()Ljava/lang/Integer;
    .locals 1

    .line 97
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

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

    .line 102
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->testDeviceIds:Ljava/util/List;

    return-object v0
.end method

.method setMaxAdContentRating(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;
    .locals 0

    .line 65
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->maxAdContentRating:Ljava/lang/String;

    return-object p0
.end method

.method setTagForChildDirectedTreatment(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;
    .locals 0

    .line 71
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForChildDirectedTreatment:Ljava/lang/Integer;

    return-object p0
.end method

.method setTagForUnderAgeOfConsent(Ljava/lang/Integer;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;
    .locals 0

    .line 77
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->tagForUnderAgeOfConsent:Ljava/lang/Integer;

    return-object p0
.end method

.method setTestDeviceIds(Ljava/util/List;)Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;"
        }
    .end annotation

    .line 83
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRequestConfiguration$Builder;->testDeviceIds:Ljava/util/List;

    return-object p0
.end method
