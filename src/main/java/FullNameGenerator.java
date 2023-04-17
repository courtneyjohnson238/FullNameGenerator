import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("First name:");
        String firstName = myScanner.nextLine().trim();
        System.out.print("Middle Name");
        String middleName = myScanner.nextLine().trim();
        System.out.print("Last name");
        String lastName = myScanner.nextLine().trim();
        System.out.print("Suffix");
        String Suffix = myScanner.nextLine().trim();

        String fullName = firstName;

        if (!middleName.isEmpty()) {





    }
}
