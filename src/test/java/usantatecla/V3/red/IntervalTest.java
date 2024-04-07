package usantatecla.V3.red;

import org.junit.jupiter.api.Test;
import usantatecla.V2.refactor.Interval;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntervalTest {

    @Test
    public void getMinimo() {
        Interval interval = new Interval(-2, 5);
        assertEquals(-2, interval.getMinimo());
    }

    @Test
    public void getMaximo() {
        Interval interval = new Interval(-2, 5);
        assertEquals(5, interval.getMaximo());
    }

}