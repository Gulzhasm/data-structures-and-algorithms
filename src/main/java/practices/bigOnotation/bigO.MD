Time and Space complexity
1. Linear Search has linear time complexity, as input size grows, execution time gets slower.

O(1) < O(logN) < O(N)

What do we consider when thinking about time complexity?
1. Always consider/look for the worst case scenario/time complexity. 
For example: 2M users at the same time will use the application, and how your application handle this worst case?
2. Always look at complexity for large/infinite data
3. y = n, y = 2n, y = 4n, even though value of y time is different, they are all growing linearly. Hence, we ignore all constants.
4. O(N^3 + logN) -> from point number #2 (Always look at complexity for large/infinite data) 
O(1million^3 + log(1million)) => O(1million^3 + 6seconds) => Always ignore less dominating terms!


What is Big O Notation?
word definition: O(N^3) => this graph is your upper bound, your algorithm will not exceed N^3!

General Knowledge purpose:
In interviews, we only care about Big O notation only!
Big Omega Notation: opposite of Big O
word definition: Ω(n^3) - this is your lower bound, your algo will always exceed the big omega!

Question: What is an algo has O(N^2) and Ω(n^2)?
Theta Notation: Combining the both upper and lower bonds.

There are also little o notation and little omega notation :)
little o notation: loosely upper bound => strictly slower than Big O
little omega notation: loosely lower bound => strictly greater than Big Ω


Space Complexity
Auxiliary Space is the extra space or temporary space used by an algorithm!
Space complexity of an algorithm is total space taken by the algo with respect to the input size. 
Space complexity includes both Auxiliary space and space used by input.

Space Complexity = Auxiliary Space + Space used by input;

