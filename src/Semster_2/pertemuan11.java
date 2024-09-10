package semester2;

import java.util.Scanner;
public class pertemuan11 {
    public static void main(String[] args) {

//        Scanner count = new Scanner(System.in);
//        System.out.print("Masukan Angka = ");
//        int number = count.nextInt();
//        int i = 1;
//        int j = 1;
//        while (i <= number){
//            System.out.print(i);
//            j += 1;
//            i += j;

//        Scanner count = new Scanner(System.in);
//        System.out.print("Masukan Angka = ");
//        int number = count.nextInt();
//        int p = 1;
//        int q = 2;
//        int r = 2;
//        while (p <= number) {
//            System.out.print(p + " ");
//            p += q + r;
//            r += 4;

//        Scanner count = new Scanner(System.in);
//        System.out.print("Masukan Angka = ");
//        int number = count.nextInt();
//        int p = 1;
//        int q = 2;
//        int r = 2;
//        while (p <= number) {
//            System.out.print(p + " ");
//            p += q + r;
//            r += 4;
//            if (p == 41){
//                p += 4;
//            }
//        }

        //bilangan prima
        Scanner count = new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        int number = count.nextInt();
        int p = 1;
        int total = 0;
        while (p <= number) {
            if(p % 2 == 0)
            System.out.print((p));
            p += 1;
        }
    }
}