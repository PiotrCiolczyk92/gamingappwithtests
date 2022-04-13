package pl.gamingapp.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberReceiversValidatorTest {

    @Test
    public void checkIfNumberIsInArray(int number){
        Assertions.assertTrue(true, checkIf.isAlreadyIn(number));
    }

    @Test
    public void checkIfNumberIsInArray(int number) {
        Assertions.assertFalse(false, checkIf.isAlreadyIn(number));
    }

}
