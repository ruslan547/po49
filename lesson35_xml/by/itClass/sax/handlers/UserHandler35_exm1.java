package by.itClass.sax.handlers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//that sax uses UserHandler like tool for pars xml, need to extends from class DefaultHandler
public class UserHandler35_exm1 extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("START DOCUMENT");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("END DOCUMENT");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("open tag: " + qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("close tag:" + qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        System.out.println("value tag:" + value);
    }
}
