package Task3;

import java.io.*;
public class ReadFile {

    void ReadTextFromFile(){
        File file = new File("mytextfile.txt");
        InputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file));
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            StringBuilder stringBuilder = new StringBuilder();
            while (inputStream.read(buffer) != -1) {
                stringBuilder.append(new String(buffer));
            }
            System.out.println(stringBuilder.toString());
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
