package pl.coderslab.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderField {
    @Autowired // field injection
    private MessageService service;

    public void sendMessage(String msg) {
        String formatted = msg.toUpperCase();
        service.send(formatted);
    }
}
