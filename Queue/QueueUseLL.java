//package Queue;

public class QueueUseLL {
    public static void main(String[] args) throws QueueEmptyException{
        QueueUsingLinkedList<Integer> list = new QueueUsingLinkedList<>();
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            list.enqueue(arr[i]);
        }
        while(!list.isEmpty()){
            System.out.println(list.dequeue());
        }


    }
}
