package main.test;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AgeRestrictionValidatorTest {
    AgeRestrictionValidator ageRestrictionValidatorObj = new AgeRestrictionValidator();

    @Test

    void TC_01_TestisEligibleWithInvalidAge_17() {
        int input = 17;

        assertFalse(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages below 18 are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_02_TestisEligibleWithValidAge_18() {
        int input = 18;

        assertTrue(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages between 18 - 65 are valid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_03_TestisEligibleWithValidAge_19() {
        int input = 19;

        assertTrue(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages between 18 - 65 are valid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_04_TestisEligibleWithValidAge_64() {
        int input = 64;

        assertTrue(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages between 18 - 65 are valid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_05_TestisEligibleWithValidAge_65() {
        int input = 65;

        assertTrue(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages between 18 - 65 are valid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_06_TestisEligibleWithValidAge_66() {
        int input = 66;

        assertFalse(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages above 65 are invalid" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_07_TestisEligibleWithValidAge_0() {
        int input = 0;

        assertFalse(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages can not be 0" +
                        "\n Test Data   : " + input + "\n");
    }

    @Test

    void TC_08_TestisEligibleWithValidAge_100() {
        int input = 66;

        assertFalse(ageRestrictionValidatorObj.isEligible(input),
                "\n           --> Testing Age Restriction Validator" +
                        "\n Rule        : Ages above 65 are invalid" +
                        "\n Test Data   : " + input + "\n");
    }
}
