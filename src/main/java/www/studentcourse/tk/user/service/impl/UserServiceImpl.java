package www.studentcourse.tk.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.studentcourse.tk.mapper.UserMapper;
import www.studentcourse.tk.model.User;
import www.studentcourse.tk.user.service.UserService;

/**
 * @Author: Mr.Zhang
 * @Description:
 * @Date: 13:27 2019/4/28
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
