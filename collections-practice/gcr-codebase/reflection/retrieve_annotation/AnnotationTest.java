package reflection.retrieve_annotation;

public class AnnotationTest {

    public static void main(String[] args) {

        try {
            // Load class
            Class<?> cls = Class.forName("reflection.retrieve_annotation.Book");
            // Check if Author annotation is present
            if (cls.isAnnotationPresent(Author.class)) {
                // Get the annotation
                Author author = cls.getAnnotation(Author.class);
                // Display annotation value
                System.out.println("Author Name: " + author.name());
            } else {
                System.out.println("Author annotation not found.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}

