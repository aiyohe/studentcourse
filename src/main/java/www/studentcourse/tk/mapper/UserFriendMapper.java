package www.studentcourse.tk.mapper;

import www.studentcourse.tk.model.UserFriend;

public interface UserFriendMapper {
    int insert(UserFriend record);

    int insertSelective(UserFriend record);
}