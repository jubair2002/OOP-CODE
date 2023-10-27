package ExceptionHandeling;

public class Exception {
     public static void throwException(String name)throws java.lang.Exception
    {
        if(name.equals("ArithmeticException")){
            throw new ArithmeticException("Arithmetic Exception");
        }
        if(name.equals("ArrayIndexOutOfBoundsException")){
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        }
        else{
            throw new NullPointerException("any other thing");
        }
    }
    public static void main(String[] args) {
        try{
            throwException("ArithmeticException");
        }catch(java.lang.Exception e ){
            System.out.println(e.getMessage());
        }


    }
}