
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    //2
   public int findSymbolOccurance(String string1, char simbol){
    char[] result = string1.toCharArray();
    int count = 0;
    for(int i = 0; i <result.length ; i++){
        if(result[i] == simbol){
            count++;
        }
    }

       return count;
   }

    //3
   public int findWordPosition(String source, String target){
       int position1 = source.indexOf(target);
       return position1;
   }

   //4
   public String stringReverse(String strReverse){
       StringBuilder stringBuilder = new StringBuilder(strReverse).reverse();
       return stringBuilder.toString();
   }

   //5
   public boolean isPalindrome1(String myPalindrome){
       String result = myPalindrome.replaceAll("[\\s\\p{Punct}]", "");
       StringBuilder stringBuilder = new StringBuilder(result).reverse();
       String reversedPalindrome = stringBuilder.toString();
       boolean isPalindrome = result.equals(reversedPalindrome);
       return isPalindrome;
   }
   //6
        public String randomEquation (String[] words) {
            Random random = new Random();
            int index = random.nextInt(words.length);
            String randomValue = words[index];

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.print("Загадайте слово:  ");
                String enteredValue = sc.nextLine().toLowerCase();

                if (enteredValue.length() > randomValue.length()) {
                    enteredValue = enteredValue.substring(randomValue.length());
                }

                String result = "";

                for (int i = 0; i < 14; i++) {
                    if (i < enteredValue.length() && enteredValue.charAt(i) == randomValue.charAt(i)) {
                        result += randomValue.charAt(i);
                    } else {
                        result += "#";
                    }
                }

                System.out.println(result);

                if (enteredValue.equals(randomValue)) {
                    System.out.println("Вы угадали слово!");
                    break;
                }
            }

            return randomValue;
        }

}



