package com.melisaekici;

public class _3_PrimitiveTypes {
    public static void main(String[] args) {
     System.out.println("Primitive Types");

        // Data Structure
        // İlkel olan stack memory kullanır
       // Daha az yer kaplar

        // 8 tane primitive type vardır.
        // Java neden %100 OOP (Object Oriented Programming) değildir? (primitive türden dolayı)

        // Sayılar için (4)
        // byte<short<int<long
        byte b1=127; // 1 byte=8 bit -128<=SAYI<=+127
        System.out.println("b1 =" +b1);
        short s1=127; // 16 bit
        System.out.println("s1 =" +s1);
        int i1=127; // (*) sıklıkla kullanıyoruz
        System.out.println(i1);
        long l1=127L; // 1234L 1241

        // Virgüllü sayılar (floating point) (2)
        float f2=14.53f;
        System.out.println(f2);
        double d2=14.53; // (*) sıklıkla kullanıyoruz
        System.out.println(d2);

        //boolean (1)
        boolean b3=true; //false
        System.out.println("b3 =" +b3);

        //char (1)
        char c1='A';
        System.out.println("c1 =" +c1);


        // primitive type ile wrapper arasındaki farklar Power point 3-4 sayfa

    }
}
