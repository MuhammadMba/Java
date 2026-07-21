import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int s1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int s3 = input.nextInt();

        int total = s1 + s2 + s3;
        double percentage = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade = A");
        } else if (percentage >= 70) {
            System.out.println("Grade = B");
        } else if (percentage >= 60) {
            System.out.println("Grade = C");
        } else if (percentage >= 50) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Grade = F");
        }

        input.close();
    }
}