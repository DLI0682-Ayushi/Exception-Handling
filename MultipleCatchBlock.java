import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number: ");
        int num2 = sc.nextInt();
    try{
         int result = num1 / num2;
         System.out.println(result);
        }
        catch(ArithmeticException e){
    System.out.println("division with zero not allowed");
        } catch(InputMismatchException e){
    System.out.println("wrong input provided");
            }
    }
}
