package action;

import dto.Result;
import org.springframework.stereotype.Controller;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;
import java.util.TimerTask;

/**
 * Created by Esther on 2016/9/22.
 */
@Controller
public class MyTask extends TimerTask {
    private static boolean isRunning = false;
    @Resource
    UserService userService;

    @Override
    public void run() {
        if(!isRunning){
            List<String> rejects = userService.allReject();
//            try {
//                rejects=userService.allReject();
//                //����
//                System.out.println(rejects.size());
//            }catch (NullPointerException e){
//                try {
//                    Boolean endCount =userService.endCount();
//                    System.out.println(endCount);
//                    if(endCount){
//                        List<Result> results = userService.endResult();
//                        //����
//                    }
//                }catch (NullPointerException ee){
//                    System.out.println("error");
//                }
//
//            }
//            if(rejects!=null&&rejects.size()>0){
//                //����
//                System.out.println(rejects.size());
//            }else {
//                System.out.println(userService.endCount());
//                if(userService.endCount()){
//                    List<Result> results = userService.endResult();
//                    //����
//                }
//            }
        }else {
            System.out.println("error");
        }
    }
}
