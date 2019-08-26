package dailyCodingProblems.passwordExercise;

//    user has to create a password
//    6 - 16 characters long
//    Must only contain letters and numbers
//    Must not start with a number and has to end in "-"

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Please insert a password 6-16 characters long. \n" +
                    "Must only contain letters and numbers. \n" +
                    "Must not start with a number and has to end in '-'. \n");
            String password = scanner.nextLine();
            if (!Length.isLength(password)) {
                System.out.println("Password of incorrect length!");
                continue;
            }

            if (!ContainsCorrectChars.isCharacters(password)) {
                System.out.println("Invalid characters used!");
                continue;
            }

            if (!Start.isGoodStart(password)) {
                System.out.println("Password format not respected1!");
                continue;
            }

            if (!End.isGoodEnd(password)) {
                System.out.println("Password format not respected2!");
                continue;
            }
            loop = false;
        }
        System.out.println("Password was set successfully");
    }
}
