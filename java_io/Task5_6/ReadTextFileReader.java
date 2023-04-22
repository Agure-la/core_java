package Task5_6;

import java.io.*;
public class ReadTextFileReader {

    void ReadText(){
        File file = new File("mytextfile.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    void writeText(){
        String text = "Hello, world!";
        File file = new File("mytextfile.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file);
            writer.write(text);
            System.out.println("Text written to file!");
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
