package usantatecla.V1.red;

import org.junit.jupiter.api.Test;
import usantatecla.V0.Interval;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntervalTest {

  @Test
   void getMin(){
    Interval interval = new Interval(-2,5);
    assertTrue(interval.getMin() == -2);
  }
  
}