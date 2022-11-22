package de.claudioaltamura.junit.failafterdate.extension;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailAfterDateTest {

    @Disabled
    @Test
    @FailAfterDate(after = "2022-01-01", reason = "Please refactor the code as agreed upon!")
    void whenFailAfterDateInThePastTestFeils() {
        assertTrue(true);
    }

    @Test
    @FailAfterDate(after = "2999-01-01", reason = "Please refactor the code as agreed upon!")
    void whenFailAfterDateInTheFutureTestPass() {
        assertTrue(true);
    }

    @Test
    void secondTest() {
        assertTrue(true);
    }

}
