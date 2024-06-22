package com.williamfiset.algorithms.math;
import com.williamfiset.algorithms.CoverageTracker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FastFourierTransformTest {

    @Test
    void testMultiply() {
        CoverageTracker.setTotalBranches(5);
        // Test case 1: Multiply polynomials with positive coefficients
        long[] polynomial1 = {1, 5, 3, 2};
        long[] polynomial2 = {0, 0, 6, 2, 5};
        long[] expected1 = {0, 0, 6, 32, 33, 43, 19, 10};
        assertArrayEquals(expected1, FastFourierTransform.multiply(polynomial1, polynomial2));
        CoverageTracker.writeCoverageToConsole();
    }
}
