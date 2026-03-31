package reflection.Customloggingproxy;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        // Real object
        Greeting realObject = new GreetingImpl();
        // Create proxy object
        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(realObject)
        );
        // Call method via proxy
        proxyObject.sayHello("Aditya");
    }
}

