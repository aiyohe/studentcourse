package www.studentcourse.tk.util;

/**
 * @Author: Mr.Zhang
 * @Description: 常量数据
 * @Date: 13:31 2019/4/28
 * @Modified By:
 */
public class Constant {
    /**
     * 用户性别
     */
    public class Sex{
        /**
         * 男
         */
        public static final int SEX_MAN=1;
        /**
         * 女
         */
        public static final int SEX_WOMAN=0;
    }

    /**
     * 有效标记
     */
    public class flag{
        /**
         * 有效
         */
        public static final int FLAG_TRUE=1;
        /**
         * 无效
         */
        public static final int FLAG_FALSE=0;
    }

    /**
     * 用户状态
     */
    public class UserStatus{
        /**
         * 封禁
         */
        public static final int BANNED=0;
        /**
         * 正常
         */
        public static final int NORMAL=1;
        /**
         * 封禁一段时间
         */
        public static final int TIMELINESS=2;
    }
}
