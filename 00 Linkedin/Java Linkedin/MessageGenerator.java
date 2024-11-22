import java.util.Scanner;

public class MessageGenerator {
    private static String CompanyName = "Google";

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            while (true) {
                generateMessage(scanner);
                System.out.print("Continue? (yes/no) ------------------ ");
                String response = scanner.nextLine();

                if (!response.equals("y")) {
                    scanner.close();
                    break;
                }
            }
        }
    }

    public static String makeCapital(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void generateMessage(Scanner scanner) {
        // Display role options to the user
            // Clearing the console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Display role options to the user
            System.out.println("Choose a role by entering the corresponding number:");
            System.out.println("1 - Open Job Role");
            System.out.println("2 - HR");
            System.out.println("3 - Team Lead");
            System.out.println("4 - SDE");
            
            // Input: Role selection
            System.out.print("Enter the number for the role: ");
            int role = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            // Input: Name of the person
            //System.out.print("Enter the name of the person: ");
            //String name = makeCapital(scanner.nextLine().trim());
            
            // Input: Company name
            System.out.println("Use this company name: " + CompanyName + "? (y/n)");
            String response = scanner.nextLine();
            String company;
            if (!response.equals("y")) {
                company = makeCapital(response);
                CompanyName = company;
            }
            else{
                company = makeCapital(CompanyName);
            }
            
            // Generate and print the message
            String message = generateMessage(role, "XX", company);
            System.out.println("\nGenerated Message:\n" + message + "\n\n\n");
    }

    public static String generateMessage(int role, String name, String company) {
        return switch (role) {
            case 1 -> "Hi " + name + ", I'm planning to apply for a product role (Job ID: 111) at " + company
                + ". My experience closely aligns with the role. Would you be willing to help me navigate? Thanks in advance!";
            case 2 -> "Dear " + name + ", I hope this message finds you in good health.\n" +"I am a recent graduate with ~2 years of experience as a Java Developer. And I have been following " + company
                + "'s innovation in Technology. I would be honored to connect with you to explore any potential opportunities.";
            case 3 -> "Hi " + name + ", I admire your leadership at " + company
                + ". \nAs I am a recent graduate with ~2 years of experience as a Java Developer, I'm seeking to contribute to impactful projects and would appreciate your guidance or tips about " + company + "'s hiring process.";
            case 4 -> "Hi " + name + ", I see you're working as a Software Developer at " + company
                + ". As someone with a similar background in Java, I'd love to connect and learn more about your experience at " + company + ".";
            default -> "Invalid selection. Please enter a number between 1 and 4.";
        };
    }
}
