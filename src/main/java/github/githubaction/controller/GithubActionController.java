package github.githubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubActionController {



    @GetMapping("/")
    public String githubAction(){

        return "docker CI 적용 성공";
    }
}
