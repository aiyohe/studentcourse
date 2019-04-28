package www.studentcourse.tk;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("www.studentcourse.tk.mapper")
@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})//阿里链接源
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})  //自带链接源
public class StudentcourseApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StudentcourseApplication.class, args);
    }

}
