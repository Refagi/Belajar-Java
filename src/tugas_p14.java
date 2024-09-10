package semester2;

import java.util.Scanner;
public class tugas_p14 {
    public static void main(String[] args){
//        nomer1 satu = new nomer1();
//        satu.result1();

        nomer2 dua = new nomer2();
        dua.result2();

//        nomer3 tiga = new nomer3();
//        tiga.result3();
    }
    static class nomer1 {
        public void result1() {
            Scanner count = new Scanner(System.in);
            System.out.print("Input sebuah angka = ");
            int result = count.nextInt();
            int angkaGenap = 1;
            int sisaHasilBagi = 0;
            int hasilBagi = 0;

            while (angkaGenap < 10){
                if(angkaGenap % 2 == 0){
                    sisaHasilBagi = result % angkaGenap;
                    hasilBagi = result / angkaGenap;
                    System.out.println(result + " : " + angkaGenap + " = " + hasilBagi + " sisa " + sisaHasilBagi);
                }
                angkaGenap++;
            }
        }
    }

    static class  nomer2 {
        public void result2 () {
            Scanner count = new Scanner(System.in);
            System.out.print("Input Nilai Pembagi = ");
            int nilaiPemb = count.nextInt();
            System.out.print("Input Nilai Awal = ");
            int nilaiAwal = count.nextInt();
            System.out.print("Input Nilai Akhir = ");
            int nilaiAkhir = count.nextInt();
            int total = 0;

            System.out.print("Output: ");
            do{
                if(nilaiAwal % nilaiPemb == 0){
                    total += nilaiAwal;
                    System.out.print(nilaiAwal + " ");
                }
                nilaiAwal++;
            }
            while (nilaiAwal <= nilaiAkhir);
            System.out.printf("%nTotal: " + total);
        }
    }

    static class nomer3 {
        public void result3 () {
            Scanner count = new Scanner(System.in);
            System.out.print("Jumlah Baris = ");
            int jumlahBaris = count.nextInt();

            for (int i = 1; i <= jumlahBaris; i++){
                int hasil = i;
                for(int j = 1; j <= i; j++){
                    System.out.print(hasil + " ");
                    hasil++;
                }
                System.out.println();

            }
        }
    }
}
