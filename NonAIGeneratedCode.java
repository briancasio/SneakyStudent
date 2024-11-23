import java.util.Scanner;

public class NonAIGeneratedCode{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of the numbers: " + sum);
        
        double average = (double) sum / size;
        System.out.println("Average of the numbers: " + average);
        
        int largest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
        
        int smallest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number: " + smallest);
        
    }
}
