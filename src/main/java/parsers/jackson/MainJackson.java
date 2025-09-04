package parsers.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import model.Root;
import model.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainJackson {
    public static void main(String[] args) throws IOException {
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

        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);

        //записать
        om.writeValue(new File("newJson.json"), root);

        //вычитать
        Root resultRoot = om.readValue(new File("file.json"), Root.class);
        System.out.println(resultRoot);
    }
}
