import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World\n");
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        printMultiplication(num);
    } 
    public static void printMultiplication(int num){
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + (num * i));
            i++;
            
        }
    }
    
}
