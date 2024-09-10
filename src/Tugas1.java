package semester2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Tugas1 {
    public static void main(String[] args){
            Scanner count = new Scanner(System.in);

        System.out.println("Info Gaji Pokok");
        System.out.println("Gaji lebih kecil dari 10001 pajak = 10%");
        System.out.println("Gaji lebih besar dari 10000 pajak = 11%");
        System.out.println("========================================");

        System.out.print("Masukan Gaji Anda = ");
        int gajiAwal = count.nextInt();

        int pajak;
        int result;
        if (gajiAwal < 10001){
            pajak = (gajiAwal * 10) / 100;
            result = gajiAwal - pajak;
            System.out.println("Pajak Anda 10% = " + pajak);
            System.out.println("Gaji Bersih = " + result);
        } else if (gajiAwal > 10000) {
            pajak = (gajiAwal * 11) / 100;
            result = gajiAwal - pajak;
            System.out.println("Pajak Anda 11% = " + pajak);
            System.out.println("Gaji Bersih = " + result);
        } else {
            System.out.println("Gaji Anda Tidak Terdafta!");
        }

    }
}
