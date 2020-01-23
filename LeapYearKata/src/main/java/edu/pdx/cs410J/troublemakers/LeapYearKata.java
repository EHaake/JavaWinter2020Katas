package edu.pdx.cs410J.troublemakers;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
                                                                                    
/**                                                                                 
 * This class is represents a <code>LeapYearKata</code>.                                 
 */                                                                                 
public class LeapYearKata {

  public static boolean isLeapYear(int year) {

    return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
  }

  public static void main(String[] args) {

    System.exit(0);
  }
}