package com.williamfiset.algorithms.math;
import com.williamfiset.algorithms.CoverageTracker;
import org.junit.Test;

import static com.williamfiset.algorithms.math.IsPrime.isPrime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {
    @Test
    public void checkPrime() {
        CoverageTracker.setTotalBranches(6);
        assertFalse(isPrime(1)); // Targets Branch ID 1
        assertTrue(isPrime(2)); // Targets Branch ID 2
        assertFalse(isPrime(4)); // Targets Branch ID 3
        assertFalse(isPrime(55)); // Targets Branch ID 4
        assertTrue(isPrime(23)); // Targets Branch ID 5
        CoverageTracker.writeCoverageToConsole();
    }
}