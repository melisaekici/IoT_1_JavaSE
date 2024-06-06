package com.melisaekici;

public class _6_3_Examples {

    // Basit bir hesap makinesi uygulaması
    /*
    2 sayının toplama, çıkarma, çarpma, bölme işlemini yapan
    basit bir hesap makinesi algoritmasını yazınız.

    Örnek: x=23; y=3

    Toplama = 23 + 3
    Çıkarma = 23 - 3
    Çarpma = 23 * 3
    Bölme = 23 / 3

     */

    public static void main(String[] args) {
        int number1=23 , number2= 3;
        System.out.println("Toplam: " +(number1 + number2));
        System.out.println("Fark: " +(number1 - number2));
        System.out.println("Bölüm: " +(number1 / number2));
        System.out.println("Çarpım: " +(number1 * number2));

    }
}
