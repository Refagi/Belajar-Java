package semester2;

import java.util.Scanner;
public class UtsPemro {
    public static void main(String[] args){
//        Scanner count = new Scanner(System.in);

        //input jumlah menit: 1000000
        //1000000 menit = 1 tahun 329 hari
        //1440 menit = 0 tahun 1 hari

//        System.out.print("Input Jumlah menit: ");
//        long menit = count.nextInt();
//
//        long conversiMenitKeTahun = menit / (365 * 24 * 60);
//        long conversiSisaTahun = menit % (365 * 24 * 60) ;
//        long converisHari = conversiSisaTahun / 1440;
//
//        System.out.println(conversiMenitKeTahun + " tahun " + converisHari + " hari ");

//        Scanner count = new Scanner(System.in);
//
//        System.out.print("Input Sebuah angka: ");
//        int angka = count.nextInt();
//
//        if(angka % 4 == 0 && angka % 5 == 0) {
//            System.out.print(angka + " dapat dibagi oleh 4 dan 5 ");
//        } else if (angka % 4 == 0 || angka % 5 == 0 ){
//            System.out.print(angka + " dapat dibagi oleh salah satu dari angka 4 atau 5, tetapi tidak keduanya");
//        } else {
//            System.out.print(angka + " tidak dapat dibagi oleh angka 4 atau 5 ");
//        }

        Scanner count = new Scanner(System.in);
        System.out.printf("Status Kategori %n 1. Tidak Kawin %n 2. Kawin");
        System.out.println();
        System.out.print("Input status Kategori: ");
        int status = count.nextInt();
        System.out.print("Masukan pendapatan anda dalam 1 tahun: ");
        long pendapatan = count.nextLong();
        float pajak = 0;
        int resultPajak = 0;

        if(status == 1) {
            if(pendapatan >= 0 && pendapatan <= 70000000) {
               pajak = (5f / 100);
            } else if (pendapatan >= 70000000 && pendapatan <= 270000000) {
                pajak = 15f / 100;
            }else if (pendapatan > 270000000) {
                pajak = 25f / 100;
            } else {
                System.out.print("rugi dong");
            }
        } else if (status == 2) {
            if(pendapatan >= 0 && pendapatan <= 50000000) {
                pajak = 5f / 100;
            } else if (pendapatan >= 50000000 && pendapatan <= 250000000) {
                pajak = 15f / 100;
            }  else if (pendapatan > 250000000) {
                pajak = 25f / 100;
            } else {
                System.out.print("rugi dong");
            }
        }
        resultPajak = (int) (pajak * pendapatan);
        System.out.println("Pajak anda adalah sebesar: Rp" + resultPajak);
    }

}
