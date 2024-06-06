package com.melisaekici;

public class _4_WrapperTypes {

    public static void main(String[] args) {
        System.out.println("Wrapper Types");
        // Wrapper Type (ilkel olmayan heap memory kullanır)
        // Null değer alabilir.
        // OOP (Object Oriented Programming) daha yakın
        // Daha fazla yer kaplar


        // Sayılar için (4)
        // byte<short<int<long
        Byte b1=127; // 1 byte=8 bit -128<=SAYI<=+127
        System.out.println("b1 =" +b1);
        Short s1=127; // 16 bit
        System.out.println("s1 =" +s1);
        Integer i1=127; // (*) sıklıkla kullanıyoruz
        System.out.println(i1);
        Long l1=127L; // 1234L 1241

        // Virgüllü sayılar (floating point) (2)
        Float f2=14.53f;
        System.out.println(f2);
        Double d2=14.53; // (*) sıklıkla kullanıyoruz
        System.out.println(d2);

        //boolean (1)
        Boolean b3=true; //false
        System.out.println("b3 =" +b3);

        //char (1)
        Character c1='A';
        System.out.println("c1 =" +c1);

        /////////////////////

        int primitiveType=11;
        System.out.println(primitiveType);
        // primitiveType=null; // primitive type: null veremezsiniz

        Integer wrapperType=127;
        System.out.println(wrapperType);
        wrapperType=null;

        //////////////////////

        // Boxing: Primitive type'ı Wrapper type'a çevirir.
        int primitiveInt=55;
        Integer wrapperInt=primitiveInt;
        System.out.println(wrapperInt);

        // Unboxing: Wrapper type'ı Primitive type'a çevirir.
        Double wrapperDouble=14.53;
        double primitiveDouble=wrapperDouble;
        System.out.println(primitiveDouble);






    }
}
