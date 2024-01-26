package leetcode.challenges.december.sorting;

 class Interval {
    int from, to; // note: you should generally make these private :)
    public Interval(int from, int to) {
        this.from = from; 
        this.to = to;
    }
    @Override
    public String toString() {
        return "[" + Integer.toString(from) + "," + Integer.toString(to) + "]";
    }
}