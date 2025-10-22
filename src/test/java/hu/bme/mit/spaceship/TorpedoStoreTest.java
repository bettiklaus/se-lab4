package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        TorpedoStore store = new TorpedoStore(1, 0);

        boolean result = store.fire(1);

        assertEquals(true, result);
    }

    @Test
    void fire_Fail() {
        TorpedoStore store = new TorpedoStore(0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            store.fire(1);
        });

        String expectedMessage = "numberOfTorpedos";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void getTorpedoCount_test() {
        TorpedoStore store = new TorpedoStore(2);
        assertEquals(2, store.getTorpedoCount());
    }

}
