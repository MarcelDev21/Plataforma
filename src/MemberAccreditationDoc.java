import Data.AccredNumb;
import Data.Nif;

public class MemberAccreditationDoc extends PDFDocument{
    private Nif nif;
    private AccredNumb numAffil;

    public MemberAccreditationDoc(Nif nif, AccredNumb numAffil) {
        this.nif = nif;
        this.numAffil = numAffil;
    }

    public Nif getNif() {
        return nif;
    }

    public AccredNumb getNumAffil() {
        return numAffil;
    }

    // the getters
}
