package de.claudioaltamura.junit.failafterdate.extension;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailAfterDateTest {

    @Test
    @Disabled
    @FailAfterDate(from ="2022-01-01", reason = "Please refactor the code as agreed upon!")
    void failFrom() {
        assertTrue(true);
    }

    @Test
    void secondTest() {
        assertTrue(true);
    }

}
