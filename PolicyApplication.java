package RealtimeExamples;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class PoorDrivingRecordException extends Exception {
    public PoorDrivingRecordException(String message) {
        super(message);
    }
}

class HealthIssueException extends Exception {
    public HealthIssueException(String message) {
        super(message);
    }
}

public class PolicyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);

            System.out.print("Do you have a good driving record? (true/false): ");
            boolean hasGoodRecord = scanner.nextBoolean();
            validateDrivingHistory(hasGoodRecord);

            System.out.print("Do you have any health issues? (true/false): ");
            boolean hasHealthIssues = scanner.nextBoolean();
            validateHealthRecords(hasHealthIssues);

            System.out.println("Congratulations! Your policy application is successful.");
        } catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
     public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 99) {
            throw new InvalidAgeException("Invalid age. Must be between 18 and 99.");
        }
    }
    public static void validateDrivingHistory(boolean hasGoodRecord) throws PoorDrivingRecordException {
        if (!hasGoodRecord) {
            throw new PoorDrivingRecordException("Poor driving history detected.");
        }
    }
    public static void validateHealthRecords(boolean hasHealthIssues) throws HealthIssueException {
        if (hasHealthIssues) {
            throw new HealthIssueException("Health issues found.");
        }
    }
}

