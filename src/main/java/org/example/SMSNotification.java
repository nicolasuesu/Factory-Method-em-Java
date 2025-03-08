package org.example;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("\n=== SMS Notification ===");
        System.out.println("To: (11) 99999-9999");
        System.out.println("Message: " + message);
        System.out.println("Status: SMS sent successfully!");
    }
}