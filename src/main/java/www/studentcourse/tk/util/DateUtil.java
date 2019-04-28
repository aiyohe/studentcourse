package www.studentcourse.tk.util;

import java.sql.Timestamp;

/**
 * @Author: Mr.Zhang
 * @Description: 时间工具类
 * @Date: 15:05 2019/4/28
 * @Modified By:
 */
public class DateUtil {
    /**
     * 获取当前时间戳
     * @return
     */
    public final static Timestamp getTimeStamp(){
        return new Timestamp(System.currentTimeMillis());
    }
}
