package stream;

import java.io.*;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("F:\\BridgeLabz-Training\\stream-practice\\gcr-codebase\\stream\\source.txt");
            FileOutputStream fos= new FileOutputStream("F:\\BridgeLabz-Training\\stream-practice\\gcr-codebase\\stream\\destination.txt")){
            int bytedata;
            while((bytedata=fis.read())!=-1) {
                fos.write(bytedata);
            }
            System.out.println("File Copied Successfully");
        }

        catch (FileNotFoundException e) {
            System.out.println(" Source file not found: " + "C:\\Users\\Tanya Maheshwari\\eclipse-workspace\\input.txt");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

}

