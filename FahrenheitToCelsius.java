import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Temperature converter");
        System.out.print("Enter the Temperature in F : ");
        float fah = input.nextFloat();
        
        float cel = (fah - 32) * 5 / 9;

        System.out.println("The Temperature is : " + cel + " C");
    }
}
