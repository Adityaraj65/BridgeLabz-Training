package json_data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Person> people = new ArrayList<>();
        people.add(new Person("ram", 24));
        people.add(new Person("shayam", 30));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(people);

        System.out.println(jsonArray);
    }
}

