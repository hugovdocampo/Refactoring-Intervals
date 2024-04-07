package usantatecla.V3.refactor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntervalTest {

  @Test
  public void getMinimo(){
    Extremo minimo = new Extremo(-2, true);
    Extremo maximo = new Extremo(5, true);
    Interval interval = new Interval(minimo, maximo);
    assertTrue(interval.getMinimo().getValor() == -2);
  }

    @Test
    public void getMaximo(){
      Extremo minimo = new Extremo(-2, true);
      Extremo maximo = new Extremo(5, true);
      Interval interval = new Interval(minimo, maximo);
      assertTrue(interval.getMaximo().getValor() == 5);
    }
  
}