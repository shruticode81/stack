//package Queue;

public class QueueUseArray {
    public static void main(String[] args){
        QueueUsingArray queue= new QueueUsingArray(3);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(2);
        try {
            System.out.println(queue.front());
        } catch (QueueEmptyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
