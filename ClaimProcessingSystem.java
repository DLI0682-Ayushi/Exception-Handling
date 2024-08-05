package RealtimeExamples;
import java.time.LocalDate;

class FraudulentClaimException extends RuntimeException {
    public FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    public InvalidClaimAmountException(String message) {
        super(message);
    }
}

class ClaimProcessingSystem {
    public void processClaim(double claimAmount, LocalDate claimDate) {
        double maxCoverage = 100000.0;
        LocalDate policyStartDate = LocalDate.of(2024, 1, 1);
        LocalDate policyEndDate = LocalDate.of(2024, 12, 31);
        if (claimAmount > maxCoverage) {
            throw new InvalidClaimAmountException("Claim amount exceeds policy coverage.");
        }
        if (claimDate.isBefore(policyStartDate) || claimDate.isAfter(policyEndDate)) {
            throw new FraudulentClaimException("Claim date is outside the policy period.");
        }
        System.out.println("Claim processed successfully!");
    }
}

