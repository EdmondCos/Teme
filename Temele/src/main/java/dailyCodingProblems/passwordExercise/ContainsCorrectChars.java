package dailyCodingProblems.passwordExercise;

class ContainsCorrectChars {
    static boolean isCharacters(String password) {
        boolean status = true;
        char[] parola = password.toCharArray();
        for (int i = 0; i <parola.length-1; i++) {
            if (!Character.isLetter(parola[i]) && !Character.isDigit(parola[i])) {
                status = false;
                break;
            }
        }
        return status;
    }
}
