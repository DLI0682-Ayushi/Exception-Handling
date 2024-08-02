import java.util.Scanner;
public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            String string = "";
            System.out.println(string.length());
            int result = 100 / 0;
            System.out.println(result);
        }
        catch(NullPointerException e) {
            System.out.println(" Cannot produce result because you are trying to print a null string");
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot produce result because you are trying to divide by zero");
        }
        catch (Exception e) {
        System.out.println("Generic exception happened");
        }
    }
}
