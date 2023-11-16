class StockSpanner {

    Stack<int[]> res;

    public StockSpanner() {
        res = new Stack<>();
    }
    
    public int next(int price) {
        int ct = 1;

        while(!res.empty() && res.peek()[0] <= price){
            ct += res.pop()[1];
        }

        res.add(new int[]{price, ct});

        return ct;
    }
}