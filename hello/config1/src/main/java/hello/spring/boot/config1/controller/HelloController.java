package hello.spring.boot.config1.controller;


import hello.spring.boot.config1.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController() {
        System.out.println("a");
    }

    @Value("${person.last-name}")
    private String name;

    @Autowired
    Person person;

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println(person);
        return "Hello "+name;
    }

}
