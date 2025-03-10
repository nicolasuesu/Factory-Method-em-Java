# Notification System with Factory Pattern in Java

## Project Description

This project demonstrates a simple notification system that applies the **Factory Method Pattern**. The system allows users to choose from multiple notification types (Email, SMS, and Push Notification) and send a message through the selected channel. It leverages Object-Oriented Programming (OOP) principles such as encapsulation, inheritance, polymorphism, and interfaces.

## Features

- **Email Notification:**  
  Sends an email notification with a preset recipient and subject.

- **SMS Notification:**  
  Sends an SMS notification to a predefined phone number.

- **Push Notification:**  
  Sends a push notification to a user's device.

## Code Structure

- **Notification.java:**  
  Declares the `Notification` interface with the method `send(String message)`.

- **EmailNotification.java:**  
  Implements the `Notification` interface for sending email notifications.

- **SMSNotification.java:**  
  Implements the `Notification` interface for sending SMS notifications.

- **PushNotification.java:**  
  Implements the `Notification` interface for sending push notifications.

- **NotificationFactory.java:**  
  Contains a factory method `createNotification(int type)` that instantiates the correct notification type based on the user's selection.

- **Main.java:**  
  The main class which displays an interactive menu, handles user input, and utilizes the factory to send notifications.

## How to Run

### Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher.
- **Terminal or IDE:** For compiling and running the code.

### Compilation and Execution

1. **Save Each Class in a Separate File**  
   Ensure that each class is saved in its own file (e.g., `Notification.java`, `EmailNotification.java`, etc.).

2. **Compile the Code**  
   Open your terminal in the directory containing the Java files and run:
   ```bash
   javac *.java
   ```

3. **Run the Program**  
   After successful compilation, run the program with:
   ```bash
   java Main
   ```

4. **Usage**  
   The program will display the following menu:
   ```
   === Notification System ===
   1 - Email
   2 - SMS
   3 - Push Notification
   0 - Exit
   Please choose an option:
   ```
   - Enter the option corresponding to the desired notification type.
   - Type your message when prompted.
   - The selected notification will be sent, and its status will be displayed on the terminal.

## Design and Implementation Details

- **Factory Method Pattern:**  
  The factory (`NotificationFactory.java`) is used to instantiate notification objects based on user input. This encapsulates object creation and simplifies the addition of new notification types.

- **OOP Concepts:**
   - **Encapsulation:** Each notification type encapsulates its specific behavior.
   - **Inheritance and Polymorphism:** All notification classes implement the `Notification` interface, enabling polymorphic behavior.
   - **Interfaces:** The `Notification` interface defines a common contract for all notification types.

- **Error Handling:**  
  The program uses try/catch blocks to handle invalid input and displays clear error messages.

- **Extensibility:**  
  To add a new notification type:
   1. Create a new class that implements the `Notification` interface.
   2. Update the `NotificationFactory` to handle the new type.
   3. Add the corresponding option in the menu in `Main.java`.

## Conclusion

This project is a practical implementation of the Factory Method Pattern in Java. It illustrates how to create a modular and scalable notification system using OOP principles. The code is organized into separate files for clarity, making it easier to maintain and extend.

---