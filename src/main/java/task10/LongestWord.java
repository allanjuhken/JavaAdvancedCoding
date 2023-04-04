package task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        List<String> words = readWords();

        String longest = findLongest(words,word -> word.length()); // sama mis String::length

        System.out.println(longest);
    }

    private static List<String> readWords(){
        // initialize scanner
        Scanner sc = new Scanner(System.in);
        // initialize result
        List<String> words = new ArrayList<>();

        System.out.println("Enter words(one per line, enter an empty line to stop)");

        // infinite loop
        while (true){
            String line = sc.nextLine();
            if (line.isEmpty()){
                break;
            }
            words.add(line);
        }
        return words;
    }

    // Generics find longest method
    private static <T> T findLongest(List<T> list, LengthFunction<T> function){
        // the T represents the type you are expecting

        // the placeholder for the potential longest value
        T longest = null;

        // placeholder for potential length of the above
        int maxLength = 0;

        // foreach loop to find the longest value
        for (T element : list){
            int length = function.getLength(element);
            if (length > maxLength){
                longest = element;
                maxLength = length;
            }
        }
        return longest;
    }
}
