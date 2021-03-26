public class StackUsingLinkedList<T>{
    private Node<T> head;
    private int size;
    StackUsingLinkedList(){
        head = null;
        size=0;
    }
    public int size(){
        return size;
    }
    public void push(T data){
        Node<T> temp = new Node<T>(data);
        temp.next = head;
        head = temp;
        size++;
    }
    public T pop(){
        T nodedata = head.data;
        head = head.next;
        size--;
        return nodedata;
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    public T top() throws StackEmptyException{
        if(size()==0){
            //StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;

        }
        return head.data;
    }
}