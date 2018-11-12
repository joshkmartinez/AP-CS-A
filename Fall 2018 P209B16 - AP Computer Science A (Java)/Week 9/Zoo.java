public class Zoo
{
    public static void main (String[] args)
    {
        Human Bob = new Human("Bob", 6.1, 103);
        Human Jane = new Human("Jane", 5.4, 302.4);
        Human Jim = new Human("Jane", 9.3, 9.63);
        UFO spaceship = new UFO("HMS Betty", "Bobatron");
        spaceship.addHuman(Bob);
        spaceship.addHuman(Jane);
        System.out.println(spaceship);
    }
}