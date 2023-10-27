package americanSuperhero;

 class SpiderMan {
     String movieName;
     String directedBy;
     public SpiderMan(String movieName,String directedBy){
         this.movieName=movieName;
         this.directedBy=directedBy;
     }
     public void show(){
         System.out.println("Your Are Waching :"+movieName);
         System.out.println("Directed By:"+directedBy);
     }

}
class SuperMan{
    public static void main(String[] args) {
        SpiderMan s= new SpiderMan("The Amazing Spider Man 2","Mark Webb");
        s.show();
    }
}
