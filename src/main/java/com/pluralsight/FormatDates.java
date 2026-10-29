package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    static void main() {
        // get current time
        LocalDateTime now = LocalDateTime.now();

        //Format to America
        DateTimeFormatter merica = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(merica));

        // year first format
        DateTimeFormatter yearFirst = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(yearFirst));

        // conver to lowercase day and month
        String day = now.getDayOfWeek().toString();
        day = day.substring(0, 1) + day.substring(1).toLowerCase();

        String month = now.getMonth().toString();
        month = month.substring(0, 1) + month.substring(1).toLowerCase();

        // print
        System.out.println(day + ", " + month + " " + now.getDayOfMonth() + ", " + now.getYear());

        //GMT
    }
}
