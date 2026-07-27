//Main.java
import java.util.Scanner;

public class InternHiring {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        try (Scanner scanner = new Scanner(System.in)) {
            // We are creating a hiring tool where the HRR can register candidates based on their eligibility to the database

            System.out.println("Enter the candidate Details");

            System.out.println("Name");
            String name = scanner.next();

            System.out.println("Gender");
            String gender = scanner.next();

            System.out.println("Enter percentage in 10th");
            int percentage = scanner.nextInt();


            if (percentage < 50) {
                throw new InvalidInternException("Registration Failed. Percentage cannot be less than 50%");

            } else {
                Candidate candidate = new Candidate();
                candidate.setName(name);
                candidate.setGender(gender);
                candidate.setPercentage(percentage);

                return candidate;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to InternHiring tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful for " + candidate.getName());
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidInternException extends Exception {
    public InvalidInternException(String message) {
        super(message);
    }
}