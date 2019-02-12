public class TestChest{
    public static void main(String[] args){
        Chest c = new Chest();
        c.add(new Excalibur(100,100));
         c.add(new Excalibur(100000,200000));
        c.add(new Khakis(3,1));
        c.add(new Khakis(10,20));
        c.add(new Ruby(1,100, 3));
        c.add(new Ruby(1,13, 1));
        System.out.println(c);
    }
}