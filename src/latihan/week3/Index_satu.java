package latihan.week3;

import java.util.ArrayList;
import java.util.Arrays;

public class Index_satu {
    public static Boolean angkaPrima(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static Integer fpb(int num1, int num2){
        int centerNum = Math.max(num1, num2), result = 0;;
        for(int i = centerNum; i >= 1; i--){
            if(num1 % i == 0 && num2 % i == 0 ){
                result = i;
                break;
            }
        }
        return result;
    }

    public static Integer cariMedian(int[] num){
        Arrays.sort(num);
        int count = num.length, median = count / 2;;
        String type = count % 2 == 0 ? "genap" : "ganjil";
        if(type.equalsIgnoreCase("ganjil")){
            median = num[median];
        } else {
            median = (num[median] + num[median - 1]) / 2;
        }
        return median;
    }

    public static Integer cariModus(int num[]){
        Arrays.sort(num);
        ArrayList<Integer> patch = new ArrayList<>(Arrays.asList(0, 0));
        int cekOne = 0;
        for (int i = 0; i < num.length; i++){
            int cekTwo = 0;
            for(int j = 0; j < num.length; j++){
                if(num[i] == num[j]){
                    cekTwo++;
                }
            }
            if(cekTwo > cekOne){
                cekOne = cekTwo;
                patch.set(0, cekOne); //simpan jumlah elemen
                patch.set(1, num[i]); //simpan elemnya
            }
        }
        if(patch.get(1) == 1 || patch.get(0) == num.length){
            return -1;
        }
        return patch.get(1);
    }

    public static String ubahHuruf(String str){
        String huruf = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j <= huruf.length() - 1; j++){
                if(str.charAt(i) == huruf.charAt(j)){
                    result += huruf.charAt(j + 1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        case 1
        System.out.println(angkaPrima(3)); //true
        System.out.println(angkaPrima(7)); //true
        System.out.println(angkaPrima(6)); //false
        System.out.println(angkaPrima(23)); //true
        System.out.println(angkaPrima(33)); //false

        //case 2
        System.out.println(fpb(6, 4)); //2
        System.out.println(fpb(12, 16)); //4
        System.out.println(fpb(50, 40)); //10
        System.out.println(fpb(22, 99)); //11
        System.out.println(fpb(24, 36)); //12
        System.out.println(fpb(17, 23)); //1
        System.out.println(fpb(12, 8)); //1

        //case 3
        System.out.println(cariMedian(new int[]{1, 2, 3, 4, 5})); //3
        System.out.println(cariMedian(new int[]{1, 3, 4, 10, 12, 13})); //7
        System.out.println(cariMedian(new int[]{3, 4, 7, 6, 10})); //6
        System.out.println(cariMedian(new int[]{1, 3, 3})); //3
        System.out.println(cariMedian(new int[]{7, 7, 8, 8})); //7.5
        System.out.println(cariMedian(new int[]{5, 4, 6, 4}));

        //case 4
        System.out.println(cariModus(new int[]{10, 4, 5, 2, 4})); //4
        System.out.println(cariModus(new int[]{5, 10, 10, 6, 5})); //5
        System.out.println(cariModus(new int[]{10, 3, 1, 2, 5})); //-1
        System.out.println(cariModus(new int[]{1, 2, 3, 3, 4, 5})); //3
        System.out.println(cariModus(new int[]{7, 7, 7, 7, 7})); //-1

        //case 5
        System.out.println(ubahHuruf("wow")); //xpx
        System.out.println(ubahHuruf("developer")); //efwfmpqfs
        System.out.println(ubahHuruf("javascript")); //kbwbtdsjqu
        System.out.println(ubahHuruf("keren")); //lfsfo
        System.out.println(ubahHuruf("semangat")); //tfnbohbu
    }
}
