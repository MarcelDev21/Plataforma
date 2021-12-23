package Data;

import Excepciones.PinException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final public class PINcode {

    private final int codePin;

    public PINcode(int codePin) throws PinException {
        this.codePin = codePin;
    }

    public int getCodePin() {
        return codePin;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PINcode piNcode = (PINcode) o;
        return piNcode.equals(piNcode.codePin);
    }


}
