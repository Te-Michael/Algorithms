package com.williamfiset.algorithms.datastructures.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.*;
import com.williamfiset.algorithms.CoverageTracker;

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

  public int getCapacity() {
    return capacity;
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
    CoverageTracker.setBranchReached(0);
    if (size == capacity) {
      CoverageTracker.setBranchReached(1);
      increaseCapacity();
    }
    // Instrumentation: Set a flag before the first statement
    CoverageTracker.setBranchReached(2);
    data[size++] = elem;
  }

  // Increase the capacity to store more elements.
  private void increaseCapacity() {
    // Branch ID: 2
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


}
