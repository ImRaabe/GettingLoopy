public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

