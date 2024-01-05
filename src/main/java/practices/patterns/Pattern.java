package practices.patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern2(5);

    }

    //*
    //**
    //***
    //****
    static void pattern(int size) {
        for (int row = 1; row <= size; row++) {
            // for every row, run col
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //****
    //***
    //**
    //*
    static void pattern2(int size) {
        for (int row = size; row >= 1; row--) {
            // for every row, run col
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
