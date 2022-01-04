package com.company;

import publicadministration.QuotePeriod;
import publicadministration.QuotePeriodsColl;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        QuotePeriodsColl quotePeriodsColl = new QuotePeriodsColl();
        quotePeriodsColl.addQuotePeriod(new QuotePeriod(new Date("12/13/2023"), 13));
    }
}
