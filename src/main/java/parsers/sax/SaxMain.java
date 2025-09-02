package parsers.sax;

import model.Root;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxMain {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //Создаем экземпляр фабрики
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        SaxHandler handler = new SaxHandler();

        saxParser.parse(new File("file.xml"), handler);
        Root root = handler.getRoot();

        System.out.println(root);
    }
}
