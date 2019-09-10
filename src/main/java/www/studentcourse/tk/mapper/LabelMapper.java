package www.studentcourse.tk.mapper;

import www.studentcourse.tk.model.Label;

public interface LabelMapper {
    int insert(Label record);

    int insertSelective(Label record);
}