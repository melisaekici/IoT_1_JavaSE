package com.melisaekici;

public class Homework1 {
    public static void main(String[] args) {
         // Ödev: Yukarıdaki öreneğe benzer olarak
        /*
        number1=18
        number2=6
        bu sayılarda (+ - * / % ) işlemleri consolda yazdıralım ?
        * */

        int number1 =18;
        int number2 =6;

        // +
        int toplam = number1 + number2;
        System.out.println("Toplam: " +toplam);

        // -
        int cikarma = number1 - number2;
        System.out.println("Çıkarma: " +cikarma);

        // *
        int carpma = number1 * number2;
        System.out.println("Çarpma: " +carpma);

        // /
        int bolme = number1 / number2;
        System.out.println("Bölme: " +bolme);

        // %
        int kalan = number1 % number2;
        System.out.println("Kalan: " +kalan);

    }
}
