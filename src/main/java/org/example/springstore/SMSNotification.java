package org.example.springstore;

import org.springframework.stereotype.Service;

@Service

public class SMSNotification implements NotificationService {


    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
