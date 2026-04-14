package kr.ac.kopo.mose._026example.controller;

import kr.ac.kopo.mose._026example.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // RestController에서 Controller로 변경!
public class EX03Controller {

    @PostMapping("/member")
    public String registerMember(Member member, Model model) {

        // "member"라는 이름으로 객체를 담아서 보냅니다.
        // HTML의 ${member.id} 등과 매칭됩니다.
        model.addAttribute("member", member);

        // 리턴하는 문자열은 templates 폴더 안의 파일명입니다. (확장자 제외)
        return "signUpResult";
    }
}