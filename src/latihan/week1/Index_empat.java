package latihan.week1;

public class Index_empat {
    public String shoutOut(){
        return "Halo Function!";
    }

    public int calculateMultiply(int num1, int num2){
        return num1 * num2;
    }

    public String processSentence(String name, int age, String address, String hobby){
         return "Nama saya "+name+", umur saya "+age+" tahun, "+" alamat saya di "+address+
                 ", dan saya punya hobby yaitu "+hobby;
    }

    public static void main(String[] args) {
        Index_empat obj = new Index_empat();

        String result1 = obj.shoutOut();
        int result2 = obj.calculateMultiply(8, 5);
        String result3 = obj.processSentence("Agus", 30, "Jln. Malioboro, Yogjakarta","gaming!");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
