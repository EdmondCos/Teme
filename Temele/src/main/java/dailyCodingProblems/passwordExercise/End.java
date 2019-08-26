package dailyCodingProblems.passwordExercise;

public class End {
    static boolean isGoodEnd (String password){
        boolean success = true;
        if(!password.substring(password.length()-1).contains("-")){
            success = false;
        }
        return success;
    }
}
