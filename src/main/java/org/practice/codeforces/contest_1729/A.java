package org.practice.codeforces.contest_1729;

import java.util.Scanner;

public class A {

    public static int solve(int a, int b, int c) {
        int time1 = Math.abs(a - 1);
        int time2 = Math.abs(b - c) + Math.abs(c - 1);
        if (time1 == time2) {
            return 3;
        } else if (time1 > time2) {
            return 2;
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, a, b, c;
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            int result = solve(a, b, c);
            System.out.println(result);
        }
        in.close();
    }

}
