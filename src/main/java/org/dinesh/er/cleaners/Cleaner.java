
package org.dinesh.er.cleaners;

/**
 * A function which can turn a value into a normalized value suitable
 * for comparison.
 */
public interface Cleaner {

  /**
   * Returns a cleaned value.
   */
  public String clean(String value);
  
}