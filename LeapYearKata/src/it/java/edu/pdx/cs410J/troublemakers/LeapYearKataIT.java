package edu.pdx.cs410J.troublemakers;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Integration tests for the <code>Student</code> class's main method.
 * These tests extend <code>InvokeMainTestCase</code> which allows them
 * to easily invoke the <code>main</code> method of <code>Student</code>.
 */
public class LeapYearKataIT extends InvokeMainTestCase {

    @Test
    public void programExitsWithErrorIfNoArgsPassed() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearKata.class);
        assertThat(result.getExitCode(), equalTo(1));
        assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line args: Please enter a year."));
    }

    @Test
    public void programOutputsConfirmationThatYearIsLeapYear() {
        InvokeMainTestCase.MainMethodResult result = invokeMain(LeapYearKata.class, "400");
        assertThat(result.getExitCode(), equalTo(0));
        assertThat(result.getTextWrittenToStandardOut(), containsString("400 is a leap year!"));
    }
}
