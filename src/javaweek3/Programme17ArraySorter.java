package javaweek3;

import java.util.Arrays;

/* Write a Java program to sort a numeric array and a string array.
* */
public class Programme17ArraySorter{

    public static void main(String[] args) {
        int[] numbers = { 3, 8, 10, 7, 4};
        String[] strings ={"banana","cherry","strawberry","grapes","watermelon"};

        //Sorting the numeric array
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        //Sorting the string array
        Arrays.sort(strings);
        System.out.println("Sorting strings: " + Arrays.toString(strings));
    }
}
