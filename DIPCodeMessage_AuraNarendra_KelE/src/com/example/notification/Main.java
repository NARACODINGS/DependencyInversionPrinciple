package com.example.notification;
public class Main {
    public static void main(String[] args) {
        // You can easily switch between different services at runtime
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        // Pass the service into the NotificationService
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification("I hope you live a good live :) via Email!");

        notificationService = new NotificationService(smsService);
        notificationService.sendNotification("I hope you die in the blazing magma of hell >:( SMS!");
    }
}

