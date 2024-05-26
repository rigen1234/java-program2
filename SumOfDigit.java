import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to the Sum of Digits!\n\n");
        System.out.print("Enter any number :");
        int num=input.nextInt();
        int sum=sumOfDigit(num);
        System.out.println("The answer is :" + sum);

    }
    public static int sumOfDigit(int num){
        int sum=0;
        while (num > 0) {
            sum += num % 10;
            num /=10;
            
        }
        return sum;
    }
}
    
