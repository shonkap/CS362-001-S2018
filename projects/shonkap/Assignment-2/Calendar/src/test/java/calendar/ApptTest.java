/** A JUnit test class to test the class ApptTest. */

package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalendarUtil;
public class ApptTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(15, 30, 9, 14, 2018, "Birthday Party", "This is my birthday party", "xyz@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t14/9/2018 at 3:30pm ,Birthday Party, This is my birthday party\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(6, 45, 2, 20, 2018, "Work", "Time to go to work", "Jonnylong@gmail.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t20/2/2018 at 6:45am ,Work, Time to go to work\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(21, 00, 8, 2, 2018, "Date", "Lunch date at mikes", "matt@yahoo.com");
      String string0 = appt0.toString();
      assertEquals(2, appt0.getRecurBy());
      assertFalse(appt0.isRecurring());
      assertEquals("\t2/8/2018 at 9:00pm ,Date, Lunch date at mikes\n", string0);
      assertEquals(0, appt0.getRecurIncrement());
      appt0.setValid();
  }

}
