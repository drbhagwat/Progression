package com.drbhagwat.Progressions;

/** 
 * A class for Arithmetic Progression.
 * @author Dinesh Bhagwat
 */
public class ArithmeticProgression extends Progression {
  /** increment */
  private long increment;

  /* inherits variables first and cur */

  /** 
   * Default Constructor setting a unit increment
   */
  ArithmeticProgression() {
    this(1);
  }
  
  /** 
   * Parametric constructor providing the increment
   */
  ArithmeticProgression(long increment) {
    this.increment = increment;
  }
  
  /** Advances the progression by adding the increment to the current value.
   * @return next value of the progression
   */
  protected long nextValue() {
    return next += increment; 
  }  
  /* inherits methods firstValue() and print() */
 }
