public class TestPop{
    public static void main(String[] args){
    
        Population world = new Population(30);
        System.out.println(world.size());
        System.out.println(world);
        
        
        System.out.println("Launching infection");
        world.infection();
        System.out.println(world);
    }
}