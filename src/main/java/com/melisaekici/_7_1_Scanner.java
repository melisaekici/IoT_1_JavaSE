package com.melisaekici;

import java.util.Scanner;

public class _7_1_Scanner {
    public static void main(String[] args) {
        // Kullanıcıdan Console üzerinden veri almak istersek
        Scanner klavye=new Scanner(System.in);

        System.out.println("Adınızı giriniz");
        String name=klavye.nextLine();
        //System.out.println("Girdiğiniz Ad: " +name);

        System.out.println("\nSoyadınızı giriniz");
        String surname=klavye.nextLine();
        //System.out.println("Girdiğiniz Soyad: " +surname);

        System.out.println("\nİl Plakanızı giriniz");
        int number=klavye.nextInt();
        //System.out.println("İl Plakanız: " +number);

        // Escape Character (\n = Alt satıra geçiş)
        System.out.println("***************************************");
        System.out.println("Adınız: " +name +"\nSoyadınız: " +surname +"\nPlakanız: " +number);
        System.out.println("***************************************");
    }
}