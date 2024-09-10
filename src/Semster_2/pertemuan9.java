package semester2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pertemuan9 {
    public static void main(String[] args) {
        try {
//        no 1
//        int npm = 8 ; // <- nilai npm diisi oleh
//        int uts = npm % 1302;
//        uts = uts * 2;
//        int soal = 1910;
//        if(npm % 2 == 0) {
//            uts = uts + 10;
//            uts = uts / 2 - npm;
//            soal = uts * 3;
//        } else {
//            uts = uts + 5 + 3;
//            uts = uts / 2 - 1 - npm;
//            soal = uts * 5;
//        }
//        double pdm = soal / 2;
//        System.out.println("Nilai NPM = " + npm);
//        System.out.println("Nilai UTS = " + uts);
//        System.out.println("Nilai Soal = " + soal);
//        System.out.println("Nilai PDM = " + pdm);

//        no 2
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.print("Input nomor bulan :");
//            int bulan = Integer.parseInt(br.readLine());
//            System.out.print("Input tahun : ");
//            int tahun = Integer.parseInt(br.readLine());
//            int hari = 0;
//            if(bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12) {
//                hari = 31;
//            } else if (bulan == 2 && tahun % 4 == 0) {
//                hari = 29;
//            } else if (bulan == 2 && tahun % 4 != 0) {
//                hari = 28;
//            } else {
//                hari = 30;
//            }
//
//            System.out.println("Bulan ke " + bulan + " ditahun " + tahun + " memiliki 31 Hari");
//
//            no 3
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Input Angka Pertama : ");
//            int pertama = scanner.nextInt();
//            System.out.print("Input Angka Kedua : ");
//            int kedua = scanner.nextInt();
//            System.out.println("Hasil Penjumlahan : " + (pertama + kedua));
//            System.out.println("Hasil Pengurangan : " + (pertama - kedua));
//            System.out.println("Hasil Perkalian   : " + (pertama * kedua));
//            System.out.println("Hasil Rata-rata   : " + ((pertama + kedua) / 2));
//            if(pertama > kedua) {
//                System.out.println("Hasil Terbesar : " + pertama);
//                System.out.println("Hasil Terkecil : " + kedua);
//            } else {
//                System.out.println("Hasil Terbesar : " + kedua);
//                System.out.println("Hasil Terkecil : " + pertama);
//            }


//            no 4
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input jumlah detik : ");
            int detik = scanner.nextInt();
            int hari = detik / 86400; // Perhitungan hari
            int sisaDetik = detik % 86400; // Sisa detik setelah dihitung hari

            int jam = sisaDetik / 3600; // Perhitungan jam
            sisaDetik = sisaDetik % 3600; // Sisa detik setelah dihitung jam

            int menit = sisaDetik / 60; // Perhitungan menit
            sisaDetik = sisaDetik % 60; // Sisa detik yang belum terbagi dengan menit (sekaligus menjadi detik)

            sisaDetik = sisaDetik % 60; // mencari sisa detik yang belum terbagi dengan menit (sekaligus menjadi detik)
            System.out.println(detik + " = " + jam + " jam " + menit + " menit " + sisaDetik + " detik " + hari + " hari");


        } catch (Exception e){
            System.out.println("ada error euy");
        }
    }
}
