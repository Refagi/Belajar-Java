package latihan.week2;
import java.util.ArrayList;
import java.util.Arrays;

public class Index_dua {
    public static String dataHandling(String input[][]){
        ArrayList<String> patchStr = new ArrayList<>();
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++){
                if(j == 0){
                    patchStr.add("Nomor ID: "+input[i][j]);
                } else if (j == 1) {
                    patchStr.add("Nama Lengkap: "+input[i][j]);
                } else if (j == 2) {
                    patchStr.add("TTL: "+input[i][j]+" "+input[i][j+1]);
                } else if (j == 4) {
                    patchStr.add("Hobi: "+input[i][j]);
                }
            }
            patchStr.add(" ");
        }
        return String.join("\n",patchStr);
    }

    public static String dataHandlings(String input[]){
        ArrayList<String> patchStr = new ArrayList<>(Arrays.asList(input));

        patchStr.set(1, "Roman Alamsyah Elsharawy");
        patchStr.set(2, "Provinsi Bandar Lampung");
        patchStr.set(4, "Pria");
        patchStr.add("SMA Internasional Metro");
        System.out.println(patchStr);

        System.out.println("Mei");

        String[] dateFrmt1 = input[3].split("/");
        dateFrmt1[0] = "1989";  // Tahun
        dateFrmt1[1] = "21";    // Hari
        dateFrmt1[2] = "05";    // Bulan

        // Cetak array yang sudah diformat
        System.out.println(Arrays.asList(dateFrmt1));

        // Gabungkan kembali array menjadi string dengan format tertentu
        dateFrmt1[0] = "21"; dateFrmt1[1] = "05"; dateFrmt1[2] = "1989";
        String changeDate2 = String.join("-", dateFrmt1);
        System.out.println(changeDate2);

        // Mengembalikan elemen kedua
        String name = input[1];
        return name;
    }

    public static void main(String[] args){
        Index_dua obj = new Index_dua();
        String str1[][] =
                {
                        {"0001", "Roman Alamsyah", "Bandar Lampung", "21/05/1989", "Membaca"},
                        {"0002", "Dika Sembiring", "Medan", "10/10/1992", "Bermain Gitar"},
                        {"0003", "Winona", "Ambon", "25/12/1965", "Memasak"},
                        {"0004", "Bintang Senjaya", "Martapura", "6/4/1970", "Berkebun"}
                };
        String str2[] = {
                "0001",
                "Roman Alamsyah ",
                "Bandar Lampung",
                "21/05/1989",
                "Membaca",};
        System.out.println(dataHandling(str1));
        System.out.println(dataHandlings(str2));
    }
}
