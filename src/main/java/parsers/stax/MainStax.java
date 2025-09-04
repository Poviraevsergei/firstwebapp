package parsers.stax;

import model.Root;
import model.Student;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainStax {
    public static void main(String[] args) {
        Root root = null;
        List<Student> students = null;
        Student student = null;

        //создаем фабрику и ридер
        try (FileInputStream fileInputStream = new FileInputStream("file.xml")) {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(fileInputStream);

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    String elementName = event.asStartElement().getName().getLocalPart();
                    switch (elementName) {
                        case "root" -> root = new Root();
                        case "count" -> {
                            event = eventReader.nextEvent();
                            if (root != null) {
                                root.setCount(Integer.parseInt(event.asCharacters().getData()));
                            }
                        }
                        case "students" -> students = new ArrayList<>();
                        case "student" -> {
                            student = new Student();
                            student.setId(Integer.parseInt(event.asStartElement().getAttributes().next().getValue()));
                        }
                        case "age" -> {
                            event = eventReader.nextEvent();
                            if (student != null) {
                                student.setAge(Integer.parseInt(event.asCharacters().getData()));
                            }
                        }
                        case "name" -> {
                            event = eventReader.nextEvent();
                            if (student != null) {
                                student.setName(event.asCharacters().getData());
                            }
                        }
                    }
                }

                if (event.isEndElement()) {
                    String elementName = event.asEndElement().getName().getLocalPart();
                    switch (elementName) {
                        case "student" -> {
                            if (students != null) {
                                students.add(student);
                            }
                        }
                        case "students" -> {
                            if (students != null && root != null) {
                                root.setStudents(students);
                            }
                        }
                    }
                }
            }
        } catch (XMLStreamException | IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(root);
    }
}
