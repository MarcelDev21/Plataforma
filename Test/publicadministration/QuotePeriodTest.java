package publicadministration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class QuotePeriodTest {
   private QuotePeriod quotePeriod;
    @BeforeEach
    void setUp() {
        quotePeriod = new QuotePeriod(new Date("12/11/2021"), 3);
    }

    @Test
    void testToString() {
        assertEquals(quotePeriod.getInitDay().toString(), "12/11/2021");
    }

    @Test
    void getInitDay() {
       assertEquals(quotePeriod.getInitDay(), new Date("12/11/2021"));
    }

    @Test
    void getNumDays() {
        assertEquals(quotePeriod.getNumDays(), 3);
    }
}