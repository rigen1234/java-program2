import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to find : ");
        int num = input.nextInt();
        int arr = numOfOccurrences(numArr,num);
        System.out.println("Your element " + num + " was found " + arr + " times");

    }
    public static int numOfOccurrences(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;

    }
}
