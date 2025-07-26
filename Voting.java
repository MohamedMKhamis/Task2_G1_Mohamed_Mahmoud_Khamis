import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        input.nextLine();
        String nationality = input.nextLine();

        if (age >= 18 && nationality.equals("Egyptian")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible");
        }

        input.close();
    }
}