package usantatecla.V1.refactor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntervalTest {

    @Test
    void getMinimo() {
        Interval interval = new Interval(-2, 5);
        assertEquals(-2, interval.getMinimo());
    }

}