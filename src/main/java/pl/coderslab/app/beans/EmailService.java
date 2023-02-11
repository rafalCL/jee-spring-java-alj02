package pl.coderslab.app.beans;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("sending email with body: " + msg);
    }
}
