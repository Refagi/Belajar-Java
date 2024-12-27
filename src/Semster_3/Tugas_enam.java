package Semster_3;
import java.util.*;
import java.io.*;
public class Tugas_enam {
    public static void main(String[] args) {
        System.out.println("Reno Faza Givaro (202343501362)");
        ProgramScanner scanner = new ProgramScanner();
        scanner.numOne();

        ProgramBufferedReader buffered = new ProgramBufferedReader();
        buffered.numTwo();
    }

    static class ProgramScanner {
        public void numOne(){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Konversi detik ke jam, menit, dan hari");
                System.out.print("Input jumlah detik : ");
                int detik = scanner.nextInt();
                int hari = detik / 86400; // Perhitungan hari
                int sisaDetik = detik % 86400; // Sisa detik setelah dihitung hari

                int jam = sisaDetik / 3600; // Perhitungan jam
                sisaDetik = sisaDetik % 3600; // Sisa detik setelah dihitung jam

                int menit = sisaDetik / 60; // Perhitungan menit
                sisaDetik = sisaDetik % 60; // Sisa detik yang belum terbagi dengan menit (sekaligus menjadi detik)

                System.out.println(detik + " = " + jam + " jam " + menit + " menit " + sisaDetik + " sisa detik " + hari + " hari");

            } catch (Exception E) {
                System.out.println("There are Error!: " + E.getMessage());
            }
        }
    }

    static class ProgramBufferedReader {
        public void numTwo(){
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Konversi Hari ke jam, menit, detik");
                System.out.print("Input jumlah Hari : ");
                int hari = Integer.parseInt(br.readLine());

                int jam = hari * 24;
                int menit = jam * 60;
                int detik = hari * 86400;

                System.out.println(hari + " = " + jam + " jam " + menit + " menit " + detik + " detik ");
            } catch (Exception E) {
                System.out.println("There are Error!: " + E.getMessage());
            }
        }
    }
}
