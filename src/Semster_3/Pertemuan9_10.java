package Semster_3;
import javax.annotation.processing.SupportedSourceVersion;
import java.io.*;
public class Pertemuan9_10{
    public static void main(String[] args) {

        Inputdata testOne = new Inputdata();
        testOne.numOne();

        ReadData testTwo = new ReadData();
        testTwo.numTwo();
    }

    static class Inputdata{
        public void numOne(){
            try {
                FileWriter input = new FileWriter("C:/LearnJava/src/pertemuan10_2.txt");
               BufferedWriter readFile = new BufferedWriter(input);
               readFile.write("K11TGS85UTS80UAS90Bambang \n");
                readFile.write("K12TGS90UTS75UAS80Messi \n");
                readFile.write("K11TGS80UTS85UAS85Ballack \n");
//                readFile.write("Didi444K0107508080 \n");
                readFile.close();
            }catch (Exception E){
                System.out.println("Ada Error!" + E.getMessage());
            }
        }
    }

    static class ReadData{
        public void numTwo(){
            String data, nama, npm, kode;
            int tugas, uts, uas;
            double nilai;
            try {
                FileReader readData = new FileReader("C:/LearnJava/src/pertemuan10_2.txt");
                BufferedReader accessFile = new BufferedReader(readData);
                System.out.println("| Nama "+"| "+"Npm "+"| "+"kodeMapel"+"| "+"Tugas"+"| "+"Uts"+"| "+"Uas");
                while ((data = accessFile.readLine()) != null){
                    nama = data.substring(18);
//                    npm = data.substring();
                    kode = data.substring(0, 3);
                    tugas = Integer.parseInt(data.substring(6, 8));
                    uts = Integer.parseInt(data.substring(11, 13));
                    uas = Integer.parseInt(data.substring(16, 18));
                    System.out.println("| " + nama + " | " + kode + " | " + tugas + " | " + uts + " | " + uas);
                }

                accessFile.close();
            }catch (Exception E){
                System.out.println("Ada Error!"+ E.getMessage());
            }
        }
    }
}
