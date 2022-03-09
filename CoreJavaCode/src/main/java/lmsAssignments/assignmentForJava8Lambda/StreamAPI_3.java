package lmsAssignments.assignmentForJava8Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamAPI_3 {
    public static void main(String[] args) {
//        List<Integer> list_i = new ArrayList<>();
//        list_i.add(12);
//        list_i.add(3);
//        list_i.add(11);
//        list_i.add(26);

        List<Integer> list_i = Arrays.asList(12,3,11,26);
        
        Double average = list_i
                .stream()
                .mapToDouble(x-> x.intValue())
                .average().getAsDouble();

        System.out.println(average);
    }
}
