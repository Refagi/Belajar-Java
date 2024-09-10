package semester2;

import java.util.*;
import java.util.Scanner;

 public class pertemuan12 {
        public static void main(String[] args) {
//            System.out.println("Pilihan: ");
//            System.out.println("1. Soto ayam ");
//            System.out.println("2. Nasi rawon ");
//            System.out.println("3. Gulai kambing ");
//            System.out.println("");
//
//            Scanner s = new Scanner (System.in);
//            System.out.print("Pilihan: ");
//            int pilihan = s.nextInt();
//
//            switch (pilihan) {
//                case 2:
//                    System.out.println("Pilihan Anda Soto ayam");
//                    System.out.println("Silakan menunggu sebentar");
//
//
//                case 1:
//                    System.out.println("Pilihan Anda Nasi rawon");
//                    System.out.println("Silakan menunggu sebentar");
//                    break;
//                default:
//                    System.out.println("Salah Pencet Boss");
//            }
//
//            System.out.println("Akhir switch");


//            int z;
//            Scanner x = new Scanner(System.in);
//            System.out.print("Masukkan angka : ");
//            z = x.nextInt();
//            //nilai
//            switch (z)   //Switch utk menangani keputusan yang meliputi beberapa
//            //pilihan
//            {
//                case 80:
//                case 81:
//                    System.out.println("Nilai anda B++");
//                    break;
//
//                case 82:
//                    System.out.println("Nilai anda B+");
//
//                case 83:
//                case 84:
//                    break;
//                case 85:
//                    System.out.println("Boleh Juga Lho");
//                    break;
//
//                default:
//                    System.out.println("DODOL Lho..");
//            }
//
//            System.out.println("Tetap Jalan");
//
//
//            Scanner s = new Scanner (System.in);
//            System.out.print("Nilai Lho Berapa(1-10) :" );
//            int nilai=s.nextInt();
//
//            switch(nilai){
//                case 10:
//                case  9: System.out.println( "MANTUL!" );  break;
//
//                case  8: System.out.println("SIIP" );
//                case  7:
//                case  6: System.out.println("LUMAYAN" );
//                case  5:
//                case  4:
//                case  3:
//                case  2:
//                case  1:
//                    break;
//
//                default:
//                    System.out.println("Salah input");
//            }



//            int a;
//            Scanner sc= new Scanner (System.in);
//            System.out.print ("Masukkan bulan (1-12) :");
//            a= sc.nextInt();
//
//            switch (a)
//            {
//                case 1:
//                case 6:
//                case 7:System.out.println ("Bulan diawali huruf J"); break;
//                case 3:
//                case 5:System.out.println ("Bulan diawali huruf M");break;
//                default:
//                    System.out.println("bulan tidak di awali huruf J dan M");
//            }

//
//            Scanner sc = new Scanner (System.in);
//            System.out.print("Masukkan pilihan   : ");
//            String pilih = sc.nextLine();
//
//
//            switch (pilih.toUpperCase())
//            {
//                case "SMU": System.out.println("Lulusan SMU"); break;
//                case "S1": System.out.println("Lulusan Sarjana"); break;
//                case "S2": System.out.println("Lulusan Magister"); break;
//                default: System.out.println("Salah input");
//            }


            Scanner s =new Scanner(System.in);
            System.out.println("Paket Internet");
            System.out.println("1.Android");
            System.out.println("2.Hitung Luas Segitiga");
            System.out.print("Silakan Pilih(1 atau 2) :");
            int a = s.nextInt();

            switch(a){
                case 1: System.out.println("\nPaket TELKOMSEL :");
                System.out.println("1.Paket Unlimited (Up to 2Mbps)");
                System.out.println("2.Paket Sosialita (Unlimited WhatsApp,Telegram, X) ");
                System.out.println("3.Paket Email (Unlimited Email)");

                System.out.print("Silakan Pilih(1/2/3) :");
                int b=s.nextInt();
                switch(b){
                    case 1:
                    System.out.println("\nAnda Memilih Paket Unlimited");
                    System.out.println("Biaya 100ribu/30hari"); break;

                    case 2: System.out.println("\nAnda Memilih Paket Sosialita");
                        System.out.println("Biaya 75ribu/30hari"); break;
                }
                break;
                case 2: System.out.println("Anda Memilih Hitung Luas segi3");
                    System.out.print("Masukkan Alas :");
                    int alas=s.nextInt();
                    System.out.print("Masukkan Tinggi :");
                    int tinggi=s.nextInt();

                    if(alas<0 | tinggi<0)
                    {System.out.print("Ada nilai negatif"); break;
                    }

                    System.out.print("Luas segi3  :" + (alas*tinggi/2)); break;



                default : System.out.println("Salah Input");
            }
        }
}
