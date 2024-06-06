package com.melisaekici;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {



    public static void dateTutorials(){

        Date date = new Date();
        System.out.println(date);
        System.out.println("Today is: " + date.getDay());
        System.out.println((1900+date.getYear()));
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());

        // SET
        date.setHours(21);
        System.out.println(date.getHours());


    }

    public static void dateFormatTurkish(){

        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", locale); // ayın ismini uzun uzun vermesini istiyorsa MMM ve MMMM olarak yazılır
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy", locale);

        Date date = new Date();
        String dateChange = sdf.format(date);
        // String dateChange = sdf.format(date).substring(0,2);
        System.out.println(dateChange);

    }

    public static void main(String[] args) {
        //dateTutorials();
        dateFormatTurkish();
    }
}
