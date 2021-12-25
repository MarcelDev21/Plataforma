package Data;

import Excepciones.PinException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final public class PINcode {

    private final String codePin;

    public PINcode(String codePin) throws PinException {
        if(codePin == null || !checkFormato(codePin)){
            throw new PinException("este pin tiene problema");
        }
        this.codePin = codePin;
    }

    public String getCodePin() {
        return codePin;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PINcode piNcode = (PINcode) o;
        return piNcode.equals(piNcode.codePin);

    }

    private boolean checkFormato(String myNif){
        Pattern pattern = Pattern.compile("BBBBBBBB[A-Z]{2}[0-9]{18}");
        Matcher matcher = pattern.matcher(myNif);
        return matcher.matches();
    }

}
