package com.melisaekici;

import java.util.Scanner;

public class _8_2_MathExamples {

    public static void main(String[] args) {

        // Kullanıcıdan alınan iki tam sayı değeri için en küçük sayının karesi?
        // Dikkat! kullanıcı yanlışlıkla negatif sayı girebilir (abs)
        // 3.5
        //3 (min)
        // 3^2=9 (pow)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz: ");
        int num1 = scanner.nextInt();
        num1 = Math.abs(num1); // pozitif sayı

        System.out.println("Lütfen 2.sayıyı giriniz ");
        int num2 = scanner.nextInt();
        num2 = Math.abs(num2); // pozitif sayı

        //System.out.println("Küçük Olan Değer: " +Math.min(num1, num2));
        // ya da
        int minValue=Math.min(num1,num2);

        double result=Math.pow(minValue,2);
        System.out.println("Sonuç: " +result);


    }
}
