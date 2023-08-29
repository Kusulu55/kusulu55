import java.util.Scanner;

public class InsuranceProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Health (excellent/poor): ");
        String health = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Location (city/village): ");
        String location = scanner.nextLine();

        System.out.print("Sex (male/female): ");
        String sex = scanner.nextLine();

        scanner.close();

        boolean insured;
        int premiumRate;
        int maxInsuredAmount;

        if (health.equals("excellent") && age >= 25 && age <= 35 && location.equals("city")) {
            premiumRate = sex.equals("male") ? 4 : 3;
            maxInsuredAmount = sex.equals("male") ? 200000 : 100000;
            insured = true;
        } else if (health.equals("poor") && age >= 25 && age <= 35 && location.equals("village") && sex.equals("male")) {
            premiumRate = 6;
            maxInsuredAmount = 10000;
            insured = true;
        } else {
            insured = false;
            premiumRate = 0;
            maxInsuredAmount = 0;
        }

        if (insured) {
            System.out.println("Person should be insured.");
            System.out.println("Premium rate: Rs. " + premiumRate + " per thousand");
            System.out.println("Maximum insured amount: Rs. " + maxInsuredAmount);
        } else {
            System.out.println("Person should not be insured.");
        }
    }
}