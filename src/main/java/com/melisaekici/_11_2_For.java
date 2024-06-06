package com.melisaekici;

import java.util.Scanner;

public class _11_2_For {

    // 1 ile kullanıcının verdiği sayıya kadar toplama yapan java algoritması
    // bu sayılarda eğer 5 varsa toplamaya dahil edilmesin
    // toplama işlemi en üst limit 8 olacak şekilde kodlama yapınız

    // bu sayılardan çift olanların toplamını bulunuz
    // bu sayılardan tek olanların toplamını bulunuz

    public static void main(String[] args) {

        int sum = 0, evenSum = 0, oddSum=0; // Toplamada etkisiz eleman: 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Pozitif Bir Sayı Giriniz");
        int num = Math.abs(sc.nextInt());

        for (int i = 1; i <= num; i++) {
            if (i == 5) {
                System.out.println("sayılarda 5 sayısı var toplamaya dahil etme ");
                continue;
            }
            if(i>8)
                break;
            if(i%2==0){// Çift
                //evenSum=+evenSum+i;
                evenSum+=i;
            }else{
                oddSum+=i;
            }
            sum=sum+i;
        }

        System.out.println("Toplam Değer: " + sum);
        System.out.println("Çift Toplam Değer: " + evenSum);
        System.out.println("Tek Toplam Değer: " + oddSum);
    }

}
