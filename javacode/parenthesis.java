import java.util.*;
class Solution {
  void isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        HashMap<Character,Character> map = new HashMap<Character,Character>();

        map.put(')' , '(');
        map.put('}' , '{');
        map.put(']' , '[');


        for(Character ch : s.toCharArray())
        {
            switch(ch){
            case '(':
            case '{':
            case '[':
               stack.push(ch);
               break;

            case')':
            case'}':
            case']':

            if(stack.isEmpty() || stack.pop()!=map.get(ch))
            {
                System.out.println("false");
            }
        }
        }
        System.out.println(stack.isEmpty());

    }


  public static void main(String args[])
  {
    Solution obj = new Solution();
    obj.isValid("() {}");
  }
}
