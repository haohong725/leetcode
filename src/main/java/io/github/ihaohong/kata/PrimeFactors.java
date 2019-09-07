package io.github.ihaohong.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int i=2; i <= n; i++) {
            while (n % i == 0) {
                primes.add(i);
                n = n / i;
            }
        }

        return primes;
    }
}
