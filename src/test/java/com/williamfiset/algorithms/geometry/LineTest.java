package com.williamfiset.algorithms.geometry;

import static com.google.common.truth.Truth.assertThat;

import com.williamfiset.algorithms.CoverageTracker;
import java.awt.geom.Point2D;
import org.junit.jupiter.api.Test;
import static com.williamfiset.algorithms.geometry.Line.intersection;
import static org.junit.Assert.*;

public class LineTest {
    @Test
    public void testCoverage() {
        CoverageTracker.setTotalBranches(19);
        testSlopePointToLine();
        testSlopePointToLineNegativeInfinitySlope();
        testSlopePointToLinePositiveInfinitySlope();
        testIntersectionSimple();
        testIntersectionSimple2();
        testIntersectionParallel();
        testIntersectionHorizontalL1();
        testIntersectionHorizontalL2();
        testIntersectionSkewed();
        testSlopePointToLine();
        testSlopePointToLineNegativeInfinitySlope();
        testSlopePointToLinePositiveInfinitySlope();
        testGetPerpBisector();
        CoverageTracker.writeCoverageToConsole();
    }

    @Test
    public void testSlopePointToLine() {
        double slope = 1;
        Point2D point = new Point2D.Double(0, 0);
        Line expectedLine = new Line(new Point2D.Double(0, 0), new Point2D.Double(1, 1));
        Line result = Line.slopePointToLine(slope, point);
        assertThat(result.toString()).isEqualTo(expectedLine.toString());
    }

    @Test
    public void testSlopePointToLinePositiveInfinitySlope() {
        double slope = Double.POSITIVE_INFINITY;
        Point2D point = new Point2D.Double(0, 0);
        Line expectedLine = new Line(new Point2D.Double(0, 0), new Point2D.Double(0, 1));
        Line result = Line.slopePointToLine(slope, point);
        assertThat(result.toString()).isEqualTo(expectedLine.toString());
    }

    @Test
    public void testSlopePointToLineNegativeInfinitySlope() {
        double slope = Double.NEGATIVE_INFINITY;
        Point2D point = new Point2D.Double(0, 0);
        Line expectedLine = new Line(new Point2D.Double(0, 0), new Point2D.Double(0, 1));
        Line result = Line.slopePointToLine(slope, point);
        assertThat(result.toString()).isEqualTo(expectedLine.toString());

    }
    @Test
    public void testIntersectionSimple() {
        Line l1 = new Line(0.0,-2.0,0.0,2.0);
        Line l2 = new Line(-2.0,0.0,2.0,0.0);
        assertEquals(intersection(l1, l2), new Point2D.Double(0.0, 0.0));
    }

    @Test
    public void testIntersectionSimple2() {
        Line l2 = new Line(0.0,-2.0,0.0,2.0);
        Line l1 = new Line(-2.0,0.0,2.0,0.0);
        assertEquals(intersection(l1, l2), new Point2D.Double(0.0, 0.0));
    }

    @Test
    public void testIntersectionParallel() {
        Line l1 = new Line(0.0,0.0,1.0,0.0);
        Line l2 = new Line(0.0,1.0,1.0,1.0);
        assertNull(intersection(l1, l2));
    }

    @Test
    public void testIntersectionHorizontalL1() {
        Line l1 = new Line(0.0,0.0,1.0,0.0);
        Line l2 = new Line(0.0,0.0,1.0,1.0);
        assertEquals(intersection(l1, l2), new Point2D.Double(0.0, 0.0));
    }

    @Test
    public void testIntersectionHorizontalL2() {
        Line l1 = new Line(0.0,0.0,1.0,1.0);
        Line l2 = new Line(0.0,0.0,1.0,0.0);
        assertEquals(intersection(l1, l2), new Point2D.Double(0.0, 0.0));
    }

    @Test
    public void testIntersectionSkewed() {
        Line l1 = new Line(0.0,0.0,2.0,3.0);
        Line l2 = new Line(0.0,0.0,3.0,2.0);
        assertEquals(intersection(l1, l2), new Point2D.Double(0.0, 0.0));
    }

    @Test
    void testGetPerpBisector() {
        double x1 = 0, y1 = 0, x2 = 4, y2 = 0;
        Line bisector1 = Line.getPerpBisector(x1, y1, x2, y2);
        assertEquals("1.0x + 0.0y = 2.0", bisector1.toString());

        x1 = 2; y1 = 1; x2 = 2; y2 = 5;
        Line bisector2 = Line.getPerpBisector(x1, y1, x2, y2);
        assertEquals("0.0x + 1.0y = 3.0", bisector2.toString());
    }
}
