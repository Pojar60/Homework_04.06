import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hi. My name Dima";
        char simbol = 'a';
        String source = "Javascript";
        String target = "Java";
        String strReverse = "Javascript";
        String myPalindrome = "level";
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Homework homework = new Homework();

        //2
        int countFinel = homework.findSymbolOccurance(string1, simbol);
        System.out.println(countFinel);

        //3
        int position = homework.findWordPosition(source, target);
        System.out.println(position);

        //4
        String reverse = homework.stringReverse(strReverse);
        System.out.println(reverse);

        //5
        boolean r = homework.isPalindrome1(myPalindrome);
        System.out.println(r);

        //6
        String x = homework.randomEquation(words);
        System.out.println(x);

    }
}
