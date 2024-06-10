package com.williamfiset.algorithms.datastructures.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.*;

/**
 * @author liujingkun
 */
public class ArrayStack<T> implements Stack<T> {
  private int size;
  private int capacity;
  private Object[] data;

  public ArrayStack() {
    capacity = 16;
    data = new Object[capacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public void push(T elem) {
    CoverageTracker.setBranchReached(1);
    if (size == capacity) {
      increaseCapacity();
    }
    // Instrumentation: Set a flag before the first statement
    CoverageTracker.setBranchReached(3);
    data[size++] = elem;

    // Write coverage information to console at the end of the method
    CoverageTracker.writeCoverageToConsole();
  }

  // Increase the capacity to store more elements.
  private void increaseCapacity() {
    // Branch ID: 2
    CoverageTracker.setBranchReached(2);
    capacity *= 2;
    data = Arrays.copyOf(data, capacity);
  }

  @Override
  @SuppressWarnings("unchecked")
  public T pop() {
    if (isEmpty()) throw new EmptyStackException();
    T elem = (T) data[--size];
    data[size] = null;
    return elem;
  }

  @Override
  @SuppressWarnings("unchecked")
  public T peek() {
    if (isEmpty()) throw new EmptyStackException();
    return (T) data[size - 1];
  }

  public class CoverageTracker {
    private static Map<Integer, Boolean> branchCoverage = new HashMap<>();

    // Initialize branch coverage map with branch IDs and set all flags to false
    static {
      branchCoverage.put(1, false); // Branch ID for entering method
      branchCoverage.put(2, false); // Branch ID for increaseCapacity() method
      branchCoverage.put(3, false); // Branch ID for data[size++]
    }

    // Method to set a flag for a branch when it's reached
    public static void setBranchReached(int branchID) {
      branchCoverage.put(branchID, true);
    }

    // Method to get coverage information
    public static Map<Integer, Boolean> getBranchCoverage() {
      return branchCoverage;
    }

    // Method to write branch coverage information to console
    public static void writeCoverageToConsole() {
      System.out.println("Branch Coverage Information:");
      for (Map.Entry<Integer, Boolean> entry : branchCoverage.entrySet()) {
        System.out.println("Branch ID: " + entry.getKey() + ", Covered: " + entry.getValue());
      }
    }

  }
}
