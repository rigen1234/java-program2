import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Area Calculator\n");
        System.out.print("Please enter your base in cms : ");
        double base = input.nextDouble();
        System.out.print("Now,enter your perpendicular height in cms : ");
        double height = input.nextDouble();

        double area = (base * height) / 2;

        System.out.println("The area of your Triangle is : " + area + " cms2");

    }
    
}
