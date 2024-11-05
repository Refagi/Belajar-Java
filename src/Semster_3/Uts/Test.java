package Semster_3.Uts;
import java.io.*;

public class Test {
    public static String row = "---------------------------------------------------------------------------------------";
    public static String file = "C:/LearnJava/src/uts.txt";
    public static int maxResults = 100; // Ukuran maksimum array untuk hasil pencarian

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            // Membuka file untuk membaca dan menampilkan semua data siswa
            FileInputStream accesFile = new FileInputStream(file);
            DataInputStream readFile = new DataInputStream(accesFile);
            BufferedReader inputFile = new BufferedReader(new InputStreamReader(readFile));

            System.out.println("~Data Siswa~");
            System.out.println(row);
            System.out.println("NIS\t\t\t\t\tNama\t\t\t\t\t\t\tKode Mapel\t\t\t\t\tNilai");
            System.out.println(row);

            String data;
            while ((data = inputFile.readLine()) != null) {
                String nis = data.split("_")[0].trim();
                String namaSiswa = data.split("_")[1].trim();
                String kodeMapel = data.split("_")[2].trim();
                int nilai = Integer.parseInt(data.split("_")[3].trim());

                System.out.println(nis + "\t\t\t\t\t" + namaSiswa + "\t\t\t\t\t" + kodeMapel + "\t\t\t\t\t" + nilai);
            }
            inputFile.close();
            readFile.close(); // Tutup file setelah pembacaan selesai
            System.out.println(row);

            // Membuka ulang file untuk melakukan pencarian
            FileInputStream searchAccessFile = new FileInputStream(file);
            DataInputStream searchReadFile = new DataInputStream(searchAccessFile);
            BufferedReader searchFile = new BufferedReader(new InputStreamReader(searchReadFile));

            System.out.print("Cari data ? [Ya/Tidak]: ");
            String isSearch = input.readLine();

            if (isSearch.equalsIgnoreCase("ya")) {
                System.out.println("~Pencarian Data . . . . ~");
                System.out.print("Input NIS: ");
                String nis = input.readLine().trim();

                String[] hasilPencarian = new String[maxResults];
                int count = 0;
                boolean isFound = false;

                while ((data = searchFile.readLine()) != null) {
                    String nisFile = data.split("_")[0].trim();
                    String namaSiswaFile = data.split("_")[1].trim();
                    String mapelFile = data.split("_")[2].trim();
                    int nilaiFile = Integer.parseInt(data.split("_")[3].trim());

                    if (nisFile.equalsIgnoreCase(nis)) {
                        if (count < maxResults) {
                            hasilPencarian[count] = "| " + nisFile + " | " + namaSiswaFile + " | " + mapelFile + " | " + nilaiFile + " |";
                            count++;
                            isFound = true;
                        } else {
                            System.out.println("Peringatan: Jumlah hasil melebihi kapasitas array!");
                            break;
                        }
                    }
                }

                if (isFound) {
                    System.out.println("Data ditemukan:");
                    System.out.println(row);
                    for (int i = 0; i < count; i++) {
                        System.out.println(hasilPencarian[i]);
                    }
                    System.out.println(row);
                } else {
                    System.out.println("NIS: " + nis + " tidak ditemukan!");
                }

                searchFile.close();
                searchReadFile.close();
                searchAccessFile.close();
            }

        } catch (Exception e) {
            System.out.println("Ada yang salah tuh! " + e.getMessage());
        }
    }
}
