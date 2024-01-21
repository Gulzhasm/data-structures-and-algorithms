
The challenge:
1. Why is my program so slow?
2. Why does it run out of memory?

Observations:
public int threeSumBF(int[] a){ //N^3

As the input size increases, the time doubles:
1K input array -> 0.468
2K input array -> 3.345
...
8K input - >51.2 elapsed time

Mathematical Models

Total running time: sum of cost x frequency for all operations. - by Donald Knuth.

Cost of basic operations:
a+b = 2.1 nano seconds

Tilde notation:
Estimate running time (or memory) as a function of input size N. 
- Ignore lower order terms.
when N is large, terms are negligible
when N is small, we don't care