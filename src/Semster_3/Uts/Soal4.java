package Semster_3.Uts;
import java.io.*;
public class Soal4 {
    public static String row = "---------------------------------------------------------------------------------------";
    public static String file = ("C:/LearnJava/src/uts.txt");
    public static int length = 50;
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            FileInputStream accesFile = new FileInputStream(file);
            DataInputStream readFile = new DataInputStream(accesFile);
            BufferedReader inputFile = new BufferedReader(new InputStreamReader(readFile));

            System.out.println("~Data Siswa~");
            System.out.println(row);
            System.out.println("NIS\t\t\t\t\tNama\t\t\t\t\t\t\t\tKode Mapel\t\t\t\t\tNilai");
            System.out.println(row);

            String data;
            while ((data = inputFile.readLine()) != null){
                String getData[] = data.split("_");
                String nis = getData[0];
                String namaSiswa = getData[1];
                String kodeMapel = getData[2];
                int nilai = Integer.parseInt(getData[3]);

                System.out.println(nis+"\t\t\t\t\t"+namaSiswa+"\t\t\t\t\t"+kodeMapel+"\t\t\t\t\t\t"+nilai);
            }
            accesFile.close();
            readFile.close();
            inputFile.close();
            System.out.println(row);


            FileInputStream accesFileSeacrh = new FileInputStream(file);
            DataInputStream readFileSearch = new DataInputStream(accesFileSeacrh);
            BufferedReader searchFile = new BufferedReader(new InputStreamReader(readFileSearch));
            System.out.print("Cari data ? [Ya/Tidak]: ");
            String isSearch = input.readLine();

            if(isSearch.equalsIgnoreCase("ya")){
                System.out.println("~Pencarian Data . . . . ~");
                System.out.print("Input NIS: ");
                String nis = input.readLine();

                String patchData[] = new String[length];
                boolean isFound = false;
                int count = 0;
                double countRataRata = 0;

                while ((data = searchFile.readLine()) != null){
                    String getData[] = data.split("_");
                    String nisFile = getData[0];
                    String namaSiswaFile = getData[1];
                    String mapelFile = getData[2];
                    int nilaiFile = Integer.parseInt(getData[3]);

                    if(nis.equalsIgnoreCase(nisFile)){
                        if(count < length){
                            patchData[count] = "| " + nisFile + " | " + namaSiswaFile + " | " + mapelFile + " | " + nilaiFile;
                            count++;
                            isFound = true;
                            countRataRata += nilaiFile;
                        } else {
                            System.out.println("Jumlah data melebihi panjang tampung data!");
                            break;
                        }
                    }
                }

                if(isFound){
                    for(int i = 0; i < count; i++){
                        System.out.println(patchData[i]);
                    }
                    double rataRata = countRataRata / count;
                    System.out.println("Rata-rata: " + rataRata);
                    if(rataRata >= 80){
                        System.out.println("Kategori Nilai: Baik");
                    } else if (rataRata >= 70) {
                        System.out.println("Kategori Nilai: Cukup");
                    } else {
                        System.out.println("Kategori Nilai: Kurang");
                    }
                } else {
                    System.out.println("NIS: " + nis + " tidak ditemukan!");
                }

                accesFileSeacrh.close();
                readFileSearch.close();
                searchFile.close();
            }

        } catch (Exception E){
            System.out.println("Ada yang salah tuh! " + E.getMessage());
        }
    }
}
