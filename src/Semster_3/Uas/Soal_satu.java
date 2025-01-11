package Semster_3.Uas;
import java.util.*;
public class Soal_satu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digit pertama NPM Anda: ");
        int awal =  sc.nextInt();
        System.out.print("Digit terakhir NPM Anda: ");
        int akhir = sc.nextInt();

        if (akhir % 3 == 0) {
            System.out.println("Hasil digit terakhir NPM "+akhir+" = "+uas(awal, 6));
        } else if (akhir % 2 == 0) {
            System.out.println("Hasil digit terakhir NPM "+akhir+" = "+uas(awal, 4));
        } else {
            System.out.println("Hasil digit terakhir NPM "+akhir+" = "+uas(awal, 5));
        }
    }

    static int uas (int a, int b) {
        if (b == 0) return 2;
        else return 3 * uas(a, b - 1) - 2;
    }
}
