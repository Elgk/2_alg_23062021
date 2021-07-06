package lesson3;

public class ReverceExpression {
    private String exp;

    public ReverceExpression(String exp) {
        this.exp = exp;
    }

    public String reverce(){
        MyStack<Character> stack = new MyStack<>(exp.length()+1);
        String result = "";
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < exp.length(); i++) {
            result += String.valueOf(stack.pop());
        }
        return  result;
    }

}
