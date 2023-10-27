package assignmentLab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Player {
    public int jersey_number;
    public double salary;
    public int age;
    public String name;

    public Player(int jersey_number, double salary, int age, String name) {
        this.jersey_number = jersey_number;
        this.salary = salary;
        this.age = age;
        this.name = name;
    }

}

public class Main {
    public static void main(String[] args) {
        Map<Integer, Player> p = new HashMap<>();

        try {
            File file= new File("D:/javaprogramming/src/input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String[] info = br.readLine().split(" ");
                int jersey_number = Integer.parseInt(info[0]);
                double salary = Double.parseDouble(info[1]);
                int age = Integer.parseInt(info[2]);
                String name = info[3];
                p.put(jersey_number, new Player(jersey_number, salary, age, name));
            }

            br.close();
            fr.close();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Player Jersey Number:");
            int input = sc.nextInt();
            Player playerInfo = p.get(input);
            if (playerInfo != null) {
                System.out.println("Player's Name: " + playerInfo.name);
                System.out.println("Jersey Number: " + playerInfo.jersey_number);
                System.out.println("Salary: " + playerInfo.salary);
                System.out.println("Age: " + playerInfo.age);
            } else {
                System.out.println("Wrong Input! Player not found.");
            }

            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
