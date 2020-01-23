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

    if (args.length == 0)
      printErrorMessageAndExit("Missing command line args: Please enter a year.");

    if (isLeapYear(400))
      System.out.println("400 is a leap year!");

    System.exit(0);
  }

  public static void printErrorMessageAndExit(String message) {
    System.err.println(message);
    System.exit(1);
  }
}