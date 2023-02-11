package pl.coderslab.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderSetter {
    private MessageService service;

    @Autowired // dependency injection by setter
    public void setService(MessageService service) {
        this.service = service;
    }

    public void sendMessage(String msg) {
        String formatted = msg.toUpperCase();
        service.send(formatted);
    }
}
