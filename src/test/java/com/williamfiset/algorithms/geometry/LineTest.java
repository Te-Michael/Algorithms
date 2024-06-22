package com.williamfiset.algorithms.geometry;

import static com.google.common.truth.Truth.assertThat;

import com.williamfiset.algorithms.CoverageTracker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.geom.Point2D;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    public void testCoverage() {
        CoverageTracker.setTotalBranches(4);
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
    }
}
