package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrimitiveFactory;
import com.google.crypto.tink.proto.AesCmacPrfKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfAesCmac;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AesCmacPrfKeyManager extends KeyTypeManager<com.google.crypto.tink.proto.AesCmacPrfKey> {
    private static final int KEY_SIZE_IN_BYTES = 32;
    private static final int VERSION = 0;

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    AesCmacPrfKeyManager() {
        super(com.google.crypto.tink.proto.AesCmacPrfKey.class, new PrimitiveFactory<Prf, com.google.crypto.tink.proto.AesCmacPrfKey>(Prf.class) { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager.1
            @Override // com.google.crypto.tink.internal.PrimitiveFactory
            public Prf getPrimitive(com.google.crypto.tink.proto.AesCmacPrfKey key) throws GeneralSecurityException {
                return new PrfAesCmac(key.getKeyValue().toByteArray());
            }
        });
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacPrfKey";
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public void validateKey(com.google.crypto.tink.proto.AesCmacPrfKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        validateSize(key.getKeyValue().size());
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.AesCmacPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return com.google.crypto.tink.proto.AesCmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateSize(int size) throws GeneralSecurityException {
        if (size != 32) {
            throw new GeneralSecurityException("AesCmacPrfKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, com.google.crypto.tink.proto.AesCmacPrfKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesCmacPrfKeyFormat, com.google.crypto.tink.proto.AesCmacPrfKey>(AesCmacPrfKeyFormat.class) { // from class: com.google.crypto.tink.prf.AesCmacPrfKeyManager.2
            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesCmacPrfKeyFormat format) throws GeneralSecurityException {
                AesCmacPrfKeyManager.validateSize(format.getKeySize());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public AesCmacPrfKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesCmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public com.google.crypto.tink.proto.AesCmacPrfKey createKey(AesCmacPrfKeyFormat format) {
                return (com.google.crypto.tink.proto.AesCmacPrfKey) com.google.crypto.tink.proto.AesCmacPrfKey.newBuilder().setVersion(0).setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.internal.KeyTypeManager.KeyFactory
            public Map<String, KeyTypeManager.KeyFactory.KeyFormat<AesCmacPrfKeyFormat>> keyFormats() throws GeneralSecurityException {
                HashMap map = new HashMap();
                map.put("AES256_CMAC_PRF", new KeyTypeManager.KeyFactory.KeyFormat((AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build(), KeyTemplate.OutputPrefixType.RAW));
                map.put("AES_CMAC_PRF", new KeyTypeManager.KeyFactory.KeyFormat((AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build(), KeyTemplate.OutputPrefixType.RAW));
                return Collections.unmodifiableMap(map);
            }
        };
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCmacPrfKeyManager(), newKeyAllowed);
        AesCmacPrfProtoSerialization.register();
    }

    public static final KeyTemplate aes256CmacTemplate() {
        return KeyTemplate.create(new AesCmacPrfKeyManager().getKeyType(), ((AesCmacPrfKeyFormat) AesCmacPrfKeyFormat.newBuilder().setKeySize(32).build()).toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }
}
