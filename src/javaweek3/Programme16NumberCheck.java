package javaweek3;

import java.util.Scanner;

/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
*/
public class Programme16NumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = scanner.nextDouble();
        scanner.close();

        if (number > 0) {
            System.out.println("Possitive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("Zero");
        }
    }
}









