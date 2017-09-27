package neusoft.controller;

import neusoft.beans.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController return json
 */

@RestController
public class TestRestController {

    @RequestMapping("/testUser")
    public User getUser() {
        User user=new User();
        user.user = "小名";
        user.host = "localhost";
        return user;
    }
}
