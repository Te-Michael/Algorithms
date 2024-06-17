package com.williamfiset.algorithms.search;

import com.williamfiset.algorithms.CoverageTracker;
import org.junit.jupiter.api.Test;

import java.util.function.DoubleFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchTest {

    @Test
    public void testCoverage() {
        CoverageTracker.setTotalBranches(5);
        testBinarySearchInvalidBounds();
        testBinarySearchSphereRadius();
        testBinarySearchSquareRoot();
        CoverageTracker.writeCoverageToConsole();
    }

    @Test
    public void testBinarySearchSquareRoot() {
        double lo = 0.0;
        double hi = 875.0;
        double target = 875.0;

        DoubleFunction<Double> function = (x) -> (x * x);

        double result = BinarySearch.binarySearch(lo, hi, target, function);

        // Check that the result squared is close to the target
        assertEquals(target, Math.ceil(result * result), BinarySearch.EPS);
    }

    @Test
    public void testBinarySearchSphereRadius() {
        double radiusLowerBound = 0.0;
        double radiusUpperBound = 1000.0;
        double volume = 100.0;

        DoubleFunction<Double> sphereVolumeFunction = (r) -> ((4.0 / 3.0) * Math.PI * r * r * r);

        double result = BinarySearch.binarySearch(radiusLowerBound, radiusUpperBound, volume, sphereVolumeFunction);

        // Check that the calculated volume using the result is close to the target volume
        assertEquals(volume, Math.ceil(sphereVolumeFunction.apply(result)), BinarySearch.EPS);
    }

    @Test
    public void testBinarySearchInvalidBounds() {
        double lo = 10.0;
        double hi = 5.0;
        double target = 7.5;

        DoubleFunction<Double> function = (x) -> x;

        // Check that IllegalArgumentException is thrown when hi <= lo
        assertThrows(IllegalArgumentException.class, () -> {
            BinarySearch.binarySearch(lo, hi, target, function);
        });
    }
}
