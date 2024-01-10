A trie is a tree-based data structure that organizes the information in a hierarchy.

AIR 
new node A will be created
I is a left child
R is a left child of left child

AIT
A is a root node
I is an existing left child
T will be added to a R, and becomes RT left child of I

BAR 
B will be added to the root node of A -> AB
A is a right child of AB
R will be the lft child of A...


Common operations on Trie
- creation - a blank node - Initialize Trie() class
- insertion - A Trie is blank - APP - A will be inserted as a root, P will be inserted as a child and a new map will be created
API insertion, as A and P are already stored in the map trie, so then I will be inserted to the P third child node, so the PI will be stored as a third child map object
APIS insertion, as API is a complete string, so S will be inserted as a new map trie and end of string will be set as true
- search for a String in a trie:
1. String does not exist in Trie
BCD -> return does not exist
2. String exist - API -> will loop through character by character if all chars match, and check if endOfString is true? 
-if all conditions met, then return true
- deletion - The string is a prefix of another string. API is a prefix of APIS, so we want to delete S


Practical use of Trie:
-Auto completion. For example: google search suggestion or autocompletion
-Spelling checker