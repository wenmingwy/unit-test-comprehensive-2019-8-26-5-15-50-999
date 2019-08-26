package tw;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    static String str="1234";
    static outputMessage outputmessage = new outputMessage() ;
    public static void main(String[] args) throws Exception {
        String result = "";
     for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();   
            result = outputmessage.resultMessage(input,str);
            System.out.println(result);
        }     
     }
}