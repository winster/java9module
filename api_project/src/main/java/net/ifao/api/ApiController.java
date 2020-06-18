package net.ifao.api;

import net.ifao.ibetms.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/user")
    User user() {
        User user = new User();
        user.setName("winster");
        return user;
    }
}
