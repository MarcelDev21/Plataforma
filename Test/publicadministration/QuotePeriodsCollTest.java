package publicadministration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuotePeriodsCollTest {
private QuotePeriodsColl quotePeriodsColl;
private List<QuotePeriod> list;
    @BeforeEach
    void setUp() {
        quotePeriodsColl = new QuotePeriodsColl();
        list = new ArrayList<>();
    }

    @Test
    void addQuotePeriod() {
        QuotePeriod quotePeriod = new QuotePeriod(new Date("12/12/2023"), 12);
        quotePeriodsColl.addQuotePeriod(quotePeriod);
         // on verifie ce que l on passe en paramètre
        //QuotePeriodsColl quotePeriodsColl = new QuotePeriodsColl();
        assertEquals( new QuotePeriod(new Date("12/12/2023"), 12),quotePeriodsColl.getQuotePeriod());
       //assertAll("test all", ()-> assertEquals(new QuotePeriod(new Date("12/12/2023"), 12),quotePeriodsColl.getQuotePeriod().toString()));
    }

    @Test
    void getQuotePeriods() {
    }

    @Test
    void getQuotePeriod() {
        QuotePeriod quotePeriod = new QuotePeriod(new Date("12/11/2022"), 12);
        assertEquals(quotePeriodsColl.getQuotePeriod(), new QuotePeriod(new Date("12/12/2023"), 12));
    }
}