package action;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.Timer;

/**
 * Created by Esther on 2016/9/23.
 */
public class CheckServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        super.init();
        System.out.println("jinru");
        Timer timer = new java.util.Timer(true) ;
        timer.schedule(new MyTask(), 60000, 5000) ;
    }
}
