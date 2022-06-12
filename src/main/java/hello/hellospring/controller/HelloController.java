package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "Spring!!");
        return "hello";
        /*
        스프링 부트 템플릿 엔진 기본 viewName 매핑
        resources:templates/ + {ViewName} + .html

        src/resources/templates 안의 리턴값과 이름이 같은 html 파일을 찾아 연결한다.
       */
    }
}
