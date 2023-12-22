package main.test;

import main.java.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginValidatorTest {
    LoginValidator loginValidatorObj = new LoginValidator();
    @Test

    void TC_01TestValidateUsernameWithValidUsername () {

        String input = "abc@abc.com";

        assertTrue(loginValidatorObj.validateUsername(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Valid usernames are email addresses with '@' and a domain name including 'e.g. .com'" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_02TestValidateUsernameWithInvalidUsernameWithoutSymbol () {

        String input = "abcabc.com";

        assertFalse(loginValidatorObj.validateUsername(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Email addresses without '@' are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_03TestValidateUsernameWithInvalidUsernameWithoutDomain () {

        String input = "abc@abc";

        assertFalse(loginValidatorObj.validateUsername(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Email addresses without domain name are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_04TestValidateUsernameWithInvalidUsernameWithInvalidCharacters () {

        String input = "ab(c@abc.com";

        assertFalse(loginValidatorObj.validateUsername(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Allowed special characters in email addresses are _ , + , & , * , - and ." +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_05TestValidateUsernameWithInvalidUsernameWithEmptyEmailString () {

        String input = "";

        assertFalse(loginValidatorObj.validateUsername(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Email field can not be empty" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_06TestValidateUsernameWithInvalidUsernameWithNullEmailAdress () {

        String input = null;

        assertFalse(loginValidatorObj.validateUsername(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Email field can not be null" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_07TestValidatePasswordWithValidPassword () {

        String input = "12345abc*";

        assertTrue(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Valid passwords consists of 8-16 characters with at least one number abd special character" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_08TestValidatePasswordWithInvalidPasswordWithoutSpecialCharacter () {

        String input = "12345abcd";

        assertFalse(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Passwords without any special character are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_09TestValidatePasswordWithInvalidPasswordWithoutNumber () {

        String input = "asdsdfabcd*";

        assertFalse(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Passwords without any number are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_10TestValidatePasswordWithInvalidPasswordLessThan8Chars () {

        String input = "12abcd*";

        assertFalse(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Passwords shorter than 8 chars are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_11TestValidatePasswordWithInvalidPasswordMoreThan16Chars () {

        String input = "1234567890abcdef*";

        assertFalse(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Passwords longer than 16 chars are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_12TestValidatePasswordWithInvalidPasswordEmptyPassword () {

        String input = "";

        assertFalse(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Empty passwords are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_13TestValidatePasswordWithInvalidPasswordNull () {

        String input = null;

        assertFalse(loginValidatorObj.validatePassword(input),
                "\n           --> Testing Login Validator" +
                        "\n Rule        : Passwords can not be null" +
                        "\n Test Data   : " + input + "\n");
    }
}

