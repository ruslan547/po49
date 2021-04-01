package by.itClass.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AnalyzesDOM {
    public static void analyzed(Document document) {
        //method getDocumentElement return root element
        Element root = document.getDocumentElement();

        //

        NodeList nodeList1 = root.getElementsByTagName("user");
        NodeList nodeList2 = root.getChildNodes();

        for (int i = 0; i < nodeList2.getLength(); i++) {
            Node node = nodeList2.item(i);
            System.out.println("node name:" + node.getNodeName() + ", node value:" + node.getNodeValue());
            String value = node.getTextContent();
            System.out.println("text content:" + value);
        }
    }
}
