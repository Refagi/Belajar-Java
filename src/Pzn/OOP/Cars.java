package Pzn.OOP;

class Vehicle {
    String name;

    Vehicle(String name){
        this.name = name;
    }

    String introduce(){
        return "Hello Gais";
    }

    void greet(String asal){
        System.out.println("Hallo " + this.name + " from" + asal);
    }

    void komponen(String obj){
        System.out.println("ini namanya " + obj + "di" + this.name);
    }
}

class Cars extends  Vehicle{
    Cars(String asal) {
        super(asal);
    }

    String introduce(){
        return "Hello Bro";
    }

    String parentIntroduce(){
        return super.introduce();
    }

    void greet(String name){
        System.out.println("Hallo saya berasal dari " + this.name + " Apakabar" + name);
    }

    void komponen(String obj){
        System.out.println("ini namanya " + obj + "di" + this.name);
    }


    public static void main(String[] args) {
        var objOne = new Vehicle("Cars");
        objOne.greet(" Indonesia");
        System.out.println(objOne.introduce());
        objOne.komponen("Mesin");

        var objTwo = new Cars("Jepang");
        objTwo.greet(" koko");
        System.out.println(objTwo.introduce());
        System.out.println(objTwo.parentIntroduce());

        //Pholymorpism
        Vehicle objThree = new Vehicle("Train");
        objThree.komponen("Roda");

        objThree = new Cars("Motorcycle");
        objThree.komponen("Ring");

    }
}
