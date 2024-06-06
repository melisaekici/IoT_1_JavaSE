package com.melisaekici;

import java.util.Arrays;

public class _14_Array {

    /*
    Birden fazla veriyi aynı küme içerisinde saklamaya ve daha sonra kullanabilmeye sağlıyor

    1. Tek Boyutlu Diziler
    2. İki Boyutlu Diziler

     */

    // Tek Boyutlu Diziler
    //Metot
    public static void arrayMethod() {

        // 10 elemanlı dizi
        int[] array = new int[9];
        array[0]=1; //sıfırıncı indisteki eleman 1
        array[1]=5;
        array[2]=3;
        array[3]=9;
        array[4]=2;
        array[5]=6;
        array[6]=7; // bu değerleri vermezsek içini 0 gösterir (Integer[] olarak yazsaydık primitive gelirdi Null yazardı ya da tam tersi)
        array[7]=8;
        array[8]=4;

        // Array Dizi tanımlamak
        int[] array2={9,1,4,2,5,6,7,8,1};

        System.out.println("Eleman Sayısı: " + array.length);   // array2 için de yapılabilir
        System.out.println("HashCode: " + array.hashCode());

        // Iterative for Loop
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n**********************");

        Arrays.sort(array);

        // ForEach Loop
        for(int temp:array){
            System.out.print(temp+" ");
        }
    }

    // İki Boyutlu Diziler
    public static void arrayMethod2(){
        System.out.println("*************************************");
        int[][] matrix = new int [3][3]; // [3][4] 3 satır 4 sütun
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        for(int i=0;i<matrix.length;i++){ // satır
            for(int j=0;j<matrix[i].length;j++){ // sütun
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        arrayMethod();
        //arrayMethod2();

    }
}
