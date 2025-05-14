import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Greatest of Three Number");
        System.out.print("Please,enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Now,enter 2nd number : ");
        int num2 = input.nextInt();
        System.out.print("Now,enter 3rd number : ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is Greater than " + num2 + "," + num3);
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is Greater than " + num1 + "," + num3);
        }else{
             System.out.println(num3 + " is Greater than " + num1 + "," + num2);
        }
    }
    
}
