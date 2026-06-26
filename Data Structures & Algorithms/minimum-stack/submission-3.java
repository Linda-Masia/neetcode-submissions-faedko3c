class MinStack {

    // 1. Fixed types to consistently use Stack<Integer>
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();   
    }
    
    public void push(int val) {
        this.stack.push(val);
        
        // 2. Changed '<' to '<=' so duplicate minimums are tracked correctly
        if (this.minStack.empty() || val <= this.minStack.peek()) {
            this.minStack.push(val);
        }
    }
    
    public void pop() {
        if (!this.stack.empty()) {
            // 3. Popped into a primitive 'int' to safely bypass the Integer object reference trap
            int popped = this.stack.pop();
            if (popped == this.minStack.peek()) {
                this.minStack.pop();
            }
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}