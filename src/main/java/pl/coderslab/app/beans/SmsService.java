package pl.coderslab.app.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mySmsService")
public class SmsService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("sending SMS with body: " + msg);
    }
}
