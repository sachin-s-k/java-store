package org.example.springstore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Email")
@Primary
public class EmailNotification implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println(message+"email");
    }
}
