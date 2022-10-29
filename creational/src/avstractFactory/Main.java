package avstractFactory;

import avstractFactory.ant.AntWidgetFactory;
import avstractFactory.app.ContactForm;

public class Main {
    public static void main(String[] args) {
        ContactForm contactForm = new ContactForm();
        contactForm.render(new AntWidgetFactory());
    }
}
