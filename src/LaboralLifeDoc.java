import Data.Nif;
import publicadministration.QuotePeriodsColl;

public class LaboralLifeDoc extends PDFDocument{
    private Nif nif;
    private QuotePeriodsColl quotePds;

    public LaboralLifeDoc(Nif nif, QuotePeriodsColl quotePds) {
        this.nif = nif;
        this.quotePds = quotePds;
    }

    public Nif getNif() {
        return nif;
    }

    public QuotePeriodsColl getQuotePds() {
        return quotePds;
    }
    // the getters

}
