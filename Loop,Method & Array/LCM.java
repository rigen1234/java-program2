import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator/n");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of number is : " + lcm);

    }
    public static int lcm(int first,int second){
        int i = 1;
        while (i <= first){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
         return 0;
    }
   
    
}
