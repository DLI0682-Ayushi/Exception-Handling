import java.util.Scanner;
public class FinallyBlock {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a divisor of your wish: ");
        int num = sc.nextInt();
        try{
            result = 100/num;
            System.out.println("Result of your division process is: " +result);
        }catch(ArithmeticException e){
            System.out.println("Sorry division with zero not allowed");
        }
        finally{
                System.out.println("Division operation is complete, regardless of whether an exception occurred or not.\n");
        }
    }
}
