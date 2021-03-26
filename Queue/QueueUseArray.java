//package Queue;

public class QueueUseArray {
    public static void main(String[] args) throws QueueFullException{
        QueueUsingArray queue= new QueueUsingArray();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(8);
        try {
            System.out.println(queue.front());
        } catch (QueueEmptyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
