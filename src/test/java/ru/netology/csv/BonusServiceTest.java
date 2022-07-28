package ru.netology.csv;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest

    @CsvFileSource(resources = "/data.csv")
    public void testRegisteredUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();
        int actual = service.calcBonus(amount, isRegistered);

        assertEquals(expected, actual);
    }
}
