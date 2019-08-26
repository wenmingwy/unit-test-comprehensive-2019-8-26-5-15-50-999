package tw;

import java.util.Random;

import javax.print.attribute.standard.OutputDeviceAssigned;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    static String excepData = "2789";
    static int [] randArray = {1,2,3,4};
    int  mm = 0;

    static outputMessage outputmessage = new outputMessage() ;
    public static void main(String[] args) throws Exception {
        String result = "";
    	for(int i=0; i<4 ; i++) {
//    	          添加随机数
    		Random  randomInt = new Random();
    		int randNum = randomInt.nextInt(9) ;
    		randArray[i] = randNum ;
    	} 
        
     for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();   
            result = outputmessage.resultMessage(input,excepData);
            System.out.println(result);
        }     
     }
}