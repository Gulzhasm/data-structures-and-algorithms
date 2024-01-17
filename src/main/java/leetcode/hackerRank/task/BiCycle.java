package leetcode.hackerRank.task;

class BiCycle {
    String whoAmI() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    @Override
    String whoAmI() {
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

//    MotorCycle() {
//    System.out.println("Hello I am a motorcycle, I am " + whoAmI());
//    System.out.println("My ancestor is a cycle who is " + super.whoAmI());
//    }

