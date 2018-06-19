package com.ph.ds;

public class BasicQueue<X> {

    private X[] data;

    private int front;

    private int end;

    @SuppressWarnings("unchecked")
    public BasicQueue(int size) {
        data = (X[])new Object[size];
        front = -1;
        end = -1;
    }

    //Big O notation for this is O(1) constant.
    public int size() {
        if(front == -1 && end == -1) {
            return 0;
        } else {
            return end - front + 1;
        }
    }

    //Big O notation for this is O(1) constant. INSERT
    public void enQueue(X item) {
        // first check queue is full
        if((end + 1) % data.length == front) {
            throw new IllegalAccessError("Queue is full");
        } else if(size() == 0) {
            front++;
            end++;
            data[end] = item;
        } else {
            end++;
            data[end] = item;
        }

    }

    //Big O notation for this is O(1) constant. REMOVE
    public X deQueue() {
        //check queue is empty
        X item = null;
        if(size() == 0) {
            throw new IllegalAccessError("Queue is empty.");
        }
        // check if this is last item in queue
        if(front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            item = data[front];
            data[front] = null;
            front++;
        }
        return item;
    }

    //Contains Big O notation is linear O(n)
    public boolean search(X item) {
        boolean found = false;
        if(size() == 0) {
            throw new IllegalAccessError("Queue is empty.");
        }
        for(int i = front; i < end; i++) {
            if(item.equals(data[i])) {
                found = true;
                break;
            }
        }
        return found;
    }

    //Contains Big O notation is linear O(n)
    public X access(int position) {
        if(size() == 0 || position > size()) {
            throw new IllegalAccessError("No item in a queue or position is grater than size.");
        }
        int trueIndex = 0;
        for(int i = front; i < end; i++) {
            if(i == position) {
                return data[trueIndex];
            }
            trueIndex++;
        }
        throw new IllegalAccessError("Could not get the any item on position:" + position);
    }
}
