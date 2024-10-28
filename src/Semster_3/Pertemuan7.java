package Semster_3;
//import java.io.FileInputStream;
//import  java.io.InputStream;
//import  java.io.BufferedReader;
//import java.io.IOException;
import  java.io.*;
public class Pertemuan7 {
    public static void main(String[] args) {
        TestOne cekOne = new TestOne();
        cekOne.kesatu();

        TestTwo cekTwo = new TestTwo();
        cekTwo.kedua();

        TestThree cekThree = new TestThree();
        cekThree.ketiga();
    }

    static class TestOne{
        public void kesatu(){
            try {
                String file = ("C:/LearnJava/src/Test.txt");
                FileInputStream readFile = new FileInputStream(file);
                DataInputStream inputFile = new DataInputStream(readFile);

                while (inputFile.available() != 0){ //mengembalikan jumlah byte
                    String data = inputFile.readLine();
                    System.out.println(data);
                }
                inputFile.close();

            } catch (Exception Error){
                System.out.println("ada yang error !" + Error.getMessage());
            }
        }
    }

    static class TestTwo{
        public void kedua(){
            String file = "C:/LearnJava/src/Test.txt"; // Pastikan file ini ada
            try (FileInputStream fis = new FileInputStream(file)) {
                int bytesAvailable = fis.available();
                System.out.println("Jumlah byte yang tersedia untuk dibaca: " + bytesAvailable);

                byte[] data = new byte[bytesAvailable];
                int bytesRead = fis.read(data);
                System.out.println("Byte yang dibaca: " + bytesRead);
                System.out.println("Isi file: " + new String(data));

            } catch (IOException e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }

    static class TestThree{
        public void ketiga(){
            String x;
            int harga = 0, jumlah = 0, n = 0;

            try {
                String file = ("C:/LearnJava/src/Test.txt");
                FileInputStream readFile = new FileInputStream(file);
                DataInputStream inputFile = new DataInputStream(readFile);

                while (inputFile.available() != 0){ //mengembalikan jumlah byte
                    x = inputFile.readLine();
                    harga = Integer.parseInt(x.substring(1, 5));
                    n++;
                    jumlah += harga;
                    System.out.println("Harga pada hari ke-" + n + " = " + jumlah);

                }
            } catch (Exception Error){
                System.out.println("ada Yang Error tuh! " + Error.getMessage());
            }
        }
    }
}
