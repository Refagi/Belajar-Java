package semester2;

import java.util.Scanner;
public class TugasP10 {
    public static void main(String[] args){
        segitigaRataKanan1 satu = new segitigaRataKanan1();
        satu.resultSatu();

        segitigaRataKanan2 dua = new segitigaRataKanan2();
        dua.resultDua();

        segitigaRataTengah1 tiga = new segitigaRataTengah1();
        tiga.resultTiga();

        segitigaRataTengah2 empat = new segitigaRataTengah2();
        empat.resultEmpat();

    }
    static class segitigaRataKanan1{
        public void resultSatu() {
            Scanner count = new Scanner(System.in);
            System.out.print("Masukan Angka = ");
            int number = count.nextInt();

            String result = "";
            for (int i = 1; i <= number; i++){
                String tampung = "";
                for (int j = 1; j <= number; j++){
                    if(j <= i){
                        tampung += "*";
                    }else {
                        tampung += " ";
                    }
                }
                result += tampung + "%n";
            }
            System.out.printf("Segitiga Rata Kanan (besar ke kecil) %n" + result);
        }
    }
    static  class segitigaRataKanan2 {
        public void resultDua(){
            Scanner count = new Scanner(System.in);
            System.out.print("Masukan Angka = ");
            int number = count.nextInt();

            String result = "";
            for (int i = number; i >= 1; i--){
                String tampung = "";
                for (int j = 1; j <= number; j++){
                    if(j >= i){
                        tampung += "*";
                    }else {
                        tampung += " ";
                    }
                }
                result += tampung + "%n";
            }
            System.out.printf("Segitiga Rata Kanan (kecil ke besar) %n" + result);
        }
    }
    static class segitigaRataTengah1 {
        public void resultTiga(){
            Scanner count = new Scanner(System.in);
            System.out.print("Masukan Angka = ");
            int number = count.nextInt();

            String result = "";
            for (int i = number; i >= 1; i--){
                String tampung = "";
                for (int j = 1; j <= number; j++){
                    if(j >= i){
                        tampung += "* ";
                    }else {
                        tampung += " ";
                    }
                }
                result += tampung + "%n";
            }
            System.out.printf("Segitiga Rata Tengah (kecil ke besar) %n" + result);
        }
    }

    static class segitigaRataTengah2 {
        public void resultEmpat(){
            Scanner count = new Scanner(System.in);
            System.out.print("Masukan Angka = ");
            int number = count.nextInt();

            String result = "";
            for (int i = 1; i <= number; i++){
                String tampung = "";
                for (int j = 1; j <= number; j++){
                    if(j >= i){
                        tampung += "* ";
                    }else {
                        tampung += " ";
                    }
                }
                result += tampung + "%n";
            }
            System.out.printf("Segitiga Rata Tengah (besar ke kecil) %n" + result);
        }
    }
}
