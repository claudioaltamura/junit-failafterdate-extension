package de.claudioaltamura.junit.failafterdate.extension;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
@FailAfterDate(after = "2022-01-01", reason = "Please refactor the code as agreed upon!")
public class FailAfterDateExampleTest {

    @Test
    void test() {
        assertTrue(true);
    }

}
