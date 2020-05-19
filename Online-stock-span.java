class StockSpanner {
    ArrayList<Integer> prices;
    Stack<Integer> st;
    public StockSpanner() {
        prices=new ArrayList<Integer>();
        st=new Stack<Integer>();
    }
    
    public int next(int price) {
        int i=prices.size();
        prices.add(price);
        //Finding the next higher element of price before current index
        while(!st.isEmpty()&&prices.get(st.peek())<=price) st.pop();
        int ans=0;
        //If stack is empty then all elements are higher than price,so ans is i+1
        if(st.isEmpty()) ans=i+1;
        //else ans is no of elements between price and next higher elements
        else ans=i-st.peek();
        //add current index to stack
        st.add(i);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */