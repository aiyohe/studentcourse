package www.studentcourse.tk.mapper;

import www.studentcourse.tk.model.UserDetail;

public interface UserDetailMapper {
    int insert(UserDetail record);

    int insertSelective(UserDetail record);
}