import by.itClass.beans.User35;
import by.itClass.sax.handlers.UserHandler35_exm3;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Runner35_exm3 {
        public static void main(String[] args) {
            UserHandler35_exm3 handler = new UserHandler35_exm3();

            try {
                SAXParserFactory factory = SAXParserFactory.newInstance();
                SAXParser saxParser = factory.newSAXParser();
                saxParser.parse("lesson35_xml/itClass36.xml", handler);
            } catch (ParserConfigurationException | SAXException | IOException e) {
                e.printStackTrace();
            }

            User35 user = handler.getUser();
            System.out.println(user);
        }
}
