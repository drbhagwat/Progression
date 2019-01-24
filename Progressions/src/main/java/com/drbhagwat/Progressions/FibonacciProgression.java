package com.drbhagwat.Progressions;

/** 
 * A class for Arithmetic Progression.
 * @author Dinesh Bhagwat
 */
public class FibonacciProgression extends Progression {
  /** Previous Value */
  private long previous;

  /* inherits variables first and cur */

  /** 
   * Default Constructor setting a unit increment
   */
  FibonacciProgression() {
    this(0, 1);
  }
  
  /** 
   * Parametric constructor providing the increment
   */
  FibonacciProgression(long value1, long value2) {
    first = value1;
    previous = value2 - value1;
  }
  
  /** Advances the progression by adding the increment to the current value.
   * @return next value of the progression
   */
  protected long nextValue() {
    long temp = previous;
    previous = next;
    return next += temp;
  }  
  /* inherits methods firstValue() and print() */
 }
