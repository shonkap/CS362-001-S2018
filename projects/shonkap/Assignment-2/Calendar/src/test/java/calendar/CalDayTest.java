/** A JUnit test class to test the class CalDay. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;


public class CalDayTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Appt> appts = new LinkedList<Appt>;
      CalDay calander = new CalDay();
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      assertTrue(calander.addAppt(appt0));
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      //Appt appt = new Appt();
      //assertFalse(appt.isValid());
  }

}
