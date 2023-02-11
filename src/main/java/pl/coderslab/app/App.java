package pl.coderslab.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.app.beans.MessageSender;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = ac.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage("hello Dave");
    }
}
