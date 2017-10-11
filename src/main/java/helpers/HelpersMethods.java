package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelpersMethods {

    public static Properties loadProperties(String fileName){
        Properties properties = new Properties();
        String filePath = System.getProperty("user.dir") + "/" + fileName;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return properties;
    }
}
