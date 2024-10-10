package Semster_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum {
    public static void main(String[] args) throws IOException{
        PraktikumSatu classOne = new PraktikumSatu();
        classOne.testSatu();

        PraktikumDua classTwo = new PraktikumDua();
        classTwo.testDua();
    }

    static class PraktikumSatu{
        public void testSatu() throws IOException{
            BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Berapa Harga Barang: ");

            int a = Integer.parseInt(dataIn.readLine());
            System.out.print("Berapa Jumlah Barang Yang diambil: ");

            int b = Integer.parseInt(dataIn.readLine());
            int total = (a * b);

            System.out.println("Harga barang = Rp "+ a);
            System.out.println("Jumlah barang = "+ b);

            System.out.println("Total harga sebelum diskon = Rp"+ total);
            if(total > 10000 & total <= 100000){
                System.out.print("Total Harga Yang Harus dibayar(setelah diskon)= Rp");
                System.out.println(total - (total * 0));
            } else if (total > 100000 & total <= 500000) {
                System.out.print("Total Harga Yang Harus dibayar(setelah diskon)= Rp");
                System.out.println(total - (total * 0.5));
            } else if (total > 500000 & total <= 1000000) {
                System.out.print("Total Harga Yang Harus dibayar(setelah diskon)= Rp");
                System.out.println(total - (total * 0.1));
            } else {
                System.out.print("Total Harga Yang Harus dibayar(setelah diskon)= Rp");
                System.out.println(total - (total * 0.15));
            }
        }
    }

    static class PraktikumDua{
        public void testDua(){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int n = 1, x, jmlh = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukan data ke-"+n+":");

            try{
                while ((x = Integer.parseInt(br.readLine())) != 0){
                    if(x < min){
                        min = x;
                    }
                    if(x > max){
                        max = x;
                    }
                    jmlh += x;
                    System.out.print("Masukan angka ke-"+(n++)+"[ketik 0 untuk STOP]: ");
                }
            }catch (Exception e){
                System.out.println("ADA YANG SALAH TUH!");
            }

            double rataRata = (double) jmlh / (n-1);
            System.out.println("Total: "+ jmlh);
            System.out.println("Rata - rata: "+rataRata);
            System.out.println("Angka Terkecil: "+ min);
            System.out.println("Angka Terbesar: "+ max);
        }
    }
}
