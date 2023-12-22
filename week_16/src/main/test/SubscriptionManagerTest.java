package main.test;

import main.java.SubscriptionManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriptionManagerTest {

    SubscriptionManager manager = new SubscriptionManager();
    @Test
    public void TC_01_TestFreeTierEmailNotificationsEnabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED", result,
                "\n           --> Testing Subscription Manager" +
                        "\n Test Data   : FREE tier, EMAIL notifications, ENABLED auto-renewal.");
    }

    @Test
    public void TC_02_TestStandardTierSmsNotificationsDisabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED", result,
                "\n           --> Testing Subscription Manager" +
                        "\n Test Data   : STANDARD tier, SMS notifications, DISABLED auto-renewal.");
    }

    @Test
    public void TC_03_TestPremiumTierNoneNotificationsEnabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED", result,
                "\n           --> Testing Subscription Manager" +
                        "\n Test Data   : PREMIUM tier, NONE notifications, ENABLED auto-renewal.");
    }

    @Test
    public void TC_04_TestFreeTierSmsNotificationsDisabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED", result,
                "\n           --> Testing Subscription Manager" +
                        "\n Test Data   : FREE tier, SMS notifications, DISABLED auto-renewal.");
    }

    @Test
    public void TC_05_TestStandardTierEmailNotificationsEnabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);
        assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED", result,
                "\n           --> Testing Subscription Manager" +
                        "\n Test Data   : STANDARD tier, EMAIL notifications, ENABLED auto-renewal.");
    }

    @Test
    public void TC_06_TestPremiumTierSmsNotificationsDisabledAutoRenewal() {
        String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);
        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED", result,
                "\n           --> Testing Subscription Manager" +
                        "\n Test Data   : PREMIUM tier, SMS notifications, DISABLED auto-renewal.");
    }
}
