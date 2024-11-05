package Semster_3.Uts;
import java.io.*;
public class Soal1 {
    public static String row = "---------------------------------------------------------------------------------------";
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\t\t\t~Pendataan~");
        System.out.print("Input Jumlah Data: ");
        int lengthData = Integer.parseInt(input.readLine());
        System.out.println(row);

        String dataBarang[][] = new String[lengthData][3];
        String isAnswerTransaksi = null;
        String isAnswerBelanja = null;
        double subtotal = 0;
        float total = 0;


        try {
            for (int i = 0; i < lengthData; i++) {
                System.out.print("Input Code Barang: ");
                String kodeBarang = input.readLine();
                dataBarang[i][0] = kodeBarang;

                System.out.print("Input Nama Barang: ");
                String namaBarang = input.readLine();
                dataBarang[i][1] = namaBarang;

                System.out.print("Input Harga Barang: ");
                String hargaBarang = input.readLine();
                dataBarang[i][2] = hargaBarang;

                System.out.println();
            }

            System.out.println("\t\t\t\t\t\t~Tabel Data Barang~");
            System.out.println(row);
            System.out.println("Kode\t\t\t\t\t\t\tNama Barang\t\t\t\t\t\t\t\tHarga");
            for (int j = 0; j < lengthData; j++) {
                System.out.println(dataBarang[j][0] + "\t\t\t\t\t\t\t" + dataBarang[j][1] + "\t\t\t\t\t\t\t\t" + dataBarang[j][2]);
            }

            boolean isContinue = true;

            while (isContinue) {
                System.out.print("Ingin Melakukan Transaksi ? [Ya/Tidak]: ");
                isAnswerTransaksi = input.readLine();
                System.out.println("~Transaksi~");

                if(isAnswerTransaksi.equalsIgnoreCase("ya")){

                    while (true){
                        System.out.print("Input Kode Barang: ");
                        String kodeBarang = input.readLine();
                        boolean isFound = false;

                        for(int k = 0; k < dataBarang.length; k++){
                            if(dataBarang[k][0].equals(kodeBarang)){
                                System.out.print("\t\t\tNama Barang: "+ dataBarang[k][1]+"\n");
                                System.out.print("\t\t\tHarga Barang: "+ dataBarang[k][2]+"\n");

                                System.out.print("Input Jumlah Barang: ");
                                int jmlhBarang = Integer.parseInt(input.readLine());
                                double hargaBarang = Double.parseDouble(dataBarang[k][2]);
                                subtotal = hargaBarang * jmlhBarang;
                                System.out.println("\t\t\tSubtotal: "+subtotal);
                                total += subtotal;
                                isFound = true;
                                break;
                            }
                        }

                        if(!isFound){
                            System.out.println("Barang Tidak ditemukan!");
                            continue;
                        }

                        System.out.print("Tambah belanja ? [Ya/Tidak]: ");
                        isAnswerBelanja = input.readLine();
                        if(!isAnswerBelanja.equals("ya")){
                            System.out.println(row);
                            System.out.println("\t\t\ttotal: "+total);
                            isContinue = false;
                            break;
                        }
                    }
                } else  {
                    System.out.println(row);
                    System.out.println("\t\t\ttotal: "+total);
                    break;
                }
            }
        }catch (Exception E){
            System.out.println("Ada yang salah tuh! " + E.getMessage());
        }
        input.close();
    }
}
