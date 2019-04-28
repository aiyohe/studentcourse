package www.studentcourse.tk.mapper;

import org.apache.ibatis.annotations.Mapper;
import www.studentcourse.tk.model.Label;
@Mapper
public interface LabelMapper {
    int insert(Label record);

    int insertSelective(Label record);
}