import java.util.*;

class FreqStack {
    private Map<Integer, Integer> freqMap;
    private Map<Integer, Stack<Integer>> setMap;
    private int maxfreq;

    public FreqStack() {
        freqMap = new HashMap<>();
        setMap = new HashMap<>();
        maxfreq = 0;
    }

    public void push(int x) {
        int freq = freqMap.getOrDefault(x, 0) + 1;
        freqMap.put(x, freq);

        if (freq > maxfreq) maxfreq = freq;

        setMap.computeIfAbsent(freq, z -> new Stack<>()).push(x);
    }

    public int pop() {
        if (maxfreq <= 0) return -1; // Stack is empty

        int top = setMap.get(maxfreq).pop();
        freqMap.put(top, freqMap.get(top) - 1);

        if (setMap.get(maxfreq).isEmpty()) maxfreq--;
        return top;
    }
}
