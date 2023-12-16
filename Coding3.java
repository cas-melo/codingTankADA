import java.util.Scanner;

public class Coding3 {

    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        int base = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= base; i += 2) {
            for (int j = base - i; j > 0; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = base - 2; i >= 1; i -= 2) {
            for (int j = base - i; j > 0; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
