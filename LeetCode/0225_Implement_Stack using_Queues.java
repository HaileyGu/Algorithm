// Approach #1 (Two Queues, push - O(1)O(1), pop O(n)O(n) )
// Approach #2 (Two Queues, push - O(n)O(n), pop O(1)O(1) )
// Approach #3 (One Queue, push - O(n)O(n), pop O(1)O(1) ) [v]

class MyStack {
    private LinkedList<Integer> que = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        que.add(x);
        int n = que.size();
        while (n > 1) {
            que.add(que.remove());
            n--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return que.remove();
    }

    /** Get the top element. */
    public int top() {
        return que.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
