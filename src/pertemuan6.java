package semester2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;

public class pertemuan6 {
    public static void main(String[] args){
//        try {
//            Scanner count = new Scanner(System.in);
//            InputStreamReader cek = new InputStreamReader(System.in);
//            BufferedReader result = new BufferedReader(cek);
//            System.out.print("Apakah kamu sudah sarapan? (ya/tidak)");
//            String pernyataan = result.readLine();
//
//            String ask;
//            ask = pernyataan.equals("ya") ? "kenyang ueyy" : "laper ueyyy";
//            System.out.print(ask);
//        } catch (IOException e){
//            System.out.println("ada error euy");
//        }
        int a = 10;
        System.out.printf ("Nilai integer = %d %n", a);
        double b = 10.51;
        System.out.printf ("%f %n", b);
        String c= "Unindra";
        System.out.printf("%s",c);
        System.out.println();

        //untuk menambahkan jarak %s
        System.out.printf("%15s %-15s", c, "sip");
        System.out.println("ok");

        //untuk menampilkan waktu
        Date waktu = new Date();
        System.out.printf("%tT%n", waktu);

        System.out.printf("hours: %tH", waktu);

        System.out.println("");

        System.out.printf("minutes: %tM", waktu);

        System.out.println("");

        System.out.printf("seconds: %tS", waktu);
    }
}
