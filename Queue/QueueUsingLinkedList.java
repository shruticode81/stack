//package Queue;

public class QueueUsingLinkedList<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;
    public QueueUsingLinkedList(){
        front= null;
        rear= null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    public T front()throws QueueEmptyException{
        if(size==0){
            // throw queueEmptyException
            throw new QueueEmptyException();
        }
        return front.data;
    }
    public void enqueue(T element){
        Node<T> temp = new Node<T>(element);
        if(size==0){
            front = temp;
            rear = temp;
        }
        else{
            rear.next = temp;
            rear = rear.next;
        }
        size++;
    }
    public T dequeue() throws QueueEmptyException{
        if(size==0){
            // throw QueueEmptyException
            throw new QueueEmptyException();
        }
        T tempdata = front.data;
        front = front.next;
        if(size==1){
            rear=null;
        }
        size--;
        return tempdata;    
    }
}
