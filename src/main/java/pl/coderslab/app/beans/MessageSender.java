package pl.coderslab.app.beans;

import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService service;

    public MessageSender(MessageService service) {
        this.service = service;
    }

    public void sendMessage(String msg) {
        String formatted = msg.toUpperCase();
        service.send(formatted);
    }
}
