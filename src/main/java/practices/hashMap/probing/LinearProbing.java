package practices.hashMap.probing;

import practices.oop.access.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    public LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHash(String word, int m) {
        char[] ch = word.toCharArray();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i);
        }
        return sum % m;
    }

    public double getLoadFactor() {
        //this comes from .javadoc
        return usedCellNumber * 1.0 / hashTable.length;
    }

    public void insert(String word) {
        //check first load factor
        double loadFactor = getLoadFactor();
        if (loadFactor >= 75) {
            //double the size
            reHash(word);
        } else {
            int index = modASCIIHash(word, hashTable.length);
            for (int i = 0; i < index + hashTable.length; i++) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    break;
                } else {
                    System.out.println("Already occupied. Trying next empty cell");
                }
            }
        }
        usedCellNumber++;
    }

    public boolean search(String word) {
        int index = modASCIIHash(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println(word + " found at the index of " + newIndex);
                return true;
            }
        }
        return false;
    }

    public void delete(String word) {
        int index = modASCIIHash(word, hashTable.length);
        for (int i = index; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                usedCellNumber--;
                return;
            }
        }
        System.out.println("Not exist");
    }


    public void display() {
        if (hashTable == null) {
            System.out.println("Hashtable does not exist");
            return;
        } else {
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index: " + i + " Key: " + hashTable[i]);
            }
        }
    }

    public void reHash(String word) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : list) {
            if (s != null) {
                list.add(s);
            }
            list.add(word);
            hashTable = new String[hashTable.length * 2];
            for (String l : list) {
                insert(l);
            }
        }
    }
}
