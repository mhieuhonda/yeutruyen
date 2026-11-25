.class public final Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
.super Ljava/lang/Object;
.source "NativeTemplateStyle.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    new-instance v0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-direct {v0}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;-><init>()V

    iput-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    return-object v0
.end method

.method public withCallToActionBackgroundColor(Landroid/graphics/drawable/ColorDrawable;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputcallToActionBackgroundColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/drawable/ColorDrawable;)V

    return-object p0
.end method

.method public withCallToActionTextSize(F)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputcallToActionTextSize(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;F)V

    return-object p0
.end method

.method public withCallToActionTextTypeface(Landroid/graphics/Typeface;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputcallToActionTextTypeface(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/Typeface;)V

    return-object p0
.end method

.method public withCallToActionTypefaceColor(I)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputcallToActionTypefaceColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Ljava/lang/Integer;)V

    return-object p0
.end method

.method public withMainBackgroundColor(Landroid/graphics/drawable/ColorDrawable;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputmainBackgroundColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/drawable/ColorDrawable;)V

    return-object p0
.end method

.method public withPrimaryTextBackgroundColor(Landroid/graphics/drawable/ColorDrawable;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 210
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputprimaryTextBackgroundColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/drawable/ColorDrawable;)V

    return-object p0
.end method

.method public withPrimaryTextSize(F)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputprimaryTextSize(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;F)V

    return-object p0
.end method

.method public withPrimaryTextTypeface(Landroid/graphics/Typeface;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputprimaryTextTypeface(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/Typeface;)V

    return-object p0
.end method

.method public withPrimaryTextTypefaceColor(I)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputprimaryTextTypefaceColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Ljava/lang/Integer;)V

    return-object p0
.end method

.method public withSecondaryTextBackgroundColor(Landroid/graphics/drawable/ColorDrawable;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputsecondaryTextBackgroundColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/drawable/ColorDrawable;)V

    return-object p0
.end method

.method public withSecondaryTextSize(F)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputsecondaryTextSize(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;F)V

    return-object p0
.end method

.method public withSecondaryTextTypeface(Landroid/graphics/Typeface;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputsecondaryTextTypeface(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/Typeface;)V

    return-object p0
.end method

.method public withSecondaryTextTypefaceColor(I)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputsecondaryTextTypefaceColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Ljava/lang/Integer;)V

    return-object p0
.end method

.method public withTertiaryTextBackgroundColor(Landroid/graphics/drawable/ColorDrawable;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputtertiaryTextBackgroundColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/drawable/ColorDrawable;)V

    return-object p0
.end method

.method public withTertiaryTextSize(F)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputtertiaryTextSize(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;F)V

    return-object p0
.end method

.method public withTertiaryTextTypeface(Landroid/graphics/Typeface;)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputtertiaryTextTypeface(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Landroid/graphics/Typeface;)V

    return-object p0
.end method

.method public withTertiaryTextTypefaceColor(I)Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle$Builder;->styles:Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;->-$$Nest$fputtertiaryTextTypefaceColor(Lcom/google/android/ads/nativetemplates/NativeTemplateStyle;Ljava/lang/Integer;)V

    return-object p0
.end method
