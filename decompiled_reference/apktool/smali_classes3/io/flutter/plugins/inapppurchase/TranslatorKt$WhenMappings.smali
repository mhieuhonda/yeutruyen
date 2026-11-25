.class public final synthetic Lio/flutter/plugins/inapppurchase/TranslatorKt$WhenMappings;
.super Ljava/lang/Object;
.source "Translator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/inapppurchase/TranslatorKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    invoke-static {}, Lio/flutter/plugins/inapppurchase/PlatformProductType;->values()[Lio/flutter/plugins/inapppurchase/PlatformProductType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lio/flutter/plugins/inapppurchase/PlatformProductType;->INAPP:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    invoke-virtual {v2}, Lio/flutter/plugins/inapppurchase/PlatformProductType;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lio/flutter/plugins/inapppurchase/PlatformProductType;->SUBS:Lio/flutter/plugins/inapppurchase/PlatformProductType;

    invoke-virtual {v3}, Lio/flutter/plugins/inapppurchase/PlatformProductType;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lio/flutter/plugins/inapppurchase/TranslatorKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->values()[Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v3, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ALTERNATIVE_BILLING_ONLY:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v3}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v3, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->BILLING_CONFIG:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v3}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    const/4 v3, 0x3

    :try_start_4
    sget-object v4, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->EXTERNAL_OFFER:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v4}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    const/4 v4, 0x4

    :try_start_5
    sget-object v5, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->IN_APP_MESSAGING:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v5}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    const/4 v5, 0x5

    :try_start_6
    sget-object v6, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->PRICE_CHANGE_CONFIRMATION:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v6}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    const/4 v6, 0x6

    :try_start_7
    sget-object v7, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->PRODUCT_DETAILS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v7}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v7, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->SUBSCRIPTIONS:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v7}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v7

    const/4 v8, 0x7

    aput v8, v0, v7
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v7, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->SUBSCRIPTIONS_UPDATE:Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;

    invoke-virtual {v7}, Lio/flutter/plugins/inapppurchase/PlatformBillingClientFeature;->ordinal()I

    move-result v7

    const/16 v8, 0x8

    aput v8, v0, v7
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, Lio/flutter/plugins/inapppurchase/TranslatorKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->values()[Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_a
    sget-object v7, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->CHARGE_FULL_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v7}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->ordinal()I

    move-result v7

    aput v1, v0, v7
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    :try_start_b
    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->CHARGE_PRORATED_PRICE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->DEFERRED:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    :try_start_d
    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->WITHOUT_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :try_start_e
    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->WITH_TIME_PRORATION:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->ordinal()I

    move-result v1

    aput v5, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    sget-object v1, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->UNKNOWN_REPLACEMENT_MODE:Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;

    invoke-virtual {v1}, Lio/flutter/plugins/inapppurchase/PlatformReplacementMode;->ordinal()I

    move-result v1

    aput v6, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    sput-object v0, Lio/flutter/plugins/inapppurchase/TranslatorKt$WhenMappings;->$EnumSwitchMapping$2:[I

    return-void
.end method
