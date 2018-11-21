import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/greetings")
    public void greetings() {
        System.out.println("Greetings");
    }
}
