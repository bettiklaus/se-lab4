package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_Fail() {
        TorpedoStore store = new TorpedoStore(0);

        boolean result = store.fire(1);

        assertEquals(false, result);
    }
    @Test
    void getTorpedoCount_test() {
        TorpedoStore store = new TorpedoStore(-1);
        boolean neg = false;
        if(store.getTorpedoCount() < 0) {
            neg = true;
        }
        assertEquals(false, neg);
    }
    @Test
    public void TorpedoStore_test(int numberOfTorpedos) {
        TorpedoStore store = new TorpedoStore(2);
        double FAILURE_RATE = 1.0;

        String failureEnv = System.getenv(null);
        if (failureEnv != null) {
            try {
                FAILURE_RATE = Double.parseDouble(failureEnv);
            } catch (NumberFormatException nfe) {
                FAILURE_RATE = 0.0;
            }
        }
        assertEquals(0.0, FAILURE_RATE);
    }
}
