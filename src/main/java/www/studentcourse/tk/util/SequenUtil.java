package www.studentcourse.tk.util;

import java.util.UUID;

/**
 * @Author: Mr.Zhang
 * @Description: 序列工具
 * @Date: 15:01 2019/4/28
 * @Modified By:
 */
public class SequenUtil {
    /**
     * 获取id
     * @return
     */
    public final static  String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
