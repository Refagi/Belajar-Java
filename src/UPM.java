package semester2;

import java.util.Scanner;
public class UPM {
    public static void main(String[] args){
//        nomer1 satu = new nomer1();
//        satu.result1();

//        nomer2 dua = new nomer2();
//        dua.result2();

//        nomer3 tiga = new nomer3();
//        tiga.result3();

//        nomer4 empat = new nomer4();
//        empat.result4();

//        nomer5 lima = new nomer5();
//        lima.result5();

        nomer6 enam = new nomer6();
        enam.result6();
    }

    static class nomer1 {
        public void result1() {
            Scanner count = new Scanner(System.in);
            System.out.print("Input sebuah angka = ");

            int result = count.nextInt();
            int angkaGenap = 1;
            int sisaHasilBagi = 0;
            int hasilBagi = 0;

            while (angkaGenap <= 10) {
                if (angkaGenap % 2 == 0 || angkaGenap % 3 == 1) {
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
            System.out.print("Input sebuah angka = ");
            int angka = count.nextInt();
            int i = 1;

            System.out.println("Angka yang dapat membagi " + angka + " tanpa sisa adalah");
            do {
                if (angka % i == 0){
                    System.out.print(i + " ");
                }
                i++;
            }
            while (i <= angka);
        }
    }

    static class nomer3 {
        public void result3() {
            Scanner count = new Scanner(System.in);
            System.out.print("Input batasan angka = ");
            int angka = count.nextInt();
            int jumlahGenap = 0;
            int jumlahGanjil = 0;

            System.out.print("Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari " + angka + " adalah = ");
            for (int i = 3; i < angka; i++){
                if ( i % 3 == 0 || i % 5 == 0){
                    System.out.print(i + " ");
                    if(i % 2 == 0 ){
                        jumlahGenap += 1;
                    } else {
                        jumlahGanjil += 1;
                    }
                }
            }
            System.out.print("\n");
            System.out.println("jumlah angka genap = " + jumlahGenap + " angka");
            System.out.println("jumlah angka ganjil = " + jumlahGanjil + " angka");
        }
    }

    static class nomer4 {
        public void result4() {
            Scanner count = new Scanner(System.in);
            System.out.print("Input jumlah baris = ");
            int baris = count.nextInt();
            System.out.print("Input jumlah baris = ");
            int kolom = count.nextInt();
            int i, j;

            for (i = 1; i <= baris; i++){
                for(j = 1; j <= kolom; j++){
                    if (((i + j) - 1) % 2 == 0){
                        System.out.print("O");
                    } else  {
                        System.out.print("X");
                    }
                }
                System.out.print("\n");
            }
        }
    }

    static class nomer5 {
        public void result5() {
            Scanner count = new Scanner(System.in);
            System.out.print("Input jumlah baris = ");
            int[] tampung = new int[5];
            int angka = count.nextInt();

            if (angka <= 5) {
                for (int i = 0; i < angka; i++) {
                    System.out.print("Input bilangan ke-" + i + " = ");
                    tampung[i] = count.nextInt();
                    System.out.println("");
                }

                System.out.print("Data yang diinput adalah = ");
                for (int j = 0; j < angka; j++) {
                    System.out.print(tampung[j] + " ");
                }
            } else {
                System.out.print("batas jumlah bilangan itu " + angka);
            }
        }
    }

    static class nomer6 {
        public void result6() {
            Scanner count = new Scanner(System.in);
            System.out.print("Input jumlah baris = ");
            int angka = count.nextInt();

            String result = "";
            for (int i = 1; i <= angka; i++){
                String tampung = "";
                for (int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    tampung += "X" + " ";
                } else {
                    tampung += j + i - 1 + " ";
                }
            }
                System.out.print(tampung + '\n');
        }
        }
    }
}
