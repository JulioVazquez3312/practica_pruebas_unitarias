package util;

public class PasswordUtil {
    public enum SecurityLevel {
        INCORRECTO, CORRECTO
    }

    public static SecurityLevel assessPassword(String password) {

        if (password.length() < 8) {
            return SecurityLevel.INCORRECTO;
        }

        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.INCORRECTO;
        }

        if (password.matches("[a-zA-Z0-9_$]+")) {
            return SecurityLevel.CORRECTO;
        }

        return SecurityLevel.INCORRECTO;

    }
}