package org.example;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("\n=== Push Notification ===");
        System.out.println("To: User's Device");
        System.out.println("Message: " + message);
        System.out.println("Status: Push notification sent successfully!");
    }
}