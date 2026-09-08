package kr.ac.kopo.mose._026example.controller;


import kr.ac.kopo.mose._026example.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam13_04")
public class Chap13_04Controller {

    @GetMapping
    public Person showJsonTypeData(){
        Person person = new Person();
        person.setName("han");
        person.setAge("20");
        person.setEmail("A");
        System.out.println(person);
        return person;
    }
}