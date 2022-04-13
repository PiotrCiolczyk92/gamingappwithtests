package pl.gamingapp.lotterydrawsystem;

import java.util.Random;

public class LotteryRandomNumbersReceiver {
    private final int AMOUNT_OF_LUCKY_DRAWN_NUMBERS = 6;
    private int[] luckyDrawnNumbers;
    private Random luckyDraw;

    public LotteryRandomNumbersReceiver() {
        this.luckyDrawnNumbers = new int[AMOUNT_OF_LUCKY_DRAWN_NUMBERS];
        this.luckyDraw = new Random();
    }

    public int[] getLuckyDrawnNumbers() {
        return this.luckyDrawnNumbers;
    }

    public Random getLuckyDraw() {
        return this.luckyDraw;
    }
}
