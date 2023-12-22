package main.test;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostCalculatorTest {
    ShippingCostCalculator shippingCostCalculatorObj = new ShippingCostCalculator();

    @Test

    void TC_01_calculateCostTestLocalDestinationWithStandardDelivery() {
        double input = 5;

        assertEquals(5, shippingCostCalculatorObj.calculateCost(input, "local", "standard"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 1 * 1" +
                        "\n Test Data   : Weight = " + input + "\n"
                );
    }

    @Test

    void TC_02_calculateCostTestLocalDestinationWithExpressDelivery() {
        double input = 5;

        assertEquals(12.5, shippingCostCalculatorObj.calculateCost(input, "local", "express"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 1 * 2.5" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_03_calculateCostTestInternationalDestinationWithStandardDelivery() {
        double input = 5;

        assertEquals(25, shippingCostCalculatorObj.calculateCost(input, "International", "standard"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 5 * 1" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_04_calculateCostTestInternationalDestinationWithExpressDelivery() {
        double input = 5;

        assertEquals(62.5, shippingCostCalculatorObj.calculateCost(input, "International", "express"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 5 * 2.5" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_05_calculateCostTestLocalDestinationWithStandardDeliveryWithZeroWeight() {
        double input = 0;

        assertEquals(0, shippingCostCalculatorObj.calculateCost(input, "local", "standard"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 1 * 1" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_06_calculateCostTestLocalDestinationWithExpressDeliveryWithZeroWeight() {
        double input = 0;

        assertEquals(0, shippingCostCalculatorObj.calculateCost(input, "local", "express"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 1 * 2.5" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_07_calculateCostTestInternationalDestinationWithStandardDeliveryWithZeroWeight() {
        double input = 0;

        assertEquals(0, shippingCostCalculatorObj.calculateCost(input, "International", "standard"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 5 * 1" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_08_calculateCostTestInternationalDestinationWithExpressDeliveryWithZeroWeight() {
        double input = 0;

        assertEquals(0, shippingCostCalculatorObj.calculateCost(input, "International", "express"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 5 * 2.5" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_09_calculateCostTestLocalDestinationWithStandardDeliveryWithNegativeWeight() {
        double input = -5;

        assertEquals(-5, shippingCostCalculatorObj.calculateCost(input, "local", "standard"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 1 * 1" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_10_calculateCostTestLocalDestinationWithExpressDeliveryWithNegativeWeight() {
        double input = -5;

        assertEquals(-12.5, shippingCostCalculatorObj.calculateCost(input, "local", "express"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 1 * 2.5" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_11_calculateCostTestInternationalDestinationWithStandardDeliveryWithNegativeWeight() {
        double input = -5;

        assertEquals(-25, shippingCostCalculatorObj.calculateCost(input, "International", "standard"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 5 * 1" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }

    @Test

    void TC_12_calculateCostTestInternationalDestinationWithExpressDeliveryWithNegativeWeight() {
        double input = -5;

        assertEquals(-62.5, shippingCostCalculatorObj.calculateCost(input, "International", "express"),
                "\n           --> Testing Calculate Cost" +
                        "\n Rule        : Local Standard Delivery = weight * 5 * 2.5" +
                        "\n Test Data   : Weight = " + input + "\n"
        );
    }
}
