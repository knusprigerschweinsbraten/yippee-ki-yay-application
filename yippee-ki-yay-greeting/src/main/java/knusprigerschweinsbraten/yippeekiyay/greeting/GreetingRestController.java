package knusprigerschweinsbraten.yippeekiyay.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author spring.io/guides
 * @since 0.0.1
 */
@RestController
public class GreetingRestController {
    @GetMapping("/greeting")
    public GreetingResource greet() {
        return new GreetingResource()
            .setMessage("Hello, World!");
    }
}