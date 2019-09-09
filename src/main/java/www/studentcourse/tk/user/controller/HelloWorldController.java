package www.studentcourse.tk.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Mr.Zhang
 * @Description: hello world
 * @Date: 10:27 2019/4/28
 * @Modified By:
 */
@Controller
public class HelloWorldController {
   /* @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        return"Hello World";
    }*/
    @RequestMapping("/helloTh")
    public String helloThymeleal(ModelMap map){
        map.addAttribute("message","这是什么情况，怎么没有改变内容");
        return "/hello/hello";
    }
}
