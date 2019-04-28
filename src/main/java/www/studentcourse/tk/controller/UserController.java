package www.studentcourse.tk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.studentcourse.tk.util.Constant;
import www.studentcourse.tk.model.User;
import www.studentcourse.tk.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 10:31 2019/4/28
 * @Modified By:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser(HttpServletRequest request, HttpServletResponse response){
        return "success";
    }
    @ResponseBody
    @RequestMapping("/addUser")
    public String insertUser(HttpServletRequest request, HttpServletResponse response){
        User user=new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName("admin");
        user.setCity("北京 北京 朝阳 ");
        user.setSex(Constant.Sex.SEX_MAN);
        user.setFlag(Constant.flag.FLAG_TRUE);
        user.setStatus(Constant.UserStatus.NORMAL);
        user.setCreateTime(new Date());
        userService.insertUser(user);
        return "success";
    }
}
