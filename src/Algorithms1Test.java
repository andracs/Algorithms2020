import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test
    void randomBoyName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(18);
        assertEquals("Cello", a.randomBoyName());
    }
}