import java.util.Scanner;

/**
 * A_Grasshopper_on_a_Line
 */
public class A_Grasshopper_on_a_Line {

    private static Scanner in = new Scanner(System.in);

    private static void solve() {
        int x, k;

        x = in.nextInt();
        k = in.nextInt();

        if (x%k == 0) {
            System.out.println(2);
            System.out.println(1 + " " + (x-1));
        } else {
            System.out.println(1);
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int t = in.nextInt();

        while (t-- != 0) {
            solve();
        }
    }
}