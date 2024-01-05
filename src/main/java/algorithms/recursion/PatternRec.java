package algorithms.recursion;

public class PatternRec {
    //*
    //**
    //***
    //****
    public static void main(String[] args) {
        pattern2(4,0);
    }
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }

    //recursion
    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if(c < r){
            System.out.print("* ");
            pattern(r, c+1);
        } else{
            System.out.println();
            pattern(r-1, 0);
        }
    }

    static void pattern2(int r, int c) {
        if (r == 0) {
            return;
        }
        if(c < r){
            pattern2(r, c+1);
            System.out.print("* ");
        } else{
            pattern2(r-1, 0);
            System.out.println();
        }
    }


    //iterative solution
    static void patternIterative(int size) {
        for (int row = 1; row <= size; row++) {
            // for every row, run col
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
