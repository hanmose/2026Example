package kr.ac.kopo.mose._026example.domain;

import lombok.Data;

@Data // 이 어노테이션이 Getter, Setter, toString 등을 자동으로 만들어줍니다!
public class Member {
    private String id;
    private String passwd; // 이미지에는 int인데 비밀번호는 보통 String으로 합니다.
    private String city;
    private String sex;
    private String[] hobby;
    private String greetings;
}