package semester2;

import java.util.Scanner;

public class pertemuan10 {
    public static void main(String[] args){
        Scanner count = new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        int angka = count.nextInt();

        for (int i = angka; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}