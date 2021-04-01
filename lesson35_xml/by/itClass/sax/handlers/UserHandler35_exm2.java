package by.itClass.sax.handlers;

import by.itClass.beans.User35;
import by.itClass.sax.enums.UserField;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler35_exm2 extends DefaultHandler {
    private final static String ROOT = "user";
    private User35 user;
    private UserField field;

    public User35 getUser() {
        return user;
    }

    public UserHandler35_exm2() {
        super();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals(ROOT)) {
            user = new User35();
        } else {
            field = UserField.valueOf(qName.toUpperCase());
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            switch (field) {
                case LOGIN:
                    user.setLogin(value);
                    break;
                case PASSWORD:
                    user.setPassword(value);
                    break;
                case NAME:
                    user.setName(value);
                    break;
                case AGE:
                    int age = Integer.parseInt(value);
                    user.setAge(age);
                    break;
            }
            field = null;
        }
    }
}
