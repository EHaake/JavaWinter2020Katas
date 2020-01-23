package edu.pdx.cs410J.troublemakers;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**                                                                                 
 * This class is represents a <code>LeapYearKata</code>.                                 
 */                                                                                 
public class LeapYearKata {

  public static boolean isLeapYear(int year) {
    if (year % 400 == 0)
      return true;
    if (year % 100 == 0)
      return false;
    if (year % 4 == 0)
      return true;
    else
      return false;
  }

  public static void main(String[] args) {

    if (args.length == 0)
      printErrorMessageAndExit("Missing command line args: Please enter a year.");

    if (!Pattern.compile("^[0-9[^-]]{1,4}$").matcher(args[0]).matches()) {
      printErrorMessageAndExit(args[0] + " is not a valid year.");
    }

    try {
      int year = Integer.parseInt(args[0]);
      if (isLeapYear(year))
        System.out.println(year + " is a leap year!");
      else
        System.out.println(year + " is not a leap year!");
    } catch (NumberFormatException ex) {
      printErrorMessageAndExit(args[0] + " is not a year. Please try again.");
    }


    System.exit(0);
  }

  public static void printErrorMessageAndExit(String message) {
    System.err.println(message);
    System.exit(1);
  }
}