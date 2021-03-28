package pl.kuziow.restfulwebservicesmicroservices.helloWorld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello world");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-bean/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }

    /*
    to zajmuje za duzo tekstu, za chwilę będzie wersja prostrsza

    @RequestMapping(method = RequestMethod.GET, path = "/hello-bean-internationalized")
    public String helloWorldInternationalised(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("good.morning.message", null, locale);
    }

    */
    @RequestMapping(method = RequestMethod.GET, path = "/hello-bean-internationalized")
    public String helloWorldInternationalised() {
        return messageSource.getMessage("good.morning.message", null,
                LocaleContextHolder.getLocale());
    }

}
