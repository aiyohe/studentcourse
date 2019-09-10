package www.studentcourse.tk.mapper;

import www.studentcourse.tk.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}