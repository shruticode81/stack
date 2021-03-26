import java.util.Stack;
public class StackCollection {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        int arr[]={3,4,5,6};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    

}
