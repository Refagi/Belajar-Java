package Pzn.TodoList;

import java.awt.*;
import java.util.ArrayList;

public class AppTodoList {
    public static ArrayList<String> model = new ArrayList<>();
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        showMenuTodoList();
    }

    public static void clearScreen() {
        // Menggunakan salah satu metode di atas, misalnya dengan ANSI escape codes:
        //bisa untuk terminal yang support ANSI escape codes
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showTodoList(){
        clearScreen();
        System.out.println("=== Data TodoList ===");
        if(model.size() < 1){
            System.out.println("Belum ada data!");
        }
        for(var i = 0; i < model.size(); i++){
            var data = model.get(i);
            var index = i + 1;

            if(data != null){
                System.out.println(index + "). "+  data);
            }
        }
        System.out.println();
    }

    public static void addTodoList(String data){
        model.add(data);
    }

    public static String removeTodoList(Integer num){
        var result = "";
        if((num) >= 1 && num < model.size() + 1){
            model.remove(num - 1);
            result += "Data no "+ (num) +" berhasil dihapus";
        } else {
            result += "Data tidak ditemukan!";
        }
        return result;
    }

    public static String inputData(String intruction){
        System.out.print(intruction + ": ");
        String data = scanner.nextLine();
        return data;
    }


    public static void showMenuTodoList(){
        clearScreen();
        while (true){
            System.out.println("===== Menu Todo List =====");
            System.out.println("=====   1. Tambah    =====");
            System.out.println("=====   2. Hapus     =====");
            System.out.println("=====   3. TodoList  =====");
            System.out.println("=====   Esc (Keluar) =====");

            var inputData = inputData("Pilihan");
            if(inputData.equalsIgnoreCase("1")){
                showAddTodoList();
            } else if (inputData.equalsIgnoreCase("2")) {
                showRemoveTodoList();
            } else if (inputData.equalsIgnoreCase("3")) {
                showTodoList();
            } else if (inputData.equalsIgnoreCase("Esc")) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
        System.out.println();
    }


    public static void showAddTodoList(){
        clearScreen();
        System.out.println("=== Menu Tambah TodoList ===");
        System.out.println("===    Esc untuk batal   ===");

        var input = inputData("Masukan Todolits");
        if(input.equalsIgnoreCase("esc")){
            showMenuTodoList();
        } else {
            addTodoList(input);
        }
    }

    public static void showRemoveTodoList(){
        clearScreen();
        System.out.println("=== Menu Hapus TodoList ===");
        System.out.println("===   Esc untuk batal   ===");

        var input = inputData("Masukan no data");
        if(input.equalsIgnoreCase("esc")){
            showMenuTodoList();
        } else {
            removeTodoList(Integer.valueOf(input));
        }
    }

}
