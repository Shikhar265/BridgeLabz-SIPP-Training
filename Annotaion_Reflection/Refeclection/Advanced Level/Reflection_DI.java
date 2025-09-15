import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    void serve() { System.out.println("Service running..."); }
}

class Client {
    @Inject
    Service service;
}

public class Reflection_DI {
    public static void main(String[] args) throws Exception {
        Client client = new Client();

        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(client, new Service());
            }
        }

        client.service.serve();
    }
}
