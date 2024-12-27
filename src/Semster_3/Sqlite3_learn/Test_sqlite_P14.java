package Sqlite3_learn;
import java.sql.*;

public class Test_sqlite_P14 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:coba.db");
        Statement st = con.createStatement();

        st.executeUpdate("drop table if exists mhs;");
        st.executeUpdate("create table mhs (npm integer, nama varchar(20));");
        st.executeUpdate("insert into mhs values (567, 'reno');");
        st.executeUpdate("insert into mhs values (847, 'faza');");
        st.executeUpdate("insert into mhs values (354, 'givaro');");

        ResultSet rs = st.executeQuery("select * from mhs;");
        System.out.println("Npm\tNama");
        while (rs.next()){
            System.out.print(rs.getInt("npm"));
            System.out.println("\t " +  rs.getString("nama"));
        }

    }
}
