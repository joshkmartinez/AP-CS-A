public class PawnShop{
    public static void main (String[] args ){
        Inventory i = new Inventory();
        i.add(new Bike());
        i.add(new Shoe());
        i.add(new Bike());
        i.add(new Shoe());
        System.out.println(i);
    }
}