package util;

import org.junit.Test;

import static org.junit.Assert.*;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(INCORRECTO, PasswordUtil.assessPassword("asDF12_$"));

    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(CORRECTO, PasswordUtil.assessPassword("AS45er_$"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(INCORRECTO, PasswordUtil.assessPassword("$"));
    }
}