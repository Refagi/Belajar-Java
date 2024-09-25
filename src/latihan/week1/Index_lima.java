package latihan.week1;

public class Index_lima {
   public String bandingAngka(int angka1, int angka2){
       if (angka1 == angka2 || angka2 == angka1){
           return "-1";
       }
       if(angka2 > angka1 || angka1 < angka2){
           return "true";
       } else {
           return "false";
       }
   }

   public Boolean xo(String str){
       int X = 0; int O = 0;
       for(int i = 0; i < str.length(); i++){
           String changeStr = str.toLowerCase();
           char currentStr = changeStr.charAt(i);
           if (currentStr == 'x') {
               X++;
           } else if (currentStr == 'o') {
               O++;
           }
       }
      return X == O;
   }

   public String balikKata(String str){
       String currentStr = "";
       for(int i = str.length() - 1; i >= 0 ; i--){
           currentStr += str.charAt(i);
       }
       return  currentStr;
   }

   public String konversiMenit(int num){
       int menit = num % 60;
       int jam = num / 60;
       if(menit < 10){
           return jam+":0"+menit;
       } else {
           return jam +":"+menit;
       }
   }

    public static void main(String[] str){
       Index_lima obj = new Index_lima();

        System.out.println(obj.bandingAngka(5, 8));//true
        System.out.println(obj.bandingAngka(5, 3));//false
        System.out.println(obj.bandingAngka(4, 4));//-1
        System.out.println(obj.bandingAngka(3, 3));//-1
        System.out.println(obj.bandingAngka(17, 2));//false

        System.out.println(obj.xo("xoxoxo")); //true
        System.out.println(obj.xo("oxooxo"));//false
        System.out.println(obj.xo("oxo"));//false
        System.out.println(obj.xo("xxxooo"));//true
        System.out.println(obj.xo("xoxooxxo"));//true
        System.out.println(obj.xo("awokawok"));//false

        System.out.println(obj.balikKata("Hello World and Coders")); //sredoC dna dlroW olleH
        System.out.println(obj.balikKata("John Doe")); // eoD nhoJ
        System.out.println(obj.balikKata("I am a bookworm")); // mrowkoob a ma I
        System.out.println(obj.balikKata("Coding is my hobby")); // ybboh ym si gnidoC
        System.out.println(obj.balikKata("Super")); // repuS

        System.out.println(obj.konversiMenit(63)); //1:03
        System.out.println(obj.konversiMenit(124)); //2:04
        System.out.println(obj.konversiMenit(53)); //0:53
        System.out.println(obj.konversiMenit(88)); //1:28
        System.out.println(obj.konversiMenit(120)); //2:00

    }
}
