package semester2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class TugasPemrogamanDua {
    public static  void main(String[] args){
        nomerSatu satu = new nomerSatu();
        satu.printResultNomerSatu();

        nomerDua dua = new  nomerDua();
        dua.printResultNomerDua();

        nomerTiga tiga = new nomerTiga();
        tiga.printResultNomerTiga();
    }
    static class nomerSatu{
        public void printResultNomerSatu() {
            Scanner count = new Scanner(System.in);
            System.out.print("Nilai Dalam KM = ");

            int satuanKm = count.nextInt();
            float result;
            if (satuanKm <= 0){
                System.out.println("Tolong isi satuan KM!");
            } else {
                result = satuanKm *  1.609F;
                System.out.println("Nilai Dalam MIL" + " " + result);
            }
        }
    }

    static class nomerDua {
        public void printResultNomerDua(){
            Scanner count = new Scanner(System.in);
            System.out.print("input jam = ");
            int changeHour = count.nextInt();
            String formatAmPm;

            if (changeHour >= 12) {
                formatAmPm = "PM";
                if (changeHour > 12) {
                    changeHour -= 12;
                }
            } else {
                formatAmPm = "AM";
                if (changeHour == 0) {
                    changeHour = 12;
                }
            }
            System.out.println("Waktu Dalam Format(AM/PM): " + changeHour + " " + formatAmPm);
    }
  }

  static  class nomerTiga{
        public void printResultNomerTiga(){
            try {
                InputStreamReader cek = new InputStreamReader(System.in);
                BufferedReader result = new BufferedReader(cek);

                System.out.print("Nama Barang = ");
                String NamaBarang = result.readLine();

                System.out.print("Harga Barang = ");
                int hargaBarang = Integer.parseInt(result.readLine());

                System.out.print("Jumlah Beli = ");
                int jumlahBeli = Integer.parseInt(result.readLine());

                int total = hargaBarang * jumlahBeli;
                System.out.println("Total = " + total);
                float diskon;
                int finalResult;

                if(total < 100000){
                    System.out.print("Diskon 0% = " + total);
                } else  if (total < 500000){
                    diskon = (total * (10F / 100));
                    finalResult = (int) (total - diskon);
                    System.out.println("Diskon 10% = " + ((int) diskon));
                    System.out.print("Total yang harus dibayar = " + finalResult);
                } else  if (total < 2000000){
                    diskon = (total * (20F / 100));
                    finalResult = (int) (total - diskon);
                    System.out.println("Diskon 20% = " + ((int) diskon));
                    System.out.print("Total yang harus dibayar = " + finalResult);
                } else {
                    diskon = (total * (30F / 100));
                    finalResult = (int) (total - diskon);
                    System.out.println("Diskon 30% = " + ((int) diskon));
                    System.out.print("Total yang harus dibayar = " + finalResult);

                }

            } catch (IOException e){
                System.out.println("ada error euy");
            }
        }
  }
}
