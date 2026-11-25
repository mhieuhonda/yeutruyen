.class public final enum Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;
.super Ljava/lang/Enum;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;",
        "",
        "raw",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getRaw",
        "()I",
        "ALTERNATIVE_BILLING_ONLY",
        "BILLING_CONFIG",
        "EXTERNAL_OFFER",
        "IN_APP_MESSAGING",
        "PRICE_CHANGE_CONFIRMATION",
        "PRODUCT_DETAILS",
        "SUBSCRIPTIONS",
        "SUBSCRIPTIONS_UPDATE",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum ALTERNATIVE_BILLING_ONLY:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum BILLING_CONFIG:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;

.field public static final enum EXTERNAL_OFFER:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum IN_APP_MESSAGING:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum PRICE_CHANGE_CONFIRMATION:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum PRODUCT_DETAILS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum SUBSCRIPTIONS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

.field public static final enum SUBSCRIPTIONS_UPDATE:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;


# instance fields
.field private final raw:I


# direct methods
.method private static final synthetic $values()[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;
    .locals 8

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ALTERNATIVE_BILLING_ONLY:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->BILLING_CONFIG:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v2, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->EXTERNAL_OFFER:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v3, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->IN_APP_MESSAGING:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v4, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->PRICE_CHANGE_CONFIRMATION:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v5, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->PRODUCT_DETAILS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v6, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->SUBSCRIPTIONS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    sget-object v7, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->SUBSCRIPTIONS_UPDATE:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    filled-new-array/range {v0 .. v7}, [Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 298
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "ALTERNATIVE_BILLING_ONLY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ALTERNATIVE_BILLING_ONLY:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 299
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "BILLING_CONFIG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->BILLING_CONFIG:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 300
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "EXTERNAL_OFFER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->EXTERNAL_OFFER:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 301
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "IN_APP_MESSAGING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->IN_APP_MESSAGING:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 302
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "PRICE_CHANGE_CONFIRMATION"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->PRICE_CHANGE_CONFIRMATION:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 303
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "PRODUCT_DETAILS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->PRODUCT_DETAILS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 304
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "SUBSCRIPTIONS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->SUBSCRIPTIONS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    .line 305
    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    const-string v1, "SUBSCRIPTIONS_UPDATE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->SUBSCRIPTIONS_UPDATE:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-static {}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->$values()[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->$VALUES:[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->Companion:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 297
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->raw:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;
    .locals 1

    const-class v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;
    .locals 1

    sget-object v0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->$VALUES:[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    return-object v0
.end method


# virtual methods
.method public final getRaw()I
    .locals 1

    .line 297
    iget v0, p0, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->raw:I

    return v0
.end method
