public class TestQueue{
    public static void main (String[] args){
    
    
        Queue q = new Queue();
        q.enqueue("Alice");
        q.enqueue("Bob");
        q.enqueue("Jeff");
        q.enqueue("Mary");
        q.dequeue();
        System.out.println(q);
        System.out.println(q.first());
        System.out.println(q.last());
    }
}