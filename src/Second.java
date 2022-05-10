public class Second {
    public static void main(String[] args) {
        Hotel myObj = new Hotel();
        System.out.println(myObj.name);
        System.out.println(myObj.location);
        System.out.println("Exit: " +myObj.number);
        System.out.println("Opening Year: " +myObj.openingYear);
        myObj.foodToBuy();
    }
}
