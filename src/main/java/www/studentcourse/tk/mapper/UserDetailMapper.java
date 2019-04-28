package www.studentcourse.tk.mapper;

import org.apache.ibatis.annotations.Mapper;
import www.studentcourse.tk.model.UserDetail;
@Mapper
public interface UserDetailMapper {
    int insert(UserDetail record);

    int insertSelective(UserDetail record);
}