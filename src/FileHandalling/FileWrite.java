package FileHandalling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileReader fr= new FileReader("D:/javaprogramming/src/FileHandalling/input.txt");
            BufferedReader br= new BufferedReader(fr);
            FileWriter fw= new FileWriter("D:/javaprogramming/src/FileHandalling/output.txt");
            BufferedWriter bw= new BufferedWriter(fw);


            int n=Integer.parseInt(br.readLine());
            for (int i=1;i<n;i++){
                String sportsName= br.readLine();
                bw.write(sportsName);
            }

            br.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
