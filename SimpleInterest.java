import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Simple Interest Calculator\n");
        System.out.print("Please enter your principle amount Tk : ");
        int principle = input.nextInt();
        System.out.print("Now,tell me your rate of Interest : ");
        float rate = input.nextFloat();
        System.out.print("Now,tell me for how many years are you borrowing this money : ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        
        System.out.println("\n Your Simple Interest is : " + interest + " TK");
        
    }
    
}
