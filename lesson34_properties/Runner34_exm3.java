import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Runner34_exm3 {
    public static void main(String[] args) {
        //Class Properties enable to work with file of properties
        Properties properties = new Properties();

        try (Reader reader = new FileReader("lesson34/itClass.properties")) {
            //method load() load data from file
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = properties.getProperty("user.db");
        System.out.println("key: user, value: " + value);

    }
}
