package FileHandalling;

import java.io.BufferedReader;
import java.io.FileReader;

public class fileread {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:/javaprogramming/src/input.txt");
            BufferedReader br= new BufferedReader(fr);
            System.out.println(br.readLine());

//            int lineNumber=Integer.parseInt(br.readLine());
//            System.out.println(lineNumber);


           String name;
            while (true){
                name=br.readLine();
                if (name==null)
                    break;
                System.out.println(name);
            }



            br.close();

        } catch (Exception e ){
            System.out.println(e.getMessage());
        }
    }
}
