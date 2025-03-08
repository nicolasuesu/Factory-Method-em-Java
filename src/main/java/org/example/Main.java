package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                showMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer

                if (choice == 0) {
                    System.out.println("Program ended!");
                    break;
                }

                if (choice >= 1 && choice <= 3) {
                    System.out.println("Type message:");
                    String message = scanner.nextLine();

                    // Usando o Factory para criar a notificação
                    Notification notification = NotificationFactory.createNotification(choice);
                    notification.send(message);
                } else {
                    System.out.println("Invalid option!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // limpa o buffer
            }
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n=== Notification System ===");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push Notification");
        System.out.println("0 - Exit");
        System.out.println("Select an option:");
    }
}