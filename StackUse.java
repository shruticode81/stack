class StackUsingArray{
    private int data[];
    private int top;
    public StackUsingArray(){
        data = new int[10];
        top=-1;
    }
    public StackUsingArray(int capacity){
        data = new int[capacity];
        top=-1;
    }
    public boolean isEmpty(){
        // if(top==-1){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return (top==-1);
    }
    public int size(){
        return top+1;
    }
    public int top() throws StackEmptyException{
        if(size()==0){
            //throw StackEmptyException
            StackEmptyException e = new StackEmptyException();
            throw e;
            
        }
        return data[top] ; 
    }
    public void push(int element) {
        if(size()==data.length){
            //throws StackFullException
            // StackFullException e = new StackFullException();
            // throw e;
            //let make the array dynamic 
            doubleCapacity();

        }
        top++;
        data[top]=element;
    }
    private void doubleCapacity(){
        int temp[]=data;
        data= new int[2*temp.length];
        for(int i=0;i<=top;i++){
            data[i]=temp[i];
        }
        
    }
    public int pop() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }

}

public class StackUse{
    public static void main(String[] args) throws StackFullException{
        StackUsingArray stack = new StackUsingArray(5);
        for(int i=0;i<=10;i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
            }catch(StackEmptyException e){

            }
            
        }
        
    }
}