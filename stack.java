import java.util.*;
public class stack {

    public static boolean isPar(String s){
        Stack<Character>stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else{
                if(!stk.empty() && (stk.peek() == '(' && s.charAt(i)==')') ||
                (stk.peek() == '{' && s.charAt(i)=='}') ||
                (stk.peek() == '[' && s.charAt(i)==']')){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stk.empty();
    }


    public static void main(String args[]){
        String s = "[4+9]/(5*3)}4-5";
        String S="";
        for(int i =0;i<s.length();i++){

            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='}' ||s.charAt(i)==')' ||s.charAt(i)==']'){
                S +=s.charAt(i);
            }
            else{
                continue;
            }
        }
        // System.out.println(S);


        if(isPar(S)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
        
    }
}
