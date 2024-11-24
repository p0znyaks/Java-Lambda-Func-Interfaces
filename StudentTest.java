package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentTest {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if(pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
