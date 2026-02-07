package stream_api.transforming_name;

import java.util.*;
import java.util.stream.Collectors;

public class TransformName{

    public static void main(String[] args) {

        // creating list of customer names
        List<String> names = new ArrayList<>();
        names.add("aditya");
        names.add("rahul");
        names.add("neha");
        names.add("amit");
        names.add("priya");

        // converting names to uppercase and sorting alphabetically
        List<String> result =
                names.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
        // printing final result
        result.forEach(name -> System.out.println(name));
    }
}

