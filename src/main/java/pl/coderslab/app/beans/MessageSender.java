package pl.coderslab.app.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService service;

    public MessageSender(@Qualifier("smsService") MessageService service) {
        this.service = service;
    }

    public void sendMessage(String msg) {
        String formatted = msg.toUpperCase();
        service.send(formatted);
    }
}
