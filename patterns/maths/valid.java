import java.util.Stack;
class valid{
    public static void main(String[] args){
        String s="([{()})])";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            st.push(')');
        }
        else if(ch=='{'){
            st.push('}');
        }
        else if(ch=='['){
            st.push(']');
        }
        else if(st.isEmpty() || st.pop()!=ch){
            System.out.println("not valid");
            return;
        }
        }
        System.out.println(st.isEmpty()?"valid":"not valid");
    }
}