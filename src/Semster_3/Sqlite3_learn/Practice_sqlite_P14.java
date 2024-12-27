package Sqlite3_learn;
import java.sql.*;

public class Practice_sqlite_P14 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kampus.db");
        Statement state = con.createStatement();
        ResultSet set = state.executeQuery("select * from barang");
        while (set.next()){
            String kode = set.getString("Kode");
            System.out.print(kode);

            String namaBarang = set.getString("namaBarang");
            System.out.print("\t"+ namaBarang);

            int harga = set.getInt("harga");
            System.out.print("\t"+harga);
            System.out.println();
        }

    }
}
