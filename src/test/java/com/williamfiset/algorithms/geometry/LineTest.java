package com.williamfiset.algorithms.geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.williamfiset.algorithms.CoverageTracker;

class LineTest {

    @Test
    void testGetPerpBisector() {
        CoverageTracker.setTotalBranches(5);

        double x1 = 0, y1 = 0, x2 = 4, y2 = 0;
        Line bisector1 = Line.getPerpBisector(x1, y1, x2, y2);
        assertEquals("1.0x + 0.0y = 2.0", bisector1.toString());

        x1 = 2; y1 = 1; x2 = 2; y2 = 5;
        Line bisector2 = Line.getPerpBisector(x1, y1, x2, y2);
        assertEquals("0.0x + 1.0y = 3.0", bisector2.toString());

        CoverageTracker.writeCoverageToConsole();

    }

}
