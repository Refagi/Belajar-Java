package latihan.week3;

import java.util.Calendar;

public class Index_dua {
    public static Integer perkalianMinimum(int num){
        String patch1= "";
        for(int i = 1; i <= num; i++){
            for(int j = i; j <= num; j++){
                if(i * j == num){
                    patch1 = i+""+j;
                }
            }
        }
        return patch1.length();
    }

    public static String urutkanAbjab(String str){
        char changeStr[] = str.toCharArray();
        for(int i = 0; i < changeStr.length; i++){
            for(int j = 0; j < changeStr.length - 1; j++){
                if(changeStr[j] > changeStr[j + 1]){
                    char patch = changeStr[j];
                    changeStr[j] = changeStr[j+1];
                    changeStr[j+1] = patch;
                }
            }
        }
        return new String(changeStr);
    }

    public static String tukerBesarKecil(String str){
        char changeStr[] = str.toCharArray();
        String result = "";
        for(int i = 0; i < changeStr.length; i++){
            String k = String.valueOf(changeStr[i]).toUpperCase();
            if(String.valueOf(changeStr[i]).equals(k)){
                result += String.valueOf(changeStr[i]).toLowerCase();
            } else {
                result += String.valueOf(changeStr[i]).toUpperCase();
            }
        }
        return result;

    }

    public static Boolean checkAB(String str){
        char changeStr[] = str.toCharArray();
        boolean result = false;
        for(int i = 0; i < changeStr.length - 4; i++){
            char patch1 = Character.toLowerCase(changeStr[i]);
            char patch2 = Character.toLowerCase(changeStr[i + 4]);
            if(patch1 == 'a' && patch2 == 'b'){
                result = true;
                break;
            } else if (patch1 == 'b' && patch2 == 'a') {
                result = true;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        case1
        System.out.println(perkalianMinimum(24)); //2
        System.out.println(perkalianMinimum(90)); //3
        System.out.println(perkalianMinimum(20)); //2
        System.out.println(perkalianMinimum(179)); //4
        System.out.println(perkalianMinimum(1)); //2

//        case2
        System.out.println(urutkanAbjab("hello")); // 'ehllo'
        System.out.println(urutkanAbjab("truncate")); // 'acenrttu'
        System.out.println(urutkanAbjab("developer")); // 'deeeloprv'
        System.out.println(urutkanAbjab("software")); // 'aeforstw'
        System.out.println(urutkanAbjab("aegis")); // 'aegis'

//        case3
        System.out.println(tukerBesarKecil("Hello World")); // "hELLO wORLD"
        System.out.println(tukerBesarKecil("I aM aLAY")); // "i Am Alay"
        System.out.println(tukerBesarKecil("My Name is Bond!")); // "mY nAME IS bOND!!"
        System.out.println(tukerBesarKecil("IT sHOULD bE me")); // "it Should Be ME"
        System.out.println(tukerBesarKecil("001-A-3-5TrdYW")); // "001-a-3-5tRDyw"

//        case3
        System.out.println(checkAB("lane borrowed")); // true
        System.out.println(checkAB("i am sick")); // false
        System.out.println(checkAB("you are boring")); // true
        System.out.println(checkAB("barbarian")); // true
        System.out.println(checkAB("bacon and meat")); // false

    }
}
