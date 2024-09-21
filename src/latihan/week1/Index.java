package latihan.week1;
import java.util.Scanner;
public class Index {
    public static void main(String[] str){
        Proxytia test1 = new Proxytia();
        test1.testResultOne();

        guessMonth test2 = new guessMonth();
        test2.testResultTwo();
    }

    static class Proxytia{
        public void testResultOne(){
            Scanner str = new Scanner(System.in);
//            String name = "", role = "";
            System.out.print("Your name: ");
            String name = str.nextLine();
            System.out.print("Your Role: ");
            String role = str.nextLine();

            if(name.equals("")){
                System.out.println("name should to fill");
            }else {
                if(role.equals("")){
                    System.out.println(name + " choose your role to start the game");
                } else if (role.equalsIgnoreCase("Ksatria")) {
                    System.out.println("Hello " + role +" "+ name + " you can attack with your weapon");
                } else if (role.equalsIgnoreCase("Tabib")) {
                    System.out.println("Hello " + role +" "+ name + " you will help your injured freind");
                } else if (role.equalsIgnoreCase("Penyihir")) {
                    System.out.println("Hello " + role +" "+ name + " Create a miracle of the your win");
                } else {
                    System.out.println("you are the bot!, because the role of your choose not found");
                }
            }
        }
    }

    static class guessMonth{
        public void testResultTwo(){
            Scanner format = new Scanner(System.in);
            System.out.print("date: ");
            int date = format.nextInt();
            System.out.print("month: ");
            int month = format.nextInt();
            System.out.print("year: ");
            long year = format.nextLong();

            if(date >= 1 && date <= 31 && year >= 1900 && year <= 2500){
                switch (month){
                    case 1: System.out.println("January");
                    break;
                    case 2: System.out.println("February");
                    break;
                    case 3: System.out.println("March");
                    break;
                    case 4: System.out.println("April");
                    break;
                    case 5: System.out.println("Mei");
                    break;
                    case 6: System.out.println("June");
                    break;
                    case 7: System.out.println("July");
                    break;
                    case 8: System.out.println("August");
                    break;
                    case 9: System.out.println("September");
                    break;
                    case 10: System.out.println("October");
                    break;
                    case 11: System.out.println("November");
                    break;
                    case 12: System.out.println("December");
                    break;
                    default: System.out.println("The mounth not found!");
                }
            }
        }
    }
}
