package json_data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = mapper.createObjectNode();
        json1.put("name", "Aditya");
        json1.put("age", 21);

        ObjectNode json2 = mapper.createObjectNode();
        json2.put("email", "aditya@example.com");
        json2.put("city", "Delhi");

        // Merge json2 into json1
        json1.setAll(json2);

        System.out.println(json1);
    }
}

