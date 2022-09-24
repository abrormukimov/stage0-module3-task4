package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1000;
        int b = 10;

        System.out.println(
                (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2)
        );
    }
}