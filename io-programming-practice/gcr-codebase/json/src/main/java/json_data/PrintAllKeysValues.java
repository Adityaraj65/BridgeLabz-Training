package json_data;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintAllKeysValues {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream is = PrintAllKeysValues.class
                .getClassLoader()
                .getResourceAsStream("user.json");

        if (is == null) {
            throw new RuntimeException("user.json not found in src/main/resources");
        }

        JsonNode rootNode = mapper.readTree(is);

        Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();

        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
