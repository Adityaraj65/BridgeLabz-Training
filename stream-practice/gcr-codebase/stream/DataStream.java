package stream;

import java.io.*;

public class DataStream {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // write data
        try {
            DataOutputStream dos =
                    new DataOutputStream(new FileOutputStream(fileName));

            // writing primitive data
            dos.writeInt(101);           // roll number
            dos.writeUTF("Aditya");      // name
            dos.writeDouble(8.5);        // GPA

            dos.close();
            System.out.println("Student data saved.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // read data
        try {
            DataInputStream dis =
                    new DataInputStream(new FileInputStream(fileName));

            // reading data in same order
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            dis.close();

            System.out.println("Student data retrieved:");
            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

