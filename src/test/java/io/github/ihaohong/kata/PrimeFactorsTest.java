package io.github.ihaohong.kata;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest extends TestCase {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

    public void testTwo() {
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    public void testThree() {
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    public void testFour() {
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }

    public void testFive() {
        assertEquals(list(5), PrimeFactors.generate(5));
    }

    public void testSix() {
        assertEquals(list(2, 3), PrimeFactors.generate(6));
    }

    public void testSeven() {
        assertEquals(list(7), PrimeFactors.generate(7));
    }

    public void testEight() {
        assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
    }

    public void testNine() {
        assertEquals(list(3, 3), PrimeFactors.generate(9));
    }

    public void testXX() {
        assertEquals(list(2, 2, 2, 3), PrimeFactors.generate(24));
    }
}