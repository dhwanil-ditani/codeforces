import java.util.*;
 
public class Solution {
    
    public static String solve(int n, int k, int[] arr) {
        boolean isSorted = true;
        for (int i=1; i<n; i++) {
            if (arr[i-1] > arr[i]) {
                isSorted = false;
            } 
        }
        if (k == 1 && !isSorted) {
            return "NO";
        } else {
            return "YES";
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        while (t-- != 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = in.nextInt();
            }
            String result = solve(n, k, arr);
            System.out.println(result);
        }
        
        in.close();
    }
}
