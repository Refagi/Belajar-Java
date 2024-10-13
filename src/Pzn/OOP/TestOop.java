package Pzn.OOP;

public class TestOop {
    public static void main(String[] args) {
        var catOne = new Animals("Zul", 10);
        var catTwo = new Animals("Blaki", 9);

        System.out.println(catOne.type+ " " + catOne.ageCat + " " + catOne.country);
        System.out.println(catTwo.type+ " " + catTwo.ageCat + " " + catTwo.country);


        catOne.cats("Mochi");
        catOne.cats("Momoy");
    }
}
