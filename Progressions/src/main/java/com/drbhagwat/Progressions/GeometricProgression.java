package com.drbhagwat.Progressions;

/**
 * A class for Geometric Progression.
 * 
 * @author Dinesh Bhagwat
 */
public class GeometricProgression extends Progression {
  /** Base */
  private long base;

  /* inherits variables first and next */

  /**
   * Default Constructor setting base as 2
   */
  GeometricProgression() {
    this(2);
  }

  /**
   * Parametric constructor providing the base
   * 
   * @param b base of the progression.
   */
  GeometricProgression(long base) {
    this.base = base;
    next = first = 1;
  }

  /**
   * Advances the progression by multiplying the base with the next value.
   * 
   * @return next value of the progression
   */
  protected long nextValue() {
    return next *= base;
  }
  /* inherits methods firstValue() and print() */
}
