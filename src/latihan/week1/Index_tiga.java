package latihan.week1;

public class Index_tiga {
    public static void main(String[] str){
        Problem1 test1 = new Problem1();
        test1.result1();

        Problem2 test2 = new Problem2();
        test2.result2();

        Problem3 test3 = new Problem3();
        test3.result3();

        Problem4 test4 = new Problem4();
        test4.result4();
    }
    static class Problem1{
        public void result1(){
            int i = 0;
            int j = 10;
            while(i < 10){
                System.out.println("Looping naik " + i);
                i++;
            }
            System.out.println();
            while(j > 0){
                System.out.println("Looping turun " + j);
                j--;
            }
        }
    }

    static class Problem2{
        public void result2(){
            for(int i = 0; i < 10; i++){
                System.out.println("Looping naik " + i);
            }

            System.out.println();

            for(int j = 10; j > 0; j--){
                System.out.println("Looping turun " + j);
            }
        }
    }

    static class Problem3{
        public void result3(){
            int i = 1;
            while (i <= 10){
                if(i % 2 == 0){
                    System.out.println(i + " merupakan genap");
                }else {
                    System.out.println(i + " merupakan ganjil");
                }
                i++;
            }
            System.out.println();
            for(int j = 1; j <= 10; j++){
                if(j % 2 == 0){
                    System.out.println(j + " merupakan genap");
                }else {
                    System.out.println(j + " merupakan ganjil");
                }
            }
        }
    }

    static class Problem4{
        public void result4(){
            for(int i = 1; i <= 100; i += 2){
                if(i % 3 == 0){
                    System.out.println( i + " kelipatan 3 dengan pertambahan 2");
                }
            }
            System.out.println();
            for(int j = 1; j <= 100; j += 5){
                if(j % 6 == 0){
                    System.out.println( j + " kelipatan 6 dengan pertambahan 5");
                }
            }
            System.out.println();
            for(int h = 1; h <= 100; h += 9){
                if(h % 10 == 0){
                    System.out.println(h + " kelipatan 10 dengan pertambahan 9");
                }
            }
        }
    }
}
