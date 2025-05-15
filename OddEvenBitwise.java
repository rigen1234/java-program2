import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even calculator\n");
        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if((num & 1) == 1){
            System.out.println(num + " is a odd number");
        }else{
            System.out.println(num + " is a even number");
        }
    }
    
}
