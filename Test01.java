package java_test_0001_12101;

public class Test01 {
    private static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= PATTERN_SIZE; i++) {
            printPatternRow(PATTERN_SIZE - i, 2 * i - 1);
        }

        for (int i = PATTERN_SIZE - 1; i >= 1; i--) {
            printPatternRow(PATTERN_SIZE - i, 2 * i - 1);
        }
    }

    private static void printPatternRow(int spaces, int stars) {
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= stars; j++) {
            if (j == 1 || j == stars) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
