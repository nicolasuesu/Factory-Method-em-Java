package org.example;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("\n=== Email Notification ===");
        System.out.println("To: user@email.com");
        System.out.println("Subject: New Notification");
        System.out.println("Message: " + message);
        System.out.println("Status: Email sent successfully!");
    }
}