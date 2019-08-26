package dailyCodingProblems.passwordExercise;

public class Length {
    static boolean isLength(String password) {
        if (password.length() >= 6 && password.length() <= 16) {
            return true;
        } else {
            return false;
        }
    }
}
