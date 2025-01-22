package node;

import java.util.HashMap;
import java.util.Stack;

public class bracketCheck {
  public static boolean isParenthesesValid(String parentheses) {
    Stack<Character> stack = new Stack<Character>();
    HashMap<Character, Character> hashmap = new HashMap<Character, Character>();
    hashmap.put('(', ')');
    hashmap.put('[', ']');
    hashmap.put('{', '}');

    for (int i = 0; i < parentheses.length(); i++) {
      Character c = parentheses.charAt(i);
      if (stack.empty() || stack.peek() != hashmap.get(c))
        stack.push(c);
      else
        stack.pop();
    }

    return stack.empty();
  }
}
