import Data.Nif;
import Excepciones.NifException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publicadministration.QuotePeriodsColl;

import static org.junit.jupiter.api.Assertions.*;

class LaboralLifeDocTest {
    private LaboralLifeDoc laboralLifeDoc;
    private Nif nif;
    @BeforeEach
    void setUp() throws NifException {
      //laboralLifeDoc = new LaboralLifeDoc(new Nif("12345"), new QuotePeriodsColl());
        nif = new Nif("12345");
        if(nif== null){
            throw  new NifException("error nif");
        }
        laboralLifeDoc = new LaboralLifeDoc(new Nif("12345"), new QuotePeriodsColl());

    }

    @Test
    void testToString() {
    }

    @Test
    void moveDoc() {
    }

    @Test
    void openDoc() {
    }

    @Test
    void getNif() throws NifException {
        Nif nif = new Nif("12345");
        assertEquals(laboralLifeDoc.getNif(), nif);
    }

    @Test
    void getQuotePds() {
    }
}