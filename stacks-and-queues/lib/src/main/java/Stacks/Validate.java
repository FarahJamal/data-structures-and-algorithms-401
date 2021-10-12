package Stacks;

public class Validate <T>{
public boolean validateBrackets(String word) throws Exception {
        Stack<String> stack=new Stack();
        String check;
        if(word.length()>1){

        for(String x:word.split("")) {
                if (x.equals("[") || x.equals("{") || x.equals("(")) {
                        stack.push(x);
                } else {
                        check = stack.pop();
                        if (check.equals("[") && !x.equals("]")) {
                                return false;
                        } else if (check.equals("{") && !x.equals("}")) {
                                return false;
                        } else if (check.equals("(") && !x.equals(")")) {
                                return false;
                        }

                }
        }
                return true;}
        else {
                return false;
        }
                   }
        }