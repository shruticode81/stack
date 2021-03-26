import java.util.Stack;
public class StackCollection {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        int arr[]={3,4,5,6};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            //peek() is just like top()--> it returns top value in stack
            //push() and pop() are same
            System.out.print(stack.peek()+" ");
            System.out.println(stack.pop());
        }
    }
    

}
