public class RightAngledTriangle {
    public static void main(String[] args) {
        int height = 5; // Height of the triangle

        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
