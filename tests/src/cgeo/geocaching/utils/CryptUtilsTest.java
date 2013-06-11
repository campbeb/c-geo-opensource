package cgeo.geocaching.utils;

import cgeo.geocaching.connector.gc.GCConstants;

import junit.framework.TestCase;

public class CryptUtilsTest extends TestCase {
    public static void testROT13() {
        assertEquals("", CryptUtils.rot13(""));
        assertEquals("", CryptUtils.rot13((String) null));
        assertEquals("Pnpur uvag", CryptUtils.rot13("Cache hint"));
        assertEquals("Pnpur [plain] uvag", CryptUtils.rot13("Cache [plain] hint"));
        assertEquals("[all plain]", CryptUtils.rot13("[all plain]"));
        assertEquals("123", CryptUtils.rot13("123"));
    }

    public static void testConvertToGcBase31() {
        assertEquals(1186660, GCConstants.gccodeToGCId("GC1PKK9"));
        assertEquals(4660, GCConstants.gccodeToGCId("GC1234"));
        assertEquals(61731, GCConstants.gccodeToGCId("GCF123"));
    }

    public static void testIssue1902() {
        assertEquals("ƖƖlƖƖƖƖ", CryptUtils.rot13("ƖƖyƖƖƖƖ"));
    }
}
