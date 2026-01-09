package linked_list;

// Class to test the program
public class TaskScheduler {
    public static void main(String[] args) {
        // Creating the object of TaskManager class
        TaskManager list = new TaskManager();

        // Creating the object of TaskNode class
        TaskNode task1 = new TaskNode("Complete Assignment", "T001", 1, "2025-01-05");
        TaskNode task2 = new TaskNode("LeetCode", "T002", 2, "2025-01-10");
        TaskNode task3 = new TaskNode("make Project Report", "T003", 3, "2025-01-15");
        TaskNode task4 = new TaskNode("exercise", "T004", 4, "2025-01-20");
        TaskNode task5 = new TaskNode("Revise Java Concepts", "T005", 5, "2025-01-25");

        // Creating list by connecting nodes
        list.addAtBeginning(task1);
        list.addAtBeginning(task2);
        list.addAtEnd(task3);
        list.addAtIndex(task4, 2);
        list.addAtIndex(task5, 3);

        // To Display the all task
        list.display();

        // To Search the task having priority 3
        list.searchByPriority(3);

        // Deleting the task with task id T002
        list.deleteByTaskID("T002");

        // Displaying all the task after deleting some task
        list.display();

        // To Display the current task running and moving to next task
        list.viewCurrentTask();
    }
}

//Class TaskNode to define what properties Node of circular linked list contains
class TaskNode {
    String taskName;                                                  // Stores the Task Name
    String taskID;                                                    // Stores the Task ID
    int priority;                                                     // Stores the priority of task
    String dueDate;                                                   // Stores the Due Date of task
    TaskNode next = null;

    // Constructor of TaskNode class
    public TaskNode(String taskName, String taskID, int priority, String dueDate) {
        this.taskName = taskName;
        this.taskID = taskID;
        this.priority = priority;
        this.dueDate = dueDate;
    }

}

class TaskManager {
    TaskNode head = null;
    TaskNode tail = null;
    int size = 0;

    //  adds the node in the beginning of circular linked list
    public void addAtBeginning(TaskNode node) {
        if (head == null) {
            head = tail = node;
            head.next = head;
        } else {
            node.next = head;
            tail.next = node;
            head = node;
        }
        size++;
    }

    // adds the node in the end of circular linked list
    public void addAtEnd(TaskNode node) {
        if (head == null) {
            head = tail = node;
            head.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    //  adds the node at the specific position of circular linked list
    public void addAtIndex(TaskNode task, int index) {
        if (index < 0 || index > size) {
            System.err.println("Index out of range");
        } else if (head == null || index == 0) {
            addAtBeginning(task);
        } else if (index == size) {
            addAtEnd(task);
        } else {
            TaskNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            task.next = temp.next;
            temp.next = task;
            size++;
        }
    }

    // removes a task by using a Task ID
    public void deleteByTaskID(String taskID) {
        if (head == null) {
            System.err.println("List is Already Empty can't delete another task");
            return;
        } else if (head.taskID.equals(taskID)) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail.next = head.next;
                head.next = null;
                head = tail.next;
            }

        } else if (tail.taskID.equals(taskID)) {
            if (head == tail) {
                head = tail = null;
            } else {
                TaskNode temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = tail.next;
                tail.next = null;
                tail = temp;
            }
        } else {
            TaskNode temp = head;
            while (temp != tail.next && !temp.next.taskID.equals(taskID)) {
                temp = temp.next;
            }
            if (temp == tail) {
                System.err.println("There is no such task with TaskID " + taskID);
                System.out.println("_________________________________________________");
                return;
            } else {
                temp.next = temp.next.next;
            }
        }
        System.out.println("Task Deleted Successfully with TaskID " + taskID);
        System.out.println("_________________________________________________");
        size--;
    }

    // method to  display the all task in the circular linked list
    public void display() {
        if (head == null) {
            System.err.println("List is Already Empty can't display any task");
        } else if (head == tail) {
            System.out.println("Task Name : " + head.taskName);
            System.out.println("Task ID : " + head.taskID);
            System.out.println("Priority : " + head.priority);
            System.out.println("Due Date : " + head.dueDate);
            System.out.println("_______________________________________________");
        } else {
            TaskNode temp = head;
            do {
                System.out.println("Task Name : " + temp.taskName);
                System.out.println("Task ID : " + temp.taskID);
                System.out.println("Priority : " + temp.priority);
                System.out.println("Due Date : " + temp.dueDate);
                System.out.println("_______________________________________________");
                temp = temp.next;
            } while (temp != tail.next);
        }
    }

    //  search for the task by using the priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.err.println("List is Already Empty can't search any task");
        } else if (head.priority == priority) {
            System.out.println("Task found with Priority " + priority);
            System.out.println("Task Name : " + head.taskName);
            System.out.println("Task ID : " + head.taskID);
            System.out.println("Priority : " + head.priority);
            System.out.println("Due Date : " + head.dueDate);
            System.out.println("_______________________________________________");
        } else {
            TaskNode temp = head;
            while (temp != tail && temp.priority != priority) {
                temp = temp.next;
            }
            if (temp == tail.next) {
                System.err.println("There is no such task with Priority " + priority);
            } else {
                System.out.println("Task found with Priority " + priority);
                System.out.println("Task Name : " + temp.taskName);
                System.out.println("Task ID : " + temp.taskID);
                System.out.println("Priority : " + temp.priority);
                System.out.println("Due Date : " + temp.dueDate);
                System.out.println("_______________________________________________");
            }
        }
    }

    //  view the current task and move to another task
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        System.out.println("____________________________________________________");
        System.out.println("Current Task Running Details are : ");
        System.out.println("Task Name : " + head.taskName);
        System.out.println("Task ID : " + head.taskID);
        System.out.println("Priority : " + head.priority);
        System.out.println("Due Date : " + head.dueDate);
        System.out.println("_______________________________________________");
        head = head.next;
        tail = tail.next;
    }

}

