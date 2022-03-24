package Bchecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text){
        this.text = text;
    }

    public void check(){
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{'){
                stack.push(i);
            }else{
                if (text.charAt(i) == ')' && stack.pop() != '('){
                    System.out.println("Error 1");
                }else if(text.charAt(i) == ']' && stack.pop() != '['){
                    System.out.println("Error 2");
                }else if(text.charAt(i) == '}' && stack.pop() != '{'){
                    System.out.println("Error 3");
                }
            }
        }
    }
}
