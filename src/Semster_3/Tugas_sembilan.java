package Semster_3;
import java.sql.*;
import java.util.*;

public class Tugas_sembilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Reno Faza Givaro (202343501362)");
        System.out.println("1.Menampilkan\n2.Menambah\n3.Merubah\n4.Menghapus");
        System.out.print("Silahkan Pilih Menu Record Data Kucing: ");
        int pilih = input.nextInt();
        switch (pilih){
            case 1:
                SelectBarang testOne = new SelectBarang();
                testOne.testSelect();
                break;
            case 2:
                InsertBarang testTwo = new InsertBarang();
                testTwo.testInsert();
                break;
            case 3:
                UpdateBarang testThree = new UpdateBarang();
                testThree.testUpdate();
                break;
            case 4:
                DeleteBarang testFour = new DeleteBarang();
                testFour.testDetelete();
                break;
        }
    }

    static  class  SelectBarang {
        public void testSelect (){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kucing.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.println("Lihat Record....");
                System.out.print("Berdasarkan Nama Kucing: ");
                String namaKucing = input.nextLine();
                String query = "SELECT umurKucing, jenisKucing, kg, harga FROM Kucing WHERE namaKucing = '"+ namaKucing +"'";
                System.out.println("umurKucing \t jenisKucing \t beratKucing \t harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery(query);

                while (result.next()) {
                    System.out.print(result.getInt("umurKucing") + " tahun");
                    System.out.print("\t\t " + result.getString("jenisKucing"));
                    System.out.print("\t\t\t" + result.getInt("kg"));
                    System.out.print("\t\t\t" + result.getInt("harga"));
                }

            } catch (Exception error) {
                System.out.println("error: " + error.getMessage());
            }
        }
    }

    static class InsertBarang {
        public void testInsert (){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kucing.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.println("Add Record....");
                System.out.print("nama kucing: "); String namaKucing = input.nextLine();
                System.out.print("umur kucing: "); int umurKucing = input.nextInt(); input.nextLine();
                System.out.print("jenis kucing: "); String jenisKucing = input.nextLine();
                System.out.print("berat kucing: "); int beratKucing = input.nextInt(); input.nextLine();
                System.out.print("harga: "); int harga = input.nextInt();

                state.executeUpdate("INSERT INTO Kucing VALUES ('"+ namaKucing +"', '"+ umurKucing +"', '"+ jenisKucing +"', '"+ beratKucing +"', '"+ harga +"')");
                System.out.println("namaKucing \t umurKucing \t jenisKucing \t beratKucing \t harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery("select * from Kucing");

                while (result.next()){
                    System.out.print(result.getString("namaKucing"));
                    System.out.print("\t\t " + result.getInt("umurKucing") + " tahun");
                    System.out.print("\t\t " + result.getString("jenisKucing"));
                    System.out.print("\t\t\t" + result.getInt("kg"));
                    System.out.print("\t\t\t" + result.getInt("harga"));
                    System.out.println();
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
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kucing.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.println("Delete Record....");
                System.out.print("nama kucing: "); String namaKucing = input.nextLine();

                state.executeUpdate("DELETE FROM Kucing WHERE namaKucing = '"+ namaKucing +"'");
                System.out.println("namaKucing \t umurKucing \t jenisKucing \t beratKucing \t harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery("SELECT * FROM Kucing");

                while (result.next()){
                    System.out.print(result.getString("namaKucing"));
                    System.out.print("\t\t " + result.getInt("umurKucing") + " tahun");
                    System.out.print("\t\t " + result.getString("jenisKucing"));
                    System.out.print("\t\t\t" + result.getInt("kg"));
                    System.out.print("\t\t\t" + result.getInt("harga"));
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
                Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Learn-sqlite/kucing.db");
                Statement state = con.createStatement();

                Scanner input = new Scanner(System.in);
                System.out.print("harga: "); int harga = input.nextInt(); input.nextLine();
                System.out.print("nama kucing: "); String namaKucing = input.nextLine();
                System.out.print("umur kucing: "); int umurKucing = input.nextInt(); input.nextLine();
                System.out.print("jenis kucing: "); String jenisKucing = input.nextLine();
                System.out.print("berat kucing: "); int beratKucing = input.nextInt(); input.nextLine();

                state.executeUpdate("UPDATE Kucing SET namaKucing = '"+ namaKucing +"', umurKucing = '"+ umurKucing +"', jenisKucing = '"+ jenisKucing +"', kg = '"+ beratKucing +"' where harga = '"+ harga +"'");
                System.out.println("namaKucing \t umurKucing \t jenisKucing \t beratKucing \t harga");
                System.out.println("=======================================================================");

                ResultSet result = state.executeQuery("SELECT * FROM Kucing");

                while (result.next()){
                    System.out.print(result.getString("namaKucing"));
                    System.out.print("\t\t " + result.getInt("umurKucing") + " tahun");
                    System.out.print("\t\t " + result.getString("jenisKucing"));
                    System.out.print("\t\t\t" + result.getInt("kg"));
                    System.out.print("\t\t\t" + result.getInt("harga"));
                    System.out.println();
                }
            } catch (Exception error){
                System.out.println("error: " + error.getMessage());
            }
        }
    }
}
