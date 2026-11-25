.class final Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0006\u0010\u0008\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0017\u001a\u00020\u00122\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;",
        "",
        "<init>",
        "()V",
        "wrapResult",
        "",
        "result",
        "wrapError",
        "exception",
        "",
        "doubleEquals",
        "",
        "a",
        "",
        "b",
        "floatEquals",
        "",
        "doubleHash",
        "",
        "d",
        "floatHash",
        "f",
        "deepEquals",
        "deepHash",
        "value",
        "image_picker_android_release"
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
.field public static final INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    invoke-direct {v0}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;-><init>()V

    sput-object v0, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p1, p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1c

    if-nez p2, :cond_1

    goto/16 :goto_4

    .line 65
    :cond_1
    instance-of v2, p1, [B

    if-eqz v2, :cond_2

    instance-of v2, p2, [B

    if-eqz v2, :cond_2

    .line 66
    check-cast p1, [B

    check-cast p2, [B

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    .line 68
    :cond_2
    instance-of v2, p1, [I

    if-eqz v2, :cond_3

    instance-of v2, p2, [I

    if-eqz v2, :cond_3

    .line 69
    check-cast p1, [I

    check-cast p2, [I

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    return p1

    .line 71
    :cond_3
    instance-of v2, p1, [J

    if-eqz v2, :cond_4

    instance-of v2, p2, [J

    if-eqz v2, :cond_4

    .line 72
    check-cast p1, [J

    check-cast p2, [J

    invoke-static {p1, p2}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p1

    return p1

    .line 74
    :cond_4
    instance-of v2, p1, [D

    if-eqz v2, :cond_8

    instance-of v2, p2, [D

    if-eqz v2, :cond_8

    .line 75
    check-cast p1, [D

    array-length v2, p1

    check-cast p2, [D

    array-length v3, p2

    if-eq v2, v3, :cond_5

    return v1

    .line 76
    :cond_5
    array-length v2, p1

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_7

    .line 77
    aget-wide v4, p1, v3

    aget-wide v6, p2, v3

    invoke-virtual {p0, v4, v5, v6, v7}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->doubleEquals(DD)Z

    move-result v4

    if-nez v4, :cond_6

    return v1

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    return v0

    .line 81
    :cond_8
    instance-of v2, p1, [F

    if-eqz v2, :cond_c

    instance-of v2, p2, [F

    if-eqz v2, :cond_c

    .line 82
    check-cast p1, [F

    array-length v2, p1

    check-cast p2, [F

    array-length v3, p2

    if-eq v2, v3, :cond_9

    return v1

    .line 83
    :cond_9
    array-length v2, p1

    move v3, v1

    :goto_1
    if-ge v3, v2, :cond_b

    .line 84
    aget v4, p1, v3

    aget v5, p2, v3

    invoke-virtual {p0, v4, v5}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->floatEquals(FF)Z

    move-result v4

    if-nez v4, :cond_a

    return v1

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_b
    return v0

    .line 88
    :cond_c
    instance-of v2, p1, [Ljava/lang/Object;

    if-eqz v2, :cond_10

    instance-of v2, p2, [Ljava/lang/Object;

    if-eqz v2, :cond_10

    .line 89
    check-cast p1, [Ljava/lang/Object;

    array-length v2, p1

    check-cast p2, [Ljava/lang/Object;

    array-length v3, p2

    if-eq v2, v3, :cond_d

    return v1

    .line 90
    :cond_d
    array-length v2, p1

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_f

    .line 91
    aget-object v4, p1, v3

    aget-object v5, p2, v3

    invoke-virtual {p0, v4, v5}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    return v1

    :cond_e
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_f
    return v0

    .line 95
    :cond_10
    instance-of v2, p1, Ljava/util/List;

    if-eqz v2, :cond_14

    instance-of v2, p2, Ljava/util/List;

    if-eqz v2, :cond_14

    .line 96
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-eq v2, v3, :cond_11

    return v1

    .line 97
    :cond_11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 98
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 99
    :cond_12
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    return v1

    :cond_13
    return v0

    .line 104
    :cond_14
    instance-of v2, p1, Ljava/util/Map;

    if-eqz v2, :cond_19

    instance-of v2, p2, Ljava/util/Map;

    if-eqz v2, :cond_19

    .line 105
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v3

    if-eq v2, v3, :cond_15

    return v1

    .line 106
    :cond_15
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 107
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 109
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 110
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p0, v3, v6}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    .line 111
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    goto :goto_3

    :cond_17
    return v1

    :cond_18
    return v0

    .line 123
    :cond_19
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_1a

    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_1a

    .line 124
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->doubleEquals(DD)Z

    move-result p1

    return p1

    .line 126
    :cond_1a
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_1b

    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_1b

    .line 127
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->floatEquals(FF)Z

    move-result p1

    return p1

    .line 129
    :cond_1b
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1c
    :goto_4
    return v1
.end method

.method public final deepHash(Ljava/lang/Object;)I
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 135
    :cond_0
    instance-of v1, p1, [B

    if-eqz v1, :cond_1

    check-cast p1, [B

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([B)I

    move-result p1

    return p1

    .line 136
    :cond_1
    instance-of v1, p1, [I

    if-eqz v1, :cond_2

    check-cast p1, [I

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([I)I

    move-result p1

    return p1

    .line 137
    :cond_2
    instance-of v1, p1, [J

    if-eqz v1, :cond_3

    check-cast p1, [J

    invoke-static {p1}, Ljava/util/Arrays;->hashCode([J)I

    move-result p1

    return p1

    .line 138
    :cond_3
    instance-of v1, p1, [D

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    .line 140
    check-cast p1, [D

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_4

    aget-wide v3, p1, v0

    mul-int/lit8 v2, v2, 0x1f

    .line 141
    invoke-virtual {p0, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->doubleHash(D)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return v2

    .line 145
    :cond_5
    instance-of v1, p1, [F

    if-eqz v1, :cond_7

    .line 147
    check-cast p1, [F

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_6

    aget v3, p1, v0

    mul-int/lit8 v2, v2, 0x1f

    .line 148
    invoke-virtual {p0, v3}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->floatHash(F)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    return v2

    .line 152
    :cond_7
    instance-of v1, p1, [Ljava/lang/Object;

    if-eqz v1, :cond_9

    .line 154
    check-cast p1, [Ljava/lang/Object;

    array-length v1, p1

    :goto_2
    if-ge v0, v1, :cond_8

    aget-object v3, p1, v0

    mul-int/lit8 v2, v2, 0x1f

    .line 155
    invoke-virtual {p0, v3}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    return v2

    .line 159
    :cond_9
    instance-of v1, p1, Ljava/util/List;

    if-eqz v1, :cond_b

    .line 161
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    mul-int/lit8 v2, v2, 0x1f

    .line 162
    invoke-virtual {p0, v0}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v2, v0

    goto :goto_3

    :cond_a
    return v2

    .line 166
    :cond_b
    instance-of v1, p1, Ljava/util/Map;

    if-eqz v1, :cond_d

    .line 168
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 169
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v2

    mul-int/lit8 v2, v2, 0x1f

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v2

    add-int/2addr v0, v1

    goto :goto_4

    :cond_c
    return v0

    .line 173
    :cond_d
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_e

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->doubleHash(D)I

    move-result p1

    return p1

    .line 174
    :cond_e
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_f

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->floatHash(F)I

    move-result p1

    return p1

    .line 175
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    return p1
.end method

.method public final doubleEquals(DD)Z
    .locals 5

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-nez v2, :cond_0

    move-wide v2, v0

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    cmpg-double v4, p3, v0

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-wide v0, p3

    :goto_1
    cmpg-double v0, v2, v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 37
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final doubleHash(D)I
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v2, p1, v0

    if-nez v2, :cond_0

    move-wide p1, v0

    .line 48
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    const/16 v0, 0x20

    ushr-long v0, p1, v0

    xor-long/2addr p1, v0

    long-to-int p1, p1

    return p1
.end method

.method public final floatEquals(FF)Z
    .locals 3

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    cmpg-float v2, p2, v0

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    cmpg-float v0, v1, v0

    if-nez v0, :cond_2

    goto :goto_2

    .line 42
    :cond_2
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_2
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final floatHash(F)I
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    move p1, v0

    .line 55
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    return p1
.end method

.method public final wrapError(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    instance-of v0, p1, Lio/flutter/plugins/imagepicker/FlutterError;

    if-eqz v0, :cond_0

    .line 26
    check-cast p1, Lio/flutter/plugins/imagepicker/FlutterError;

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/FlutterError;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/FlutterError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/plugins/imagepicker/FlutterError;->getDetails()Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, v1, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x3

    .line 29
    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cause: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Stacktrace: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    .line 28
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final wrapResult(Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 21
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
