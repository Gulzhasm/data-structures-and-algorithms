package practices.hashMap.directChaining;

import java.util.LinkedList;

public class DirectChaining {

    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    public DirectChaining(int size) {
     hashTable = new LinkedList[size];
    }

    public int modASCIIHash(String word, int m){
        char[] ch = word.toCharArray();
        int sum = 0;
        for(int i = 0; i < word.length(); i++){
            sum += word.charAt(i);
        }
        return sum % m;
    }

    public void insert(String word){
        int hash = modASCIIHash(word, hashTable.length);
        if(isFull()){
            reHash();
        }
        if(hashTable[hash] == null){
            hashTable[hash] = new LinkedList<>();
            hashTable[hash].add(word);
        } else {
            hashTable[hash].add(word);
        }
    }

    private void reHash() {
        LinkedList<String>[] old = hashTable;
        hashTable = new LinkedList[old.length*2];
        for(int i = 0; i < old.length * 2; i++){
            hashTable[i] = old[i];
        }
    }

    public boolean search(String word){
        int newIndex = modASCIIHash(word, hashTable.length);
        return hashTable[newIndex] != null && hashTable[newIndex].contains(word);
    }

    public void removeKey(String word){
        int newIndex = modASCIIHash(word, hashTable.length);
        boolean result = search(word);
        if(result){
            hashTable[newIndex].remove(word);
        }
    }

    public boolean isFull(){
        return hashTable.length >= maxChainSize;
    }


    public void display(){
        if(hashTable == null){
            System.out.println("Hashtable does not exist");
            return;
        } else {
            for(int i = 0; i <hashTable.length; i++){
                System.out.println("Index: " + i  + " Key: " + hashTable[i]);
            }
        }
    }

}
