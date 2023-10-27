package InterfacePracticeProblem;
public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
          this.x=x;
          this.y=y;
          this.xSpeed=xSpeed;
          this.y=ySpeed;
    }
    public String toString(){
        return "(x,y) Speed :"+this.x+this.y;
    }
    public void moveUp(){
        y-=ySpeed;
    }
    public void moveDwon(){
        y+=ySpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
}
