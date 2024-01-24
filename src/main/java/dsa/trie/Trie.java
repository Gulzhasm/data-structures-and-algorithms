package dsa.trie;

public class Trie {
    private TrieNode root;


    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) { // time - O(M), space - O(M)
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
        System.out.println(word + " has been inserted");
    }

    public boolean search(String word) { // time - O(M), space - O(1)
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                System.out.println(word + " does not exist in Trie");
                return false;
            }
            current = node;
        }
        if (current.endOfString) {
            System.out.println(word + " exist in trie");
            return true;
        } else {
            System.out.println(word + " does not exist in Trie. but it is a prefix of another string");
        }
        return current.endOfString;
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode current = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        if (current.children.size() > 1) {
            delete(current, word, index + 1);
            return false;
        }
        if (index == word.length() - 1) {
            if (current.children.size() >= 1) {
                current.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (current.endOfString) {
            delete(current, word, index + 1);
            return false;
        }
        canThisNodeBeDeleted = delete(current, word, index + 1);
        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

}
