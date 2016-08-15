/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dragonboatbuilder.tools;

/**
 *
 * @author felix
 */
public class Date {

    int[] date = new int[3]; //Year, Month, Day of Month

    public Date(int year, int month, int day) {
        this.date[0] = year;
        this.date[1] = month;
        this.date[2] = day;
    }

    public int getYear() {
        return date[0];
    }

    public int getMonth() {
        return date[1];
    }

    public int getDay() {
        return date[2];
    }

    @Override
    public String toString() {
        String str;

        String str_d1 = "";
        String str_d2 = "";

        if (date[1] < 10) {
            str_d1 = "0";
        }

        if (date[2] < 10) {
            str_d2 = "0";
        }

        str = str_d2 + date[2] + "." + str_d1 + date[1] + "." + date[0];
        
        return str;
    }
}