package Semster_3;

import java.util.Scanner;
public class Tugas {
    public static void main(String[] args){
        tugas1 tugasSatu = new tugas1();
        tugasSatu.result1();
    }
    static class tugas1 {
        public void result1(){
            Scanner count = new Scanner(System.in);
            System.out.print("Masukan panjang = ");
            int p = count.nextInt();
            System.out.print("Masukan lebar = ");
            int l = count.nextInt();

            float luasPersegiPanjang = p * l;

            System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);
            if(luasPersegiPanjang % 2 == 0){
                System.out.print("Merupakan angka genap");
            } else {
                System.out.print("Merupakan angka ganjil");
            }

        }
    }
}
