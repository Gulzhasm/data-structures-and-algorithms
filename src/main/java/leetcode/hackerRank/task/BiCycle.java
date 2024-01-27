package leetcode.hackerRank.task;

class BiCycle {
    String definition() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    @Override
    String definition() {
        return "a cycle with an engine.";
    }
}

class Solution {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle();

        //output:

        // Hello I am a motorcycle, I am a cycle with an engine.
        // My ancestor is a cycle who is a vehicle with pedals.
    }
}

/*

    public MotorCycle() {
        System.out.println("Hello! Hello I am a motorcycle. I am " + definition());
        System.out.println("My ancestor is a cycle who is " + super.definition());
    }

 */

