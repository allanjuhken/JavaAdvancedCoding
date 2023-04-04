package task8;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    //Scanner sc = new Scanner(System.in);
    private static final String[] charCategories = new String[]{
            "abcdefghijklmnopqrstuvwxyz",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
            "0123456789"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the length of password to generate: ");
        int length = sc.nextInt();
        String password = generatePassword(length);
        System.out.println("Your generated password is: " + password);
    }

    private static String generatePassword(int length) {
        //System.out.println("What's the length of password to generate: ");
        //int length = sc.nextInt();
        StringBuilder password = new StringBuilder(length);
        Random random = new Random();


        for (int i = 0; i < length; i++) {
            String charCategory = charCategories[random.nextInt(charCategories.length)];
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return String.valueOf(password);
    }
}

//    String password = new Random().ints(10, 33, 123)
//            .collect(StringBuilder::new,
//                    StringBuilder::appendCodePoint, StringBuilder::append)
//            .toString();

