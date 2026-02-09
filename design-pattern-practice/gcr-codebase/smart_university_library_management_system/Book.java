package smart_university_library_management_system;

// Book class using Builder pattern
class Book {

    private String title;      // mandatory
    private String author;     // optional
    private String edition;    // optional
    private String genre;      // optional
    private String publisher;  // optional

    // Private constructor
    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
    }

    public String getTitle() {
        return title;
    }

    // Static inner Builder class
    public static class BookBuilder {

        private String title;
        private String author;
        private String edition;
        private String genre;
        private String publisher;

        // Mandatory field
        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}

