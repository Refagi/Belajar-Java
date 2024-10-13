package Pzn.OOP;

class Animals {
    String type;
    int ageCat;
    final String country = "Indonesia";

//    Animals(String paramType, Integer paramAge){
//        type = paramType;
//        ageCat = paramAge;
//    }

    Animals(String type, Integer ageCat){
        this.type = type;
        this.ageCat = ageCat;
    }

    void cats(String str){
        type = "Kampung"; ageCat = 8;
        System.out.println("Hallo Ini Kucing saya " + str + " Type: " + type + " Age: " + ageCat + " Asal: " + country);
    }
}
