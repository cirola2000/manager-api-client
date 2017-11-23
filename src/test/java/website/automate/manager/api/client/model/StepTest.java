/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 23 11:28:40 CET 2017
 */

package website.automate.manager.api.client.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
 
public class StepTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Step step0 = new Step();
      step0.setIndex(1);
      int int0 = step0.getIndex();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Step step0 = new Step();
      step0.setIndex((-1));
      int int0 = step0.getIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Step step0 = new Step();
      step0.getStatus();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Step step0 = new Step();
      int int0 = step0.getIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Step step0 = new Step();
      Step.STATUS step_STATUS0 = Step.STATUS.ERROR;
      step0.setStatus(step_STATUS0);
      Step.STATUS step_STATUS1 = step0.getStatus();
      assertSame(step_STATUS1, step_STATUS0);
  }
}