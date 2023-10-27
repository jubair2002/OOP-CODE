package assignmentLab;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :");
        String sub = sc.nextLine();


        int firstIndex = sub.indexOf("apple");
        if (firstIndex == -1) {
            System.out.println("Not Applicable");
        } else {
            int secondIndex = sub.indexOf("apple", firstIndex + 1);
            if (secondIndex == -1) {
                System.out.println("Not Applicable");
            } else {
                String result = sub.substring(firstIndex + "apple".length(), secondIndex);
                System.out.println("Output :"+result);
            }
        }
    }
}