import java.util.Scanner;
    public class ArrayOperations {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[15];

            // Prompting the user to input the value to check
            System.out.println("PLEASE ENTER THE 15 VALUES:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // The system Output of the outcome array
            System.out.println("Array elements:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            // Search for the value
            System.out.println("\n Please Enter a Value to search:");
            int num = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    System.out.println(" THE VALUE IS FOUND IN THIS ARRAY " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(" !!!THE NUMBER IS NOT FOUND IN THIS ARRAY!!! ");
            }

            // Method for finding the Reverse and output values
            int[] reverseArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reverseArr[i] = arr[arr.length - i - 1];
            }
            System.out.println("Reverse array elements:");
            for (int i = 0; i < reverseArr.length; i++) {
                System.out.print(reverseArr[i] + " ");
            }

            // Method to get the Sum and product values
            int sum = 0;
            int product = 1;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                product *= arr[i];
            }
            System.out.println("\nSum: " + sum);
            System.out.println("Product: " + product);
        }

}