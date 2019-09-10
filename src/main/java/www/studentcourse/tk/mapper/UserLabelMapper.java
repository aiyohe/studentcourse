package www.studentcourse.tk.mapper;

import www.studentcourse.tk.model.UserLabel;

public interface UserLabelMapper {
    int insert(UserLabel record);

    int insertSelective(UserLabel record);
}