package kr.ac.kopo.mose._026example.controller;

import kr.ac.kopo.mose._026example.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/exam13_03")
public class Chap13_03Controller {
    @ResponseBody
    @GetMapping
    public Person showJsonTypeData(){
        Person person = new Person();
        person.setName("PolyKim");
        person.setAge("30");
        person.setEmail("polykim@kopo.ac.kr");
        System.out.println(person);
        return person;
    }
}