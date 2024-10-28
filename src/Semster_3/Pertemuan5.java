package Semster_3;

public class Pertemuan5 {
    public static void main(String[] args) {
//        Manual nomerStau = new Manual();
//        nomerStau.testManual();

//        Looping nomerDua = new Looping();
//        nomerDua.testLooping();

        LoopingManual nomerDua = new LoopingManual();
        nomerDua.testTiga();
    }

    static class Manual{
        public void testManual(){
            String dataManual[][] = new String[3][4];
            dataManual[0][0] = "1";
            dataManual[0][1] = "Agus";
            dataManual[0][2] = "1111";
            dataManual[0][3] = "TIK";
            dataManual[1][0] = "2";
            dataManual[1][1] = "Budi";
            dataManual[1][2] = "2222";
            dataManual[1][3] = "SI";
            dataManual[2][0] = "3";
            dataManual[2][1] = "Cici";
            dataManual[2][2] = "3333";
            dataManual[2][3] = "TI";

//            System.out.println(dataManual[0][0]+" "+dataManual[0][1]+" "+dataManual[0][2]+" "+dataManual[0][3]);
//            System.out.println(dataManual[1][0]+" "+dataManual[1][1]+" "+dataManual[1][2]+" "+dataManual[1][2]);
//            System.out.println(dataManual[2][0]+" "+dataManual[2][1]+" "+dataManual[2][2]+" "+dataManual[2][3]);

            System.out.println(dataManual[2][0]+" "+dataManual[2][1]+" "+dataManual[2][2]+" "+dataManual[2][3]);
            System.out.println(dataManual[1][0]+" "+dataManual[1][1]+" "+dataManual[1][2]+" "+dataManual[1][3]);
            System.out.println(dataManual[0][0]+" "+dataManual[2][1]+" "+dataManual[2][2]+" "+dataManual[2][3]);
        }
    }

    static class Looping{
        public void testLooping(){
            String data[][] = {
                    {"1", "1111", "Agus", "TIK"},
                    {"2", "2222", "Budi", "SI"},
                    {"3", "3333", "Cici", "TI"},
            };
//            mundur
            for(var i = data.length - 1; i >= 0; i--){
                for(var j = 0; j <= data.length; j++){
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();
            }

//            maju
            for(var i = 0; i < data.length; i++){
                for(var j = 0; j <= data.length; j++){
                    System.out.print(data[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    static class LoopingManual{
        public void testTiga(){
            String data[][] = {
                    {"1", "1111", "Agus", "TIK"},
                    {"2", "2222", "Budi", "SI"},
                    {"3", "3333", "Cici", "TI"},
            };

            //maju
            for(var i = 0; i < data.length; i++){
                System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+data[i][3]);
            }

            System.out.print("\n");

            for(var i = data.length - 1; i >= 0; i--){
                System.out.println(data[i][0]+" "+data[i][1]+" "+data[i][2]+" "+data[i][3]);
            }
        }
    }
}
