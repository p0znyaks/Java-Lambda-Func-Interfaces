package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "kak dela", "normalno", "poka");
        list.forEach(s -> System.out.println(s));
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });
        Function<Student, Double> f = stud -> stud.avgGrade;
    }
    private  static  double avgOfSomething(List<Student> students, Function<Student, Double> f) {
        double result = 0;
        for (Student s : students) {
            result += f.apply(s);
        }
        return result / students.size();
    }
}
