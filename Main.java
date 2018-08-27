package sms;
import java.util.Random;

import com.jaunt.NotFound;
import com.jaunt.ResponseException;

public class Main {

    public static void main(String[] args) throws ResponseException, NotFound {

        M160by2 m160by2=new M160by2();
        m160by2.login("8899583416","savita");
        Random rand = new Random();
    	int num = rand.nextInt(9000000) + 1000000;
    	String otp = Integer.toString(num);
        String msg="Your otp for verification is :"+ otp;
        m160by2.sendSMS(msg,"7068335317");
    }
}
