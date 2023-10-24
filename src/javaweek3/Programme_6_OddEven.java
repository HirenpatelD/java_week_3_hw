package javaweek3;

import java.util.Scanner;

/*Write a java program to input any number and find out if it’s odd or even
* */
public class Programme_6_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = scanner.nextInt();
        Programme_6_OddEven obj = new Programme_6_OddEven();
       // obj.isItEvenOrOddNumber(number);
        System.out.println(number + " is " + obj.isItEvenOrOddNumber(number) + "number");

        scanner.close();


    }
    public String isItEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "Even number";
        }else {
            return "Odd Number";
        }
    }
}
