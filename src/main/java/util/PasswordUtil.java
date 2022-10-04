package util;

public class PasswordUtil {
    public enum SecurityLevel {
        NULL,WEAK, MEDIUM, STRONG
    }

    public SecurityLevel assessPassword(String password) {

        if (password.isEmpty()||password.isBlank())
            return SecurityLevel.NULL;

        if (password.length() < 8) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z]+")) {
            return SecurityLevel.WEAK;
        }

        if (password.matches("[a-zA-Z0-9]+")) {
            return SecurityLevel.MEDIUM;
        }
        //para ser fuerte necesita tener
        //    Minimo 8 caracteres
        //    Maximo 15
        //    Al menos una letra mayúscula
        //    Al menos una letra minucula
        //    Al menos un dígito
        //    No espacios en blanco
        //    Al menos 1 caracter especial
        if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}"))
            return SecurityLevel.STRONG;

        return SecurityLevel.WEAK;

    }
}