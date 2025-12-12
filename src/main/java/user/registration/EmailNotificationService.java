package user.registration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary

public class EmailNotificationService implements NotificationService {
    @Value("$mail.host")
    private String host;
    @Value("$mail.port")
    private int port;

    @Override
    public void senNotification(String message, String recepientEmail) {
        System.out.println("Sending message to email: " + message+""+recepientEmail);
        System.out.println(""+host+":"+port);
    }
}
