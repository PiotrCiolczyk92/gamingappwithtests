package pl.gamingapp.playerinput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerNumberReceiverTest {

    @Test
    public void creationOfEmptyConstructorOfClassPlayerNumberReceiver() {
        PlayerNumbersReceiver pnr = new PlayerNumbersReceiver();
        assertNotNull(pnr);
    }

}
