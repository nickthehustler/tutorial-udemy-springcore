package guru.springframework.services;

/**
 * Created by nick_x on 3/8/17.
 */
public class HelloWorldGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello Welt";
    }

}
