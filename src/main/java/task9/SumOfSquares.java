package task9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfSquares {
    public static void main(String[] args) {

        List<Integer> squares = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = 0;

        for (Integer number : squares) {
            int square = number * number;
            sum += square;
        }
        System.out.println(sum);


        // õpetaja versioon
//        int sum = IntStream
//                .rangeClosed(1, 10)
//                .map(x -> x * x)
//                .reduce(0, Integer::sum);
//        System.out.println("Sum of squares of 1-10: " + sum);
    }
}
