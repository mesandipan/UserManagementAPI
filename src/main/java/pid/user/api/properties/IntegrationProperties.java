package pid.user.api.properties;

public class IntegrationProperties {

    private static final PropertiesReader propertiesReader = new PropertiesReader();
    public static final String integrationUrl = propertiesReader.getProperty("integration.host");
    public static final String getUserUrl= String.format("%s/get_users",integrationUrl);
}
