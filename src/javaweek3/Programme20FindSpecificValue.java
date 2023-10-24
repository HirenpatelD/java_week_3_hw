package javaweek3;
/*. Write a Java program to test if an array contains a specific value.
* */
public class Programme20FindSpecificValue {

    public static void main(String[] args) {
        int [] userInput = {10, 20, 30, 40, 50};
        int specificElement = 30;
        Programme20FindSpecificValue.getSpecificElement(userInput, specificElement);
    }

    public static void getSpecificElement(int[] userInput, int specificElement) {

        int[] input = userInput;
        int element = specificElement;

        for (int i = 0; i < input.length; i++) {
            //System.out.println(" + input[i];

            if (input[i] == element) {
                System.out.println("Yes");

            }
        }
    }
}

