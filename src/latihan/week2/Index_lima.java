package latihan.week2;

import java.util.ArrayList;
import java.util.Arrays;

public class Index_lima {
    public static Integer targetTerdekat(String str[]){
        int distanceNear = Integer.MAX_VALUE; //jarak terdekat isi dengan nilai maksimum
        int distanceO = -1;
        for(int i = 0; i < str.length; i++){
            if(str[i].equalsIgnoreCase("o")){
                distanceO = i;
            }
            if(str[i].equalsIgnoreCase("x")){ //jika ketemu x langsung hitung
                int distanceX = Math.abs(i - distanceO); //hitung jarak o
                distanceNear = Math.min(distanceNear, distanceX); //lalu hitung jarak terkecil

            }
        }
        if(distanceNear == Integer.MAX_VALUE){
            return 0;
        }
        return  distanceNear;
    }

    public static ArrayList<ArrayList<Integer>> mengelompokkanAngka(int num[]){
        ArrayList<Integer> genap = new ArrayList<>();
        ArrayList<Integer> ganjil = new ArrayList<>();
        ArrayList<Integer> kelipatanTiga = new ArrayList<>();
        for(int i = 0; i < num.length; i++){
            if(num[i] % 3 == 0){
                kelipatanTiga.add(num[i]);
            } else if(num[i] % 2 == 0){
                genap.add(num[i]);
            } else {
                ganjil.add(num[i]);
            }
        }
        return new ArrayList<>(Arrays.asList(genap, ganjil, kelipatanTiga));
    }

    public static ArrayList<ArrayList<String>> groupAnimals(String[] str){
        Arrays.sort(str);
        ArrayList<String> patch = new ArrayList<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            if(i == 0){
                patch.add(str[i]);//masukan elemnt pertama sebagai acuan misal anoa
                continue;
            }
            if(str[i].charAt(0) == patch.get(0).charAt(0)){
                patch.add(str[i]); //jika element selanjutnya misal ayam (a) = anoa (a) maka masukan ke array yg sama
            }else {
                result.add(new ArrayList<>(patch));//masukan ke dalam array jika sudah se group
                patch.clear(); //perbarui array untuk mengisi group baru
                patch.add(str[i]);
            }
        }
        result.add(patch);
        return  result;
    }
    public static void main(String[] args) {
        //case 1
        System.out.println(targetTerdekat(new String[]{" ", " ", "o", " ", " ", "x", " ", "x"}));//3
        System.out.println(targetTerdekat(new String[]{"o", " ", " ", " ", "x", "x", "x"}));//4
        System.out.println(targetTerdekat(new String[]{"x", " ", " ", " ", "x", "x", "o", " "}));//1
        System.out.println(targetTerdekat(new String[]{" ", " ", "o", " "}));//0
        System.out.println(targetTerdekat(new String[]{" ", "o", " ", "x", "x", " ", " ", "x"}));//2
        System.out.println(targetTerdekat(new String[]{" ", " ", " ", " "}));//0

        //case 2
        System.out.println(mengelompokkanAngka(new int[]{2, 4, 6}));// [ [2, 4], [], [6] ]
        System.out.println(mengelompokkanAngka(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));// [ [ 2, 4, 8 ], [ 1, 5, 7 ], [ 3, 6, 9 ] ]
        System.out.println(mengelompokkanAngka(new int[]{100, 151, 122, 99, 111}));// [ [ 100, 122 ], [ 151 ], [ 99, 111 ] ]
        System.out.println(mengelompokkanAngka(new int[]{}));// [ [], [], [] ]

        //case 3
        System.out.println(groupAnimals(new String[]{"cacing", "ayam", "kuda", "anoa", "kancil", "angsa"}));
        // [[angsa, anoa, ayam], [cacing], [kancil, kuda]]
        System.out.println(groupAnimals(new String[]{"cacing", "ayam", "kuda", "anoa", "kancil", "unta", "cicak"}));
        // [[anoa, ayam], [cacing, cicak], [kancil, kuda], [unta]]
    }
}
