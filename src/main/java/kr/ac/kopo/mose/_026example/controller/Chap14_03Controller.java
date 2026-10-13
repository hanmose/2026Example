package kr.ac.kopo.mose._026example.controller;

import kr.ac.kopo.mose._026example.repository.DetailRepository;
import kr.ac.kopo.mose._026example.repository.Product2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam14_03")
public class Chap14_03Controller {

    @Autowired
    private Product2Repository product2Repository;

    @Autowired
    private DetailRepository detailRepository;

}
