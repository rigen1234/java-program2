import java.util.Scanner;

public class GreadeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to check the Greade\n");
        System.out.print("Please,enter a number(1-100) to get Bangla subject : ");
        int bang = input.nextInt();
        System.out.print("Please,enter a number(1-100) to get English subject : ");
        int eng = input.nextInt();
        System.out.print("Please,enter a number(1-100) to get Math subject : ");
        int math = input.nextInt();
        System.out.print("Please,enter a number(1-100) to get Physics subject : ");
        int phy = input.nextInt();
        System.out.print("Please,enter a number(1-100) to get Chamistry subject : ");
        int cha = input.nextInt();
        System.out.print("Please,enter a number(1-100) to get Biology subject : ");
        int bio = input.nextInt();

        float avgMarks = (bang + eng + math + phy + cha + bio)/6;

        if(avgMarks >= 80){
            System.out.println("Your Greade is A+");
        }else if(avgMarks >=70){
            System.out.println("Your Greade is A");
        }else if(avgMarks >= 60){
            System.out.println("Your Greade is A-");
        }else if(avgMarks >= 50){
            System.out.println("Your Greade is B");
        }else if(avgMarks >= 40){
            System.out.println("Your Greade is C");
        }else{
            System.out.println("Your Greade is Fail");
        }

    }
    
}
