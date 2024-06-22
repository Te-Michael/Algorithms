package com.williamfiset.algorithms.geometry;

import static com.google.common.truth.Truth.assertThat;

import com.williamfiset.algorithms.CoverageTracker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.geom.Point2D;
import java.util.stream.Stream;
import java.util.Objects;
import org.junit.jupiter.api.Test;

import org.junit.Test;
import static com.williamfiset.algorithms.geometry.Line.intersection;
import static org.junit.Assert.*;

public class LineTest {
    @Test
    public void testCoverage() {
        CoverageTracker.setTotalBranches(14);
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
}
