package pl.gamingapp.lotterydrawsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LotteryRandomNumbersReceiverTest {

    @Test
    public void checkIfEmptyConstructorForThisClassWorksCorrectly() {
        assertNotNull(new LotteryRandomNumbersReceiver());
    }
}