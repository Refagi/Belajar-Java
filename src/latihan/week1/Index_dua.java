package latihan.week1;

import java.util.Arrays;

public class Index_dua {
    public static void main(String[] str){

        WordsJava test = new WordsJava();
        test.result1();

        WordsArrayjava test2 = new WordsArrayjava();
        test2.result2();

        WordsJavaSubstr test3 = new WordsJavaSubstr();
        test3.result3();
    }

    static  class WordsJava{
        public void result1(){
            String word, second, third, fourth, fifth, sixth, seventh;
            word = "Java";
            second = "is";
            third = "awesome";
            fourth = "and";
            fifth = "i";
            sixth = "love";
            seventh = "it!";

            System.out.println(word+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh);
        }
    }

    static class WordsArrayjava{
        public void result2(){
            String word[] = {"w","o","w","j","a","v","a","i","s","s","o","c","o","o","l"};
            String firstWord, secondWord, thirdWord, fourthWord, fifthWord;
            firstWord = word[0] + word[1] + word[2];
            secondWord = word[3] + word[4] + word[5] + word[6];
            thirdWord = word[7] + word[8];
            fourthWord = word[9] + word[10];
            fifthWord = word[11] + word[12] + word[13] + word[14];

            System.out.println(firstWord+" "+secondWord+" "+thirdWord+" "+fourthWord+" "+fifthWord);
        }
    }

    static  class WordsJavaSubstr{
        public void result3(){
            String word = "wow java is so cool";
            String firstWord, secondWord, thirdWord, fourthWord, fifthWord;
            firstWord = word.substring(0, 3);
            secondWord = word.substring(4, 8);
            thirdWord = word.substring(9, 11);
            fourthWord = word.substring(12, 14);
            fifthWord = word.substring(15, 19);
            System.out.println(firstWord+" "+secondWord+" "+thirdWord+" "+ fourthWord+" "+fifthWord);
            System.out.println("First Word: " + firstWord + ", with length: " + firstWord.length());
            System.out.println("Second Word: " + secondWord + ", with length: " + secondWord.length());
            System.out.println("Third Word: " + thirdWord + ", with length: " + thirdWord.length());
            System.out.println("Fourth Word: " + fourthWord + ", with length: " + fourthWord.length());
            System.out.println("Fifth Word: " + fifthWord + ", with length: " + fifthWord.length());

        }
    }
}
