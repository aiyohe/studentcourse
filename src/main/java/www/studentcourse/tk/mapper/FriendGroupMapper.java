package www.studentcourse.tk.mapper;

import www.studentcourse.tk.model.FriendGroup;

public interface FriendGroupMapper {
    int insert(FriendGroup record);

    int insertSelective(FriendGroup record);
}