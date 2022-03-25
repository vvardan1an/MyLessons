package Bchecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text){
        this.text = text;
    }

      public void check(){
        Stack<Character> stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{'){
                stack.push((char) i);
            }else{
                char opened = stack.pop();
                if (text.charAt(i) == ')' && stack.pop() != '(' 
                        || text.charAt(i) == ']' && stack.pop() != '[' 
                        || text.charAt(i) == '}' && stack.pop() != '{') {
                    showErrorMessage(opened, text.charAt(i));
                }
            }
        }
    }
    
    private void showErrorMessage(char opened, char closed) {
        System.out.println("Error 1 opened " + opened + "closed " + closed);
    }
}
