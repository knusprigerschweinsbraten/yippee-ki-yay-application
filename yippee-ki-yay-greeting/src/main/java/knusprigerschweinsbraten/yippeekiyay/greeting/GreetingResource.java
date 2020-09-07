package knusprigerschweinsbraten.yippeekiyay.greeting;

/**
 * @author spring.io/guides
 * @since 0.0.1
 */
public class GreetingResource {
    private String message;

    public GreetingResource setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }
}