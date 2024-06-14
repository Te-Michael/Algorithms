package com.williamfiset.algorithms.math;
import com.williamfiset.algorithms.CoverageTracker;
import org.junit.Test;

import static com.williamfiset.algorithms.math.IsPrime.isPrime;

public class PrimeTest {
    @Test
    public void checkPrime() {
        assert(!isPrime(1)); // Targets Branch ID 1
        assert(isPrime(2)); // Targets Branch ID 2
        assert(!isPrime(4)); // Targets Branch ID 3
        assert(!isPrime(55)); //Targets Branch ID 4
        assert(isPrime(23)); // Targets Branch ID 5
        CoverageTracker.writeCoverageToConsole();
    }
}