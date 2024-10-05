package latihan.week3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Index_tiga {
    public static String changeMe(String str[][]) {
        if(str.length < 1){
            return "Kosong!";
        }
        String result = "";
        for (var i = 0; i < str.length; i++) {
            String fullName = str[i][0] + " " + str[i][1];
            String firstName = str[i][0];
            String lastName = str[i][1];
            String gender = str[i][2];
            String age;
            if (str.length > 3 && str[i][3] != null) {
                int countAge = 2024 - Integer.parseInt(str[i][3]);
                age = String.valueOf(countAge);
            } else {
                age = "Invalid Birth Year";
            }

            result += fullName+": { \n"+"fistName: "+firstName+"\n"+"lastName: "+lastName+"\n"+"gender: "+gender+"\n"+"age: "+age+"\n}";
        }
        return result;
    }

    public static String shoopingTime(String str, Integer num){
        HashMap<String, Integer> barang = new HashMap<>();
        ArrayList<String> item = new ArrayList<>();
        int modal = num;
        String result = "";
        barang.put("Sepatu Stacattu", 1500000);
        barang.put( "Baju Zoro", 500000);
        barang.put("Baju H&N", 250000);
        barang.put("Sweater Uniklooh", 175000);
        barang.put("Casing Handphone", 50000);

        if(modal < 50000){
            return "Mohon maaf, uang tidak cukup";
        }

        for(String key : barang.keySet()) {
                if (modal >= barang.get(key)) {
                    int price = barang.get(key);
                    modal -= price;
                    item.add(key);
                }
        }

        result += "{ MemberId: "+str+"\n"+"Money: "+num+"\n"+"Listpurched: "+item+"\n"+"Changemoney: "+modal+" }";
        if(str != "" && num > 50000){
            return result;
        } else {
            return "Mohon maaf, toko X hanya berlaku untuk member saja";
        }
    }
    public static void main(String[] args) {
//        case1
        System.out.println(changeMe(new String[][]{{"Christ", "Evans", "Male", "1982"}, {"Robert", "Downey", "Male"}}));
        System.out.println(changeMe(new String[][]{}));
        /*
  // 1. Christ Evans:
  // Christ Evans: { firstName: 'Christ',
  //   lastName: 'Evans',
  //   gender: 'Male',
  //   age: 41 } 2023 - 1982 = 41 kan yak wkwk
  // Robert Downey: { firstName: 'Robert',
  //   lastName: 'Downey',
  //   gender: 'Male',
  //   age: 'Invalid Birth Year' }
  */

//        case2
        System.out.println(shoopingTime("1820RzKrnWn08", 2475000));
        //{ memberId: '1820RzKrnWn08',
        // money: 2475000,
        // listPurchased:
        //  [ 'Sepatu Stacattu',
        //    'Baju Zoro',
        //    'Baju H&N',
        //    'Sweater Uniklooh',
        //    'Casing Handphone' ],
        // changeMoney: 0 }
        System.out.println(shoopingTime("", 2475000)); ////Mohon maaf, toko X hanya berlaku untuk member saja
        System.out.println(shoopingTime("234JdhweRxa53", 15000)); // //Mohon maaf, uang tidak cukup
        System.out.println(shoopingTime("82Ku8Ma742", 170000));
        //{ memberId: '82Ku8Ma742',
        // money: 170000,
        // listPurchased:
        //  [ 'Casing Handphone' ],
        // changeMoney: 120000 }
        System.out.println(shoopingTime("", 0)); //Mohon maaf, toko X hanya berlaku untuk member saja
    }
}
