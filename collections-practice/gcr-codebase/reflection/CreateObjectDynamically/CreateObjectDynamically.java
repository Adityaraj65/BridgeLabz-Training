package reflection.CreateObjectDynamically;

public class CreateObjectDynamically {

    public static void main(String[] args) {

        try {
            Class c = Class.forName("reflection.CreateObjectDynamically.Student");

            // Create object using constructor
            Object obj = c.getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
