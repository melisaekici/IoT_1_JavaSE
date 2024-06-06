package com.melisaekici;

import javax.crypto.spec.PSource;

public class _11_1_For {
    public static void main(String[] args) {

        System.out.println("*** For ********************");
        for (int i = 1; i <= 10; i++) {// i++  i=i+1  i+=1
            System.out.print(i + " ");
        }

        System.out.println("\n*** While ********************");
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }

        System.out.println("\n*** Do-While ********************");
        int x = 1;
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 10);

        // Tekrar

        System.out.println("\n*** For ********************");
        for (int i=1; i<=10; i++){
            System.out.println("i: " + i);
        }

        System.out.println("\n*** While ********************");
        int m = 10;
        while(m <= 10){
            System.out.println("m: " + m);
            m++;
        }

        System.out.println("\n*** Do-While *******************");
        int c = 1;
        do {
            System.out.println("c: " + c);
            c++;
        }
        while (c <= 10);

    }

}
