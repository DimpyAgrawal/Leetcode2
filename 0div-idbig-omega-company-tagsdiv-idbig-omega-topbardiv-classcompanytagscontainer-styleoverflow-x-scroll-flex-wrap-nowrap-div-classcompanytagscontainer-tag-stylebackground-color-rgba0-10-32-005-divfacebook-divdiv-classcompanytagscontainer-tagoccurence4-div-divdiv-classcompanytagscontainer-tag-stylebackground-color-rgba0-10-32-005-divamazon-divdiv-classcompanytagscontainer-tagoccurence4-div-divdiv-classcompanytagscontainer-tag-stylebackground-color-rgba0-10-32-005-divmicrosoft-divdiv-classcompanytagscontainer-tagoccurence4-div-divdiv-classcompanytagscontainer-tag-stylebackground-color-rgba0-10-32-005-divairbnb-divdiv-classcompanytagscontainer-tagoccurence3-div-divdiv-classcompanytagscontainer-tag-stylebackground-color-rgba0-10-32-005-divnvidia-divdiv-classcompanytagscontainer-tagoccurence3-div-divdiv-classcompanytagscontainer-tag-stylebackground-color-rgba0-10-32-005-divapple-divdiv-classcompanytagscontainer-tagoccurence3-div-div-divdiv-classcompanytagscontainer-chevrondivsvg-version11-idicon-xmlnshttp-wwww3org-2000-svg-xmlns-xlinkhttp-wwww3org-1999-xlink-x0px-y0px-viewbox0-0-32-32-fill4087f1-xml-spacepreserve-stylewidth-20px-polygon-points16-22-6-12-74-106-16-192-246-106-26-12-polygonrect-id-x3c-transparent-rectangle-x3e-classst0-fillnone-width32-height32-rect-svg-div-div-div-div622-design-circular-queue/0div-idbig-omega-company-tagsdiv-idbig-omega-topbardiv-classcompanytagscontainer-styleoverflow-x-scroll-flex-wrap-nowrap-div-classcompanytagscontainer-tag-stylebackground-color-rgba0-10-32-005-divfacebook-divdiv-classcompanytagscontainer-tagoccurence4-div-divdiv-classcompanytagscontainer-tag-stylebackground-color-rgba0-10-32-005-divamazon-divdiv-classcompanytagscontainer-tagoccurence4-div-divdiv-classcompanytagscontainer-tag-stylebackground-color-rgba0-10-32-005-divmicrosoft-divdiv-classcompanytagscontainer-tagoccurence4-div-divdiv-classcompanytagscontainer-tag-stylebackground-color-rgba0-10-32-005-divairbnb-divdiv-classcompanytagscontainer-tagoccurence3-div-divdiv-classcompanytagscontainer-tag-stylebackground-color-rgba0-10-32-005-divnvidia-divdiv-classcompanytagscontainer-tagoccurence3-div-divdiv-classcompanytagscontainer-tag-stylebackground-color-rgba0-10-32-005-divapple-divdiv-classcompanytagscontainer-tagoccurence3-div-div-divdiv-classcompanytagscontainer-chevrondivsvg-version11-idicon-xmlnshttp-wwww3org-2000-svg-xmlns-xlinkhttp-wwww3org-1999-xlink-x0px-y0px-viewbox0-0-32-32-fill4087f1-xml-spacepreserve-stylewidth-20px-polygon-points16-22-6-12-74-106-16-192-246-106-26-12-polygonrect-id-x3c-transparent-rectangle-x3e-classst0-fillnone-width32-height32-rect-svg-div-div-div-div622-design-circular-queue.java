class MyCircularQueue {
    
    protected int[] arr;
    protected int front;
    private int size;

    public MyCircularQueue(int k) {
       arr = new int[k];
       front = 0;
       size = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        int idx = (front + size) % arr.length;
        arr[idx] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front + 1) % arr.length;
        size--;
        return true;
    }
    
    public int Front() {
       if(isEmpty()) return -1;
       return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        int rear = (front + size - 1) % arr.length;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == arr.length;
    }
}
