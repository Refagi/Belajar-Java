package Semster_3;
import java.io.*;
public class Tugas_lima {
    public static void main(String[] args) {
        NomerSatu testOne = new NomerSatu();
        testOne.numOne();

        NomerDua testTwo = new NomerDua();
        testTwo.numTwo();
    }

    static class NomerSatu{
        public void numOne(){
            try {
                String file = ("C:/LearnJava/src/tugasP7.txt");
                FileOutputStream cretaFile = new FileOutputStream(file);
                PrintStream inputData = new PrintStream(cretaFile);
                inputData.println("9981117806701");
                inputData.println("0832348108521");
                inputData.println("1560016594591");
                inputData.println("3452416706704");
                inputData.println("5560247018199");
                inputData.close();

            } catch (Exception Error){
                System.out.println("ada yang error! " + Error.getMessage());
            }
        }
    }

    static class NomerDua{
        public void numTwo(){
            String row = "-------------------------------------------------------------";
            try{
                float nilaiAkhir = 0;
                float rataRata = 0;
                String file = ("C:/LearnJava/src/tugasP7.txt");
                FileInputStream accesFile = new FileInputStream(file);
                DataInputStream readFile = new DataInputStream(accesFile);
                int i = 1;
                System.out.println(row);
                System.out.println("No\tTugas\t\tUTS\t\tUAS\t\t Nilai Akhir");

                while (readFile.available() != 0){ //mengembalikan jumlah byte
                    String data = readFile.readLine();
                    int tugas = Integer.parseInt(data.substring(1, 3));
                    int uts = Integer.parseInt(data.substring(6, 8));
                    int uas = Integer.parseInt(data.substring(9, 11));
                    nilaiAkhir = (float) (((0.20) * tugas) + ((0.30) * uts) + ((0.50) * uas));
                    rataRata += nilaiAkhir;

                    System.out.println(i++ +"\t"+ tugas +"\t\t\t"+ uts +"\t\t"+ uas +"\t\t\t"+ nilaiAkhir);
                }
                System.out.println(row);
                System.out.println(Math.floor(rataRata / 5)); //floor membulatkan angka setelah koma ke kebawah
                readFile.close();
            } catch (Exception Error){
                System.out.println("ada yang error! " + Error.getMessage());
            }
        }
    }
}
