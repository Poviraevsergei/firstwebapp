package parsers.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import model.Root;

import java.io.File;

public class JaxBMainReader {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Root.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        Root root = (Root) unmarshaller.unmarshal(new File("file.xml"));

        System.out.println(root);
    }
}
