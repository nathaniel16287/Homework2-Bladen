package edu.bloomu.Bladen.Homework2;

import java.util.*;

/**
 * Have the user enter a string and then sort the words of each string by last letter
 *
 * test String
 * I have the death sentence on tweleve systems
 * Sentence the have twelve death systems
 * @author Nathaniel Bladen
 */
public class Colexical {
    public static void main(String[] args) {
        //StringBuilder[] stringBuilder = new StringBuilder[100];
        System.out.print("Enter a line of text: ");
        Scanner in = new Scanner(System.in);
        String[] test = in.nextLine().split(" ");
        Arrays.sort(test, new MyComparator());

        for (String w : test){
            System.out.println(w.toUpperCase(Locale.ROOT) + " ");
        }
    }
}
class MyComparator implements Comparator<String>{
    /**
     * Takes the string that was entered and broken down and converts them to upper.
     * Then applies a search and comapares the last letter one word versus the other
     * and if the last letter matches it will go to the second to last letter.
     *
     */
    @Override
    public int compare(String s1, String s2) {
        String toUpper1 = s1.toUpperCase();
        String toUpper2 = s2.toUpperCase();
        for (int i = 1; i <= Math.min(toUpper1.length(), toUpper2.length()); i++){
            if (toUpper1.charAt(toUpper1.length()-i) != toUpper2.charAt(toUpper2.length()-i)){
                return toUpper1.charAt(toUpper1.length()-i) - toUpper2.charAt(toUpper2.length()-i);
            }
        }
        return 0;
    }

}


