package Semster_3.Uts;
import java.io.*;
public class Soal3 {
    public static String row = "----------------------------------------------------------------------------------";
    public static String file = ("C:/LearnJava/src/uts.txt");
    public static void main(String[] args) throws IOException{
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Inpur digit terakhir NPM Anda: ");
            int lastNpm = Integer.parseInt(input.readLine());
            System.out.println("NPM genap mengisi 6 data");
            System.out.println("NPM ganjil mengisi 5 data");
            System.out.println(row);


            FileOutputStream cretaFile = new FileOutputStream(file);
            PrintStream inputData = new PrintStream(cretaFile);
            boolean isGanjilGenap = lastNpm % 2 == 0 ? true : false;

            if(isGanjilGenap){
                for(int i = 0; i < 6; i++){
                    System.out.print("Input NIS: ");
                    inputData.print(input.readLine() + "_");

                    System.out.print("Input Nama Siswa: ");
                    inputData.print(input.readLine() + "_");

                    System.out.print("Input Kode Mapel: ");
                    inputData.print(input.readLine() + "_");

                    System.out.print("Input Nilai: ");
                    inputData.println(input.readLine());

                    System.out.println();
                }
                System.out.println(row);
                System.out.println("Selesai menulis ke File");
            }
        } catch (Exception E){
            System.out.println("Ada yang salah tuh!: " + E.getMessage());
        }
    }
}
