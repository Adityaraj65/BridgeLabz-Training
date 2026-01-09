package linked_list;

import java.util.Scanner;

// Node class representing a process
class ProcessNode {
    int pid;                 // Process ID
    int burstTime;           // Total burst time
    int remainingTime;       // Remaining execution time
    ProcessNode next;        // Next process in circular list

    ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

// Round Robin Scheduler using Circular Linked List
class RoundRobinScheduler {

    private ProcessNode tail = null;   // Tail of circular list
    private int timeQuantum;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at the end of circular linked list
    public void addProcess(int pid, int burstTime) {
        ProcessNode newNode = new ProcessNode(pid, burstTime);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;   // Single node points to itself
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Process added: PID " + pid);
    }

    // Display all processes
    public void displayQueue() {
        if (tail == null) {
            System.out.println("Queue is empty.");
            return;
        }

        ProcessNode temp = tail.next;
        System.out.println("Process Queue:");
        do {
            System.out.println("PID: " + temp.pid +
                    " | Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != tail.next);
    }

    // Execute Round Robin Scheduling
    public void executeRoundRobin() {
        if (tail == null) {
            System.out.println("No processes to execute.");
            return;
        }

        int time = 0;
        int totalWT = 0;
        int totalTAT = 0;
        int completed = 0;

        ProcessNode current = tail.next;
        int totalProcesses = countProcesses();

        while (completed < totalProcesses) {

            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);

                System.out.println("\nExecuting PID " + current.pid +
                        " for " + execTime + " units");

                current.remainingTime -= execTime;
                time += execTime;

                if (current.remainingTime == 0) {
                    completed++;
                    int turnaroundTime = time;
                    int waitingTime = turnaroundTime - current.burstTime;

                    totalWT += waitingTime;
                    totalTAT += turnaroundTime;

                    System.out.println("PID " + current.pid + " completed");
                    System.out.println("Waiting Time: " + waitingTime);
                    System.out.println("Turnaround Time: " + turnaroundTime);
                }
            }

            displayQueue();
            current = current.next;
        }

        System.out.println("\nAverage Waiting Time: " + (float) totalWT / totalProcesses);
        System.out.println("Average Turnaround Time: " + (float) totalTAT / totalProcesses);
    }

    // Count number of processes
    private int countProcesses() {
        if (tail == null) return 0;

        int count = 0;
        ProcessNode temp = tail.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != tail.next);

        return count;
    }
}

// Driver class
public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time Quantum: ");
        int tq = sc.nextInt();

        RoundRobinScheduler scheduler = new RoundRobinScheduler(tq);

        boolean run = true;

        while (run) {
            System.out.println("\n1. Add Process");
            System.out.println("2. Display Queue");
            System.out.println("3. Run Round Robin");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Burst Time: ");
                    int bt = sc.nextInt();
                    scheduler.addProcess(pid, bt);
                    break;

                case 2:
                    scheduler.displayQueue();
                    break;

                case 3:
                    scheduler.executeRoundRobin();
                    break;

                case 4:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}

