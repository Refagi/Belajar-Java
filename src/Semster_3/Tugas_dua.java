package Semster_3;
public class Tugas_dua {
    public static void  main(String [] args){
        name change = new name();
        change.changeName();

        palindrom chek = new palindrom();
        chek.result1();
    }

    static class palindrom {
        public void result1(){
            String a [] = {"m", "o", "m"};
            String result1 = "" ;
            String result2 = "" ;

            for(int j = a.length - 1; j >= 0; j--){
                result1 += a[j];
            }
            for(int j = 0; j < a.length; j++){
                result2 += a[j];
            }

            if(result1.equalsIgnoreCase(result2)){
                System.out.println("Kata "+result2+" Merupakan Palindrom");
            } else  {
                System.out.println("Kata "+result2+" Bukan Palindrom");
            }
        }
    }

     static class name {
        public void changeName(){
            String b [] = {"r", "e", "n", "o"};
            String result1 = "";
            String result2 = "";

            for(int j = b.length - 1; j >= 0; j--){
                result1 += b[j];
            }

            for(int i = 0; i < b.length; i++){
                result2 += b[i];
            }

            if(result1.equalsIgnoreCase(result2)){
                System.out.println("nama "+result2+" merupakan Palindrom");
            } else  {
                System.out.println("nama "+result2+" bukan Palindrom");
            }
        }
    }
}
