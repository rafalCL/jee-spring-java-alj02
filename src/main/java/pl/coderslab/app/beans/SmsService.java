package pl.coderslab.app.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("sending SMS with body: " + msg);
    }
}
