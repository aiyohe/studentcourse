package www.studentcourse.tk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Mr.Zhang
 * @Description: hello world
 * @Date: 10:27 2019/4/28
 * @Modified By:
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        return"Hello World 你好啊";
    }
}
