package pl.gamingapp.lotterydrawsystem;

public class LotteryRandomNumbersReceiver {
    private final int AMOUNT_OF_LUCKY_DRAWN_NUMBERS = 6;
    private int[] luckyDrawnNumbers;

    public LotteryRandomNumbersReceiver() {
        this.luckyDrawnNumbers = new int[AMOUNT_OF_LUCKY_DRAWN_NUMBERS];
    }
}
