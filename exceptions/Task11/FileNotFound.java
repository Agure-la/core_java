package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {

    void getFile(){
        try {
            File file = new File("myfile.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
