package com.google.crypto.tink.signature;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat;
import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBigInteger;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class RsaSsaPkcs1ProtoSerialization {
    private static final ParametersParser<ProtoParametersSerialization> PARAMETERS_PARSER;
    private static final ParametersSerializer<RsaSsaPkcs1Parameters, ProtoParametersSerialization> PARAMETERS_SERIALIZER;
    private static final KeyParser<ProtoKeySerialization> PRIVATE_KEY_PARSER;
    private static final KeySerializer<RsaSsaPkcs1PrivateKey, ProtoKeySerialization> PRIVATE_KEY_SERIALIZER;
    private static final String PRIVATE_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    private static final Bytes PRIVATE_TYPE_URL_BYTES;
    private static final KeyParser<ProtoKeySerialization> PUBLIC_KEY_PARSER;
    private static final KeySerializer<RsaSsaPkcs1PublicKey, ProtoKeySerialization> PUBLIC_KEY_SERIALIZER;
    private static final String PUBLIC_TYPE_URL = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    private static final Bytes PUBLIC_TYPE_URL_BYTES;

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii(PRIVATE_TYPE_URL);
        PRIVATE_TYPE_URL_BYTES = bytesFromPrintableAscii;
        Bytes bytesFromPrintableAscii2 = Util.toBytesFromPrintableAscii(PUBLIC_TYPE_URL);
        PUBLIC_TYPE_URL_BYTES = bytesFromPrintableAscii2;
        PARAMETERS_SERIALIZER = ParametersSerializer.create(new ParametersSerializer.ParametersSerializationFunction() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
            public final Serialization serializeParameters(Parameters parameters) {
                return RsaSsaPkcs1ProtoSerialization.serializeParameters((RsaSsaPkcs1Parameters) parameters);
            }
        }, RsaSsaPkcs1Parameters.class, ProtoParametersSerialization.class);
        PARAMETERS_PARSER = ParametersParser.create(new ParametersParser.ParametersParsingFunction() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
            public final Parameters parseParameters(Serialization serialization) {
                return RsaSsaPkcs1ProtoSerialization.parseParameters((ProtoParametersSerialization) serialization);
            }
        }, bytesFromPrintableAscii, ProtoParametersSerialization.class);
        PUBLIC_KEY_SERIALIZER = KeySerializer.create(new KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
                return RsaSsaPkcs1ProtoSerialization.serializePublicKey((RsaSsaPkcs1PublicKey) key, secretKeyAccess);
            }
        }, RsaSsaPkcs1PublicKey.class, ProtoKeySerialization.class);
        PUBLIC_KEY_PARSER = KeyParser.create(new KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
                return RsaSsaPkcs1ProtoSerialization.parsePublicKey((ProtoKeySerialization) serialization, secretKeyAccess);
            }
        }, bytesFromPrintableAscii2, ProtoKeySerialization.class);
        PRIVATE_KEY_SERIALIZER = KeySerializer.create(new KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda4
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
                return RsaSsaPkcs1ProtoSerialization.serializePrivateKey((RsaSsaPkcs1PrivateKey) key, secretKeyAccess);
            }
        }, RsaSsaPkcs1PrivateKey.class, ProtoKeySerialization.class);
        PRIVATE_KEY_PARSER = KeyParser.create(new KeyParser.KeyParsingFunction() { // from class: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$$ExternalSyntheticLambda5
            @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
            public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) {
                return RsaSsaPkcs1ProtoSerialization.parsePrivateKey((ProtoKeySerialization) serialization, secretKeyAccess);
            }
        }, bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    private static OutputPrefixType toProtoOutputPrefixType(RsaSsaPkcs1Parameters.Variant variant) throws GeneralSecurityException {
        if (RsaSsaPkcs1Parameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (RsaSsaPkcs1Parameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (RsaSsaPkcs1Parameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        if (RsaSsaPkcs1Parameters.Variant.LEGACY.equals(variant)) {
            return OutputPrefixType.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    private static HashType toProtoHashType(RsaSsaPkcs1Parameters.HashType hashType) throws GeneralSecurityException {
        if (RsaSsaPkcs1Parameters.HashType.SHA256.equals(hashType)) {
            return HashType.SHA256;
        }
        if (RsaSsaPkcs1Parameters.HashType.SHA384.equals(hashType)) {
            return HashType.SHA384;
        }
        if (RsaSsaPkcs1Parameters.HashType.SHA512.equals(hashType)) {
            return HashType.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + hashType);
    }

    private static RsaSsaPkcs1Parameters.HashType toHashType(HashType hashType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return RsaSsaPkcs1Parameters.HashType.SHA256;
        }
        if (i == 2) {
            return RsaSsaPkcs1Parameters.HashType.SHA384;
        }
        if (i == 3) {
            return RsaSsaPkcs1Parameters.HashType.SHA512;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.signature.RsaSsaPkcs1ProtoSerialization$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr2;
            try {
                iArr2[HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static RsaSsaPkcs1Parameters.Variant toVariant(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i == 1) {
            return RsaSsaPkcs1Parameters.Variant.TINK;
        }
        if (i == 2) {
            return RsaSsaPkcs1Parameters.Variant.CRUNCHY;
        }
        if (i == 3) {
            return RsaSsaPkcs1Parameters.Variant.LEGACY;
        }
        if (i == 4) {
            return RsaSsaPkcs1Parameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    private static RsaSsaPkcs1Params getProtoParams(RsaSsaPkcs1Parameters parameters) throws GeneralSecurityException {
        return (RsaSsaPkcs1Params) RsaSsaPkcs1Params.newBuilder().setHashType(toProtoHashType(parameters.getHashType())).build();
    }

    private static ByteString encodeBigInteger(BigInteger i) {
        return ByteString.copyFrom(BigIntegerEncoding.toBigEndianBytes(i));
    }

    private static com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey getProtoPublicKey(RsaSsaPkcs1PublicKey key) throws GeneralSecurityException {
        return (com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey) com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.newBuilder().setParams(getProtoParams(key.getParameters())).setN(encodeBigInteger(key.getModulus())).setE(encodeBigInteger(key.getParameters().getPublicExponent())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoParametersSerialization serializeParameters(RsaSsaPkcs1Parameters parameters) throws GeneralSecurityException {
        return ProtoParametersSerialization.create((KeyTemplate) KeyTemplate.newBuilder().setTypeUrl(PRIVATE_TYPE_URL).setValue(((RsaSsaPkcs1KeyFormat) RsaSsaPkcs1KeyFormat.newBuilder().setParams(getProtoParams(parameters)).setModulusSizeInBits(parameters.getModulusSizeBits()).setPublicExponent(encodeBigInteger(parameters.getPublicExponent())).build()).toByteString()).setOutputPrefixType(toProtoOutputPrefixType(parameters.getVariant())).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoKeySerialization serializePublicKey(RsaSsaPkcs1PublicKey key, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        return ProtoKeySerialization.create(PUBLIC_TYPE_URL, getProtoPublicKey(key).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, toProtoOutputPrefixType(key.getParameters().getVariant()), key.getIdRequirementOrNull());
    }

    private static ByteString encodeSecretBigInteger(SecretBigInteger i, SecretKeyAccess access) {
        return encodeBigInteger(i.getBigInteger(access));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProtoKeySerialization serializePrivateKey(RsaSsaPkcs1PrivateKey key, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        SecretKeyAccess secretKeyAccessRequireAccess = SecretKeyAccess.requireAccess(access);
        return ProtoKeySerialization.create(PRIVATE_TYPE_URL, ((com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey) com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.newBuilder().setVersion(0).setPublicKey(getProtoPublicKey(key.getPublicKey())).setD(encodeSecretBigInteger(key.getPrivateExponent(), secretKeyAccessRequireAccess)).setP(encodeSecretBigInteger(key.getPrimeP(), secretKeyAccessRequireAccess)).setQ(encodeSecretBigInteger(key.getPrimeQ(), secretKeyAccessRequireAccess)).setDp(encodeSecretBigInteger(key.getPrimeExponentP(), secretKeyAccessRequireAccess)).setDq(encodeSecretBigInteger(key.getPrimeExponentQ(), secretKeyAccessRequireAccess)).setCrt(encodeSecretBigInteger(key.getCrtCoefficient(), secretKeyAccessRequireAccess)).build()).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, toProtoOutputPrefixType(key.getParameters().getVariant()), key.getIdRequirementOrNull());
    }

    private static BigInteger decodeBigInteger(ByteString data) {
        return BigIntegerEncoding.fromUnsignedBigEndianBytes(data.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RsaSsaPkcs1Parameters parseParameters(ProtoParametersSerialization serialization) throws GeneralSecurityException {
        if (!serialization.getKeyTemplate().getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + serialization.getKeyTemplate().getTypeUrl());
        }
        try {
            RsaSsaPkcs1KeyFormat from = RsaSsaPkcs1KeyFormat.parseFrom(serialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            return RsaSsaPkcs1Parameters.builder().setHashType(toHashType(from.getParams().getHashType())).setPublicExponent(decodeBigInteger(from.getPublicExponent())).setModulusSizeBits(from.getModulusSizeInBits()).setVariant(toVariant(serialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RsaSsaPkcs1PublicKey parsePublicKey(ProtoKeySerialization serialization, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        if (!serialization.getTypeUrl().equals(PUBLIC_TYPE_URL)) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + serialization.getTypeUrl());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey from = com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerDecodeBigInteger = decodeBigInteger(from.getN());
            return RsaSsaPkcs1PublicKey.builder().setParameters(RsaSsaPkcs1Parameters.builder().setHashType(toHashType(from.getParams().getHashType())).setPublicExponent(decodeBigInteger(from.getE())).setModulusSizeBits(bigIntegerDecodeBigInteger.bitLength()).setVariant(toVariant(serialization.getOutputPrefixType())).build()).setModulus(bigIntegerDecodeBigInteger).setIdRequirement(serialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    private static SecretBigInteger decodeSecretBigInteger(ByteString data, SecretKeyAccess access) {
        return SecretBigInteger.fromBigInteger(BigIntegerEncoding.fromUnsignedBigEndianBytes(data.toByteArray()), access);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RsaSsaPkcs1PrivateKey parsePrivateKey(ProtoKeySerialization serialization, @Nullable SecretKeyAccess access) throws GeneralSecurityException {
        if (!serialization.getTypeUrl().equals(PRIVATE_TYPE_URL)) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + serialization.getTypeUrl());
        }
        try {
            com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey from = com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey.parseFrom(serialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey publicKey = from.getPublicKey();
            BigInteger bigIntegerDecodeBigInteger = decodeBigInteger(publicKey.getN());
            RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKeyBuild = RsaSsaPkcs1PublicKey.builder().setParameters(RsaSsaPkcs1Parameters.builder().setHashType(toHashType(publicKey.getParams().getHashType())).setPublicExponent(decodeBigInteger(publicKey.getE())).setModulusSizeBits(bigIntegerDecodeBigInteger.bitLength()).setVariant(toVariant(serialization.getOutputPrefixType())).build()).setModulus(bigIntegerDecodeBigInteger).setIdRequirement(serialization.getIdRequirementOrNull()).build();
            SecretKeyAccess secretKeyAccessRequireAccess = SecretKeyAccess.requireAccess(access);
            return RsaSsaPkcs1PrivateKey.builder().setPublicKey(rsaSsaPkcs1PublicKeyBuild).setPrimes(decodeSecretBigInteger(from.getP(), secretKeyAccessRequireAccess), decodeSecretBigInteger(from.getQ(), secretKeyAccessRequireAccess)).setPrivateExponent(decodeSecretBigInteger(from.getD(), secretKeyAccessRequireAccess)).setPrimeExponents(decodeSecretBigInteger(from.getDp(), secretKeyAccessRequireAccess), decodeSecretBigInteger(from.getDq(), secretKeyAccessRequireAccess)).setCrtCoefficient(decodeSecretBigInteger(from.getCrt(), secretKeyAccessRequireAccess)).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
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

    private RsaSsaPkcs1ProtoSerialization() {
    }
}
