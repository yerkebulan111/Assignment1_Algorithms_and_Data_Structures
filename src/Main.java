public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = facto();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The factorial of 7 is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
    }



    /**
     * This method calculates factorial of 7
     *It is a convenience method that internally calls the facto(int n) method with default value of 7
     *
     * @return
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
