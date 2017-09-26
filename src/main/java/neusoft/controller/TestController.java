package neusoft.controller;

import com.alibaba.fastjson.JSON;
import neusoft.beans.User;
import neusoft.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 17-9-25
 * Time: 上午11:20
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        List<User> list = userService.getUser();
        String actual = JSON.toJSONString(list);
        model.addAttribute("name",actual);
        return "index";
    }
}
