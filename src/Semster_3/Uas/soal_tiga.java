package Semster_3.Uas;
import java.sql.*;
import java.util.*;
public class soal_tiga {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/db-uas/reno.db");
            Statement state = con.createStatement();
            int totalPbyr = 0;
            boolean lanjut = true;

            Scanner input = new Scanner(System.in);
            System.out.println("\t\t\t ~ Transaksi ~");
            System.out.print("Nomer Transaksi: "); String noTransaksi = input.nextLine();
            System.out.println("-------------------------------------------------------------------------");

            System.out.print("Input ID Pasien: "); String idPasien = input.nextLine();
            String getPasin = "SELECT Nama_Pasien, No_telp FROM Pasien WHERE Id_pasien = '"+ idPasien +"'";
            ResultSet resultPasien = state.executeQuery(getPasin);
            if (resultPasien.next()) {
                System.out.println("\t\t >> " + resultPasien.getString("Nama_pasien"));
                System.out.println("\t\t >> " + resultPasien.getString("No_telp"));
            } else {
                System.out.println("Data tidak ditemukan!");
            }

            while (lanjut) {
                System.out.print("Input Kode Obat: "); String kodeObat = input.nextLine();
                String getObat = "SELECT Nama_obat, Harga, Stok, Satuan FROM Obat WHERE Kode_obat = '"+ kodeObat +"'";
                ResultSet resultObat = state.executeQuery(getObat);

                if (resultObat.next()) {
                    System.out.println("\t\t >> " + resultPasien.getString("Nama_obat"));
                    System.out.println("\t\t >> Rp" + resultPasien.getString("Harga"));
                    System.out.println("\t\t >> Tersedia " + resultPasien.getString("Stok") + " " + resultObat.getString("Satuan"));
                    System.out.println("-------------------------------------------------------------------------");

                    System.out.print("Input Jumlah: "); int jumlah = input.nextInt(); input.nextLine();
                    int stok = resultObat.getInt("Stok");
                    if (jumlah > stok) {
                        System.out.println("Stok tidak mencukupi!");
                        continue;
                    }

                    int subtotal = resultObat.getInt("Harga") * jumlah;
                    System.out.println("\t\t\t Subtotal >> Rp " + subtotal);
                    totalPbyr += subtotal;

                    state.executeUpdate( "UPDATE Obat SET Stok = Stok - '"+jumlah+"' WHERE Kode_obat = '"+kodeObat+"'");
                    state.executeUpdate("INSERT INTO Transaksi VALUES ('"+noTransaksi+"', '"+idPasien+"', '"+totalPbyr+"')");
                } else {
                    System.out.println("Obat tidak ditemukan!");
                }
                System.out.println("-------------------------------------------------------------------------");
                System.out.print("[?] Lanjut pembayaran lain? [ya/tidak]: "); String pilihan = input.nextLine();
                lanjut = pilihan.equalsIgnoreCase("ya");
                System.out.println("-------------------------------------------------------------------------");
            }
            System.out.println("\t\t\t TOTAL PEMBAYARAN >> Rp " + totalPbyr);
        } catch (Exception error) {
            System.out.println("error: " + error.getMessage());
        }
    }
}
