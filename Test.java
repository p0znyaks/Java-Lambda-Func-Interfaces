package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentTest test = new StudentTest();

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'f';
        test.testStudents(students, p1);
        System.out.println("---------------");
        test.testStudents(students, p1.and(p2));
        System.out.println("---------------");
        test.testStudents(students, p1.or(p2));
        System.out.println("---------------");
        test.testStudents(students, s -> s.avgGrade < 8);
//        test.testStudents(students, s -> s.age < 30);
//        test.testStudents(students, s -> s.avgGrade > 8);
//        test.testStudents(students, s -> s.avgGrade < 9.3 && s.age < 30 && s.sex == 'f');
    }
}