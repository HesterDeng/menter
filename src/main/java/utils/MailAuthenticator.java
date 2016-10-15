package utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * Created by Esther on 2016/9/27.
 */
public class MailAuthenticator extends Authenticator {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MailAuthenticator(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(username,password);
    }
}
