import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Calculator {
    private Properties properties;
    private InputStream file;
    private HashMap<String, String> factories;

    public Calculator() throws PropertyExistenceException {
        properties = new Properties();
        try {
            file = new FileInputStream("file.property");
            properties.load(file);
        } catch (IOException | NullPointerException e) {
            System.out.println("Properties does not exist");
        }
        factories = new HashMap<>();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries)
            factories.put((String) entry.getKey(), (String) entry.getValue());

    }

    public Command getCommandFromFactory(String key) throws PropertyExistenceException {
        CommandFactory cf;
        if (factories.containsKey(key)) {
            try {
                cf = (CommandFactory) Class.forName(factories.get(key)).getDeclaredConstructor().newInstance();
                return cf.getCommand();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                throw new PropertyExistenceException("Properties does not exist");
            }
        }
        else
            throw new PropertyExistenceException("Properties does not exist");
    }
}
