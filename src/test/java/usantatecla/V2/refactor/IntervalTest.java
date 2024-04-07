package usantatecla.V2.refactor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntervalTest {

  @Test
  public void getMinimo(){
    Interval interval = new Interval(-2,5);
    assertTrue(interval.getMinimo() == -2);
  }

    @Test
    public void getMaximo(){
      Interval interval = new Interval(-2,5);
      assertTrue(interval.getMaximo() == 5);
    }
  
}