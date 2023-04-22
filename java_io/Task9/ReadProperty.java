package Task9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class ReadProperty {

    void readProperty(){
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            // Load the properties file
            prop.load(input);

            // Get the values of properties
            String databaseUrl = prop.getProperty("database.url");
            String databaseUser = prop.getProperty("database.user");
            String databasePassword = prop.getProperty("database.password");

            // Print the values
            System.out.println("Database URL: " + databaseUrl);
            System.out.println("Database user: " + databaseUser);
            System.out.println("Database password: " + databasePassword);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Close the input stream
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
