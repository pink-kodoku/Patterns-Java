package abstractFactory;

import abstractFactory.ant.AntWidgetFactory;
import abstractFactory.app.ContactForm;

public class Main {
    public static void main(String[] args) {
        ContactForm contactForm = new ContactForm();
        contactForm.render(new AntWidgetFactory());
    }
}
