//package stackimpQues;
import java.util.Scanner;
import java.util.Stack;
public class checkBalanced {
    public static boolean balanceBracketCheck(String str){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='{') || (str.charAt(i)=='(') || (str.charAt(i)=='[') ){
                stack.push(str.charAt(i));
            }
            else if((str.charAt(i)=='}') || (str.charAt(i)==')') || (str.charAt(i)==']')){
                if(stack.isEmpty()){
                   // System.out.println(false);
                   return false;
                }
                char temp=stack.pop();
                if((temp=='{' && str.charAt(i)=='}') || (temp=='(' && str.charAt(i)==')') || (temp=='[' && str.charAt(i)==']')){
                    continue;
                }else{
                    //System.out.println(false);
                    return false;
                }
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next(); 
        
        
        System.out.println(balanceBracketCheck(str));
    }
}
