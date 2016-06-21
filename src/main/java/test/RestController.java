package test;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class RestController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "return this!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestController.class, args);
    }
}