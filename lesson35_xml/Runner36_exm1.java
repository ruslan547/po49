import by.itClass.beans.User36;
import by.itClass.sax.handlers.UserHandler36;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Runner36_exm1 {
    public static void main(String[] args) {
        UserHandler36 handler = new UserHandler36();

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse("lesson35_xml/itClass.xml", handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        User36 user = handler.getUser();
        System.out.println(user);
    }
}
