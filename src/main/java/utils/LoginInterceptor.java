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
    /**
     *  preHandle方法是进行处理器拦截用的，顾名思义，该方法将在Controller处理之前进行调用，SpringMVC中的Interceptor拦截器是链式的，可以同时存在
     * 多个Interceptor，然后SpringMVC会根据声明的前后顺序一个接一个的执行，而且所有的Interceptor中的preHandle方法都会在
     * Controller方法调用之前调用。SpringMVC的这种Interceptor链式结构也是可以进行中断的，这种中断方式是令preHandle的返
     * 回值为false，当preHandle的返回值为false的时候整个请求就结束了。
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute("username");
        if(username != null){
            return true;
        }
        String url = httpServletRequest.getRequestURL().toString();
        String path1 = getContext(httpServletRequest)+"/";//http://localhost:8080/
        String path2 = getContext(httpServletRequest)+"user/login";//http://localhost:8080/user/login
        if(url.equals(path1)||url.equals(path2)){
            httpServletRequest.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(httpServletRequest,httpServletResponse);
            return false;
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
        return contextPath.toString();
    }

    /**
     * 这个方法只会在当前这个Interceptor的preHandle方法返回值为true的时候才会执行。postHandle是进行处理器拦截用的，它的执行时间是在处理器进行处理之
     * 后，也就是在Controller的方法调用之后执行，但是它会在DispatcherServlet进行视图的渲染之前执行，也就是说在这个方法中你可以对ModelAndView进行操
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    /**
     * 该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行。该方法将在整个请求完成之后，也就是DispatcherServlet渲染了视图执行，
     * 这个方法的主要作用是用于清理资源的，当然这个方法也只能在当前这个Interceptor的preHandle方法的返回值为true时才会执行。
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
