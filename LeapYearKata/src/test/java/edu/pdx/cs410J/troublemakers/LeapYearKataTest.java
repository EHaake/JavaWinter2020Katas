package edu.pdx.cs410J.troublemakers;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class LeapYearKataTest
{

    @Test
    public void year400IsALeapYear() {
        assertThat(LeapYearKata.isLeapYear(400), equalTo(true));
    }

    @Test
    public void year401IsNotALeapYear() {
        assertThat(LeapYearKata.isLeapYear(401), equalTo(false));

    }


    @Test
    public void ifIsDivisibleBy400ReturnTrue() {
        assertThat(LeapYearKata.isLeapYear(400), equalTo(true));
    }

    @Test
    public void year2020IsAValidLeapYear() {
        assertThat(LeapYearKata.isLeapYear(2020), equalTo(true));

    }

}
