import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
            
        }
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        while (count < 5) {
            int num2 = input.nextInt();
            System.out.println("Your number is : " + num2);
            count++;
            
        }
    }
    
}
