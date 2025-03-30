import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello! Which task do you want to see?");
        System.out.print("Input: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Problem 1. The minimum number of array");
                System.out.print("Input length of array: ");
                int length = input.nextInt();
                System.out.println("Input array elements: ");
                int[] array = new int[length];
                for (int i = 0; i < length; i++) {
                    array[i] = input.nextInt();
                }
                double startTime = System.nanoTime();
                System.out.println("The minimum number of array: " + printMIN(length, array));
                double endTime = System.nanoTime();
                double duration = (endTime - startTime) / 1000000;
                System.out.println("Time taken: " + duration + "milliseconds");
                break;
            case 2:
                System.out.println("Problem 2. The average of array");
                System.out.print("Input length of array: ");
                length = input.nextInt();
                System.out.println("Input array elements: ");
                int[] array2 = new int[length];
                for (int i = 0; i < length; i++) {
                    array2[i] = input.nextInt();
                }
                double startTime2 = System.nanoTime();
                System.out.println("The average of array: " + printAVG(length, array2));
                double endTime2 = System.nanoTime();
                double duration2 = (endTime2 - startTime2) / 1000000;
                System.out.println("Time taken: " + duration2 + "milliseconds");
                break;
            case 3:
                System.out.println("Problem 3. Check whether given number is prime or composite");
                System.out.print("Input number: ");
                int number = input.nextInt();
                double startTime3= System.nanoTime();
                System.out.println("The given number is: " + isItPrime(number));
                double endTime3= System.nanoTime();
                double duration3 = (endTime3 - startTime3) / 1000000;
                System.out.println("Time taken: " + duration3 + "milliseconds");
                break;
            case 4:
                System.out.println("Problem 4. Finding factorial of given number");
                System.out.print("Input number: ");
                int number2 = input.nextInt();
                double startTime4= System.nanoTime();
                System.out.println("The factorial of " + number2 + " is: " + facto(number2));
                double endTime4= System.nanoTime();
                double duration4 = (endTime4 - startTime4) / 1000000;
                System.out.println("Time taken: " + duration4 + "milliseconds");
                break;
            case 5:
                System.out.println("Problem 5. n-th element in Fibonacci sequence");
                System.out.print("Input n-th order : ");
                int number3 = input.nextInt();
                double startTime5= System.nanoTime();
                System.out.println("The " + number3 + "-th element in Fibonacci sequence is: " + fibb(number3));
                double endTime5= System.nanoTime();
                double duration5 = (endTime5 - startTime5) / 1000000;
                System.out.println("Time taken: " + duration5 + "milliseconds");
                break;
            case 6:
                System.out.println("Problem 6. a^n");
                System.out.print("Input a: ");
                int a = input.nextInt();
                System.out.print("Input n: ");
                int n = input.nextInt();
                double startTime6= System.nanoTime();
                System.out.println(a + " to the power of " + n + ": " + aPowerOfn(a, n));
                double endTime6= System.nanoTime();
                double duration6 = (endTime6 - startTime6) / 1000000;
                System.out.println("Time taken: " + duration6 + "milliseconds");
                break;
            case 7:
                System.out.println("Problem 7. Reverse order of given array");
                System.out.print("Input length of array: ");
                int length2 = input.nextInt();
                System.out.println("Input array elements: ");
                double startTime7= System.nanoTime();
                printReverse(length2, new Scanner(System.in));
                double endTime7= System.nanoTime();
                double duration7 = (endTime7 - startTime7) / 1000000;
                System.out.println("\nTime taken: " + duration7 + "milliseconds");
                break;
        }


    }






    /**
     * This method gives reverse order version of given an array of n elements
     * It uses a recursive approach
     * Time complexity: O(n), where n is number of elements of array
     *
     * @param n Number of elements of given array
     * @param scanner Scanner, to scan input elements of array
     */
    public static void printReverse(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int a = scanner.nextInt();
        printReverse(n - 1, scanner);
        System.out.print(a + " ");
    }



    /**
     * This method returns 2^10
     * It is a convenience method that internally calls aPowerOfn(int a, int n) method
     *
     * @return 2^10
     */
    public static int aPowerOfn() {
        return aPowerOfn(2,10);
    }

    /**
     * The method calculates a to the power of n: a^n
     * It uses a recursive approach
     * Time complexity: O(n), where n is a given power
     * The method breaks down the task into smaller tasks: a^n = a*a^(n-1),
     * a^(n-1) = a*a*a(n-2), and so on, when it comes a^1 where n==1, it returns a
     *
     * @param a The number which will be calculated its n power
     * @param n Power of the a
     * @return The a to the power of n
     */
    public static int aPowerOfn(int a, int n) {
        if (n==1) {return a;}
        else {return a * aPowerOfn(a, n-1);}
    }



    /**
     * This function gives 17-th element in Fibonacci sequence
     * It is a convenience method that internally calls fibb(int n) method
     *
     * @return Element which is in 17-th position in Fibonacci sequence
     */
    public static int fibb() {
        return fibb(17);
    }

    /**
     * This function n-th element in Fibonacci sequence
     * It uses a recursive approach
     * Time complexity: O(2^n), where n is a given number
     * The method breaks down the task into smaller tasks: fibb(n) = fibb(n-1) + fibb(n-2),
     * fibb(n-1) = fibb(n-2) + fibb(n-3) and so on,
     * everytime there is block fibb(0) or fibb(1) in STACK, it returns 0 or 1 respectively
     *
     * @param n n-th position in Fibonacci sequence which will be calculated
     * @return n-th element in the Fibonacci sequence
     */
    public static int fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else return fibb(n - 1) + fibb(n - 2);
    }




    /**
     * This method calculates factorial of 7
     *It is a convenience method that internally calls the facto(int n) method with default value of 7
     *
     * @return Factorial of 7
     */
    public static int facto() {
        return facto(7);
    }

    /**
     * This method calculates factorial of a given number
     * It uses a recursive approach
     * Time complexity: O(n), where n is the parameter of this function
     * This function calculates this task by dividing (divide & conquer) it into smaller parts: facto(n) = n*facto(n-1)
     *facto(n-1) = (n-1)*facto(n-2) and so on
     *
     * @param n The number that will be calculated its factorial
     * @return Factorial of n
     */
    public static int facto(int n) {
        if (n == 1) return 1;
        else return n * facto(n - 1);
    }



    /**
     * This method defines whether 7 is prime or composite
     * It is a convenience method that internally calls the isItPrime(int number) with default number of 7
     *
     * @return true
     */
    public static boolean isItPrime() {
        int number = 7;
        return isItPrime(number);
    }

    /**
     * This method returns true or false, if number is prime it returns true, if it is not - false
     * This method uses conditions and for loop
     * Time complexity: O(n-2), where n is the given positive number
     * The condition will check if the positive number can be divided by any number in interval 2 to number-1,
     * if it can be divided without remainder, it is not prime number, it is composite
     *
     * @param number The positive number that either prime or composite
     * @return true or false, true - prime, false - composite
     */
    public static boolean isItPrime(int number) {
        boolean isPrime = true;
        if (number == 1) {isPrime = false;}
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {isPrime = false;}
        }
        return isPrime;
    }


    /**
     * This method returns the average of {3,2,4,1} : 2.5
     * It is a convenience method that internally calls the printAVG(int length, int[] arr) with default length of {3,2,4,1} which is 4
     *
     * @return Average of {3,2,4,1} : 2.5
     */
    public static double printAVG() {
        int[] array = {3,2,4,1};
        int length = 4;
        return printAVG(length, array);
    }

    /**
     * This method returns the minimum value of array
     * It uses iteration approach: for loop
     * Time complexity: O(n) where n is length of array
     * It calculates sum of elements in array and divide sum by length of the array
     *
     * @param length The length of the array
     * @param arr Array of numbers which its average will be calculated
     * @return The average of array
     */
    public static double printAVG(int length, int[] arr) {
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum / length;
    }



    /**
     * This method returns the minimum element of {10,1,32,3,45} : 1
     * It is a convenience method that internally calls the printMIN(int length, int[] arr) with default length of {10,1,32,3,45} which is 5
     *
     * @return Minimum value of {10,1,32,3,45} : 1
     */

    public static int printMIN() {
        int[] arr = {10,1,32,3,45};
        int len = 5;
        return printMIN(len, arr);
    }

    /**
     * This method returns the minimum value of array
     * It uses iteration approach
     * Time complexity: O(n-1), where n is length of the array
     * It takes the first element of array as minimum value then iteration compares it with other elements of array,
     * if any element of array is less than minimum, then this element will be taken as min value
     *
     * @param length The length of the array
     * @param arr Array of numbers which min value will be calculated
     * @return The minimum value of an array
     */
    public static int printMIN(int length ,int[] arr) {
        int min = arr[0];
        for (int i = 1; i < length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
