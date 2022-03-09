package lmsAssignments.assignmentForJava8Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_2 {
    public static void main(String[] args) {
        List<Integer> list_i = new ArrayList<>();
        list_i.add(12);
        list_i.add(3);
        list_i.add(11);
        list_i.add(26);

        System.out.println(getString(list_i));

    }

    public static String getString(List<Integer> list) {
        List<String> new_l = list
                .stream()
                .map(x-> {
                    String s = ((x % 2) == 0) ? ("e" + String.valueOf(x)) : ("o" + String.valueOf(x));
                    return s;
                })
                .collect(Collectors.toList());
        return String.join(",", new_l);
    }
}
