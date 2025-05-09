package stack;

import java.util.ArrayDeque;

public class BalanedBracket {
    public static boolean matching(char x, char y){
        return (
                (x == '{' && y == '}') || (x == '[' && y == ']') || (x == '(' && y == ')')
        );
    }

    public static boolean isBlancedBracket(String str){
        ArrayDeque<Character> ch = new ArrayDeque<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[' || c =='{' || c == '('){
                ch.push(c);
            }else {
                if (ch.isEmpty()) {
                    return false;
                } else if (!matching(ch.peek(), c)) {
                    return false;
                }else {
                    ch.pop();
                }
            }
        }
        return (ch.isEmpty());
    }

    public static void main(String[] args) {
        String s1= "({})";
        String s2= "({}))";
        String s3= "((({}))";
        String s4= "(({[}))";
        System.out.println(isBlancedBracket(s1));
        System.out.println(isBlancedBracket(s2));
        System.out.println(isBlancedBracket(s3));
        System.out.println(isBlancedBracket(s4));
    }
}
