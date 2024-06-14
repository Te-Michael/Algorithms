/**
 * Tests whether a number is a prime number or not Time Complexity: O(sqrt(n))
 *
 * @author Micah Stairs, William Fiset
 */
package com.williamfiset.algorithms.math;
import com.williamfiset.algorithms.CoverageTracker;

public class IsPrime {

  public static boolean isPrime(final long n) {
    CoverageTracker.setBranchReached(0);
    if (n < 2) {
      CoverageTracker.setBranchReached(1);
      return false;
    }
    if (n == 2 || n == 3) {
      CoverageTracker.setBranchReached(2);
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0) {
      CoverageTracker.setBranchReached(3);
      return false;
    }
    long limit = (long) Math.sqrt(n);
    for (long i = 5; i <= limit; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        CoverageTracker.setBranchReached(4);
        return false;
      }
    }
    CoverageTracker.setBranchReached(5);
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(5));
    System.out.println(isPrime(31));
    System.out.println(isPrime(1433));
    System.out.println(isPrime(8763857775536878331L));
  }
}