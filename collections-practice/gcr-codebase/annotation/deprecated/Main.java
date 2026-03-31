package annotation.deprecated;

public class Main {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        // Calling deprecated method
        api.oldFeature();   // ⚠️ Warning in IDE

        // Calling new method
        api.newFeature();
    }
}

