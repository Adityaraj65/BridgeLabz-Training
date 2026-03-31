package smart_university_library_management_system;

// Student class
class Student implements User {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Student.");
    }

    // This method is called when notification is sent
    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

