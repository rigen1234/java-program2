import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even checker");
        System.out.print("Please,enter a number : ");
        int num = input.nextInt();
        
        if(num % 2 == 1){
            System.out.println("Your number is Odd");
        }else if (num == 0){
            System.out.println("Your number is Zero");
        }else{
            System.out.println("Your number is Even");
        }
    }
    
}
