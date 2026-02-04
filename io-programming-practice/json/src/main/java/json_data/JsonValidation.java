package json_data;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidation {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(new File("F:\\BridgeLabz-Training\\io-programming-practice\\json\\src\\main\\resource\\user.json"));

        if (node.has("name") && node.has("email")) {
            System.out.println("JSON is valid");
        } else {
            System.out.println("JSON is invalid");
        }
    }
}

