package semester2;

import java.util.*;
public class pertemuan15 {
    public static void main(String[] args) {

        //deklarasi array 1dimensi dengan
        //panjang array sebanyak 4
//        int[] a = new int[4];
//
//        //cara mengisi indeks array
//
//        a[1] = 10;
//        a[2] = 11;
//        a[3] = 12;
//
//        //cara mencetak nilai array
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//
//
//        //deklarasi variabel array 1 dimensi
//        // larik [] menandakan banyak dimensi yang dideklarasikan
//        //0,1,2,3,4
//
//        int[] y={3,4,5,6,7,8};
//
//        //length berfungsi untuk menghitung panjang array
//        //    System.out.println(y.length) ;
//        //   System.out.println(y[4]);
//
//
//        for (int i = 0; i<y.length; i++)
//        {
//            System.out.println(y[i]);
//
//        }
//
//
//        int [] x = new int [4];
//        int d;
//
//        x[0]=2;
//        x[1]=4;
//        x[2]=5;
//        x[3]=6;
//
//        //array dapat dijumlahkan
//        x[1] = x[2]+x[0];
//        d = x[1]+x[1];
//        System.out.println(x[1]);
//        System.out.println(d);
//
//
//
//
//
//
//        //cara lain deklarasi array (menggunakan tipe data String      //0        1
//        String [] b = {"semua","hallo","guys"};
//
//        System.out.println(b[1]+" "+b[2]);
//
//
//
//
//        Scanner s= new Scanner(System.in);
//
//        System.out.print("Masukkan byk array: ");
//        int inputan = s.nextInt();
//
//        int[] xx= new int [inputan];
//
//
////        for (int j = 0; j<xx.length; j++)
////        {
////            System.out.print("Masukkan nilai array["+j+"] =");
////            x[j]= s.nextInt();
////        }
//
//
//        for (int k = 0; k<xx.length; k++)
//        {
//            System.out.println("nilai array[" +k+ "] ="+ x[k]);
//        }


        //contoh 2
//        deklarasi variabel array 1 dimensi
//         larik [] menandakan banyak dimensi yang dideklarasikan
//        int y [] = {3,4,5,7,10};
//        int jum=0;
//
//        for (int i = 0; i<y.length; i++)
//        {
//            System.out.println(y[i]);
//
//            jum= jum+y[i];
//        }
//        System.out.println("Total = "+jum);

        //contoh 3
        int[] bil = new int[10];
        int n,maks;
        Scanner x = new Scanner(System.in);
        System.out.print("Berapa data (maks 10) : ");
        n = x.nextInt();
        // mengisi array
        if (n <= 10){
            for (int i = 0; i <= n ;i++){
                Scanner b = new Scanner(System.in);
                System.out.print("Data Index ke["+i+"]: ");
                bil[i] = b.nextInt();
                System.out.println("");
            }
        } else {
            System.out.print("lebih dari 10 !");
        }

        /* mencari nilai maksimum dan minimum*/
        maks=bil[0];
        for (int i=0;i <= n;i++){

            if (bil[i]>maks){
                maks=bil[i];
            }
        }

        int min=bil[0];

        for(int i=1;i <= n;i++){

            if(bil[i]<min)
            {min=bil[i];}
        }
        System.out.println("Nilai maksimumnya adalah : "+maks+"\n");
        System.out.println("Nilai minimumnya  adalah : "+min+"\n");


    }
}
