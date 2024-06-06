package com.melisaekici;

import java.util.Random;


public class _8_3_Math_Random {

    public static void main(String[] args) {

        // Random: Rastgele sayılar
        // Math
        System.out.println(Math.random()*3+1); //1<=X<3

        double rastgele1=Math.floor(Math.random()*3+1);
        System.out.println(rastgele1);

        // Random: Rastgele sayılar
        // Class

        Random random = new Random();
        int rastgele2=random.nextInt(100)+1;
        System.out.println(rastgele2);

    }
}
