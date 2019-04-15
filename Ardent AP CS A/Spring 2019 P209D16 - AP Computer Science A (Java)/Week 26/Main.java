public class Main {
    public static int mystery(int n)
    {
        if (n <= 1)
        {
            return 0;
        }
        else
        {
            return 1 + mystery(n / 2);
        }
    }

    public static void main(String[] main){
        System.out.println(mystery(12));
    }
}