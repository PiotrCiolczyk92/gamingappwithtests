package pl.gamingapp.lotterydrawsystem;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LotteryRandomNumbersReceiverTest {
    public static LotteryRandomNumbersReceiver lrn;

    @BeforeClass
    public static void createConstructor() {
        lrn = new LotteryRandomNumbersReceiver();
    }

    @Test
    public void checkIfLotteryReceiverConstructorInitializingArrayOfLengthSix() {
        createConstructor();
        Assertions.assertEquals(6, lrn.getLuckyDrawnNumbers().length);
    }

    @Test
    public void checkIfLotteryReceiverConstructorInitializingRandomClassInstance() {
        createConstructor();
        Assertions.assertNotNull(lrn.getLuckyDraw());
    }
}