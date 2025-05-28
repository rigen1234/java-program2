import java.util.Scanner;

public class ReverseDigits { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Reverse Digits");
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("The Reverse of Digits is : " + reverse);

    }
    public static int reverse(int num){
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
            
        }
        return newNum;
    }
    
}
