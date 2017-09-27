package neusoft.controller;

import com.alibaba.fastjson.JSON;
import neusoft.beans.User;
import neusoft.service.RedisService;
import neusoft.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Resource
    private RedisService redisService;

    @RequestMapping("/index")
    public String greeting(Model model) {
        List<User> list = userService.getUser();
        String actual = JSON.toJSONString(list);
        System.out.println(actual);
        model.addAttribute("name",actual);
        return "index";
    }

    @RequestMapping("/redis")
    public String redis(Model model){
        redisService.set("redis-key","ginoy");
        model.addAttribute("redis",redisService.get("redis-key"));
        return "index";
    }
}
