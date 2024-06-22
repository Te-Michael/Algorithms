/**
 * A custom infinite line class that provides additional functionality beyond Java's Line2D.
 *
 * @author Thomas Finn Lidbetter
 */
package com.williamfiset.algorithms.geometry;

import com.williamfiset.algorithms.CoverageTracker;

import static java.lang.Math.*;

import java.awt.geom.Point2D;
import com.williamfiset.algorithms.CoverageTracker;

public class Line {

  // The internal representation of a line is
  // in general form which is: ax + by = c
  private double a, b, c;

  // A very same epsilon value used as a threshold for double equality
  private static final double EPS = 0.0000001;

  // Construct a line given a line segment
  public Line(Point2D p1, Point2D p2) {
    this(p1.getX(), p1.getY(), p2.getX(), p2.getY());
  }

  // Construct a line given a line segment as (x1, y1), (x2, y2)
  public Line(double x1, double y1, double x2, double y2) {
    a = y1 - y2;
    b = x2 - x1;
    c = x2 * y1 - x1 * y2;
    normalise();
  }

  // Constructs a line from a slope and a point
  public static Line slopePointToLine(double slope, Point2D pt) {
    CoverageTracker.setBranchReached(0);
    Point2D p2 = null;
    if (slope == Double.POSITIVE_INFINITY || slope == Double.NEGATIVE_INFINITY) {
      p2 = new Point2D.Double(pt.getX(), pt.getY() + 1);
      CoverageTracker.setBranchReached(1);

    } else {
      p2 = new Point2D.Double(pt.getX() + 1, pt.getY() + slope);
      CoverageTracker.setBranchReached(2);
    }
    CoverageTracker.setBranchReached(3);
    return new Line(pt, p2);
  }

  // Normalize the line in general form
  public void normalise() {
    if (abs(b) < EPS) {
      CoverageTracker.setBranchReached(0);
      c /= a;
      a = 1;
      b = 0;
    } else {
      CoverageTracker.setBranchReached(1);
      a = (abs(a) < EPS) ? 0 : a / b;
      c /= b;
      b = 1;
    }
  }

  // Given a line segment this method finds the line which goes
  // through the middle of the segment and cuts it in half.
  public static Line getPerpBisector(double x1, double y1, double x2, double y2) {

    // Find middle point of segment
    Point2D middle = new Point2D.Double((x1 + x2) / 2.0, (y1 + y2) / 2.0);
    CoverageTracker.setBranchReached(0);

    // The slope perpendicular to (y2-y1)/(x2-x1) is the negative
    // reciprocal or -(x2-x1)/(y2-y1) = (x1-x2)/(y2-y1)
    double perpSlope = (x1 - x2) / (y2 - y1);
    CoverageTracker.setBranchReached(1);

    if (abs(y2 - y1) < EPS){
      perpSlope = Double.POSITIVE_INFINITY;
      CoverageTracker.setBranchReached(2);
    }
    else if (abs(x1 - x2) < EPS){
      perpSlope = 0;
      CoverageTracker.setBranchReached(3);
    }

    CoverageTracker.setBranchReached(4);
    return slopePointToLine(perpSlope, middle);
  }

  // Finds the intersection point of two infinite lines
  // and returns null if line1 and line2 are parallel
  public static Point2D intersection(Line l1, Line l2) {

    l1.normalise();//Branches 0 & 1 are in normalise().
    l2.normalise();
    CoverageTracker.setBranchReached(2);

    // Lines are parallel
    if (abs(l1.a - l2.a) < EPS && abs(l1.b - l2.b) < EPS) {
      CoverageTracker.setBranchReached(3);
      return null;
    }
    CoverageTracker.setBranchReached(4);
    double x = Double.NaN, y = Double.NaN;
    if (abs(l1.b) < EPS) {
      CoverageTracker.setBranchReached(5);
      x = l1.c / l1.a;
      y = (l2.c - l2.a * x) / l2.b;
    } else if (abs(l2.b) < EPS) {
      CoverageTracker.setBranchReached(6);
      x = l2.c / l2.a;
      y = (l1.c - l1.a * x) / l1.b;
    } else if (abs(l1.a) < EPS) {
      CoverageTracker.setBranchReached(7);
      y = l1.c / l1.b;
      x = (l2.c - l2.b * y) / l2.a;
    } else if (abs(l2.a) < EPS) {
      CoverageTracker.setBranchReached(8);
      y = l2.c / l2.b;
      x = (l1.c - l1.b * y) / l1.a;
    } else {
      CoverageTracker.setBranchReached(9);
      x = (l1.c - l2.c) / (l1.a - l2.a);
      y = (l1.c - l1.a * x) / l1.b;
    }
    return new Point2D.Double(x, y);
  }

  // Get a printable representation of a this Line
  @Override
  public String toString() {
    return a + "x + " + b + "y = " + c;
  }
}
