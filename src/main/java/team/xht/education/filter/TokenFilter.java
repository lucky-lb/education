package team.xht.education.filter;

import com.alibaba.druid.util.StringUtils;
import team.xht.education.reult.ResultData;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "TokenFilter", urlPatterns = "/*")
public class TokenFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String url = request.getRequestURI();
        System.out.println(url);
        if (url.equals("/user/login") || url.equals("/user/register")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            //Token验证
            ResultData<Object> resultData=new ResultData<>();
            String token=request.getHeader("token");
            if(StringUtils.isEmpty(token)){
                resultData.setCode(404);
                resultData.setMsg("don't login");
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json");
                PrintWriter writer = response.getWriter();
                writer.println(resultData);
            }

            // response.sendRedirect("/user/login");
        }
    }
}
