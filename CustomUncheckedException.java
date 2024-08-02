import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
public class CustomUncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        try{
            if (number < 0) {
                throw new NegativeNumberException("oops!!!! You entered a Negative number");
            }
            else{
                System.out.println("you entered " +number);
            }

        }
        catch (NegativeNumberException e){
         System.out.println(e);
        }
    }
}
