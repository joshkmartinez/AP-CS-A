public class TestStack{
    public static void main(String[] args){
        Stack s = new Stack();
        
        s.add("Test");
        s.add("Hi");
        s.add("Bob");
        s.pop();
        System.out.println(s);
        System.out.println(s.top());
    }
}