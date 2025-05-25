import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sum Of Digits/n");
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum Of Digits is : " + sum);


    }
    public static int sumOfDigits(int num){
          int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
            
        }
        return sum;
    }
    
}
