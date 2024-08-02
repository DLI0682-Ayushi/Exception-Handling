import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomCheckedException {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Your age is less then 18...");
            }
            else{
                System.out.println("You are above 18 years old...");
            }
        } catch (InvalidAgeException e) {
           System.out.println(e.getMessage());
        }

    }
}
