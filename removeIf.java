package Lambda;

import java.util.ArrayList;

public class removeIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Java");
        arrayList.add("Lambda");
        arrayList.removeIf(s -> s.length() < 5);
        System.out.println(arrayList);
    }
}
