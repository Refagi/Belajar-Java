package latihan.week2;
import java.util.ArrayList;
import java.util.Arrays;

public class Index_empat {
    public static int cariMean(int num[]){
        int count = 0;
        for(int i = 0; i < num.length; i++){
            count += num[i];
        }
        float result = (float) count / num.length; //ubah dulu ke double
        return (int) Math.ceil(result); //ubah lagi ke int (bil bulat)
    }

    public static ArrayList<Integer> perkalianUnix(int num[]){
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(new Integer[num.length]));
        //membuat array di dalam list / ArrayList dengan batas sesuai panjang array inputan

        int count = 1;
        result.set(0, 1); //tetapkan index 0 diArrayList menjadi 1
        for(int i = 1; i < num.length; i++){
            result.set(i, result.get(i - 1) * num[i - 1]);
        }

        for(int j = num.length - 1; j >= 1; j--){
            result.set(j, result.get(j) * count);
            count *= num[j];
        }
        return result;
    }

    public static Boolean tentukanDeretAritmatika(int num[]){
        if (num.length < 2) return true;
        int count = num[1] - num[0];
        for(int i = 1; i < num.length; i++){
            int result = num[i] - num[i - 1];
            if(result != count){
                return false;
            }
        }
        return true;
    }

    public static Boolean tentukanDeretGeometri(int num[]){
        if(num.length < 2) return true;

        int count = num[1] / num[0];
        for(int i = 1; i < num.length; i++){
            int result = num[i] / num[i - 1];
            if(result != count){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        Index_empat obj = new Index_empat();

//        case 1
        System.out.println(cariMean(new int[]{1, 2, 3, 4, 5})); //3
        System.out.println(cariMean(new int[]{3, 5, 7, 5, 3})); //5
        System.out.println(cariMean(new int[]{6, 5, 4, 7, 3})); //5
        System.out.println(cariMean(new int[]{1, 3, 3})); //2
        System.out.println(cariMean(new int[]{7, 7, 7, 7, 7})); //7

//        case 2
        System.out.println(perkalianUnix(new int[]{2, 4, 6})); // [24, 12, 8]
        System.out.println(perkalianUnix(new int[]{1, 2, 3, 4, 5})); // [120, 60, 40, 30, 24]
        System.out.println(perkalianUnix(new int[]{1, 4, 3, 2, 5})); // [120, 30, 40, 60, 24]
        System.out.println(perkalianUnix(new int[]{1, 3, 3, 1})); // [9, 3, 3, 9]
        System.out.println(perkalianUnix(new int[]{2, 1, 8, 10, 2})); // [160, 320, 40, 32, 160]

//        case 3
        System.out.println(tentukanDeretAritmatika(new int[]{1, 2, 3, 4, 5, 6})); // true
        System.out.println(tentukanDeretAritmatika(new int[]{2, 4, 6, 12, 24})); // false
        System.out.println(tentukanDeretAritmatika(new int[]{2, 4, 6, 8})); // true
        System.out.println(tentukanDeretAritmatika(new int[]{2, 6, 18, 54})); // false
        System.out.println(tentukanDeretAritmatika(new int[]{1, 2, 3, 4, 7, 9})); // false
        System.out.println(tentukanDeretAritmatika(new int[]{1, 4, 7, 10, 13})); // false

        //case4
        System.out.println(tentukanDeretGeometri(new int[]{1, 3, 9, 27, 81})); // true
        System.out.println(tentukanDeretGeometri(new int[]{2, 4, 8, 16, 32})); // true
        System.out.println(tentukanDeretGeometri(new int[]{2, 4, 6, 8})); // false
        System.out.println(tentukanDeretGeometri(new int[]{2, 6, 18, 54})); // true
        System.out.println(tentukanDeretGeometri(new int[]{1, 2, 3, 4, 7, 9})); // false
    }
}
