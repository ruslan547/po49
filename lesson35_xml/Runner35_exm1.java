import by.itClass.sax.handlers.UserHandler35_exm1;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Runner35_exm1 {
    public static void main(String[] args) {
        UserHandler35_exm1 handler = new UserHandler35_exm1();

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse("lesson35/itClass.xml", handler);
        } catch (ParserConfigurationException | SAXException | IOException  e) {
            e.printStackTrace();
        }
    }
}
