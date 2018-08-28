import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * { var_description }.
     */
    public static final int FOUR = 4;
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    /**.
     * { function_description }.
     *
     * @param      a     { parameter_description }.
     * @param      b     { parameter_description }.
     * @param      c     { parameter_description }.
     */
    static void roots(final int a, final int b, final int c) {
        double root1 = (-b + Math.sqrt((b * b) - FOUR * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt((b * b) - FOUR * a * c)) / (2 * a);
        System.out.println(root1 + " " + root2);

    }
}
