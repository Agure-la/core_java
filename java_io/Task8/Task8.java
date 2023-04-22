package Task8;

import java.io.*;
public class Task8 {

    void read(){
        File file = new File("mytextfile.txt");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello, world!");
            writer.newLine();
            writer.write("This is a new line of text.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
