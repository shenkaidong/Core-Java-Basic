package lmsAssignments.assignmentForJava8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("peter", 23));
        list.add(new Person("ashe", 23));
        list.add(new Person("mary", 23));
        list.add(new Person("ana", 23));
        list.add(new Person("john", 23));
        System.out.println(search(list));
    }

    public static List<String> search(List<Person> list) {
        List<String> l_str = new ArrayList<>();

        List<Person> new_l = list
                .stream()
                .filter(x->x.name.startsWith("a"))
                .filter(x->x.name.length() == 3)
                .collect(Collectors.toList());

        new_l.forEach(x -> l_str.add(x.name));

        return l_str;

    }
}
