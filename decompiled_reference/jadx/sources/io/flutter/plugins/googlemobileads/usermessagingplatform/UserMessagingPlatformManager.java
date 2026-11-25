package io.flutter.plugins.googlemobileads.usermessagingplatform;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* JADX INFO: loaded from: classes3.dex */
public class UserMessagingPlatformManager implements MethodChannel.MethodCallHandler {
    private static final String INTERNAL_ERROR_CODE = "0";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/ump";
    private Activity activity;
    private ConsentInformation consentInformation;
    private final Context context;
    private final MethodChannel methodChannel;
    private final UserMessagingCodec userMessagingCodec;

    public UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context) {
        UserMessagingCodec userMessagingCodec = new UserMessagingCodec();
        this.userMessagingCodec = userMessagingCodec;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec));
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.context = context;
    }

    UserMessagingPlatformManager(BinaryMessenger binaryMessenger, Context context, UserMessagingCodec userMessagingCodec) {
        this.userMessagingCodec = userMessagingCodec;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME, new StandardMethodCodec(userMessagingCodec));
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.context = context;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    private ConsentInformation getConsentInformation() {
        ConsentInformation consentInformation = this.consentInformation;
        if (consentInformation != null) {
            return consentInformation;
        }
        ConsentInformation consentInformation2 = UserMessagingPlatform.getConsentInformation(this.context);
        this.consentInformation = consentInformation2;
        return consentInformation2;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        ConsentRequestParameters asConsentRequestParameters;
        String str = methodCall.method;
        str.hashCode();
        switch (str) {
            case "ConsentInformation#reset":
                getConsentInformation().reset();
                result.success(null);
                break;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                Activity activity = this.activity;
                if (activity == null) {
                    result.error(INTERNAL_ERROR_CODE, "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager$$ExternalSyntheticLambda0
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public final void onConsentFormDismissed(FormError formError) {
                            result.success(formError);
                        }
                    });
                    break;
                }
                break;
            case "ConsentInformation#requestConsentInfoUpdate":
                if (this.activity == null) {
                    result.error(INTERNAL_ERROR_CODE, "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) methodCall.argument("params");
                    if (consentRequestParametersWrapper == null) {
                        asConsentRequestParameters = new ConsentRequestParameters.Builder().build();
                    } else {
                        asConsentRequestParameters = consentRequestParametersWrapper.getAsConsentRequestParameters(this.activity);
                    }
                    getConsentInformation().requestConsentInfoUpdate(this.activity, asConsentRequestParameters, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.1
                        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                        public void onConsentInfoUpdateSuccess() {
                            result.success(null);
                        }
                    }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.2
                        @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                        public void onConsentInfoUpdateFailure(FormError formError) {
                            result.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
                        }
                    });
                    break;
                }
                break;
            case "ConsentForm#show":
                ConsentForm consentForm = (ConsentForm) methodCall.argument("consentForm");
                if (consentForm == null) {
                    result.error(INTERNAL_ERROR_CODE, "ConsentForm#show", null);
                    break;
                } else {
                    consentForm.show(this.activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.5
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public void onConsentFormDismissed(FormError formError) {
                            MethodChannel.Result result2 = result;
                            if (formError != null) {
                                result2.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
                            } else {
                                result2.success(null);
                            }
                        }
                    });
                    break;
                }
                break;
            case "ConsentForm#dispose":
                ConsentForm consentForm2 = (ConsentForm) methodCall.argument("consentForm");
                if (consentForm2 == null) {
                    Log.w(INTERNAL_ERROR_CODE, "Called dispose on ad that has been freed");
                } else {
                    this.userMessagingCodec.disposeConsentForm(consentForm2);
                }
                result.success(null);
                break;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                Activity activity2 = this.activity;
                if (activity2 == null) {
                    result.error(INTERNAL_ERROR_CODE, "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    UserMessagingPlatform.showPrivacyOptionsForm(activity2, new ConsentForm.OnConsentFormDismissedListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager$$ExternalSyntheticLambda1
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public final void onConsentFormDismissed(FormError formError) {
                            result.success(formError);
                        }
                    });
                    break;
                }
                break;
            case "ConsentInformation#isConsentFormAvailable":
                result.success(Boolean.valueOf(getConsentInformation().isConsentFormAvailable()));
                break;
            case "UserMessagingPlatform#loadConsentForm":
                UserMessagingPlatform.loadConsentForm(this.context, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.3
                    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
                    public void onConsentFormLoadSuccess(ConsentForm consentForm3) {
                        UserMessagingPlatformManager.this.userMessagingCodec.trackConsentForm(consentForm3);
                        result.success(consentForm3);
                    }
                }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.4
                    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
                    public void onConsentFormLoadFailure(FormError formError) {
                        result.error(Integer.toString(formError.getErrorCode()), formError.getMessage(), null);
                    }
                });
                break;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int i = AnonymousClass6.$SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[getConsentInformation().getPrivacyOptionsRequirementStatus().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        result.success(1);
                    } else {
                        result.success(2);
                    }
                    break;
                } else {
                    result.success(0);
                    break;
                }
                break;
            case "ConsentInformation#canRequestAds":
                result.success(Boolean.valueOf(getConsentInformation().canRequestAds()));
                break;
            case "ConsentInformation#getConsentStatus":
                result.success(Integer.valueOf(getConsentInformation().getConsentStatus()));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus;

        static {
            int[] iArr = new int[ConsentInformation.PrivacyOptionsRequirementStatus.values().length];
            $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus = iArr;
            try {
                iArr[ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
