package com.epam.conditions;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year >= 0 && month > 0 && month < 13) {
            System.out.println(Month.of(month).length(Year.of(year).isLeap()));
        } else {
            System.out.println("invalid date");
        }
    }
}
