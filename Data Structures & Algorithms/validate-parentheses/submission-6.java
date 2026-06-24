class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stk.push('(');
                    break;
                case '[':
                     stk.push('[');
                    break;
                case '{':
                    stk.push('{');
                    break;
                case '}':
                    if(stk.isEmpty() || stk.pop() != '{') return false;
                    break;
                case ']':
                    if( stk.isEmpty() || stk.pop() != '[') return false;
                    break;
                case ')':
                    if(stk.isEmpty() || stk.pop() != '(') return false;
                    break;
                default:
                    
            }
        }
        return stk.isEmpty();
    }
}
