package Data;

import Excepciones.NifException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final public class Nif {
    private final String nif;
   // public Nif (String code) { this.nif = code; } public String getNif () { return nif; }

    public Nif(String nif) throws NifException {
        if(nif == null || !checkFormato(nif)){
            throw new NifException("error Nif");
        }
        this.nif = nif;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; Nif niff = (Nif) o;
        return nif.equals(niff.nif);
    }

    @Override
    public int hashCode () { return nif.hashCode(); }

    @Override
    public String toString () {
        return "Nif{" + "nif ciudadano='" + nif + '\'' + '}';
    }

    private boolean checkFormato(String myNif){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(myNif);
        return matcher.matches();
    }
}
