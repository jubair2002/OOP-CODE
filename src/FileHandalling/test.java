package FileHandalling;

import java.io.BufferedReader;
import java.io.FileReader;

public class test {
    public static void main(String[] args) {
       try{
           FileReader fr= new FileReader("D:/javaprogramming/src/input.txt");
           BufferedReader br= new BufferedReader(fr);
           String line= br.readLine();
           




           br.close();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
