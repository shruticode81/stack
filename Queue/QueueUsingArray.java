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
    public QueueUsingArray(int capacity){
        data = new int[capacity];
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
    public void enqueue(int element) {
        if(size==data.length){
            //throw QueueFullException
            //throw new QueueFullException();
            doubleCapacity();

        }
        if(size==0){
            front=0;
        }
        
        size++;
        //circular queue concet when rear becomes equal to data.length
        //and there is still space in queue
        // if(rear==data.length){
        //     rear=0;
        // }
        rear = (rear+1)%data.length;
        //rear++;
        data[rear]= element;
    }
    private void doubleCapacity(){
        //call this func when queue is full
        int temp[] = data;
        data = new int[2*temp.length];
        int index=0;
        for(int i=front;i<temp.length;i++){
            data[index]= temp[i];
            index++;
        }
        for(int i=0;i<front;i++){
            data[index]=temp[i];
            index++;
        }
        front =0;
        rear=size()-1;

    }
    public int dequeue(){
        int temp = data[front];
       // front++;
       front = (front+1)%data.length;
    //    if(front==data.length){
    //        front=0;
    //    }
        size--;
        if(size==0){
            //reset front and rear to -1
            front=-1;
            rear=-1;
        }
        return temp;
    }
}
