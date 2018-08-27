
package sms;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;
import com.jaunt.component.Form;


public class M160by2 {

    public static String Token;
    Form sms;
    UserAgent agent;

    /**
     * Used to login at http://www.160by2.com bu using username and password
     * @param username
     * @param Password
     * @throws ResponseException
     * @throws NotFound
     */
    public void login(String username,String Password) throws ResponseException, NotFound {

        agent=new UserAgent();
        agent.visit("http://www.160by2.com/Index");
        Form form=agent.doc.getForm(0);
        form.setTextField("username",username);
        form.setPassword("password",Password);
        form.submit();

        Token=agent.getLocation().substring(agent.getLocation().indexOf("?id=")+4);
        agent.visit("http://www.160by2.com/SendSMS?id="+Token);
        sms=agent.doc.getForm(0);
    }

    
    public void sendSMS(String message,String Phone_No) throws NotFound, ResponseException {

        sms.setTextField(sms.getElement().findFirst("<input type=\"text\" placeholder=\"Enter Mobile Number or Name\"").getAt("name"),Phone_No);
        sms.setTextArea("sendSMSMsg",message);
        sms.setHidden("maxwellapps",Token);
        sms.setHidden("hid_exists","no");
        sms.setAction("http://www.160by2.com/"+sms.getElement().findFirst("<input type=\"hidden\" id=\"fkapps\"").getAt("value"));
        sms.submit();
        System.out.println(agent.doc.innerHTML());
    }

}
