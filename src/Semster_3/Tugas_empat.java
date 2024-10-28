package Semster_3;

public class Tugas_empat {
    public static String testCase = "Pemrograman Java";
    public static void main(String[] args) {
//        SegitigaMengecil testOne = new SegitigaMengecil();
//        testOne.numberOne();

//        TampilString testTwo = new TampilString();
//        testTwo.numberTwo();

        SegitigaMembesar testThree = new SegitigaMembesar();
        testThree.numberThree();
    }

    static class SegitigaMengecil{
        public void numberOne(){
            for(int j = 0; j < testCase.length(); j++){
                System.out.println(testCase.substring(j));
            }
        }
    }

    static class TampilString{
        public void numberTwo(){
            var first = 0;
            for(int i = 0; i < testCase.length(); i++){
                System.out.println(testCase.substring(first, i + 1));
                first++;
            }
        }
    }
    static class SegitigaMembesar{
        public void numberThree(){
            for(int k = testCase.length() - 1; k >= 0; k--){
                System.out.println(testCase.substring(k));
            }
        }
    }
}
