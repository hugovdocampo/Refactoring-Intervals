package usantatecla.V3.red;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtremoTest {

    @Test
    void getValor() {
        Extremo extremo = new Extremo(2, true);
        assertEquals(2, extremo.getValor());
    }

    @Test
    void isIncluido() {
        Extremo extremo = new Extremo(2, true);
        assertTrue(extremo.isIncluido());
    }
}