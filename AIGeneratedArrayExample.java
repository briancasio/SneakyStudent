import java.util.Arrays;

public class AIGeneratedArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Reverse the sorted array
        reverseArray(numbers);
        System.out.println("Reversed array: " + Arrays.toString(numbers));

        // Find the maximum and minimum values
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
