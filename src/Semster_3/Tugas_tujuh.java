package Semster_3;

public class Tugas_tujuh {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumFromOne(1));
        System.out.println(sumFromFive(5));
    }

    public static int factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }

    public static int sumFromOne(int num) {
        if (num == 10) return num;
        return sumFromOne(num + 1) + num;
    }

    public static int sumFromFive(int num) {
        if (num == 10) return num;
        return sumFromFive(num + 1) + num;
    }
}
