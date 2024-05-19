import java.util.Scanner;
public class UserInput{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=input.nextLine();
		System.out.println(name +",Please tell me your age");
		int age=input.nextInt();
		System.out.println(name +" age is "+ age);
}
}