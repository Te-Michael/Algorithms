package com.williamfiset.algorithms.datastructures.stack;

import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;
import com.williamfiset.algorithms.CoverageTracker;


public class ArrayStackTest {

    @Test
    public void testPush() {
        CoverageTracker.setTotalBranches(3);
        ArrayStack<Integer> stack = new ArrayStack<>();

        // Check initial capacity and size
        assertEquals(0, stack.size());
        assertEquals(16, stack.getCapacity()); // Assuming a getter method for capacity

        // Push elements until capacity should double
        for (int i = 1; i <= 16; i++) {
            stack.push(i);
            assertEquals(i, stack.size());
            assertEquals(16, stack.getCapacity()); // Capacity should remain 16 until the 17th push
        }

        // 17th push should trigger capacity doubling
        stack.push(17);
        assertEquals(17, stack.size());
        assertEquals(32, stack.getCapacity()); // Capacity should now be doubled to 32

        // Push more elements to verify capacity remains doubled
        for (int i = 18; i <= 32; i++) {
            stack.push(i);
            assertEquals(i, stack.size());
            assertEquals(32, stack.getCapacity()); // Capacity should remain 32
        }
        CoverageTracker.writeCoverageToConsole();

    }
}
