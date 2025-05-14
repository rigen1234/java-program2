import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Number checker\n");
        System.out.print("Please,enter a number : ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Your number is a Positive Number");
        }else if(num < 0){
            System.out.println("Your number is a Negative Number");
        }else{
            System.out.println("Your number is Zero");
        }
    }
    
}
