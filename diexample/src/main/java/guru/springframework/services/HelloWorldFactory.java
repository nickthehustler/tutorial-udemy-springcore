package guru.springframework.services;

/**
 * Created by nick_x on 3/8/17.
 */
public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = null;

        switch(language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolishImpl();
                break;
            case "ru":
                service = new HelloWorldServiceRussianImpl();
                break;
            default: service = new HelloWorldServiceEnglishImpl();
        }

        return service;
    }
}
