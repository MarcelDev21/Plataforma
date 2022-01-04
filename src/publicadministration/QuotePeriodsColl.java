package publicadministration;

import java.text.SimpleDateFormat;
import java.util.*;

public class QuotePeriodsColl {

    private List<QuotePeriod> quotePeriods;
    private QuotePeriod quotePeriod;

    public QuotePeriodsColl (){
       quotePeriods = new ArrayList<>();
       quotePeriod = new QuotePeriod(new Date("12/12/2023"), 12);
    }

    public String createFormatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaChange = simpleDateFormat.format(date);
        return fechaChange;
    }

    public void addQuotePeriod (QuotePeriod qPd){
       // qPd = new QuotePeriod(new Date("12/12/2023"), 13);
       // quotePeriods.add(qPd);
        /*List<String> misFechasOrdenades = Arrays.asList(quotePeriod.getInitDay().toString() , qPd.getInitDay().toString());
        Collections.sort(misFechasOrdenades, Collections.reverseOrder());
        System.out.println(misFechasOrdenades);*/

        qPd = new QuotePeriod(new Date("12/12/2023"), 12);
        quotePeriods.add(qPd);
        return;
    }
    public String toString () {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaChange = simpleDateFormat.format(date);
        return fechaChange;
    } // Converts to String

    public void ordenarDates(Date actualDate){
        //mas antigua a la mas actual
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        actualDate = new Date();
        List<String> misFechasOrdenadas = Arrays.asList(quotePeriod.getInitDay().toString(), actualDate.toString());
        Collections.sort(misFechasOrdenadas, Collections.reverseOrder());
    }

    public List<QuotePeriod> getQuotePeriods() {
        return quotePeriods;
    }

    public QuotePeriod getQuotePeriod() {
        return quotePeriod;
    }


}
