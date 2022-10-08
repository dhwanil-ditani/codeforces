package org.practice.codeforces.contest_1729;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.practice.codeforces.contest_1729.A.solve;

class ATest {

    @Test
    void case1() {
        int a = 1, b = 2, c = 3;
        assertEquals(solve(a, b, c), 1);
    }

    @Test
    void case2() {
        int a = 3, b = 1, c = 2;
        assertEquals(solve(a, b, c), 3);
    }

    @Test
    void case3() {
        int a = 3, b = 2, c = 1;
        assertEquals(solve(a, b, c), 2);
    }
}