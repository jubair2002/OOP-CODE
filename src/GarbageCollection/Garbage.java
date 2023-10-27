package GarbageCollection;

public class Garbage {
    String name;
    public void show(){
        System.out.println("Name :"+name);
    }

    protected void finalize() {
        System.out.println("object destroyed");
    }

}
