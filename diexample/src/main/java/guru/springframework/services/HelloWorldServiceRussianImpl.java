package guru.springframework.services;

/**
 * Created by nick_x on 3/8/17.
 */
public class HelloWorldServiceRussianImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Привет мир";
    }
}
