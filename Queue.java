import java.util.LinkedList;

public class Queue {
     private LinkedList<Order> list = new LinkedList<Order>();
    
     public void enqueue(Order data) {
         list.addLast(data);
     }
     
     public Order dequeue() {
         return list.removeFirst();
     }
     
     public Order peek() {
         return list.getFirst();
     }
     
     public boolean isEmpty() {
         return list.isEmpty();
     }

     public int sizeQueue() {
        return list.size();
     }
}
