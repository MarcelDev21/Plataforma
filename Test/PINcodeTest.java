import Data.PINcode;
import Excepciones.PinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PINcodeTest {

    @Test
    void getCodePin() throws PinException {
        PINcode piNcode = new PINcode("BBBBBBBBQR648597807024000012");
        assertEquals(piNcode.getCodePin(), "BBBBBBBBQR648597807024000012");
    }
    @Test
    void getCodePinIDNull(){
        assertThrows(PinException.class, () -> new PINcode(null));
    }
    @Test
    void getCodePinIdOk(){
        assertThrows(PinException.class, () -> new PINcode(""));
    }
}