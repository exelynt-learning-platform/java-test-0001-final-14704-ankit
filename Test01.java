public class Test01 {
    public static void main(String[] args) {
        int n = 9;
        int m = n/2;
        for (int i = 0; i < n; i++) {
            int d = Math.min(i, n-1-i);
            int s1 = m-d;
            for (int j = 0; j<s1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (d > 0) {
                int s2 = 2*d-1;
                for (int j = 0; j<s2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
