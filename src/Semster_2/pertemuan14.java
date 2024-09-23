package Semster_2;

import java.util.Scanner;
public class pertemuan14 {
    public static void main(String [] args){
//        int a = 1;//insialisasi
//        do{
//            //statment jika kondisi TRUE
//            System.out.println(a);
//            a+=1;
//        }
//        while (a<1); //kondisi

//        Scanner s = new Scanner (System.in);
//
//        boolean banding = false;
//        do
//        {
//            System.out.print("Lanjut (y/t) ?");
//            String prosesInput = s.next();
//            banding = prosesInput.equalsIgnoreCase("y");
//        }
//        while ( banding ); // proses == "y"

        int limit = 7;
        int i = 1;
        int hasil = 0;
        do{
            hasil += i;
            i++;
        }
        while (i <= limit);
        System.out.print("terakhir = " + hasil);
    }
}
