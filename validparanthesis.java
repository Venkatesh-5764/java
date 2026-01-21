import java.util.HashMap;
import java.util.Stack;
import java.util.*;

public class validparanthesis {

    public static void main(String[] args){
        HashMap<Character,Character> h = new HashMap<>();
        h.put(')','(');
        h.put(']','[');
        h.put('}','{');
        Stack<Character> st = new Stack<>();
        String userstring;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string Mf");
        userstring=sc.next();
        int le = userstring.length();
        for(int i=0;i<le;i++){
            char c = userstring.charAt(i);
            if(c=='[' || c=='{'|| c=='('){
                st.push(c);
            }
            else if(h.containsKey(c)){
                if(st.empty()){
                    System.out.println("Invalid Paranthesis");
                    return;
                }
                char t = st.pop();
                if(t!=h.get(c)){
                    System.out.println("Invalid paranthessis");
                    return;
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("Valid Paranthesis");

        }
        else{
            System.out.println("Invalid paranthesis");
        }


    }
}
