package com.melisaekici;

import java.util.Random;

public class _11_3_For {

    // 1 ile 10 arasında rastgele 8 tane sayının toplamı

    public static void main(String[] args) {

        Random rand = new Random();
        int sum =0;

        for (int i = 0; i <= 8; i++) {
            int randomNum = rand.nextInt(10); //+1 //1 ile 10 arasındaki sayılar
            System.out.println(randomNum + " ");
            sum = sum +randomNum;

            if(i>10){
                break;
            }
        }
        System.out.println("\nRastgele Toplam:  " + sum);
    }
}
