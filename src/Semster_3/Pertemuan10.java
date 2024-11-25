package Semster_3;
import java.io.*;
public class Pertemuan10 {
    public static void main(String[] args) {
        String testNama, testNpm, testKode, testTugas, testUts, testUas;
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            FileWriter file = new FileWriter("C:/LearnJava/src/pertemuan10_Test.txt");
            BufferedWriter readFile = new BufferedWriter(file);

            System.out.print("Nama: ");
            testNama = input.readLine();
            System.out.print("Npm: ");
            testNpm = input.readLine();
            System.out.print("Tugas: ");
            testTugas = input.readLine();
            System.out.print("Uts: ");
            testUts = input.readLine();
            System.out.print("Uas: ");
            testUas = input.readLine();
            readFile.write(testNama + testNpm + testTugas + testUts + testUas);
            readFile.close();


        } catch (Exception E){
            System.out.println("Ada Error!" + E.getMessage());
        }
    }
}
