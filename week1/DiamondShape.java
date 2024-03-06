// 4. Write and application that prints the following diamond shape. Don’t print any unneeded characters
public class DiamondShape {
    public static void main(String[] args) {
        int size = 4;

        // Print upper part of the diamond
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower part of the diamond
        for (int i = size - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 2 * i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}