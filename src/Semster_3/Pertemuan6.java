package Semster_3;

public class Pertemuan6 {
    public static void main(String[] args) {
        PalindromeOne numberOne = new PalindromeOne();
        numberOne.test1();
    }

    static class PalindromeOne{
        public void test1(){
            String kalimat1 = "Katak";

            var change = kalimat1.toUpperCase();

            var result = "";
            for(int i = change.length() - 1; i >= 0; i--){
                result += change.charAt(i);
            }
            if(result.equals(change)){
             System.out.println(change +" "+ true + " adalah palindrom");
            } else  {
                System.out.println(change +" "+ false + " bukan merupakan palindrom");
            }
        }
    }
}
