package usantatecla.V5;

import org.junit.jupiter.api.Test;
import usantatecla.V4.refactor.Extremo;
import usantatecla.V4.refactor.Interval;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntervalTest {

  @Test
  void getMinimo() {
    Extremo minimo = new Extremo(-2, true);
    Extremo maximo = new Extremo(5, true);
    Interval interval = new Interval(minimo, maximo);
    assertEquals(-2, interval.getMinimo().getValor());
  }

  @Test
  void getMaximo() {
    Extremo minimo = new Extremo(-2, true);
    Extremo maximo = new Extremo(5, true);
    Interval interval = new Interval(minimo, maximo);
    assertEquals(5, interval.getMaximo().getValor());
  }

  @Test
  void hayInterseccion() {
    Extremo minimo = new Extremo(-2, true);
    Extremo maximo = new Extremo(5, true);
    Extremo minimo2 = new Extremo(3, true);
    Extremo maximo2 = new Extremo(10, true);
    Interval interval = new Interval(minimo, maximo);
    Interval interval2 = new Interval(minimo2, maximo2);
    assertTrue(interval.hayInterseccion(interval2));
  }

}