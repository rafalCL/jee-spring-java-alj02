package pl.coderslab.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.app.beans.MessageSender;
import pl.coderslab.app.beans.MessageSenderField;
import pl.coderslab.app.beans.MessageSenderSetter;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = ac.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage("hello Dave");

        MessageSenderSetter mss = ac.getBean("messageSenderSetter", MessageSenderSetter.class);
        mss.sendMessage("pedze do Ciebie światłowodem!");

        MessageSenderField msf = ac.getBean("messageSenderField", MessageSenderField.class);
        msf.sendMessage("hejoo");
    }
}
