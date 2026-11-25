.class public final Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0008\u0018\u0000 \'2\u00020\u0001:\u0001\'BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u0014\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u0096\u0080\u0004J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u00c6\u0003JW\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000bH\u00c6\u0001J\n\u0010&\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006("
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;",
        "",
        "quantity",
        "",
        "purchaseTime",
        "developerPayload",
        "",
        "originalJson",
        "purchaseToken",
        "signature",
        "products",
        "",
        "<init>",
        "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "getQuantity",
        "()J",
        "getPurchaseTime",
        "getDeveloperPayload",
        "()Ljava/lang/String;",
        "getOriginalJson",
        "getPurchaseToken",
        "getSignature",
        "getProducts",
        "()Ljava/util/List;",
        "toList",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "toString",
        "Companion",
        "in_app_purchase_android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;


# instance fields
.field private final developerPayload:Ljava/lang/String;

.field private final originalJson:Ljava/lang/String;

.field private final products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final purchaseTime:J

.field private final purchaseToken:Ljava/lang/String;

.field private final quantity:J

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->Companion:Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord$Companion;

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "originalJson"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseToken"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "products"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1117
    iput-wide p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    .line 1118
    iput-wide p3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    .line 1119
    iput-object p5, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    .line 1120
    iput-object p6, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    .line 1121
    iput-object p7, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    .line 1122
    iput-object p8, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    .line 1123
    iput-object p9, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p5

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 1116
    invoke-direct/range {v1 .. v10}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;
    .locals 10

    and-int/lit8 v0, p10, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p10, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p10, 0x4

    if-eqz p1, :cond_2

    iget-object p5, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    :cond_2
    move-object v5, p5

    and-int/lit8 p1, p10, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    move-object v6, p1

    goto :goto_0

    :cond_3
    move-object/from16 v6, p6

    :goto_0
    and-int/lit8 p1, p10, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    move-object v7, p1

    goto :goto_1

    :cond_4
    move-object/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p10, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    move-object v8, p1

    goto :goto_2

    :cond_5
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, p10, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    move-object v9, p1

    goto :goto_3

    :cond_6
    move-object/from16 v9, p9

    :goto_3
    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;"
        }
    .end annotation

    const-string v0, "originalJson"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchaseToken"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "products"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;

    move-wide v2, p1

    move-wide v4, p3

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v10}, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    .line 1164
    :cond_1
    check-cast p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;

    .line 1165
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1166
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1167
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1168
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1169
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1170
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1171
    sget-object v2, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    iget-object p1, p1, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getDeveloperPayload()Ljava/lang/String;
    .locals 1

    .line 1119
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginalJson()Ljava/lang/String;
    .locals 1

    .line 1120
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    return-object v0
.end method

.method public final getProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1123
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    return-object v0
.end method

.method public final getPurchaseTime()J
    .locals 2

    .line 1118
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    return-wide v0
.end method

.method public final getPurchaseToken()Ljava/lang/String;
    .locals 1

    .line 1121
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuantity()J
    .locals 2

    .line 1117
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    return-wide v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 1122
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1175
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1176
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1177
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1178
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1179
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1180
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1181
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1182
    sget-object v1, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/inapppurchase/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1147
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 1148
    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    .line 1149
    iget-object v4, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    .line 1150
    iget-object v5, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    .line 1151
    iget-object v6, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    .line 1152
    iget-object v7, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    .line 1153
    iget-object v8, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    .line 1146
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-wide v0, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->quantity:J

    iget-wide v2, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseTime:J

    iget-object v4, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->developerPayload:Ljava/lang/String;

    iget-object v5, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->originalJson:Ljava/lang/String;

    iget-object v6, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->purchaseToken:Ljava/lang/String;

    iget-object v7, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->signature:Ljava/lang/String;

    iget-object v8, p0, Lio/flutter/plugins/inapppurchase/PlatformPurchaseHistoryRecord;->products:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "PlatformPurchaseHistoryRecord(quantity="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", purchaseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", developerPayload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", originalJson="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", purchaseToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
