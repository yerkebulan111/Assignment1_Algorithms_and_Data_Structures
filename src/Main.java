public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        double result = printAVG();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The average of {3,2,4,1} is: " + result);
        System.out.println("Time taken: " + duration + "milliseconds");
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
