package ExceptionHandeling;

import java.util.Scanner;

public class UserDefineException extends java.lang.Exception {

    UserDefineException(String message){
        super(message);
    }
public static void throwMyException() throws java.lang.Exception {
        throw new UserDefineException("this is my Exception");
}
public static void capitalletterException(String msg)throws java.lang.Exception{
        for(int i=0;i<msg.length();i++){
           if(msg.charAt(i)>='A' && msg.charAt(i)<='Z'){
               throw  new java.lang.Exception("captial letter is not aecepted");
           }
        }
}

    public static void main(String[] args) {
        try{
            Scanner sc= new Scanner(System.in);
            String line=sc.nextLine();
            capitalletterException(line);
        }catch (java.lang.Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println("ok");
    }
}
class CapitalLetterException extends java.lang.Exception {
    CapitalLetterException(String message){
        super(message);
    }
}
