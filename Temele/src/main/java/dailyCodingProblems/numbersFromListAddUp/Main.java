package dailyCodingProblems.numbersFromListAddUp;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[] lst = new int[]{42, 15, 2, 11};
        int k = 4;
        boolean bol = methods.isSum(lst, k);
        System.out.println(bol);
    }
}
