package javaweek3;
/*Write a Java program to calculate the average value of array elements.
* */
public class Programme19ArrayAverage {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 7, 1, 8};
        int sum = 0;

        //loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];

        }
        //Calculate the average value
        double average = (double) sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

    }
}
