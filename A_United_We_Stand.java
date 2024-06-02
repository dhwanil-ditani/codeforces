import java.util.Arrays;
import java.util.Scanner;

/**
 * A_United_We_Stand
 */
public class A_United_We_Stand {

    private static Scanner in = new Scanner(System.in);

    private static void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        if (a[0] == a[n-1]) {
            System.out.println("-1");
            return;
        }
        else {
            int i=0;
            while (a[i] == a[0]) i++;
            System.out.println(i + " " + (n-i));
            for (int j=0; j<i; j++) {
                System.out.print(a[j] + " ");
            }
            for (int j=i; j<n; j++) {
                System.out.print(a[j] + " ");
            }
        }
    }


    public static void main(String[] args) {
        int t = in.nextInt();

        while (t-- != 0) {
            solve();
        }
    }
}