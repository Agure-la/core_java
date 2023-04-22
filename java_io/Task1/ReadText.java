package Task1;

import java.io.*;
public class ReadText {

    void readDocs(){
        File file = new File("mytextfile.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
