package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.StreamingAead;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StreamingAeadWrapper implements PrimitiveWrapper<StreamingAead, StreamingAead> {
    private static final StreamingAeadWrapper WRAPPER = new StreamingAeadWrapper();

    StreamingAeadWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public StreamingAead wrap(final PrimitiveSet<StreamingAead> primitives) throws GeneralSecurityException {
        ArrayList arrayList = new ArrayList();
        Iterator<List<PrimitiveSet.Entry<StreamingAead>>> it = primitives.getAll().iterator();
        while (it.hasNext()) {
            Iterator<PrimitiveSet.Entry<StreamingAead>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getPrimitive());
            }
        }
        PrimitiveSet.Entry<StreamingAead> primary = primitives.getPrimary();
        if (primary == null || primary.getPrimitive() == null) {
            throw new GeneralSecurityException("No primary set");
        }
        return new StreamingAeadHelper(arrayList, primary.getPrimitive());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<StreamingAead> getPrimitiveClass() {
        return StreamingAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<StreamingAead> getInputPrimitiveClass() {
        return StreamingAead.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(WRAPPER);
    }
}
