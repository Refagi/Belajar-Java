import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!");
//
//        for (int i = 0; i <= 10; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("Hello Brongz");
//        }
        Scanner sc = new Scanner(System.in);

        int Tinggi= 5;
        for (int a = Tinggi; a >= 1; a--) {
            for (int b = Tinggi; b > a; b--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}