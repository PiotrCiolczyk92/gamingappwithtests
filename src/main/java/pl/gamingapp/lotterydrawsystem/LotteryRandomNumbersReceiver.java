package pl.gamingapp.lotterydrawsystem;

import java.util.Random;

public class LotteryRandomNumbersReceiver {
    private final int AMOUNT_OF_LUCKY_DRAWN_NUMBERS = 6;
    private int[] luckyDrawnNumbers;
    private Random randomNumbersPicker;

    public LotteryRandomNumbersReceiver() {
        this.luckyDrawnNumbers = new int[AMOUNT_OF_LUCKY_DRAWN_NUMBERS];
    }

    public int[] getLuckyDrawnNumbers() {
        return this.luckyDrawnNumbers;
    }
}
