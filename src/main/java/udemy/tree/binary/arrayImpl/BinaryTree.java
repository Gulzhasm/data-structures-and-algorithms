package udemy.tree.binary.arrayImpl;

import java.util.Arrays;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
    }


    boolean isFull() {
        return (arr.length - 1) == lastUsedIndex;
    }

    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
        } else {
            System.out.println("The BT is full");
        }
    }

    public void preOrder(int index) { //TC - O(N) -> SC- O(N)
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index] + " "); // first root, and then ..
        preOrder(index * 2); // left subtree - O(N/2)
        preOrder(index * 2 + 1);// right subtree - O(N/2)
    }

    public void inOrder(int index) {//TC - O(N) -> SC- O(N)
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    public void postOrder(int index) {//TC - O(N), SC- O(N)
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder() { //TC - O(N), SC- O(1)
        for (int i = 1; i <= lastUsedIndex; i++) { //O(N)
            System.out.print(arr[i] + " ");
        }
    }

    public int search(String value) {//TC - O(N), SC- O(1)
        for (int i = 1; i <= lastUsedIndex; i++) { //O(N)
            if (arr[i].equals(value)) {
                return i;
            }
        }
        System.out.println("The value does not exist in BT");
        return -1;
    }

    public void delete(String value) {//TC - O(N), SC- O(1)
        int deletedIndex = search(value);
        if (deletedIndex == -1) {
            return;
        } else {
            arr[deletedIndex] = arr[lastUsedIndex];
            lastUsedIndex--;
        }
    }

    public void deleteBT(){
        try {
            lastUsedIndex = 0;
            arr = null;
        } catch (Exception e){
            System.out.println("Error");
        }

    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "arr=" + Arrays.toString(arr) +
                ", lastUsedIndex=" + lastUsedIndex +
                '}';
    }
}
