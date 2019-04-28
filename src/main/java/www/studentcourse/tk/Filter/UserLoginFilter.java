package www.studentcourse.tk.Filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: Mr.Zhang
 * @Description: 用户登录session验证
 * @Date: 13:54 2019/4/28
 * @Modified By:
 */
public class UserLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
