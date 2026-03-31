package json_data;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterByAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode array = mapper.readTree(new File("user.json"));

        for (JsonNode user : array) {
            if (user.get("age").asInt() > 25) {
                System.out.println(user);
            }
        }
    }
}
