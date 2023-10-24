package javaweek3;
/*Write a Java program to sum values of an array.
 */
public class Programme18ArraySum {

    public static void main(String[] args) {
        int[] numbers = {4, 6, 5, 7, 8};
        int sum = 0;

        //loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
