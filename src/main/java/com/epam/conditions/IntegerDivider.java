package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        System.out.println(divider == 0 ? "division by zero" : ((int) dividend / divider) * divider == dividend ? "can be divided completely" : "cannot be divided completely");
    }
}
