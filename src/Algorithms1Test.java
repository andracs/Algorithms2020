import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test
    void randomBoyName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(5);
        assertEquals("Klausbjerke", a.randomBoyName());
    }

    @Test
    void randomGirlName() {
        Algorithms1 a = new Algorithms1();
        a.rand.setSeed(10);
        assertEquals("Glød", a.randomGirlName());
    }

}