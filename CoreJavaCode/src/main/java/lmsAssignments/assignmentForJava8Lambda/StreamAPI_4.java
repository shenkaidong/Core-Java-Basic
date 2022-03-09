package lmsAssignments.assignmentForJava8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamAPI_4 {
    public static void main(String[] args) {
        List<String> list_s = new ArrayList<>();
        list_s.add("acb");
        list_s.add("def");
        list_s.add("mbv");
        list_s.add("azx");

        List<String> new_l = list_s
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        new_l.forEach(System.out::println);

    }
}
