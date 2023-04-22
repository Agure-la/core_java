package Task12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class InputOutputEx {

    void showIO(){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
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
}
