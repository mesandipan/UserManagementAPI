package pid.user.api.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {
    private Properties prop = new Properties();
    public PropertiesReader() {
        try {
            InputStream file = this.getClass().getClassLoader().getResourceAsStream("integration.properties");
            prop.load(file);
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public String getProperty(String key){
        return prop.getProperty(key);
    }
}
