package semester2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class QuizPemro2 {
    public static void main(String[] args){
//        int J,K,L;
//        int x = 13;
//        int  y = 17;
//        int j = 10;
//        int k = 11;
//        int l = 11;
//        System.out.println ( ++x + +(++y));
//        System.out.print ( y++ +l);
//        System.out.println ( l++ +l);
//        System.out.print ( l++ + -l);
//        System.out.println ( l++ -x);
//        System.out.print ( y-- - --l);
//        System.out.println ( j-- -k);
//        System.out.print ( -j++ -j);
//        Scanner count = new Scanner(System.in);

//        System.out.print("Angka Pertama:  ");
//        int angkaPertama = count.nextInt();
//
//        System.out.print("Angka Kedua:  ");
//        int angkaKedua = count.nextInt();
//        int result;
//
//        if(angkaPertama == angkaKedua){
//            result = angkaPertama + angkaKedua;
//        } else {
//            result = angkaPertama * angkaKedua;
//        }
//        System.out.println("Output: " + result);
try {
    InputStreamReader cek = new InputStreamReader(System.in);
    BufferedReader result = new BufferedReader(cek);
//
//    System.out.print("Nama Customer = ");
//    String NamaCustomer = result.readLine();
//
//    System.out.print("Jarak Yang akan di tempuh: ");
//    int jarak = Integer.parseInt(result.readLine());
//
//    int diskon = 0;
//    int tarif = 0;
//    int resultTarif = 0;
//
//    if (jarak == 4) {
//        tarif += 9500;
//    } else if (jarak > 4) {
//        tarif += 9500 + ((jarak - 4) * 2500);
//        if (jarak <= 10) {
//            System.out.print("Diskon 0%");
//        } else if (jarak > 10 && jarak <= 15) {
//            diskon = 2000;
//        } else {
//            diskon = 5000;
//        }
//    } else {
//        System.out.print("miinimal 4KM");
//    }
//
//    resultTarif = tarif - diskon;
//    System.out.println("Selamat Anda mendapatkan Potongan Rp " + diskon);
//    System.out.println("Tarif yang harus dibayarkan " + NamaCustomer + " adalah " + resultTarif);
    System.out.print("Jenis Kelas Kamar: ");
    String kamar = result.readLine();

    System.out.print("Lama Menginap: ");
    int lamaInap = Integer.parseInt(result.readLine());
    int tarif = 0;

    if(kamar.equalsIgnoreCase("Standard")){
        if(lamaInap >= 1 && lamaInap <= 2){
            tarif += 400000;
        } else {
            tarif +=  350000;
        }
    } else if (kamar.equalsIgnoreCase("eksekutif")) {
        if(lamaInap >= 1 && lamaInap <= 2){
            tarif += 1200000;
        } else {
            tarif += 1000000;
        }
    }
    System.out.print(tarif);

}catch (IOException e){
    System.out.println("ada error euy");
}
    }
}
