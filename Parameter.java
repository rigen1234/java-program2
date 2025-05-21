public class Parameter {
    public static void main(String[] args) {
        System.out.println("The summation of number is : " + sumTwoNumber(6, 9));
        System.out.println("The summation of number is : " + sumTwoNumber(8, 7));
        System.out.println("The summation of number is : " + sumTwoNumber(2, 4));
        
    }
    public static int sumTwoNumber(int x,int y){
        System.out.println("First Number Recived : " + x);
        System.out.println("Second Number Recived :" + y);
        int sum = x + y;
        return sum;

    }
    
}
