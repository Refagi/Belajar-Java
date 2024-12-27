package Sqlite3_learn;
import java.sql.*;
import java.util.*;

public class Practice_sqlite_P15 {
    public static void main(String[] args) {
//        InsertBarang testOne = new InsertBarang();
//        testOne.testInsert();

//        UpdateBarang testTwo = new UpdateBarang();
//        testTwo.testUpdate();

        DeleteBarang testThree = new DeleteBarang();
        testThree.testDetelete();
    }

    static class InsertBarang {
        public void testInsert (){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kampus.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.println("Add Record....");
                System.out.print("Kode Barang: "); String kodeBarang = input.nextLine();
                System.out.print("Nama Barang: "); String namaBarang = input.nextLine();
                System.out.print("Harga: "); int harga = input.nextInt();

                state.executeUpdate("insert into Barang values ('"+ kodeBarang +"', '"+ namaBarang +"', '"+ harga +"')");
                System.out.println("Kode \t Nama Barang \t Harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery("select * from Barang");

                while (result.next()){
                    System.out.print(result.getString("Kode"));
                    System.out.print("\t" + result.getString("namaBarang"));
                    System.out.println("\t\t" + result.getString("harga"));
                }
            } catch (Exception error){
                System.out.println("error: " + error.getMessage());
            }
        }
    }

    static class DeleteBarang {
        public void testDetelete (){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kampus.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.println("Delete Record....");
                System.out.print("Kode Barang: "); String kodeBarang = input.nextLine();

                state.executeUpdate("delete from Barang where Kode = '"+ kodeBarang +"'");
                System.out.println("Kode \t Nama Barang \t Harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery("select * from Barang");

                while (result.next()){
                    System.out.print(result.getString("Kode"));
                    System.out.print("\t\t" + result.getString("namaBarang"));
                    System.out.println("\t\t" + result.getString("harga"));
                }
            } catch (Exception error){
                System.out.println("error: " + error.getMessage());
            }
        }
    }

    static class UpdateBarang {
        public void testUpdate (){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kampus.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.println("Update Record....");
                System.out.print("Kode Barang: "); String kodeBarang = input.nextLine();
                System.out.print("Nama Barang: "); String namaBarang = input.nextLine();
                System.out.print("Harga: "); int harga = input.nextInt();

                state.executeUpdate("update Barang set namaBarang = '"+ namaBarang +"', harga = '"+ harga +"' where Kode = '"+ kodeBarang +"'");
                System.out.println("Kode \t Nama Barang \t Harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery("select * from Barang");

                while (result.next()){
                    System.out.print(result.getString("Kode"));
                    System.out.print("\t\t" + result.getString("namaBarang"));
                    System.out.println("\t\t" + result.getString("harga"));
                }
            } catch (Exception error){
                System.out.println("error: " + error.getMessage());
            }
        }
    }
}
