import java.lang.reflect.*;

interface Greeting { void sayHello(); }

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, User!");
    }
}

class LoggingHandler implements InvocationHandler {
    private final Object target;
    LoggingHandler(Object target) { this.target = target; }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("LOG: Calling " + method.getName());
        return method.invoke(target, args);
    }
}

public class Reflection_LoggingProxy {
    public static void main(String[] args) {
        Greeting g = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            new LoggingHandler(new GreetingImpl())
        );
        g.sayHello();
    }
}
