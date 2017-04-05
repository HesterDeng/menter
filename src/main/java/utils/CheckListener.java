package utils;

import action.MyTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Esther on 2016/9/22.
 */
public class CheckListener implements ServletContextListener {
    private java.util.Timer timer = null ;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        timer = new java.util.Timer(true) ;
        event.getServletContext().log("��ʱ����������") ;
        timer.schedule(new MyTask(), 60000, 5000) ;
        event.getServletContext().log("�Ѿ����������ȱ�" ) ;
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
