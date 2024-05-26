import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the LCM!\n");
        System.out.print("Enter first number :");
        int first=input.nextInt();
        System.out.print("Enter second number :");
        int second=input.nextInt();
        int lcm=lcm(first, second);
        System.out.println("The lcm of the two number is :" + lcm);

    }
    public static int lcm(int first,int second){
        int i=1;
        while (i <= second) {
            int factor=first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;    
        }
        return 0;
    }
    
}
