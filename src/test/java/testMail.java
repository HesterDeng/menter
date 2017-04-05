import utils.SimpleMailSender;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Esther on 2016/9/27.
 */
public class testMail {
    public static void main(String[] args) throws MessagingException {
        List<String> recipients = new ArrayList<String>();
        recipients.add("1471669398@qq.com");
        recipients.add("739979010@qq.com");
        SimpleMailSender sender = new SimpleMailSender("1334995739@qq.com","pcihjbujzzdpbadi");
        sender.send(recipients,"subject--aa","content--hello");
        System.out.println("seccess");
    }
}
