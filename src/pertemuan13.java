package semester2;

public class pertemuan13 {
    public static void main(String [] args){
        int npm = 3;
        npm = npm % 5;
        for (int i = 1; i <= npm; i++){
            for(int j = 1; j <= npm; j++){
                if (j < i){
                    System.out.print("0_");
                } else if(j > i){
                    System.out.print("0_");
                } else {
                    System.out.print("1_");
                }
            }
            System.out.println();
        }
    }
}
