 abstract class Cafe {
    public String name = "joy cafe";
    public String location = "kimbo";
   public int number = 11;
    public abstract void foodToBuy();//main method
}
class Hotel extends Cafe{
    public int openingYear = 2020;
    public void foodToBuy() {
        System.out.println("we have the best food ever!!, come dine with us.");
         }
         }
