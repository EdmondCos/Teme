package dailyCodingProblems.passwordExercise;

public class Start {

    static boolean isGoodStart(String password) {
        boolean success = true;
        if (Character.isDigit(password.charAt(0))){
            success = false;
        }
        return success;
    }
}
