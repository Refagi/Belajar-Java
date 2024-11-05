package Semster_3.Uts;
import java.io.*;

public class Soal2 {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Mari Menghitung Matematika dengan rumus C = √a^2 + b^2");
        double c = 0;

        System.out.print("Masukan Nilai a: ");
        int a = Integer.parseInt(input.readLine());

        System.out.println();

        System.out.print("Masukan Nilai b: ");
        int b = Integer.parseInt(input.readLine());

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Maka nilai C dengan C = √a^2 + b^2 adalah: " + c);
        c = Math.floor(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("Jika dibulatkan kebawah menjadi: " + c);
    }
}
