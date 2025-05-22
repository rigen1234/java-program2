import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum\n");
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        int sum = oddToSum(num);
        System.out.println("OddSum till " + num + " is : " + sum);
    }
    public static int oddToSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
            
        }
        return sum;

    }
    
}
