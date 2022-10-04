package util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {
    private PasswordUtil password;
    @Before
    public void setup(){
        password = new PasswordUtil();
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, password.assessPassword("13123s"));
    }
    @Test
    public void null_when_has_no_letters() {
        assertEquals(WEAK, password.assessPassword("     #!!###############"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, password.assessPassword("abcde12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, password.assessPassword("Adasd@2123"));
    }
}