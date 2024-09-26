package latihan.week2;
import java.util.ArrayList;
import java.util.Arrays;
public class Index_satu {
    public static void main(String[] args) {
        TestCase1 cek = new TestCase1();
        cek.test1();

        TestCase2 cek2 = new TestCase2();
        cek2.test2();

    }

    static class TestCase1{
        public void test1(){

            String namesArray[] = {"asep", "johan", "budi"};
            ArrayList<String> namesList = new ArrayList<>(Arrays.asList(namesArray));//Konversi array menjadi ArrayList
        namesList.add("dedi"); //Menambahkan elemen baru ke dalam ArrayList
        namesList.remove(namesList.size() - 1); //Menghapus elemen index terakhir
        namesList.remove(0); //Menghapus elemen index pertama
        namesList.add(0, "ujang"); //Menambahkan elemen index pertama
        namesList.set(2, "joni"); //Menghapus elemen index 2 dan menambahkan elemen baru
//            Mengambil elemen dari index 1 sampai 2
        String newNamesArray[] = Arrays.copyOfRange(namesArray, 1, 2);
        System.out.println(Arrays.toString(newNamesArray)); //[johan]

        String str = "hello world";
        String[] arr = str.split("");  // Memisahkan string berdasarkan spasi
        System.out.println(Arrays.toString(arr)); //[h, e, l, l, o,  , w, o, r, l, d]
        }
    }

    static class TestCase2{
        public void test2(){
            int num[][] = {{1, 2, 3}, {4, 5, 6}};
//            System.out.println(num[0][1]); //2
//            System.out.println(num[0].length); //3
//
//            for(int i = 0; i < num.length; i++){
//                for(int j = 0; j <num[i].length; j++){
//                    System.out.println(num[i][j]);
//                }
//            }

            String str[][] = {{"refagi", "cikande", "19 tahun"},{"faza", "jayanti", "20 tahun"}};
            for(int i = 0; i < str.length; i++){
                for(int j = 0; j < str[i].length; j++){
                    if (j == 0){
                        System.out.println("nama saya: "+str[i][j]);
                    } else if (j == 1){
                        System.out.println("tempat saya: "+str[i][j]);
                    } else {
                        System.out.println("umur saya: "+ str[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
}
