//package Queue;

public class QueueUsingArray {
    int data[];
    int front;
    int rear;
    int size;
    public QueueUsingArray(){
        data = new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public int front() throws QueueEmptyException{
        if(size==0){
            //throw QueueEmptyException
            throw new QueueEmptyException();
        }
        return data[front];
    }
    public void enqueue(int element) throws QueueFullException{
        if(size==data.length){
            //throw QueueFullException
            throw new QueueFullException();

        }
        if(size==0){
            front=0;
        }
        rear++;
        size++;
        data[rear]= element;
    }
    public int dequeue(){
        int temp = data[front];
        front++;
        size--;
        if(size==0){
            //reset front and rear to -1
            front=-1;
            rear=-1;
        }
        return temp;
    }
}
