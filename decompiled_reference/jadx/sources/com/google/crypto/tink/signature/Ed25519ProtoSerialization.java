package com.google.crypto.tink.signature;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.Ed25519KeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class Ed25519ProtoSerialization {
    private static final Map<OutputPrefixType, Ed25519Parameters.Variant> OUTPUT_PREFIX_TO_VARIANT_MAP;
    private static final ParametersParser<ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final ParametersSerializer<Ed25519Parameters, ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final KeyParser<ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final KeySerializer<Ed25519PrivateKey, ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    private static final Bytes PRIVATE_TYPE_URL_BYTES;
    private static final KeyParser<ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final KeySerializer<Ed25519PublicKey, ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    private static final Bytes PUBLIC_TYPE_URL_BYTES;
    private static final Map<Ed25519Parameters.Variant, OutputPrefixType> VARIANT_TO_OUTPUT_PREFIX_MAP;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        Bytes bytesFromPrintableAscii2 = Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = ParametersSerializer.create(new ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.signature.Ed25519ProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final Serialization serializeParameters(Parameters parameters) {
                return Ed25519ProtoSerialization.serializeParameters((Ed25519Parameters) parameters);
            }
        }, Ed25519Parameters.class, ProtoParametersSerialization.class);
        PARAMETERS_PARSER = ParametersParser.create(new ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.signature.Ed25519ProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final Parameters parseParameters(Serialization serialization) {
                return Ed25519ProtoSerialization.parseParameters((ProtoParametersSerialization) serialization);
            }
        }, bytesFromPrintableAscii, ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = KeySerializer.create(new KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.Ed25519ProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
                return Ed25519ProtoSerialization.serializePublicKey((Ed25519PublicKey) key, secretKeyAccess);
            }
        }, Ed25519PublicKey.class, ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = KeyParser.create(new KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.Ed25519ProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
                return Ed25519ProtoSerialization.parsePublicKey((ProtoKeySerialization) serialization, secretKeyAccess);
            }
        }, bytesFromPrintableAscii2, ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = KeySerializer.create(new KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.Ed25519ProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
                return Ed25519ProtoSerialization.serializePrivateKey((Ed25519PrivateKey) key, secretKeyAccess);
            }
        }, Ed25519PrivateKey.class, ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = KeyParser.create(new KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.Ed25519ProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
                return Ed25519ProtoSerialization.parsePrivateKey((ProtoKeySerialization) serialization, secretKeyAccess);
            }
        }, bytesFromPrintableAscii, ProtoKeySerialization.class);
        VARIANT_TO_OUTPUT_PREFIX_MAP = createVariantToOutputPrefixMap();
        OUTPUT_PREFIX_TO_VARIANT_MAP = createOutputPrefixToVariantMap();
    }

    public static void register() throws GeneralSecurityException {
        register(MutableSerializationRegistry.globalInstance());
    }

    public static void register(MutableSerializationRegistry registry) throws GeneralSecurityException {
        registry.registerParametersSerializer(PARAMETERS_SERIALIZER);
        registry.registerParametersParser(PARAMETERS_PARSER);
        registry.registerKeySerializer(PUBLIC_KEY_SERIALIZER);
        registry.registerKeyParser(PUBLIC_KEY_PARSER);
        registry.registerKeySerializer(PRIVATE_KEY_SERIALIZER);
        registry.registerKeyParser(PRIVATE_KEY_PARSER);
    }

    private static Map<Ed25519Parameters.Variant, OutputPrefixType> createVariantToOutputPrefixMap() {
        HashMap map = new HashMap();
        map.put(Ed25519Parameters.Variant.NO_PREFIX, OutputPrefixType.RAW);
        map.put(Ed25519Parameters.Variant.TINK, OutputPrefixType.TINK);
        map.put(Ed25519Parameters.Variant.CRUNCHY, OutputPrefixType.CRUNCHY);
        map.put(Ed25519Parameters.Variant.LEGACY, OutputPrefixType.LEGACY);
        return Collections.unmodifiableMap(map);
    }

    private static Map<OutputPrefixType, Ed25519Parameters.Variant> createOutputPrefixToVariantMap() {
        EnumMap enumMap = new EnumMap(OutputPrefixType.class);
        enumMap.put(OutputPrefixType.RAW, Ed25519Parameters.Variant.NO_PREFIX);
        enumMap.put(OutputPrefixType.TINK, Ed25519Parameters.Variant.TINK);
        enumMap.put(OutputPrefixType.CRUNCHY, Ed25519Parameters.Variant.CRUNCHY);
        enumMap.put(OutputPrefixType.LEGACY, Ed25519Parameters.Variant.LEGACY);
        return Collections.unmodifiableMap(enumMap);
    }

    private static OutputPrefixType toProtoOutputPrefixType(Ed25519Parameters.Variant variant) throws GeneralSecurityException {
        OutputPrefixType outputPrefixType = VARIANT_TO_OUTPUT_PREFIX_MAP.get(variant);
        if (outputPrefixType != null) {
            return outputPrefixType;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    private static Ed25519Parameters.Variant toVariant(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        Ed25519Parameters.Variant variant = OUTPUT_PREFIX_TO_VARIANT_MAP.get(outputPrefixType);
        if (variant != null) {
            return variant;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    private static com.google.crypto.tink.proto.Ed25519PublicKey getProtoPublicKey(Ed25519PublicKey key) {
        return (com.google.crypto.tink.proto.Ed25519PublicKey) com.google.crypto.tink.proto.Ed25519PublicKey.newBuilder().setKeyValue(ByteString.copyFrom(key.getPublicKeyBytes().toByteArray())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoParametersSerialization serializeParameters(Ed25519Parameters parameters) throws GeneralSecurityException {
        return ProtoParametersSerialization.create((KeyTemplate) KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(Ed25519KeyFormat.getDefaultInstance().toByteString()).setOutputPrefixType(toProtoOutputPrefixType(parameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoKeySerialization serializePublicKey(Ed25519PublicKey key, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        return ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(key).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, toProtoOutputPrefixType(key.getParameters().getVariant()), key.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoKeySerialization serializePrivateKey(Ed25519PrivateKey key, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        return ProtoKeySerialization.create(PRIVATE_TYPE_URL, ((com.google.crypto.tink.proto.Ed25519PrivateKey) com.google.crypto.tink.proto.Ed25519PrivateKey.newBuilder().setPublicKey(getProtoPublicKey(key.getPublicKey())).setKeyValue(ByteString.copyFrom(key.getPrivateKeyBytes().toByteArray(SecretKeyAccess.requireAccess(access)))).build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, toProtoOutputPrefixType(key.getParameters().getVariant()), key.getIdRequirementOrNull());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ed25519Parameters parseParameters(ProtoParametersSerialization serialization) throws GeneralSecurityException {
        if (!serialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + serialization.getKeyTemplate().getTypeUrl());
        }
        try {
            if (Ed25519KeyFormat.parseFrom(serialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry()).getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return Ed25519Parameters.create(toVariant(serialization.getKeyTemplate().getOutputPrefixType()));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ed25519PublicKey parsePublicKey(ProtoKeySerialization serialization, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        if (!serialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + serialization.getTypeUrl());
        }
        try {
            com.google.crypto.tink.proto.Ed25519PublicKey from = com.google.crypto.tink.proto.Ed25519PublicKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return Ed25519PublicKey.create(toVariant(serialization.getOutputPrefixType()), Bytes.copyFrom(from.getKeyValue().toByteArray()), serialization.getIdRequirementOrNull());
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ed25519PrivateKey parsePrivateKey(ProtoKeySerialization serialization, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        if (!serialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + serialization.getTypeUrl());
        }
        try {
            com.google.crypto.tink.proto.Ed25519PrivateKey from = com.google.crypto.tink.proto.Ed25519PrivateKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return Ed25519PrivateKey.create(Ed25519PublicKey.create(toVariant(serialization.getOutputPrefixType()), Bytes.copyFrom(from.getPublicKey().getKeyValue().toByteArray()), serialization.getIdRequirementOrNull()), SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(access)));
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private Ed25519ProtoSerialization() {
    }
}
