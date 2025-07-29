import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and Average calculation");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = avg(numArray);
        System.out.println("Sum of the number is : " + sum);
        System.out.println("Average of the number is : " + avg);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public  static double avg(int[] numArray){
        double sum = sum(numArray);
        return (sum / numArray.length);
    }
}
