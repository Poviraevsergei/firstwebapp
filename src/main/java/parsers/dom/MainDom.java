package parsers.dom;

import model.Root;
import model.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainDom {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //Создаем эеземпляр фабрики для билдеров
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Создаем билдер и парсим XML
        Document doc = factory.newDocumentBuilder().parse(new File("file.xml"));

        //Нормализация документа
        doc.normalize();

        Root root = new Root();
        List<Student> students = new ArrayList<>();
        Student student;

        //Получаем кол-во передаваемых студентов
        NodeList allCountsNodes = doc.getElementsByTagName("count");
        if (allCountsNodes.getLength() == 1) {
            root.setCount(Integer.parseInt(allCountsNodes.item(0).getTextContent()));
        }

        //Получаем список всех студентов
        NodeList studentsNodes = doc.getElementsByTagName("student");
        for (int i = 0; i < studentsNodes.getLength(); i++) {
            Element element = (Element) studentsNodes.item(i);
            student = new Student();
            student.setId(Integer.parseInt(element.getAttribute("id")));
            student.setName(element.getElementsByTagName("name").item(0).getTextContent());
            student.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));
            students.add(student);
        }
        root.setStudents(students);

        System.out.println(root);
    }
}
