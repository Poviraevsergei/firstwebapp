package parsers.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import model.Root;
import model.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JaxBMainWriter {
    public static void main(String[] args) throws JAXBException {
        Root root = new Root();
        root.setCount(2);

        Student studentDarya = new Student();
        studentDarya.setId(1);
        studentDarya.setName("Darya");
        studentDarya.setAge(18);

        Student studentLesha = new Student();
        studentLesha.setId(2);
        studentLesha.setName("Lesha");
        studentLesha.setAge(28);

        List<Student> students = Arrays.asList(studentDarya, studentLesha);
        root.setStudents(students);

        JAXBContext context = JAXBContext.newInstance(Root.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(root, new File("resultjaxb.xml"));
    }
}
