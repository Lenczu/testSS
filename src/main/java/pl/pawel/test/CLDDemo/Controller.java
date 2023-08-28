package pl.pawel.test.CLDDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String homeSceen(){
        return "Yosa";
    }

}
