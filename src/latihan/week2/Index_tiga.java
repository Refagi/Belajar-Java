package latihan.week2;

public class Index_tiga {
    public static Boolean palindrome(String str) {
        String patchStr = "";
        String changeStr = str.toLowerCase();
        for (int i = changeStr.length() - 1; i >= 0; i--) {
            patchStr += str.charAt(i);
        }
        return patchStr.equals(str);
    }

    public static String palindromeAngka(int num) {
        int next = num + 1;
        while (true) {
            String numstr = Integer.toString(next);
            String patchNum = "";
            for (int i = numstr.length() - 1; i >= 0; i--) {
                patchNum += numstr.charAt(i);
            }
            if (numstr.equals(patchNum)) {
                return numstr;
            }
            next++;
        }
    }

    public static int hitungJumlahKalimat(String str){
        String changeStr[] = str.split(" ");
        return changeStr.length;
    }

    public static String pasanganTerbesar(int num){
        String changeNum = Integer.toString(num);
        String test1 = "0";
        for(int i = 0; i < changeNum.length() - 1; i++){
//            String test2 = String.valueOf(changeNum.substring(i, i + 2)); bisa juga dengan cara ini
            String test2 = changeNum.charAt(i) +""+ changeNum.charAt(i + 1); //menggunakan +""+ agar char menjadi string
            if(Integer.valueOf(test2) > Integer.valueOf(test1)){
                test1 = test2;
            }
        }
        return test1;
    }
    public static void main(String[] args){
        Index_tiga obj = new Index_tiga();

        //case 1
        System.out.println(palindrome("katak")); //true
        System.out.println(palindrome("blanket")); //false
        System.out.println(palindrome("civic")); //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("mister")); //false

        //case 2
        System.out.println(palindromeAngka(8)); //9
        System.out.println(palindromeAngka(10)); //11
        System.out.println(palindromeAngka(117)); //121
        System.out.println(palindromeAngka(175)); // 181
        System.out.println(palindromeAngka(1000)); //1001

        //case 3
        System.out.println(hitungJumlahKalimat("I have a dream knawbf")); //5
        System.out.println(hitungJumlahKalimat("Never eat shredded wheat or cake")); //6
        System.out.println(hitungJumlahKalimat("A song to sing")); //4
        System.out.println(hitungJumlahKalimat("I")); //1
        System.out.println(hitungJumlahKalimat("I believe I can code")); //5

        //case 4
        System.out.println(pasanganTerbesar(641573)); //73
        System.out.println(pasanganTerbesar(12783456)); //83
        System.out.println(pasanganTerbesar(910233)); //91
        System.out.println(pasanganTerbesar(71856421)); //85
        System.out.println(pasanganTerbesar(79918293)); //99
    }
}
