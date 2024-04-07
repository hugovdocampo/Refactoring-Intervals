package usantatecla.V2.red;

import org.junit.jupiter.api.Test;
import usantatecla.V1.refactor.Interval;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntervalTest {

  @Test
  public void getMinimo(){
    Interval interval = new Interval(-2,5);
    assertTrue(interval.getMinimo() == -2);
  }

    @Test
    public void getMax(){
      Interval interval = new Interval(-2,5);
      assertTrue(interval.getMax() == 5);
    }
  
}