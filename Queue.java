import java.util.LinkedList;

public class Queue {
     private LinkedList<Object> list = new LinkedList<Object>();
    
     public void enqueue(Object data) {
         list.addLast(data);
     }
     
     public Object dequeue() {
         return list.removeFirst();
     }
     
     public Object peek() {
         return list.getFirst();
     }
     
     public boolean isEmpty() {
         return list.isEmpty();
     }
}
