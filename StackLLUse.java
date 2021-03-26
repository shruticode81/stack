public class StackLLUse {
    public static void main(String[] args){
        StackUsingLinkedList<Integer> l = new StackUsingLinkedList<Integer>();
        l.push(3);
        l.push(5);
        System.out.println(l.pop());

    }
}
