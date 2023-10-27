package assignmentLab;

import java.util.Scanner;

abstract class Animal {
    public abstract String foodEnergySourcing();
}
interface Moveable{
    public boolean canMove();
    public boolean canFly();
    public boolean canSwim();

}
class Tiger extends Animal implements Moveable{

    @Override
    public String foodEnergySourcing() {
        return "Carnivorous";
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
class Hilsha extends Animal implements Moveable{

    @Override
    public String foodEnergySourcing() {
        return "Herbivorous";
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}
class Eagle extends Animal implements Moveable{

    @Override
    public String foodEnergySourcing() {
        return "Omnivorous";
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}


public class MyClass{
    public static void main(String[] args) {
        try {
            Animal a = null;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Animal Name :");
            String animalName=sc.next().toUpperCase();
            if(animalName.equals("TIGER")){
                a= new Tiger();
            } else if (animalName.equals("HILSHA")) {
                a= new Hilsha();

            } else if (animalName.equals("EAGLE")) {
                a= new Eagle();

            }
            else {
                System.out.println("Wrong Input ! Please Try Again");
                return;
            }

            sc.close();

            System.out.println("Animal Name :"+ animalName);
            System.out.println("Food Source :"+ a.foodEnergySourcing());
            System.out.println("Moveable :"+((Moveable)a).canMove());
            System.out.println("Flyable :"+((Moveable)a).canFly());
            System.out.println("Flyable :"+((Moveable)a).canSwim());

        }catch (Exception e){
            System.out.println("Animal Not Found");

        }
        }

}



