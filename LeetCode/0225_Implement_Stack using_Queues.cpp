// Approach #1 (Two Queues, push - O(1)O(1), pop O(n)O(n) )
// Approach #2 (Two Queues, push - O(n)O(n), pop O(1)O(1) )
// Approach #3 (One Queue, push - O(n)O(n), pop O(1)O(1) )[v]

class MyStack {
private:
    queue<int> que;
    
public:
    MyStack() {
    }

    /** Push element x onto stack. */
    void push(int x) {
        que.push(x);
        for(int i = 0; i < que.size()-1; i++)
        {
            que.push(que.front());
            que.pop();
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    int pop() {
        int item = que.front();
        que.pop();
        return item;
    }

    /** Get the top element. */
    int top() {
        return que.front();
    }

    /** Returns whether the stack is empty. */
    bool empty() {
        return que.empty();
    }
};
