package dsa.trie;

import java.util.Map;
import java.util.HashMap;


public class TrieNode {

    Map<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode() {
        children = new HashMap<>();
        endOfString = false;
    }
}
