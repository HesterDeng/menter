package utils;

import net.sf.cglib.proxy.MethodProxy;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * Created by xheart on 2016/8/5.
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute("username");
        if(username != null){
            return true;
        }
        String uri = httpServletRequest.getRequestURI();
        if(uri.equalsIgnoreCase("/")||uri.equalsIgnoreCase("/user/login")){
            httpServletRequest.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(httpServletRequest,httpServletResponse);
        }
        return false;
    }

    private String getContext(HttpServletRequest request){
        StringBuilder contextPath = new StringBuilder();
        if(request.getProtocol().contains("HTTPS")){
            contextPath.append("https://");
        }else{
            contextPath.append("http://");
        }

        contextPath.append(request.getServerName());

        if(request.getServerPort()!=80){
            contextPath.append(":").append(request.getServerPort());
        }
        contextPath.append(request.getContextPath());
        return contextPath.toString();
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.printf("post");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.printf("after");
    }
}
