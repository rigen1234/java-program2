import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of element : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Please enter element number no " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
