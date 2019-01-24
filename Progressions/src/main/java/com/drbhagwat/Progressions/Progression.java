package com.drbhagwat.Progressions;

/** 
 * A class for numeric progression.
 * @author Dinesh Bhagwat
 */
public class Progression {
  /** initial value of the progression */
  protected long first; 
  
  /** next value of the progression */
  protected long next;
  
  /** 
   * Default Constructor
   */
  Progression() {
    next = first = 0;
  }
  
  /** Resets the progression to the first value.
   * @return first value
   */
  protected long firstValue() {
    return first;
  }  
  
  /** Advances the progression to the next value.
   * @return first value
   */
  protected long nextValue() {
    return ++next; // default increment is 1 
  }  
  
  /** Prints the first n values of the progression.
   * @param n - number of values to print
   */
  public void print(int n) {
    assert n >= 1 : " There should be at least one number in the series";
    
    System.out.print(first);
    
    for (int i = 1; i < n; i++) {
      System.out.print(", ");
      System.out.print(nextValue());  
    }
  }  
}