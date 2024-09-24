package Semster_3;
import java.util.Scanner;

public class Tugas_tiga {
    public static void main(String[] str){
        Scanner result = new Scanner(System.in);
        String garis = "--------------------------------------------------------";
        float rataRata = 0;
        System.out.print("Jumlah data: ");
        int data = result.nextInt();
        System.out.println(garis);
        String countData[][] = new String[data][3];

        for(int i = 0; i < data; i++){
            System.out.print("Mata Kuliah: "); countData[i][0] = result.next();
            System.out.print("Nilai Teori: "); countData[i][1] = result.next();
            System.out.print("Nilai Praktikum: "); countData[i][2] = result.next();
            System.out.println();
        }

        System.out.println(garis);
        System.out.println("Mata Kuliah\tTeori\tPraktikum\tRata-rata");
        System.out.println(garis);

        for(int j = 0; j < data; j++){
            int num1 = Integer.parseInt(countData[j][1]);
            int num2 = Integer.parseInt(countData[j][2]);
            rataRata = (num1 + num2) / 2;
            System.out.println(countData[j][0] +"\t\t"+ countData[j][1] +"\t"+ countData[j][2] + "\t\t" + rataRata);
            System.out.println();
        }
    }
}
