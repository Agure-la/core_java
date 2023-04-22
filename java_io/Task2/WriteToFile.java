package Task2;

import java.io.*;
public class WriteToFile {

    void writeTextToFile(){
        File file = new File("text.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            writer.write("Hello, World!\n");
            writer.write("This is a sample text file.\n");
            writer.write("We're using real-life objects to write to it.\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
