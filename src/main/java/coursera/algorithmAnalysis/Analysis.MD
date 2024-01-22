Theory of Algorithms

When analyzing the computer programming algorithms, we may consider:
Best case - Lower bound on cost;
Worst case - Upper bound on cost;
Average Case - Expected cost;

Actual data might not match input model in the real world that our client is trying to solve:
- We need to understand the input model to effectively process it
- Approach 1: design for the worst case. - Just make sure that your algorithm runs always faster as it can.
- Approach 2: randomize, depend on probabilistic guarantee.

Goals:
- establish "difficulty" of a problem
- develop optimal algorithms

Approach:
- eliminate variability in input model by just focusing on the worst case design.
Your algorithm needs to be optimal for the wost case.

Example:
Given an array, find if there is a 0 in the array?
Upper bound: Brute-Force algorithm for th problem: Look at every array entry.
Running time of the optimal algorithm is O(N).

Lower bound: Proof that no algorithm can do better.
Running time of the optimal algorithm for this problem is Ω(N).

Optimal algorithm.
- Lower bound equals to upper bound in this case.
- Brute force algorithm is optimal for this problem: its running time is Θ(N).

Algorithm design  approach:
- Develop an algorithm.
- Prove a lower bound.
- Lower the upper bound: Discover/Improve a new algorithm.
