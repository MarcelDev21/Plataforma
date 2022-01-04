package publicadministration;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuotePeriod {
    private Date initDay;
    private int numDays;
   /* public QuotePeriod (Date date, int ndays){

    } */ // Initializes attributes ??? // the getters


    public QuotePeriod(Date initDay, int numDays) {
        this.initDay = initDay;
        this.numDays = numDays;
    }

    public String createFormatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaChange = simpleDateFormat.format(date);
        return fechaChange;
    }

    public String toString () {
        return initDay.toString();
    } // converts to String

    public String getInitDay() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaChange = simpleDateFormat.format(date);
        return fechaChange;
    }

    public int getNumDays() {
        return numDays;
    }

}
