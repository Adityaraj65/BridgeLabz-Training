package linked_list;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentRecordManager list = new StudentRecordManager();

        // Creating 6 Nodes
        StudentNode student1 = new StudentNode(1, "Messi", 35, 91);
        StudentNode student2 = new StudentNode(2, "Ronaldo", 40, 90);
        StudentNode student3 = new StudentNode(3, "Neymar", 33, 95);
        StudentNode student4 = new StudentNode(4, "Sunil", 38, 97);
        StudentNode student5 = new StudentNode(5, "Mbappe", 25, 81);
        StudentNode student6 = new StudentNode(6, "Halland", 26, 85);

        // Connecting the Nodes
        list.addAtEnd(student1);
        list.addAtEnd(student2);
        list.addAtBeginning(student3);
        list.addAtIndex(student4, 1);
        list.addAtIndex(student5, 3);
        list.addAtBeginning(student6);

        // Searching the Student Record by using Roll Number
        list.searchByRollNumber(4);

        // Searching the Grades of student by using roll number
        list.searchGrades(2);

        // Displaying the details of all students
        list.display();

        // Deleting the record by using the roll number
        list.deleteByRollNumber(5);

        // Displaying the details of all students after deleting some records
        list.display();
    }

}

// StudentNode Class that represents what value a node store of singly linked list
class StudentNode {
    int rollNumber;
    String name;
    int age;
    int grade;
    StudentNode next;

    // Constructor of StudentNode class to initialize variables
    public StudentNode(int rollNumber, String name, int age, int grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;

    }

}

class StudentRecordManager {
    StudentNode head = null;
    StudentNode tail = null;
    int size = 0;

    // This Method Stores the Student record at the Beginning of the Linked List
    public void addAtBeginning(StudentNode student) {
        student.next = head;
        head = student;
        size++;
    }

    // This Method Stores the Student record at the end of the Linked List
    public void addAtEnd(StudentNode student) {
        if (head == null) {
            head = tail = student;
        } else {
            tail.next = student;
            tail = student;
        }
        size++;
    }

    // This Method add Student Record on a specific Position
    public void addAtIndex(StudentNode student, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
        } else {
            StudentNode temp = head;
            if (index == 0) {
                addAtBeginning(student);
            } else if (index == size) {
                addAtEnd(student);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                student.next = temp.next;
                temp.next = student;
                size++;
            }
        }
    }

    // This Method delete student record on the basis of roll number
    public void deleteByRollNumber(int rollNumber) {
        StudentNode temp = head;
        if (head == null) {
            System.err.println("EmptyList");
        } else {
            if (head.rollNumber == rollNumber) {
                deleteAtHead();
                size--;
            } else {
                while ((temp.next != null) && (temp.next.rollNumber != rollNumber)) {
                    temp = temp.next;
                }
                if (temp.next == null) {
                    System.out.println("record not found");
                } else {                                                       // Deleting the record who have the same roll number we want to delete
                    if (temp.next == tail) {
                        tail = temp;
                    }
                    temp.next = temp.next.next;
                    size--;
                }
            }
        }
    }

    // This method deletes the record from the head of the list
    private void deleteAtHead() {
        try {
            head = head.next;
        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
    }

    // This method search for Student Record by using roll number
    public void searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null && temp.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Student record with this roll number ");
        } else {
            System.out.println("Student record found with this roll number :");
            System.out.println("name : " + temp.name);
            System.out.println("Age : " + temp.age);
            System.out.println("roll number : " + temp.rollNumber);
            System.out.println("grade :" + temp.grade);
            System.out.println("------------------------------------");
        }
    }

    // This method display all student details in the list
    public void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Name : " + temp.name);
            System.out.println("Age : " + temp.age);
            System.out.println("Roll Number : " + temp.rollNumber);
            System.out.println("Grade : " + temp.grade);
            System.out.println("__________________________________________");
            temp = temp.next;
        }
        if (head == null) {
            System.err.println("List is already Empty .");
        }
    }

    // This method display the grade of student based on their roll number
    public void searchGrades(int rollNumber) {
        StudentNode temp = head;
        while (temp != null && temp.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp == null) {
            System.err.println("No Student grade found with this roll number . ");
        } else {
            System.out.println("Student grade found with roll number " + rollNumber);
            System.out.println("Grade of the student : " + temp.grade);
            System.out.println("_________________________________________________");
        }
    }

}
