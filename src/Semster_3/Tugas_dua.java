package Semster_3;

public class Tugas_dua {
    public static void  main(String [] args){
        //outputnya: 1. reno pake looping
        //outputnya: 2. oner pake looping
        //outputnya: 3. makam palindrom atau bukan

        name change = new name();
        change.changeName();

        palindrom chek = new palindrom();
        chek.result1();
    }

    static class palindrom {
        public void result1(){
            String a [] = {"m", "o", "m"};
            String change = String.join("", a); //mengubah array mnjadi string
            String result = "" ;
            System.out.println(change);

            for(int j = a.length - 1; j >= 0; j--){
                result += a[j];
            }
            if(result.equalsIgnoreCase(change)){
                System.out.println("Merupakan Palindrom");
            } else  {
                System.out.println("Bukan Palindrom");
            }
        }
    }


     static class name {
        public void changeName(){
            String b [] = {"r", "e", "n", "o"};
            String name1 = "";
            String name2 = "";

            for(int i = 0; i < b.length; i++){
                name1 += b[i];
            }
            for(int j = b.length - 1; j >= 0; j--){
                name2 += b[j];
            }

            System.out.println("nama: " + name1 +"\n"+"dibalik: " + name2);
        }
    }
}
