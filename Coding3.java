import java.util.Scanner;

public class Coding3 {

    public static void main (String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        int base = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= base; i++) {
            for (int j = base - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = base - 1; i > 0; i--) {
            for (int j = base - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
