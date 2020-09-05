package assignments;
import java.util.Scanner;
public class c1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the patient portal");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your email");
        String email = input.next();

        System.out.println("Enter your street");
        int numbers = input.nextInt();

        input.nextLine();

        String streetName= input.nextLine();

        System.out.println("Enter your city");
        String cityName = input.next();

        System.out.println("Enter your state");
        String state = input.next();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        System.out.println("Enter your work phone number");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your personal phone number");
        long personal = input.nextLong();

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height = input.nextDouble();

        System.out.println("Enter your weight");
        double weight = input.nextDouble();

        System.out.println("Are you married");
        boolean married = input.nextBoolean();

        String fullname = lastName+", "+ firstName;

        System.out.println("Patient personal information");
        System.out.println("Full name: "+ fullname);
        System.out.println("Address: "+ streetName+", "+cityName+", "+state+" "+zipCode  );
        System.out.println("Contacts: work phone number- "+phoneNumber+", personal phone number");

    }
}
