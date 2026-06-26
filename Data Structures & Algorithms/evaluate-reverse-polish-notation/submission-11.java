class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int temp1 = 0;
        int temp2 = 0;

        for(int i = 0; i < tokens.length; i++){

        switch(tokens[i]) {
            case "+": 
                stk.push( stk.pop() + stk.pop());
                break;

            case "-":
                temp1 = stk.pop();
                temp2 = stk.pop();

                stk.push( temp2 - temp1 );
                break;

            case "*":

                stk.push( stk.pop() * stk.pop());
                break;

            case "/":
                temp1 = stk.pop();
                temp2 = stk.pop();

                stk.push( temp2 / temp1);
                break;

            default:
                stk.push(Integer.parseInt(tokens[i]));
            }
        }

        return stk.pop();
    }
;
}
